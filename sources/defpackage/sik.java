package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: sik reason: default package */
public final class sik implements wig<sij> {
    private final wzi<RxResolver> a;
    private final wzi<Boolean> b;

    private sik(wzi<RxResolver> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sik a(wzi<RxResolver> wzi, wzi<Boolean> wzi2) {
        return new sik(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sij((RxResolver) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
