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
    public List<vlf> a = new ArrayList();
    public boolean b;
    private final boolean c;
    private String d;
    private final Context f;
    private final boolean g;
    private final a h;
    private final jor<vlf> i;
    private final sso j;

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

    public AlbumTracksAdapter(Context context, boolean z, a aVar, jor<vlf> jor, sso sso, boolean z2) {
        this.f = context;
        this.g = z;
        this.h = aVar;
        this.i = (jor) fbp.a(jor);
        this.j = sso;
        this.c = z2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, View view) {
        if (i2 < this.a.size()) {
            this.h.a(view, (long) ((vlf) this.a.get(i2)).getUri().hashCode());
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
        ((jqk) tag).a(this.f, this.j);
        return true;
    }

    public final void a(String str) {
        this.d = str;
        notifyDataSetChanged();
    }

    public final int getCount() {
        return this.a.size();
    }

    public final /* synthetic */ Object getItem(int i2) {
        return (vlf) this.a.get(i2);
    }

    public final long getItemId(int i2) {
        return (long) ((vlf) this.a.get(i2)).getUri().hashCode();
    }

    public final int getItemViewType(int i2) {
        return Type.TRACK.ordinal();
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Type type = Type.b[getItemViewType(i2)];
        fsb fsb = (fsb) fqv.b(view, fsb.class);
        if (fsb == null) {
            fqv.b();
            fsb = fsk.a(this.f, viewGroup, !this.g);
        }
        if (AnonymousClass1.a[type.ordinal()] != 1) {
            StringBuilder sb = new StringBuilder("Unknown type ");
            sb.append(type);
            Assertion.a(sb.toString());
        } else {
            vlf vlf = (vlf) this.a.get(i2);
            fsb.a(vlf.getName());
            List artists = vlf.getArtists();
            if (artists == null || artists.isEmpty()) {
                fsb.b("");
            } else {
                fsb.b(((vku) artists.get(0)).getName());
            }
            juf.a(this.f, fsb.d(), vlf.getOfflineState());
            jzb.a(this.f, fsb.d(), vlf.isExplicit());
            if (this.c) {
                jzb.a(this.f, fsb.d(), vlf.hasLyrics(), this.f.getString(R.string.lyrics_label));
            }
            fsb.a(vlf.getUri().equals(this.d));
            fsb.getView().setEnabled(vlf.isCurrentlyPlayable());
            fsb.getView().setTag(vlf);
            fsb.a(jqq.a(this.f, this.i, vlf, this.j));
            fsb.getView().setTag(R.id.context_menu_tag, new jqk(this.i, vlf));
            fsb.c(jvh.a(vlf.isCurrentlyPlayable(), this.b, vlf.isExplicit()));
            fsb.getView().setOnClickListener(new OnClickListener(i2) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AlbumTracksAdapter.this.a(this.f$1, view);
                }
            });
            fsb.getView().setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return AlbumTracksAdapter.this.c(view);
                }
            });
            if (VERSION.SDK_INT >= 23) {
                fsb.getView().setOnContextClickListener(new OnContextClickListener() {
                    public final boolean onContextClick(View view) {
                        return AlbumTracksAdapter.this.b(view);
                    }
                });
            }
        }
        return fsb.getView();
    }

    public final int getViewTypeCount() {
        return e;
    }

    public final boolean isEnabled(int i2) {
        return true;
    }
}
