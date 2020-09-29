package defpackage;

import android.os.Handler;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: hin reason: default package */
final class hin implements c {
    final Handler a;
    final jhz b;
    private final hil c;
    private final Flowable<fpt> d;
    private final jye e;
    private Disposable f = Disposables.b();
    private final jza g = new jza() {
        public final void a(boolean z) {
            hin.this.a.post(new $$Lambda$hin$1$4dskjwomHtO_GWVxS2w6lTY6uYM(this, z));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(boolean z) {
            hin.this.b.o.a(z);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(boolean z) {
            hin.this.b.a(z);
        }

        public final void b(boolean z) {
            hin.this.a.post(new $$Lambda$hin$1$8bzMQ2_wuIat5mBOXrto_0wMjhg(this, z));
        }
    };

    public final String c() {
        return "BetamaxPlayer";
    }

    hin(hil hil, Flowable<fpt> flowable, Handler handler, jhz jhz, jye jye) {
        this.c = hil;
        this.d = flowable;
        this.a = handler;
        this.b = jhz;
        this.e = jye;
    }

    public final void ai_() {
        hil hil = this.c;
        jza jza = this.g;
        fay.a(jza);
        hil.a = jza;
        this.e.b();
        Flowable<fpt> flowable = this.d;
        hil hil2 = this.c;
        hil2.getClass();
        this.f = flowable.c((Consumer<? super T>) new $$Lambda$6FaWMhDEmxz3DdfL8F8FJ6NmEUY<Object>(hil2));
    }

    public final void aj_() {
        this.f.bf_();
        hej.a(this.e.a);
    }
}
