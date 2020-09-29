package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mjl reason: default package */
public final class mjl implements wig<mjk> {
    private final wzi<ni> a;
    private final wzi<String> b;
    private final wzi<Scheduler> c;

    private mjl(wzi<ni> wzi, wzi<String> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mjl a(wzi<ni> wzi, wzi<String> wzi2, wzi<Scheduler> wzi3) {
        return new mjl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mjk((ni) this.a.get(), (String) this.b.get(), (Scheduler) this.c.get());
    }
}
