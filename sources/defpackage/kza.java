package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kza reason: default package */
public final class kza implements wig<Callable<Boolean>> {
    private final wzi<fqn> a;
    private final wzi<kyk> b;

    private kza(wzi<fqn> wzi, wzi<kyk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kza a(wzi<fqn> wzi, wzi<kyk> wzi2) {
        return new kza(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Callable) wil.a(CC.a((fqn) this.a.get(), (kyk) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
