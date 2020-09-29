package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: qmy reason: default package */
public final class qmy implements vua<Observable<Boolean>> {
    private final wlc<Integer> a;
    private final wlc<Scheduler> b;

    private qmy(wlc<Integer> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qmy a(wlc<Integer> wlc, wlc<Scheduler> wlc2) {
        return new qmy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(Observable.b(Boolean.TRUE).c((long) ((Integer) this.a.get()).intValue(), TimeUnit.MILLISECONDS, (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
