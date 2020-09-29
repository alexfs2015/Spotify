package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wwz reason: default package */
public final class wwz<T> implements defpackage.wuh.a<T> {
    private defpackage.wuh.a<T> a;
    private long b;
    private TimeUnit c;
    private wug d;
    private defpackage.wuh.a<? extends T> e;

    /* renamed from: wwz$a */
    static final class a<T> extends wui<T> implements wum {
        private wui<? super T> a;
        private AtomicBoolean b = new AtomicBoolean();
        private defpackage.wuh.a<? extends T> c;

        /* renamed from: wwz$a$a reason: collision with other inner class name */
        static final class C0089a<T> extends wui<T> {
            private wui<? super T> a;

            C0089a(wui<? super T> wui) {
                this.a = wui;
            }

            public final void a(T t) {
                this.a.a(t);
            }

            public final void a(Throwable th) {
                this.a.a(th);
            }
        }

        a(wui<? super T> wui, defpackage.wuh.a<? extends T> aVar) {
            this.a = wui;
            this.c = aVar;
        }

        public final void a(T t) {
            if (this.b.compareAndSet(false, true)) {
                try {
                    this.a.a(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        public final void a(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                try {
                    this.a.a(th);
                } finally {
                    unsubscribe();
                }
            } else {
                wzs.a(th);
            }
        }

        public final void call() {
            if (this.b.compareAndSet(false, true)) {
                try {
                    defpackage.wuh.a<? extends T> aVar = this.c;
                    if (aVar == null) {
                        this.a.a((Throwable) new TimeoutException());
                    } else {
                        C0089a aVar2 = new C0089a(this.a);
                        this.a.a((wuk) aVar2);
                        aVar.call(aVar2);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        a aVar = new a(wui, this.e);
        defpackage.wug.a c2 = this.d.c();
        aVar.a((wuk) c2);
        wui.a((wuk) aVar);
        c2.a(aVar, this.b, this.c);
        this.a.call(aVar);
    }

    public wwz(defpackage.wuh.a<T> aVar, long j, TimeUnit timeUnit, wug wug, defpackage.wuh.a<? extends T> aVar2) {
        this.a = aVar;
        this.b = j;
        this.c = timeUnit;
        this.d = wug;
        this.e = aVar2;
    }
}
