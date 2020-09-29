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
    public final List<vlf> c = new ArrayList();
    public boolean d;
    private String e;
    private final Context g;
    private final boolean h;
    private final jor<vlf> i;
    private final jor<a> j;
    private final sso k;
    private final jyx l;

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
        final vlf a;

        public a(vlf vlf) {
            this.a = vlf;
        }

        public final String a() {
            vkt album = this.a.getAlbum();
            return album != null ? album.getName() : "";
        }

        public final String b() {
            vkt album = this.a.getAlbum();
            return album != null ? album.getUri() : "";
        }

        public final String c() {
            vkt album = this.a.getAlbum();
            return album != null ? album.getImageUri(Size.NORMAL) : "";
        }
    }

    public AlbumsWithTracksAdapter(boolean z, jor<vlf> jor, jor<a> jor2, Context context, sso sso, jyx jyx) {
        this.g = context;
        this.h = z;
        this.i = jor;
        this.j = jor2;
        this.k = sso;
        this.l = jyx;
    }

    public final void a(String str) {
        this.e = str;
        notifyDataSetChanged();
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Object getItem(int i2) {
        return this.a.get(i2);
    }

    public final long getItemId(int i2) {
        return (long) (this.b.get(i2) == Type.ALBUM ? ((a) this.a.get(i2)).a.getUri().hashCode() : ((vlf) this.a.get(i2)).getUri().hashCode());
    }

    public final int getItemViewType(int i2) {
        return ((Type) this.b.get(i2)).ordinal();
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Type type = (Type) this.b.get(i2);
        frt frt = (frt) fqv.b(view, frt.class);
        if (frt == null) {
            if (type == Type.TRACK) {
                fqv.b();
                frt = fsk.a(this.g, viewGroup, !this.h);
            } else if (type == Type.PLACEHOLDER) {
                fqv.b();
                frt = fsk.c(this.g, viewGroup);
            } else {
                fqv.b();
                frt = fsk.b(this.g, viewGroup);
            }
            if (type == Type.ALBUM) {
                ((fry) frt).b().setTypeface(vfn.c(this.g, R.attr.glueFontSemibold));
            }
        }
        int i3 = AnonymousClass1.a[type.ordinal()];
        if (i3 != 1) {
            String str = "";
            if (i3 == 2) {
                vlf vlf = (vlf) this.a.get(i2);
                fsb fsb = (fsb) frt;
                fsb.a(vlf.getName());
                List artists = vlf.getArtists();
                if (artists == null || artists.isEmpty()) {
                    fsb.b(str);
                } else {
                    fsb.b(((vku) artists.get(0)).getName());
                }
                jzb.a(this.g, fsb.d(), vlf.isExplicit());
                fsb.a(vlf.getUri().equals(this.e));
                fsb.getView().setEnabled(vlf.isCurrentlyPlayable());
                juf.a(this.g, fsb.d(), vlf.getOfflineState());
                fsb.getView().setTag(vlf);
                fsb.a(jqq.a(this.g, this.i, vlf, this.k));
                fsb.getView().setTag(R.id.context_menu_tag, new jqk(this.i, vlf));
                fsb.c(jvh.a(vlf.isCurrentlyPlayable(), this.d, vlf.isExplicit()));
            } else if (i3 != 3) {
                StringBuilder sb = new StringBuilder("Unknown type ");
                sb.append(type);
                Assertion.a(sb.toString());
            } else {
                ((frx) frt).a(str);
            }
        } else {
            a aVar = (a) this.a.get(i2);
            fry fry = (fry) frt;
            fry.a(aVar.a());
            this.l.b(fry.c(), !TextUtils.isEmpty(aVar.c()) ? Uri.parse(aVar.c()) : Uri.EMPTY);
            fry.c().setVisibility(0);
            fry.getView().setTag(aVar);
            fry.a(jqq.a(this.g, this.j, aVar, this.k));
            fry.getView().setTag(R.id.context_menu_tag, new jqk(this.j, aVar));
        }
        return frt.getView();
    }

    public final int getViewTypeCount() {
        return f;
    }

    public final boolean isEnabled(int i2) {
        return Type.d[getItemViewType(i2)] != Type.PLACEHOLDER;
    }
}
