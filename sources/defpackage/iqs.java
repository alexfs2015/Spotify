package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqs reason: default package */
public final class iqs implements wig<iqp> {
    private final wzi<RxResolver> a;

    private iqs(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static iqs a(wzi<RxResolver> wzi) {
        return new iqs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new iqp((RxResolver) this.a.get());
    }
}
