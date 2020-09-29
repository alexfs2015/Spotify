package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: okd reason: default package */
public final class okd {
    private final jlr a;
    private final hgy b;

    /* renamed from: okd$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[BundlingPlaceboBannerFlag.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag[] r0 = com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag r1 = com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag.BANNER_FREE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag r1 = com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag.BANNER_PREMIUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag r1 = com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag.CONTROL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag r1 = com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag.NOT_USED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag r1 = com.spotify.music.features.placebobanner.BundlingPlaceboBannerFlag.USED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.okd.AnonymousClass1.<clinit>():void");
        }
    }

    public okd(jlr jlr, hgy hgy) {
        this.b = hgy;
        this.a = jlr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(BundlingPlaceboBannerFlag bundlingPlaceboBannerFlag) {
        boolean z;
        int i = AnonymousClass1.a[bundlingPlaceboBannerFlag.ordinal()];
        if (i == 1 || i == 2) {
            this.a.a(new aq("", "should-show", null));
            z = true;
        } else {
            if (!(i == 3 || i == 4 || i == 5)) {
                Logger.d("Unknown flag value: %s", b());
            }
            z = false;
        }
        Logger.b("isBannerEnabled: %s", Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    private Observable<BundlingPlaceboBannerFlag> b() {
        return this.b.a(okg.a).j();
    }

    /* access modifiers changed from: 0000 */
    public final Observable<Boolean> a() {
        return b().c((Function<? super T, ? extends R>) new $$Lambda$okd$j0h2c4IspdL_RGLKAxEEthweQR4<Object,Object>(this));
    }
}
