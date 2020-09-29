package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ryi reason: default package */
final class ryi implements ryh, ryk {
    private final SerialDisposable a;
    private final Flowable<fqn> b;
    private final Scheduler c;
    private final Set<a> d = new HashSet();
    private Optional<fqn> e = Optional.e();

    public ryi(hgy hgy, Scheduler scheduler) {
        this.b = hgy.a();
        this.a = new SerialDisposable();
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        this.e = Optional.b(fqn);
        for (a onFlagsChange : this.d) {
            onFlagsChange.onFlagsChange(fqn);
        }
    }

    public final void a() {
        this.a.a(this.b.a(this.c).c((Consumer<? super T>) new $$Lambda$ryi$2Lxd5fsFyCefvezZHLCBaF4_suw<Object>(this)));
    }

    public final void a(a aVar) {
        this.d.add(aVar);
    }

    public final boolean a(fqm<?> fqm) {
        return this.e.b() && ((fqn) this.e.c()).b(fqm);
    }

    public final void b() {
        this.a.a(Disposables.a());
    }

    public final void b(a aVar) {
        this.d.remove(aVar);
    }
}
