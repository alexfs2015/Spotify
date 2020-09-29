package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: qvg reason: default package */
public final class qvg implements wig<Observable<Boolean>> {
    private final wzi<Integer> a;
    private final wzi<Scheduler> b;

    private qvg(wzi<Integer> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qvg a(wzi<Integer> wzi, wzi<Scheduler> wzi2) {
        return new qvg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(Observable.b(Boolean.TRUE).c((long) ((Integer) this.a.get()).intValue(), TimeUnit.MILLISECONDS, (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
