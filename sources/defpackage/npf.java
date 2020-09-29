package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;

/* renamed from: npf reason: default package */
public final class npf {
    private final niz a;
    private final niq b;
    private final nja c;
    private final nou d;
    private final nka e;
    private final njp f;
    private final hcs g;
    private final hcs h;
    private final xii<RecentlyPlayedItems> i;
    private final Observable<njs> j;
    private final Function3<hcs, hcs, njs, hcs> k;

    /* renamed from: npf$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PODCAST_EPISODE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.npf.AnonymousClass1.<clinit>():void");
        }
    }

    public npf(boolean z, niz niz, niq niq, nja nja, nit nit, nou nou, nka nka, Observable<njs> observable, njp njp, xii<RecentlyPlayedItems> xii) {
        this.a = niz;
        this.b = niq;
        this.c = nja;
        this.d = nou;
        this.e = nka;
        this.f = njp;
        a builder = hdb.builder();
        hcm[] hcmArr = new hcm[1];
        String str = "ui:group";
        hcmArr[0] = hcx.builder().a("home:inlineEmptyState", HubsComponentCategory.CARD.mId).a(hcy.builder().a(nit.a).b(z ? nit.f : nit.e).a()).c(HubsImmutableComponentBundle.builder().a(str, "home-offline-download-prompt").a()).a();
        this.g = builder.a(hcmArr).a();
        a b2 = hbb.b();
        hcm[] hcmArr2 = new hcm[1];
        a a2 = hcx.builder().a((hck) HubsGlue2MiscComponents.EMPTY_STATE);
        a a3 = hcy.builder().a(nit.a);
        String str2 = z ? nit.f : nit.e;
        String str3 = "home-no-network-empty-view";
        hcmArr2[0] = a2.a(a3.b(str2)).e(HubsImmutableComponentBundle.builder().a("tag", str3).a("style", "noResults").a()).c(HubsImmutableComponentBundle.builder().a(str, str3).a()).a();
        this.h = b2.c(hcmArr2).a();
        this.i = xii;
        this.j = observable;
        this.k = new $$Lambda$npf$gSEnUTKPjDP72cIN9aBPbETMEyE(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(hcs hcs) {
        return niq.a(hcs, "offline", Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        if (defpackage.fbo.a(r11) == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        if (defpackage.fbo.a(r11) == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        if (defpackage.fbo.a(r11) == false) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ defpackage.hcs a(defpackage.hcs r15, defpackage.hcs r16, defpackage.njs r17) {
        /*
            r14 = this;
            r0 = r14
            java.util.List r1 = r16.body()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0018
            java.util.List r1 = r15.body()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0018
            hcs r1 = r0.h
            return r1
        L_0x0018:
            java.util.ArrayList r1 = com.google.common.collect.Lists.a()
            java.util.List r2 = r15.body()
            r3 = 0
            r4 = 0
        L_0x0022:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x004a
            java.lang.Object r5 = r2.get(r4)
            hcm r5 = (defpackage.hcm) r5
            if (r5 == 0) goto L_0x0047
            hcj r5 = r5.custom()
            java.util.Set r5 = r5.keySet()
            java.lang.String r6 = "autoDownload"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0047
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.add(r5)
        L_0x0047:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x004a:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0070
            java.util.List r1 = r16.body()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x005d
            hcs r1 = r0.g
            goto L_0x005f
        L_0x005d:
            r1 = r16
        L_0x005f:
            hcs$a r1 = r1.toBuilder()
            java.util.List r2 = r15.body()
            hcs$a r1 = r1.b(r2)
            hcs r1 = r1.a()
            return r1
        L_0x0070:
            java.util.List r2 = r16.body()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0081
            hcs r2 = r0.g
            java.util.List r2 = r2.body()
            goto L_0x0085
        L_0x0081:
            java.util.List r2 = r16.body()
        L_0x0085:
            int r4 = r1.size()
            java.util.ArrayList r4 = com.google.common.collect.Lists.a(r4)
            java.util.List r5 = r15.body()
            int r5 = r5.size()
            int r6 = r1.size()
            int r5 = r5 - r6
            java.util.ArrayList r5 = com.google.common.collect.Lists.a(r5)
            r6 = 0
        L_0x009f:
            java.util.List r7 = r15.body()
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x01f5
            java.util.List r7 = r15.body()
            java.lang.Object r7 = r7.get(r6)
            hcm r7 = (defpackage.hcm) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L_0x01ee
            java.util.List r8 = r7.children()
            int r8 = r8.size()
            java.util.ArrayList r8 = com.google.common.collect.Lists.a(r8)
            java.util.List r9 = r7.children()
            java.util.Iterator r9 = r9.iterator()
        L_0x00d1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01de
            java.lang.Object r10 = r9.next()
            hcm r10 = (defpackage.hcm) r10
            hcj r11 = r10.metadata()
            java.util.Set r11 = r11.keySet()
            java.lang.String r12 = "uri"
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L_0x00fc
            hcj r11 = r10.metadata()
            java.lang.String r11 = r11.string(r12)
            boolean r13 = defpackage.fbo.a(r11)
            if (r13 != 0) goto L_0x00fc
            goto L_0x0144
        L_0x00fc:
            hcj r11 = r10.logging()
            java.util.Set r11 = r11.keySet()
            java.lang.String r13 = "ui:uri"
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x011b
            hcj r11 = r10.logging()
            java.lang.String r11 = r11.string(r13)
            boolean r13 = defpackage.fbo.a(r11)
            if (r13 != 0) goto L_0x011b
            goto L_0x0144
        L_0x011b:
            java.util.Map r11 = r10.events()
            java.lang.String r13 = "navigate"
            boolean r11 = r11.containsKey(r13)
            if (r11 == 0) goto L_0x0142
            java.util.Map r11 = r10.events()
            java.lang.Object r11 = r11.get(r13)
            hci r11 = (defpackage.hci) r11
            if (r11 == 0) goto L_0x0142
            hcj r11 = r11.data()
            java.lang.String r11 = r11.string(r12)
            boolean r12 = defpackage.fbo.a(r11)
            if (r12 != 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            java.lang.String r11 = ""
        L_0x0144:
            jva r12 = defpackage.jva.a(r11)
            int[] r13 = defpackage.npf.AnonymousClass1.a
            com.spotify.mobile.android.util.LinkType r12 = r12.b
            int r12 = r12.ordinal()
            r12 = r13[r12]
            r13 = 1
            if (r12 == r13) goto L_0x0196
            r13 = 2
            if (r12 == r13) goto L_0x0180
            r13 = 3
            if (r12 == r13) goto L_0x016a
            r13 = 4
            if (r12 == r13) goto L_0x016a
            com.google.common.base.Optional r11 = com.google.common.base.Optional.e()
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r13 = "Not a supported link type"
            com.spotify.base.java.logging.Logger.d(r13, r12)
            goto L_0x01ab
        L_0x016a:
            vlb r12 = r17.b()
            java.lang.Object[] r12 = r12.getItems()
            java.util.List r12 = java.util.Arrays.asList(r12)
            -$$Lambda$npf$z5KXX_fNTh3dR9kTj1pDDHzDhQg r13 = new -$$Lambda$npf$z5KXX_fNTh3dR9kTj1pDDHzDhQg
            r13.<init>(r11)
            com.google.common.base.Optional r11 = defpackage.fdd.f(r12, r13)
            goto L_0x01ab
        L_0x0180:
            vlb r12 = r17.c()
            java.lang.Object[] r12 = r12.getItems()
            java.util.List r12 = java.util.Arrays.asList(r12)
            -$$Lambda$npf$oatv7e9vsrk3NnCK2PtzUfD-ugg r13 = new -$$Lambda$npf$oatv7e9vsrk3NnCK2PtzUfD-ugg
            r13.<init>(r11)
            com.google.common.base.Optional r11 = defpackage.fdd.f(r12, r13)
            goto L_0x01ab
        L_0x0196:
            vky r12 = r17.a()
            java.lang.Object[] r12 = r12.getItems()
            java.util.List r12 = java.util.Arrays.asList(r12)
            -$$Lambda$npf$fJN0xBbgXl1_3pcCKBHAEIBDYZY r13 = new -$$Lambda$npf$fJN0xBbgXl1_3pcCKBHAEIBDYZY
            r13.<init>(r11)
            com.google.common.base.Optional r11 = defpackage.fdd.f(r12, r13)
        L_0x01ab:
            boolean r11 = r11.b()
            if (r11 == 0) goto L_0x01d9
            hcm$a r11 = r10.toBuilder()
            hco$a r12 = defpackage.hcy.builder()
            hco r10 = r10.text()
            java.lang.String r10 = r10.title()
            java.lang.String r10 = defpackage.fbo.b(r10)
            hco$a r10 = r12.b(r10)
            hcm$a r10 = r11.a(r10)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.String r12 = "downloadedBadge"
            hcm$a r10 = r10.c(r12, r11)
            hcm r10 = r10.a()
        L_0x01d9:
            r8.add(r10)
            goto L_0x00d1
        L_0x01de:
            hcm$a r7 = r7.toBuilder()
            hcm$a r7 = r7.a(r8)
            hcm r7 = r7.a()
            r4.add(r7)
            goto L_0x01f1
        L_0x01ee:
            r5.add(r7)
        L_0x01f1:
            int r6 = r6 + 1
            goto L_0x009f
        L_0x01f5:
            java.util.List r1 = r16.body()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0208
            fcp r1 = defpackage.fcp.a(r2, r4, r5)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.a(r1)
            goto L_0x0210
        L_0x0208:
            fcp r1 = defpackage.fcp.a(r4, r2, r5)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.a(r1)
        L_0x0210:
            hcs$a r2 = defpackage.hdb.builder()
            hcs$a r1 = r2.a(r1)
            hcs r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npf.a(hcs, hcs, njs):hcs");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(Throwable th) {
        return this.h;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, vla vla) {
        return vla != null && vla.getUri().equals(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs b(hcs hcs) {
        return (hcs) this.e.call(hcs, Integer.valueOf(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, vla vla) {
        if (vla == null) {
            return false;
        }
        String uri = vla.getUri();
        jva a2 = jva.a(uri);
        return a2.b != LinkType.ALBUM ? str.equals(jva.e(a2.f()).h()) : str.equals(uri);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(String str, vla vla) {
        if (vla == null) {
            return false;
        }
        String uri = vla.getUri();
        jva a2 = jva.a(uri);
        return a2.b != LinkType.PLAYLIST_V2 ? str.equals(jva.f(a2.f()).h()) : str.equals(uri);
    }

    public final Observable<hcs> a() {
        return Observable.a((ObservableSource<? extends T1>) wit.b(xii.a(this.a.a().e((xiy<? super T, ? extends R>) this.c).e((xiy<? super T, ? extends R>) new $$Lambda$npf$PcjBNdtaFAoU5AGk4VK9brj3ILc<Object,Object>(this)).a(hdb.EMPTY), this.i, (xiz<? super T1, ? super T2, ? extends R>) this.d)), (ObservableSource<? extends T2>) this.j.c((Function<? super T, ? extends R>) this.f).e((Function<? super Throwable, ? extends T>) $$Lambda$npf$_rPpoM0sQlKcXDna42DgPCuwRE.INSTANCE), (ObservableSource<? extends T3>) this.j, this.k).e((Function<? super Throwable, ? extends T>) new $$Lambda$npf$TgLg1EojA2Tht5RtExuvQBA3vSA<Object,Object>(this)).c((Function<? super T, ? extends R>) new $$Lambda$npf$l6ZXlGRL0tloiiDsu24PuQAfHxg<Object,Object>(this));
    }
}
