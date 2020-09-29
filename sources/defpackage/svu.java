package defpackage;

import android.view.ViewGroup;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

/* renamed from: svu reason: default package */
public final class svu implements c {
    private final CompositeDisposable a = new CompositeDisposable();
    private final swm b;

    public svu(swm swm) {
        this.b = swm;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public final void a() {
        for (c cVar : this.b.a) {
            CompositeDisposable compositeDisposable = this.a;
            cVar.getClass();
            compositeDisposable.a(Completable.a((Runnable) new $$Lambda$1oh_WiH78Gbu3GRNlwCSrdPMKP0(cVar)).b(Schedulers.a()).c((Action) $$Lambda$svu$wpSikPQwug1ZNmmHR0ZcXuhEjPw.INSTANCE));
        }
    }

    public final void a(ViewGroup viewGroup) {
        for (c a2 : this.b.a) {
            a2.a(viewGroup);
        }
    }

    public final void b() {
        this.a.c();
        for (c b2 : this.b.a) {
            b2.b();
        }
    }
}
