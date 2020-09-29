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

/* renamed from: qua reason: default package */
public final class qua implements qul {
    private final AlbumRecsLoader a;
    private final qxq b;
    private final CollectionStateProvider c;
    private final jpb d;
    private final a e;
    private final PublishSubject<Integer> f;
    private final BehaviorSubject<Observable<String>> g;
    private Observable<qun> h;

    /* renamed from: qua$a */
    interface a {
        Observable<Map<String, uyq>> decorateAlbums(String... strArr);
    }

    public qua(RxResolver rxResolver, AlbumRecsLoader albumRecsLoader, qxq qxq, CollectionStateProvider collectionStateProvider, jpb jpb, wug wug, wug wug2) {
        this(albumRecsLoader, qxq, collectionStateProvider, jpb, new $$Lambda$qua$J4uNtQYCJQA2CryQ0TFsk9YJI(rxResolver, wug, wug2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(RxResolver rxResolver, wug wug, wug wug2, String[] strArr) {
        if (strArr.length > 0) {
            return vun.b(wuh.a(new imq(rxResolver, wug, wug2).a(null, strArr)));
        }
        return Observable.b(Collections.emptyMap());
    }

    private qua(AlbumRecsLoader albumRecsLoader, qxq qxq, CollectionStateProvider collectionStateProvider, jpb jpb, a aVar) {
        this.g = BehaviorSubject.a();
        this.a = albumRecsLoader;
        this.b = qxq;
        this.c = collectionStateProvider;
        this.d = jpb;
        this.e = aVar;
        this.f = PublishSubject.a();
    }

    public final Observable<Boolean> a() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$qua$TE9aFik7ISUXT1_Kumy8bTnsz04.INSTANCE);
    }

    public final Observable<qun> b() {
        return c();
    }

    public final Observable<qun> a(Observable<qum> observable) {
        this.g.onNext(observable.c((Function<? super T, ? extends R>) $$Lambda$mUeg78QF2llkS40z5bPUHr3m4M.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$xxWcAMvFTuoIpsrHlDBC7lko1E.INSTANCE));
        return c();
    }

    private Observable<qun> c() {
        if (this.h == null) {
            this.h = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$qua$fJww9P72diKSfEDC5gv1AML07gQ<Object>(this)).a(1).a();
        }
        return this.h;
    }

    /* access modifiers changed from: private */
    public Observable<qun> d() {
        return this.f.e(Integer.valueOf(100)).h(new $$Lambda$qua$2VAq6jTXuUKhFGDyExSPkreMwFA(this)).h(new $$Lambda$qua$WLVA5AxdwX6GRZKdHo0kvBzN4e4(this)).c((Function<? super T, ? extends R>) new $$Lambda$qua$fk_4HzkD6SKDrXsF0amjCEvutbo<Object,Object>(this)).e((Function<? super Throwable, ? extends T>) $$Lambda$qua$Kisj3keqriiKqfmRqoeCFPEfaiM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String[] strArr) {
        String str = "";
        return Observable.a(Observable.b(strArr), this.e.decorateAlbums(strArr), this.c.a(str, str, strArr), Observable.a((ObservableSource<? extends ObservableSource<? extends T>>) this.g).e(str).a(Functions.a()), new $$Lambda$qua$BNPtxvbrMfvIL434VnB6HslCoc(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(ImmutableList immutableList) {
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        fpt b2 = this.d.b();
        for (int i = 0; i < immutableList.size(); i++) {
            uyq uyq = (uyq) immutableList.get(i);
            g2.c(MusicItem.a(this.b.c.a((CharSequence) uyq.getUri()).c(), uyq.getName(), qxq.a(uyq), uyq.getUri(), uyq.getUri(), uyq.getImageUri(Size.NORMAL), uyq.getAddTime(), i, jsl.c(b2), uyq.isSavedToCollection(), true, uyq.getOfflineState()));
        }
        return quo.b(g2.a());
    }

    /* access modifiers changed from: private */
    public Observable<String[]> a(int i) {
        AlbumRecsLoader albumRecsLoader = this.a;
        StringBuilder sb = new StringBuilder("hm://your-library-view/v1/recommendations/albums?limit=");
        sb.append(i);
        return vun.b(albumRecsLoader.a.resolve(new Request(Request.GET, sb.toString(), ImmutableMap.b("accept", "application/json"), Request.EMPTY_BODY))).c((Function<? super T, ? extends R>) $$Lambda$qua$LBHCluxrzgWF5OjM0sTzrYyCjo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String[] a(AlbumRecsResponse albumRecsResponse) {
        List list = (List) jtc.a(albumRecsResponse.getAlbumRecs(), Collections.emptyList());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((AlbumRec) list.get(i)).getUri();
        }
        return strArr;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r4 == false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.ImmutableList<defpackage.uyq> a(java.lang.String[] r17, java.util.Map<java.lang.String, defpackage.uyq> r18, java.util.Map<java.lang.String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a> r19, java.lang.String r20) {
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
            uyq r8 = (defpackage.uyq) r8
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
            uyr r12 = r8.getArtist()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qua.a(java.lang.String[], java.util.Map, java.util.Map, java.lang.String):com.google.common.collect.ImmutableList");
    }
}
