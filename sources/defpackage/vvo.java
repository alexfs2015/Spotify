package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: vvo reason: default package */
public final class vvo extends vvp {
    private final Scheduler b;

    public vvo(int i, long j, Scheduler scheduler) {
        super(i, j);
        this.b = scheduler;
    }

    /* access modifiers changed from: 0000 */
    public final Observable<Long> a() {
        return Observable.a(this.a, TimeUnit.MILLISECONDS, this.b);
    }
}
