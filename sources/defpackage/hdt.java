package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.Map;

/* renamed from: hdt reason: default package */
public final class hdt implements vua<Observable<Map<String, String>>> {
    private final wlc<hdm> a;
    private final wlc<Scheduler> b;

    private hdt(wlc<hdm> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hdt a(wlc<hdm> wlc, wlc<Scheduler> wlc2) {
        return new hdt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(((hdm) this.a.get()).a().a(1).a().a((Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
