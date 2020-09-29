package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import rx.subjects.PublishSubject;

/* renamed from: sfy reason: default package */
public final class sfy extends gnk {
    private final PublishSubject<ViewLoadSequence> b = PublishSubject.e();
    private final xil c;
    private xip d = xon.a();

    public sfy(xil xil) {
        this.c = xil;
    }

    public final synchronized void a() {
        if (!this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        this.d = this.b.a(this.c).a((xis<? super T>) new $$Lambda$E4TetqkwWRtTMqtkDhj3nHgfvSA<Object>(this), (xis<Throwable>) $$Lambda$sfy$qtHL7gSVZdJeRuRPU35iZQhwh8I.INSTANCE);
        super.a();
    }

    public final synchronized void b() {
        if (!this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        super.b();
    }

    public final void b(ViewLoadSequence viewLoadSequence) {
        this.b.onNext(viewLoadSequence);
    }
}
