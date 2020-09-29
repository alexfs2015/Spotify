package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: vij reason: default package */
public final class vij extends vik {
    private final Scheduler b;

    public vij(int i, long j, Scheduler scheduler) {
        super(i, j);
        this.b = scheduler;
    }

    /* access modifiers changed from: 0000 */
    public final Observable<Long> a() {
        return Observable.a(this.a, TimeUnit.MILLISECONDS, this.b);
    }
}
