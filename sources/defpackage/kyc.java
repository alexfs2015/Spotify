package defpackage;

import java.util.Random;

/* renamed from: kyc reason: default package */
public final class kyc implements wig<kyb> {
    private final wzi<Random> a;

    private kyc(wzi<Random> wzi) {
        this.a = wzi;
    }

    public static kyc a(wzi<Random> wzi) {
        return new kyc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kyb((Random) this.a.get());
    }
}
