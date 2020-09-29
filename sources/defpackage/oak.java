package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.features.payfail.PaymentFailureRepository;

/* renamed from: oak reason: default package */
public final class oak implements vua<PaymentFailureRepository> {
    private final wlc<rnf> a;
    private final wlc<RxResolver> b;

    private oak(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oak a(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        return new oak(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new PaymentFailureRepository((rnf) this.a.get(), (RxResolver) this.b.get());
    }
}
