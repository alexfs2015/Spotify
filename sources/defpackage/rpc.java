package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rpc reason: default package */
final class rpc implements rpb, rpe {
    private final SerialDisposable a;
    private final Flowable<fpt> b;
    private final Scheduler c;
    private final List<a> d = new ArrayList();
    private Optional<fpt> e = Optional.e();

    public rpc(hec hec, Scheduler scheduler) {
        this.b = hec.a();
        this.a = new SerialDisposable();
        this.c = scheduler;
    }

    public final void a() {
        this.a.a(this.b.a(this.c).c((Consumer<? super T>) new $$Lambda$rpc$PWTneHIpHB67yK_D46zkQVER4k<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        this.e = Optional.b(fpt);
        for (a onFlagsChange : this.d) {
            onFlagsChange.onFlagsChange(fpt);
        }
    }

    public final void b() {
        this.a.a(Disposables.a());
    }

    public final boolean a(fps<?> fps) {
        return this.e.b() && ((fpt) this.e.c()).b(fps);
    }

    public final void a(a aVar) {
        this.d.add(aVar);
    }

    public final void b(a aVar) {
        this.d.remove(aVar);
    }
}
