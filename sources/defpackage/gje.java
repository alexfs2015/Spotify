package defpackage;

import io.reactivex.Scheduler;

/* renamed from: gje reason: default package */
public final class gje implements wig<gio> {
    private final wzi<gin> a;
    private final wzi<Scheduler> b;

    private gje(wzi<gin> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gje a(wzi<gin> wzi, wzi<Scheduler> wzi2) {
        return new gje(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gio) wil.a(new gio((gin) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
