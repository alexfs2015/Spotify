package com.spotify.music.features.collectionartist.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.List;

public final class AlbumsWithTracksAdapter extends BaseAdapter {
    private static final int f = Type.d.length;
    public final List<Object> a = new ArrayList();
    public final List<Type> b = new ArrayList();
    public final List<uzc> c = new ArrayList();
    public boolean d;
    private String e;
    private final Context g;
    private final boolean h;
    private final jmf<uzc> i;
    private final jmf<a> j;
    private final sih k;
    private final jwv l;

    /* renamed from: com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter$Type[] r0 = com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter$Type r1 = com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.Type.ALBUM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter$Type r1 = com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.Type.TRACK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter$Type r1 = com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.Type.PLACEHOLDER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Type {
        TRACK,
        ALBUM,
        PLACEHOLDER;
        
        /* access modifiers changed from: private */
        public static final Type[] d = null;

        static {
            d = values();
        }
    }

    public static final class a {
        final uzc a;

        public a(uzc uzc) {
            this.a = uzc;
        }

        public final String a() {
            uyq album = this.a.getAlbum();
            return album != null ? album.getName() : "";
        }

        public final String b() {
            uyq album = this.a.getAlbum();
            return album != null ? album.getUri() : "";
        }

        public final String c() {
            uyq album = this.a.getAlbum();
            return album != null ? album.getImageUri(Size.NORMAL) : "";
        }
    }

    public AlbumsWithTracksAdapter(boolean z, jmf<uzc> jmf, jmf<a> jmf2, Context context, sih sih, jwv jwv) {
        this.g = context;
        this.h = z;
        this.i = jmf;
        this.j = jmf2;
        this.k = sih;
        this.l = jwv;
    }

    public final int getViewTypeCount() {
        return f;
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Object getItem(int i2) {
        return this.a.get(i2);
    }

    public final long getItemId(int i2) {
        return (long) (this.b.get(i2) == Type.ALBUM ? ((a) this.a.get(i2)).a.getUri().hashCode() : ((uzc) this.a.get(i2)).getUri().hashCode());
    }

    public final boolean isEnabled(int i2) {
        return Type.d[getItemViewType(i2)] != Type.PLACEHOLDER;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Type type = (Type) this.b.get(i2);
        fqz fqz = (fqz) fqb.b(view, fqz.class);
        if (fqz == null) {
            if (type == Type.TRACK) {
                fqb.b();
                fqz = frq.a(this.g, viewGroup, !this.h);
            } else if (type == Type.PLACEHOLDER) {
                fqb.b();
                fqz = frq.c(this.g, viewGroup);
            } else {
                fqb.b();
                fqz = frq.b(this.g, viewGroup);
            }
            if (type == Type.ALBUM) {
                ((fre) fqz).b().setTypeface(utw.c(this.g, R.attr.glueFontSemibold));
            }
        }
        int i3 = AnonymousClass1.a[type.ordinal()];
        if (i3 != 1) {
            String str = "";
            if (i3 == 2) {
                uzc uzc = (uzc) this.a.get(i2);
                frh frh = (frh) fqz;
                frh.a(uzc.getName());
                List artists = uzc.getArtists();
                if (artists == null || artists.isEmpty()) {
                    frh.b(str);
                } else {
                    frh.b(((uyr) artists.get(0)).getName());
                }
                jxb.a(this.g, frh.d(), uzc.isExplicit());
                frh.a(uzc.getUri().equals(this.e));
                frh.getView().setEnabled(uzc.isCurrentlyPlayable());
                jrv.a(this.g, frh.d(), uzc.getOfflineState());
                frh.getView().setTag(uzc);
                frh.a(joe.a(this.g, this.i, uzc, this.k));
                frh.getView().setTag(R.id.context_menu_tag, new jny(this.i, uzc));
                frh.c(jtb.a(uzc.isCurrentlyPlayable(), this.d, uzc.isExplicit()));
            } else if (i3 != 3) {
                StringBuilder sb = new StringBuilder("Unknown type ");
                sb.append(type);
                Assertion.a(sb.toString());
            } else {
                ((frd) fqz).a(str);
            }
        } else {
            a aVar = (a) this.a.get(i2);
            fre fre = (fre) fqz;
            fre.a(aVar.a());
            this.l.b(fre.c(), !TextUtils.isEmpty(aVar.c()) ? Uri.parse(aVar.c()) : Uri.EMPTY);
            fre.c().setVisibility(0);
            fre.getView().setTag(aVar);
            fre.a(joe.a(this.g, this.j, aVar, this.k));
            fre.getView().setTag(R.id.context_menu_tag, new jny(this.j, aVar));
        }
        return fqz.getView();
    }

    public final int getItemViewType(int i2) {
        return ((Type) this.b.get(i2)).ordinal();
    }

    public final void a(String str) {
        this.e = str;
        notifyDataSetChanged();
    }
}
