package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import rx.subjects.PublishSubject;

/* renamed from: rwo reason: default package */
public final class rwo extends glv {
    private final PublishSubject<ViewLoadSequence> b = PublishSubject.e();
    private final wug c;
    private wuk d = xaj.a();

    public rwo(wug wug) {
        this.c = wug;
    }

    public final synchronized void a() {
        if (!this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        this.d = this.b.a(this.c).a((wun<? super T>) new $$Lambda$EVpnq0xVg_sT2E53v1W_AsMST1o<Object>(this), (wun<Throwable>) $$Lambda$rwo$KhzB5pRjVDAztgdHyBSmsoCCnyo.INSTANCE);
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
