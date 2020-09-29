package defpackage;

import android.view.ViewGroup;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

/* renamed from: sln reason: default package */
public final class sln implements c {
    private final CompositeDisposable a = new CompositeDisposable();
    private final smf b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public sln(smf smf) {
        this.b = smf;
    }

    public final void a(ViewGroup viewGroup) {
        for (c a2 : this.b.a) {
            a2.a(viewGroup);
        }
    }

    public final void a() {
        for (c cVar : this.b.a) {
            CompositeDisposable compositeDisposable = this.a;
            cVar.getClass();
            compositeDisposable.a(Completable.a((Runnable) new $$Lambda$mduZeWOCtCXTBEVARjTCvQS88ck(cVar)).b(Schedulers.a()).c((Action) $$Lambda$sln$n23Da127ym72wtyesJqtbIrDZls.INSTANCE));
        }
    }

    public final void b() {
        this.a.c();
        for (c b2 : this.b.a) {
            b2.b();
        }
    }
}
