package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.features.payfail.PaymentFailureRepository;

/* renamed from: ohc reason: default package */
public final class ohc implements wig<PaymentFailureRepository> {
    private final wzi<rwl> a;
    private final wzi<RxResolver> b;

    private ohc(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ohc a(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        return new ohc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new PaymentFailureRepository((rwl) this.a.get(), (RxResolver) this.b.get());
    }
}
