package defpackage;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;

/* renamed from: wip reason: default package */
final class wip implements defpackage.xig.a {
    private CompletableSource a;

    /* renamed from: wip$a */
    static final class a implements CompletableObserver, xip {
        private xih a;
        private Disposable b;

        a(xih xih) {
            this.a = xih;
        }

        public final boolean isUnsubscribed() {
            return this.b.b();
        }

        public final void onComplete() {
            this.a.a();
        }

        public final void onError(Throwable th) {
            this.a.a(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            this.a.a((xip) this);
        }

        public final void unsubscribe() {
            this.b.bd_();
        }
    }

    wip(CompletableSource completableSource) {
        this.a = completableSource;
    }

    public final /* synthetic */ void call(Object obj) {
        this.a.a(new a((xih) obj));
    }
}
