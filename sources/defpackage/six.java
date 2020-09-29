package defpackage;

import io.reactivex.Scheduler;

/* renamed from: six reason: default package */
public final class six implements vua<siw> {
    private final wlc<siv> a;
    private final wlc<Scheduler> b;

    public static siw a(Object obj, Scheduler scheduler) {
        return new siw((siv) obj, scheduler);
    }

    public final /* synthetic */ Object get() {
        return new siw((siv) this.a.get(), (Scheduler) this.b.get());
    }
}
