package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wvn reason: default package */
public final class wvn<T> implements defpackage.wud.a<T> {
    private wud<? extends T> a;
    private wud<? extends T> b;

    /* renamed from: wvn$a */
    static final class a<T> extends wuj<T> {
        private final wxb a;
        private final wuj<? super T> b;

        a(wuj<? super T> wuj, wxb wxb) {
            this.b = wuj;
            this.a = wxb;
        }

        public final void setProducer(wuf wuf) {
            this.a.a(wuf);
        }

        public final void onCompleted() {
            this.b.onCompleted();
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        public final void onNext(T t) {
            this.b.onNext(t);
            this.a.b(1);
        }
    }

    /* renamed from: wvn$b */
    static final class b<T> extends wuj<T> {
        private boolean a = true;
        private final wuj<? super T> b;
        private final xai c;
        private final wxb d;
        private final wud<? extends T> e;
        private AtomicInteger f;
        private volatile boolean g;

        b(wuj<? super T> wuj, xai xai, wxb wxb, wud<? extends T> wud) {
            this.b = wuj;
            this.c = xai;
            this.d = wxb;
            this.e = wud;
            this.f = new AtomicInteger();
        }

        public final void setProducer(wuf wuf) {
            this.d.a(wuf);
        }

        public final void onCompleted() {
            if (!this.a) {
                this.b.onCompleted();
                return;
            }
            if (!this.b.isUnsubscribed()) {
                this.g = false;
                a(null);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(wud<? extends T> wud) {
            if (this.f.getAndIncrement() == 0) {
                while (!this.b.isUnsubscribed()) {
                    if (!this.g) {
                        if (wud == null) {
                            a aVar = new a(this.b, this.d);
                            this.c.a(aVar);
                            this.g = true;
                            this.e.a((wuj<? super T>) aVar);
                        } else {
                            this.g = true;
                            wud.a((wuj<? super T>) this);
                            wud = null;
                        }
                    }
                    if (this.f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        public final void onNext(T t) {
            this.a = false;
            this.b.onNext(t);
            this.d.b(1);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        xai xai = new xai();
        wxb wxb = new wxb();
        b bVar = new b(wuj, xai, wxb, this.b);
        xai.a(bVar);
        wuj.add(xai);
        wuj.setProducer(wxb);
        bVar.a(this.a);
    }

    public wvn(wud<? extends T> wud, wud<? extends T> wud2) {
        this.a = wud;
        this.b = wud2;
    }
}
