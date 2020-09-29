package defpackage;

import io.reactivex.Scheduler;

/* renamed from: owp reason: default package */
public final class owp implements wig<owo> {
    private final wzi<opw> a;
    private final wzi<owq> b;
    private final wzi<String> c;
    private final wzi<Scheduler> d;

    private owp(wzi<opw> wzi, wzi<owq> wzi2, wzi<String> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static owp a(wzi<opw> wzi, wzi<owq> wzi2, wzi<String> wzi3, wzi<Scheduler> wzi4) {
        return new owp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new owo((opw) this.a.get(), (owq) this.b.get(), (String) this.c.get(), (Scheduler) this.d.get());
    }
}
