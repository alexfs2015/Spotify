package com.spotify.music.features.collectionalbum.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnContextClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class AlbumTracksAdapter extends BaseAdapter {
    private static final int e = Type.b.length;
    public List<uzc> a = new ArrayList();
    public boolean b;
    private final boolean c;
    private String d;
    private final Context f;
    private final boolean g;
    private final a h;
    private final jmf<uzc> i;
    private final sih j;

    /* renamed from: com.spotify.music.features.collectionalbum.adapter.AlbumTracksAdapter$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        static {
            try {
                a[Type.TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    enum Type {
        TRACK;
        
        /* access modifiers changed from: private */
        public static final Type[] b = null;

        static {
            b = values();
        }
    }

    public interface a {
        void a(View view, long j);
    }

    public final boolean isEnabled(int i2) {
        return true;
    }

    public AlbumTracksAdapter(Context context, boolean z, a aVar, jmf<uzc> jmf, sih sih, boolean z2) {
        this.f = context;
        this.g = z;
        this.h = aVar;
        this.i = (jmf) fay.a(jmf);
        this.j = sih;
        this.c = z2;
    }

    public final int getCount() {
        return this.a.size();
    }

    public final long getItemId(int i2) {
        return (long) ((uzc) this.a.get(i2)).getUri().hashCode();
    }

    public final int getViewTypeCount() {
        return e;
    }

    public final int getItemViewType(int i2) {
        return Type.TRACK.ordinal();
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Type type = Type.b[getItemViewType(i2)];
        frh frh = (frh) fqb.b(view, frh.class);
        if (frh == null) {
            fqb.b();
            frh = frq.a(this.f, viewGroup, !this.g);
        }
        if (AnonymousClass1.a[type.ordinal()] != 1) {
            StringBuilder sb = new StringBuilder("Unknown type ");
            sb.append(type);
            Assertion.a(sb.toString());
        } else {
            uzc uzc = (uzc) this.a.get(i2);
            frh.a(uzc.getName());
            List artists = uzc.getArtists();
            if (artists == null || artists.isEmpty()) {
                frh.b("");
            } else {
                frh.b(((uyr) artists.get(0)).getName());
            }
            jrv.a(this.f, frh.d(), uzc.getOfflineState());
            jxb.a(this.f, frh.d(), uzc.isExplicit());
            if (this.c) {
                jxb.a(this.f, frh.d(), uzc.hasLyrics(), this.f.getString(R.string.lyrics_label));
            }
            frh.a(uzc.getUri().equals(this.d));
            frh.getView().setEnabled(uzc.isCurrentlyPlayable());
            frh.getView().setTag(uzc);
            frh.a(joe.a(this.f, this.i, uzc, this.j));
            frh.getView().setTag(R.id.context_menu_tag, new jny(this.i, uzc));
            frh.c(jtb.a(uzc.isCurrentlyPlayable(), this.b, uzc.isExplicit()));
            frh.getView().setOnClickListener(new OnClickListener(i2) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AlbumTracksAdapter.this.a(this.f$1, view);
                }
            });
            frh.getView().setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return AlbumTracksAdapter.this.c(view);
                }
            });
            if (VERSION.SDK_INT >= 23) {
                frh.getView().setOnContextClickListener(new OnContextClickListener() {
                    public final boolean onContextClick(View view) {
                        return AlbumTracksAdapter.this.b(view);
                    }
                });
            }
        }
        return frh.getView();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, View view) {
        if (i2 < this.a.size()) {
            this.h.a(view, (long) ((uzc) this.a.get(i2)).getUri().hashCode());
            return;
        }
        Assertion.b(String.format(Locale.getDefault(), "Tracks list is missing for album %s at position %d", new Object[]{this.j, Integer.valueOf(i2)}));
        Toast.makeText(this.f, R.string.error_general_title, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean c(View view) {
        Object tag = view.getTag(R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((jny) tag).a(this.f, this.j);
        return true;
    }

    public final void a(String str) {
        this.d = str;
        notifyDataSetChanged();
    }

    public final /* synthetic */ Object getItem(int i2) {
        return (uzc) this.a.get(i2);
    }
}
