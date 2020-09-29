package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: rds reason: default package */
public final class rds extends rdq implements rdu {
    private static final Policy a;
    private static final Policy c;
    private final ipf d;
    private List<irh> e;
    private final rbg f;
    private final irb g;
    private final rgf h;

    /* renamed from: rds$a */
    static class a {
        final boolean a;
        final int b;
        final int c;

        public a(boolean z, int i, int i2) {
            this.a = z;
            this.b = i;
            this.c = i2;
        }
    }

    static {
        ListPolicy listPolicy = new ListPolicy();
        String str = "link";
        String str2 = "previewId";
        String str3 = "inCollection";
        String str4 = "isBanned";
        String str5 = "isExplicit";
        String str6 = "playable";
        String str7 = "offline";
        String str8 = "isLocal";
        listPolicy.setListAttributes(ImmutableMap.g().b(str, Boolean.TRUE).b("name", Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b());
        listPolicy.setArtistsAttributes(ImmutableMap.a("name", Boolean.TRUE, "link", Boolean.TRUE, "portraits", Boolean.TRUE));
        listPolicy.setAlbumAttributes(ImmutableMap.a("name", Boolean.TRUE, "link", Boolean.TRUE, "covers", Boolean.TRUE));
        listPolicy.setAlbumArtistAttributes(ImmutableMap.b(str, Boolean.TRUE));
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        String str9 = "groupIndex";
        decorationPolicy.setListAttributes(Collections.singletonMap(str9, Boolean.TRUE));
        a = new Policy(decorationPolicy);
        DecorationPolicy decorationPolicy2 = new DecorationPolicy();
        decorationPolicy2.setListAttributes(Collections.singletonMap(str9, Boolean.TRUE));
        c = new Policy(decorationPolicy2);
    }

    public rds(rbg rbg, irb irb, rgf rgf, ipf ipf) {
        super(rbg);
        this.f = rbg;
        this.g = irb;
        this.h = rgf;
        this.g.a(way.e().a("addTime").a());
        this.d = ipf;
    }

    private Observable<iri> a(rdb rdb, boolean z, Policy policy) {
        way c2 = rdb.c().c();
        if (c2 != null) {
            this.g.a(c2);
            this.g.a = z;
        }
        this.g.a(Integer.valueOf(rdb.a()), Integer.valueOf(rdb.b()));
        this.g.g = rdb.f();
        this.g.b = rdb.c().b();
        this.g.a(false, ((Boolean) fbm.a(rdb.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue(), false);
        return this.g.a(policy);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(rdb rdb, List list) {
        a aVar;
        int i;
        int a2 = rdb.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= list.size()) {
                aVar = new a(false, 0, 0);
                break;
            } else if (i3 == a2) {
                aVar = new a(true, i4, i2);
                break;
            } else {
                int i5 = i3 + 1;
                int b = ((irh) list.get(i2)).b();
                int i6 = a2 - i5;
                if (i6 < b) {
                    aVar = new a(false, i4 + i6, i2);
                    break;
                }
                i3 = i5 + b;
                i4 += b;
                i2++;
            }
        }
        a aVar2 = aVar;
        int a3 = rdb.a();
        int b2 = a3 + rdb.b();
        int b3 = rdb.b();
        way c2 = rdb.c().c();
        if ("album.name".equals(c2.a())) {
            i = 0;
        } else {
            i = "artist.name".equals(c2.a()) ? 1 : -1;
        }
        rdb a4 = rdb.a(aVar2.b);
        Observable a5 = a(a4, true, a);
        $$Lambda$rds$WeNFtXg3RHK9EKo57ejfnVIP0w r7 = new $$Lambda$rds$WeNFtXg3RHK9EKo57ejfnVIP0w(this, aVar2, a4, a3, b2, b3, i, rdb);
        return a5.h(r7);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(a aVar, rdb rdb, int i, int i2, int i3, int i4, rdb rdb2, iri iri) {
        int i5;
        ArrayList arrayList;
        MusicItem musicItem;
        a aVar2 = aVar;
        int i6 = i3;
        int i7 = i4;
        vlf[] vlfArr = (vlf[]) iri.getItems();
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        this.e = iri.b();
        int i8 = aVar2.c;
        if (vlfArr.length <= 0 || aVar2.a) {
            i5 = 0;
        } else {
            irh irh = (irh) this.e.get(i8);
            int b = (irh.b() - aVar2.b) + irh.a();
            a(g2, vlfArr, 0, b, rdb.a());
            i5 = b + 0;
            i8++;
        }
        ArrayList arrayList2 = new ArrayList(this.e.size());
        while (i8 < this.e.size() && i + i5 < i2 && i5 < i6) {
            irh irh2 = (irh) this.e.get(i8);
            vlf vlf = vlfArr[irh2.a() - aVar2.b];
            if (i7 == 1 && fbo.a(a(vlf).getImageUri(Size.LARGE))) {
                arrayList2.add(a(vlf).getUri());
            }
            vkt album = vlf.getAlbum();
            if (i7 == 0) {
                rgf rgf = this.h;
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a z = MusicItem.z();
                fej fej = rgf.c;
                StringBuilder sb = new StringBuilder();
                sb.append(Type.GROUP_HEADER_ALBUM);
                sb.append(album.getTitle());
                arrayList = arrayList2;
                musicItem = z.a(fej.a((CharSequence) sb.toString()).c()).a(Type.GROUP_HEADER_ALBUM).a(album.getTitle()).e(album.getImageUri(Size.LARGE)).c(album.getUri()).a(album.getOfflineState()).d(album.getUri()).a();
            } else {
                arrayList = arrayList2;
                if (i7 == 1) {
                    vku a2 = a(vlf);
                    rgf rgf2 = this.h;
                    String i9 = jva.a(album == null ? "" : album.getArtist().getUri()).i(rgf2.b);
                    com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a z2 = MusicItem.z();
                    fej fej2 = rgf2.c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Type.GROUP_HEADER_ARTIST);
                    sb2.append(a2.getTitle());
                    musicItem = z2.a(fej2.a((CharSequence) sb2.toString()).c()).a(Type.GROUP_HEADER_ARTIST).a(a2.getName()).e(a2.getImageUri(Size.LARGE)).c(a2.getUri()).a(a2.getOfflineState()).d(i9).a();
                } else {
                    StringBuilder sb3 = new StringBuilder("Group header type not supported: ");
                    sb3.append(i7);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            g2.c(musicItem);
            int i10 = i5 + 1;
            int min = Math.min(irh2.b(), i6 - i10);
            a(g2, vlfArr, irh2.a() - aVar2.b, min, rdb.a());
            i5 = i10 + min;
            i8++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        Observable b2 = arrayList3.isEmpty() ? Observable.b(Collections.emptyMap()) : wit.a(this.d.a("spotify:internal:collection:tracks", (String[]) arrayList3.toArray(new String[0]))).d().e(Collections.emptyMap());
        $$Lambda$rds$UIPbhDCCAUjTVxvcbvwnnMG7HKk r0 = new $$Lambda$rds$UIPbhDCCAUjTVxvcbvwnnMG7HKk(this, g2.a(), iri, i, rdb2);
        return b2.c((Function<? super T, ? extends R>) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(ImmutableList immutableList, iri iri, int i, rdb rdb, Map map) {
        if (!map.isEmpty()) {
            com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
            fdz R_ = immutableList.R_();
            while (R_.hasNext()) {
                MusicItem musicItem = (MusicItem) R_.next();
                vku vku = (vku) map.get(musicItem.j());
                if (musicItem.a() != Type.GROUP_HEADER_ARTIST || vku == null) {
                    g2.c(musicItem);
                } else {
                    g2.c(musicItem.r().e(vku.getImageUri(Size.LARGE)).a());
                }
            }
            immutableList = g2.a();
        }
        return rdd.a(iri.isLoading(), iri.getUnrangedLength() + this.e.size(), i, immutableList, rdb, MusicItem.p);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(rdb rdb, iri iri) {
        vlf[] vlfArr = (vlf[]) iri.getItems();
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        int a2 = rdb.a();
        a(g2, vlfArr, 0, vlfArr.length, a2);
        return rdd.a(iri.isLoading(), iri.getUnrangedLength(), a2, g2.a(), rdb, MusicItem.p);
    }

    private static vku a(vlf vlf) {
        return (vku) vlf.getArtists().get(0);
    }

    private void a(com.google.common.collect.ImmutableList.a<MusicItem> aVar, vlf[] vlfArr, int i, int i2, int i3) {
        vlf[] vlfArr2 = vlfArr;
        int i4 = i;
        while (i4 < i + i2 && i4 < vlfArr2.length) {
            int i5 = i3 + i4;
            vlf vlf = vlfArr2[i4];
            rgf rgf = this.h;
            aVar.c(MusicItem.a(rgf.c.a((CharSequence) vlf.getUri()).c(), this.f.a() ? Type.TRACK_SHUFFLE_ONLY : Type.TRACK, true, vlf.getName(), rgf.d ? jve.a(vlf) : jve.b(vlf), vlf.getUri(), vlf.getTargetUri(), vlf.getImageUri(Size.NORMAL), vlf.getAddTime(), i5, vlf.getOfflineState(), vlf.inCollection(), vlf.isBanned(), true, false, vlf.isExplicit(), vlf.isCurrentlyPlayable(), false, vlf.isLocal(), vlf.previewId(), "spotify:internal:collection:tracks"));
            i4++;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if ("artist.name".equals(r0.a()) != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.Observable<defpackage.rdc> a(defpackage.rdb r6) {
        /*
            r5 = this;
            rdb$b r0 = r6.c()
            way r0 = r0.c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0045
            rbg r3 = r5.f
            jrn r3 = r3.a
            fqn r3 = r3.d()
            if (r3 == 0) goto L_0x0028
            fqu r4 = defpackage.vcd.d
            java.io.Serializable r3 = r3.a(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Enabled"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = r0.a()
            java.lang.String r4 = "album.name"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r0 = r0.a()
            java.lang.String r3 = "artist.name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0081
            java.util.List<irh> r0 = r5.e
            if (r0 == 0) goto L_0x0051
            io.reactivex.Single r0 = io.reactivex.Single.b(r0)
            goto L_0x0077
        L_0x0051:
            rdb$a r0 = r6.h()
            rdb$a r0 = r0.a(r2)
            rdb$a r0 = r0.b(r2)
            rdb r0 = r0.a()
            com.spotify.mobile.android.playlist.model.policy.Policy r2 = c
            io.reactivex.Observable r0 = r5.a(r0, r1, r2)
            r1 = 1
            io.reactivex.Observable r0 = r0.c(r1)
            io.reactivex.Single r0 = r0.h()
            -$$Lambda$zPrxTjYmwS-yjpAhpC2Guc4kO0o r1 = defpackage.$$Lambda$zPrxTjYmwSyjpAhpC2Guc4kO0o.INSTANCE
            io.reactivex.Single r0 = r0.f(r1)
        L_0x0077:
            -$$Lambda$rds$Z9aiWGLI1ptmmIUtIvK1p68sb3M r1 = new -$$Lambda$rds$Z9aiWGLI1ptmmIUtIvK1p68sb3M
            r1.<init>(r5, r6)
            io.reactivex.Observable r6 = r0.d(r1)
            return r6
        L_0x0081:
            com.spotify.mobile.android.playlist.model.policy.Policy r0 = a
            io.reactivex.Observable r0 = r5.a(r6, r2, r0)
            -$$Lambda$rds$acbSgaQ3kzq9K8WKZlW4C2IDF_Q r1 = new -$$Lambda$rds$acbSgaQ3kzq9K8WKZlW4C2IDF_Q
            r1.<init>(r5, r6)
            io.reactivex.Observable r6 = r0.c(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rds.a(rdb):io.reactivex.Observable");
    }

    public final void a(boolean z) {
        this.g.a(z);
    }
}
