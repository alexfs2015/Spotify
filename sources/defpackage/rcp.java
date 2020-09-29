package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader.AlbumRec;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader.AlbumRecsResponse;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: rcp reason: default package */
public final class rcp implements rda {
    private final AlbumRecsLoader a;
    private final rgf b;
    private final CollectionStateProvider c;
    private final jrn d;
    private final a e;
    private final PublishSubject<Integer> f;
    private final BehaviorSubject<Observable<String>> g;
    private Observable<rdc> h;

    /* renamed from: rcp$a */
    interface a {
        Observable<Map<String, vkt>> decorateAlbums(String... strArr);
    }

    public rcp(RxResolver rxResolver, AlbumRecsLoader albumRecsLoader, rgf rgf, CollectionStateProvider collectionStateProvider, jrn jrn, xil xil, xil xil2) {
        this(albumRecsLoader, rgf, collectionStateProvider, jrn, new $$Lambda$rcp$DEH2eMq9q22jankn6w1SpuiK8(rxResolver, xil, xil2));
    }

    private rcp(AlbumRecsLoader albumRecsLoader, rgf rgf, CollectionStateProvider collectionStateProvider, jrn jrn, a aVar) {
        this.g = BehaviorSubject.a();
        this.a = albumRecsLoader;
        this.b = rgf;
        this.c = collectionStateProvider;
        this.d = jrn;
        this.e = aVar;
        this.f = PublishSubject.a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r4 == false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.ImmutableList<defpackage.vkt> a(java.lang.String[] r17, java.util.Map<java.lang.String, defpackage.vkt> r18, java.util.Map<java.lang.String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> r19, java.lang.String r20) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r0.length
            com.google.common.collect.ImmutableList$a r2 = com.google.common.collect.ImmutableList.g()
            int r3 = r0.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000b:
            r8 = 50
            if (r5 >= r3) goto L_0x00a7
            r9 = r0[r5]
            r10 = r19
            java.lang.Object r11 = r10.get(r9)
            com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider$a r11 = (com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a) r11
            if (r11 == 0) goto L_0x009f
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x009f
            r11 = r18
            if (r7 >= r8) goto L_0x009a
            java.lang.Object r8 = r11.get(r9)
            vkt r8 = (defpackage.vkt) r8
            if (r8 == 0) goto L_0x009a
            boolean r9 = r20.isEmpty()
            if (r9 != 0) goto L_0x0092
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = " "
            r9.<init>(r12)
            java.util.Locale r13 = java.util.Locale.getDefault()
            r14 = r20
            java.lang.String r13 = r14.toLowerCase(r13)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            java.lang.String r15 = r8.getName()
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r15.toLowerCase(r4)
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            boolean r4 = r4.contains(r9)
            if (r4 != 0) goto L_0x008e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r12)
            vku r12 = r8.getArtist()
            java.lang.String r12 = r12.getName()
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            java.util.Locale r12 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toLowerCase(r12)
            boolean r4 = r4.contains(r9)
            if (r4 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r4 = 0
            goto L_0x008f
        L_0x008e:
            r4 = 1
        L_0x008f:
            if (r4 == 0) goto L_0x009c
            goto L_0x0094
        L_0x0092:
            r14 = r20
        L_0x0094:
            r2.c(r8)
            int r7 = r7 + 1
            goto L_0x009c
        L_0x009a:
            r14 = r20
        L_0x009c:
            int r6 = r6 + 1
            goto L_0x00a3
        L_0x009f:
            r11 = r18
            r14 = r20
        L_0x00a3:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x00a7:
            r0 = 100
            if (r1 != r0) goto L_0x00b9
            if (r6 >= r8) goto L_0x00b9
            r1 = r16
            io.reactivex.subjects.PublishSubject<java.lang.Integer> r3 = r1.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.onNext(r0)
            goto L_0x00bb
        L_0x00b9:
            r1 = r16
        L_0x00bb:
            com.google.common.collect.ImmutableList r0 = r2.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcp.a(java.lang.String[], java.util.Map, java.util.Map, java.lang.String):com.google.common.collect.ImmutableList");
    }

    /* access modifiers changed from: private */
    public Observable<String[]> a(int i) {
        AlbumRecsLoader albumRecsLoader = this.a;
        StringBuilder sb = new StringBuilder("hm://your-library-view/v1/recommendations/albums?limit=");
        sb.append(i);
        return wit.b(albumRecsLoader.a.resolve(new Request(Request.GET, sb.toString(), ImmutableMap.b("accept", "application/json"), Request.EMPTY_BODY))).c((Function<? super T, ? extends R>) $$Lambda$rcp$_b2uklaG9MISdwGsY3DdrrRBpRI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(RxResolver rxResolver, xil xil, xil xil2, String[] strArr) {
        return strArr.length > 0 ? wit.b(xim.a(new ipd(rxResolver, xil, xil2).a(null, strArr))) : Observable.b(Collections.emptyMap());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String[] strArr) {
        String str = "";
        return Observable.a(Observable.b(strArr), this.e.decorateAlbums(strArr), this.c.a(str, str, strArr), Observable.a((ObservableSource<? extends ObservableSource<? extends T>>) this.g).e(str).a(Functions.a()), new $$Lambda$rcp$9_6Er8I1gRcuuEnbpKAa2DjKl6k(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(ImmutableList immutableList) {
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        fqn d2 = this.d.d();
        for (int i = 0; i < immutableList.size(); i++) {
            vkt vkt = (vkt) immutableList.get(i);
            g2.c(MusicItem.a(this.b.c.a((CharSequence) vkt.getUri()).c(), vkt.getName(), rgf.a(vkt), vkt.getUri(), vkt.getUri(), vkt.getImageUri(Size.NORMAL), vkt.getAddTime(), i, jus.c(d2), vkt.isSavedToCollection(), true, vkt.getOfflineState()));
        }
        return rdd.b(g2.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String[] a(AlbumRecsResponse albumRecsResponse) {
        List list = (List) jvi.a(albumRecsResponse.getAlbumRecs(), Collections.emptyList());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((AlbumRec) list.get(i)).getUri();
        }
        return strArr;
    }

    private Observable<rdc> c() {
        if (this.h == null) {
            this.h = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$rcp$dNldG_Cou3feZIZfwg3IsFcX0bQ<Object>(this)).a(1).a();
        }
        return this.h;
    }

    /* access modifiers changed from: private */
    public Observable<rdc> d() {
        return this.f.e(Integer.valueOf(100)).h(new $$Lambda$rcp$h0j4YdeCXI_UhetDKN3Ioit8Fsk(this)).h(new $$Lambda$rcp$6rcLBR_bRbspmvBLTNC_xjgpSjE(this)).c((Function<? super T, ? extends R>) new $$Lambda$rcp$eNeiKfvzmBjQPX3bkVD9c9dqxyg<Object,Object>(this)).e((Function<? super Throwable, ? extends T>) $$Lambda$rcp$PYJq7tItynX9lrgIRckP0_R4pLo.INSTANCE);
    }

    public final Observable<Boolean> a() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$rcp$d3g1Ql6b7ZkVWHDlm8uR5pirCo.INSTANCE);
    }

    public final Observable<rdc> a(Observable<rdb> observable) {
        this.g.onNext(observable.c((Function<? super T, ? extends R>) $$Lambda$c1CTNq_YW6TLI7uz50sr8OZKMbE.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$lflArm0m0foA0aS8ghPf8ocwg.INSTANCE));
        return c();
    }

    public final Observable<rdc> b() {
        return c();
    }
}
