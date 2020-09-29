package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdProduct;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ibn reason: default package */
public final class ibn {
    public Optional<ibm> a = Optional.e();
    public Optional<AdProduct> b = Optional.e();
    public final CompositeDisposable c = new CompositeDisposable();
    private final igh d;

    /* renamed from: ibn$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[AdProduct.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.spotlets.ads.model.AdProduct[] r0 = com.spotify.mobile.android.spotlets.ads.model.AdProduct.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.ads.model.AdProduct r1 = com.spotify.mobile.android.spotlets.ads.model.AdProduct.AUDIO_AD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.ads.model.AdProduct r1 = com.spotify.mobile.android.spotlets.ads.model.AdProduct.VIDEO_AD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ibn.AnonymousClass1.<clinit>():void");
        }
    }

    public ibn(igh igh) {
        this.d = igh;
    }

    public static ibl a(AdProduct adProduct, ibm ibm) {
        int i = AnonymousClass1.a[adProduct.ordinal()];
        return i != 1 ? i != 2 ? ibm.c : ibm.a : ibm.b;
    }

    /* access modifiers changed from: private */
    public void a(Optional<AdProduct> optional) {
        Logger.b("AdProduct received: %s", optional);
        this.b = optional;
        boolean b2 = this.b.b();
        boolean b3 = this.a.b();
        if (b2 && b3) {
            a((AdProduct) this.b.c(), (ibm) this.a.c()).a();
        }
    }

    public final void a() {
        this.c.c();
        CompositeDisposable compositeDisposable = this.c;
        igh igh = this.d;
        compositeDisposable.a(igh.b.h(igh.a).a((Consumer<? super T>) new $$Lambda$ibn$f_jOQVe8J1WcEkHVUO7oPWT0YHI<Object>(this), (Consumer<? super Throwable>) $$Lambda$ibn$y9zTxlk1pL0fgZc7W4vR0uf1O9o.INSTANCE));
    }
}
