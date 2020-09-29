package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mdx reason: default package */
public final class mdx implements wig<mdw> {
    private final wzi<kym> a;
    private final wzi<Scheduler> b;

    private mdx(wzi<kym> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mdx a(wzi<kym> wzi, wzi<Scheduler> wzi2) {
        return new mdx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mdw((kym) this.a.get(), (Scheduler) this.b.get());
    }
}
