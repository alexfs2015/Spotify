package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: wsa reason: default package */
final class wsa extends defpackage.wrv.a {
    final Executor a;

    /* renamed from: wsa$a */
    static final class a<T> implements wru<T> {
        final Executor a;
        final wru<T> b;

        a(Executor executor, wru<T> wru) {
            this.a = executor;
            this.b = wru;
        }

        public final void a(final wrw<T> wrw) {
            wsm.a(wrw, "callback == null");
            this.b.a(new wrw<T>() {
                public final void a(final wsj<T> wsj) {
                    a.this.a.execute(new Runnable() {
                        public final void run() {
                            if (a.this.b.c()) {
                                wrw.a(a.this, new IOException("Canceled"));
                            } else {
                                wrw.a(wsj);
                            }
                        }
                    });
                }

                public final void a(wru<T> wru, final Throwable th) {
                    a.this.a.execute(new Runnable() {
                        public final void run() {
                            wrw.a(a.this, th);
                        }
                    });
                }
            });
        }

        public final wsj<T> a() {
            return this.b.a();
        }

        public final void b() {
            this.b.b();
        }

        public final boolean c() {
            return this.b.c();
        }

        /* renamed from: d */
        public final wru<T> clone() {
            return new a(this.a, this.b.d());
        }
    }

    wsa(Executor executor) {
        this.a = executor;
    }

    public final wrv<?, ?> a(Type type) {
        if (wsm.a(type) != wru.class) {
            return null;
        }
        final Type e = wsm.e(type);
        return new wrv<Object, wru<?>>() {
            public final Type a() {
                return e;
            }

            public final /* synthetic */ Object a(wru wru) {
                return new a(wsa.this.a, wru);
            }
        };
    }
}
