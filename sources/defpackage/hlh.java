package defpackage;

import android.os.Handler;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: hlh reason: default package */
final class hlh implements c {
    final Handler a;
    final jkp b;
    private final hlf c;
    private final Flowable<fqn> d;
    private final kae e;
    private Disposable f = Disposables.b();
    private final kba g = new kba() {
        /* access modifiers changed from: private */
        public /* synthetic */ void c(boolean z) {
            hlh.this.b.a(z);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(boolean z) {
            hlh.this.b.o.a(z);
        }

        public final void a(boolean z) {
            hlh.this.a.post(new $$Lambda$hlh$1$qZ9zzebzXYSsuTytB7exF6QsdBA(this, z));
        }

        public final void b(boolean z) {
            hlh.this.a.post(new $$Lambda$hlh$1$AJ4oLtagaAKtLaGEQwCcZODFve0(this, z));
        }
    };

    hlh(hlf hlf, Flowable<fqn> flowable, Handler handler, jkp jkp, kae kae) {
        this.c = hlf;
        this.d = flowable;
        this.a = handler;
        this.b = jkp;
        this.e = kae;
    }

    public final void ai_() {
        hlf hlf = this.c;
        kba kba = this.g;
        fbp.a(kba);
        hlf.a = kba;
        this.e.b();
        Flowable<fqn> flowable = this.d;
        hlf hlf2 = this.c;
        hlf2.getClass();
        this.f = flowable.c((Consumer<? super T>) new $$Lambda$kPMG5XeK_Ivlufiw8TUh1xvztI<Object>(hlf2));
    }

    public final void aj_() {
        this.f.bd_();
        hhf.a(this.e.a);
    }

    public final String c() {
        return "BetamaxPlayer";
    }
}
