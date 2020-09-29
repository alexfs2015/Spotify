package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: xgf reason: default package */
final class xgf extends defpackage.xga.a {
    final Executor a;

    /* renamed from: xgf$a */
    static final class a<T> implements xfz<T> {
        final Executor a;
        final xfz<T> b;

        a(Executor executor, xfz<T> xfz) {
            this.a = executor;
            this.b = xfz;
        }

        public final xgo<T> a() {
            return this.b.a();
        }

        public final void a(final xgb<T> xgb) {
            xgr.a(xgb, "callback == null");
            this.b.a(new xgb<T>() {
                public final void a(xfz<T> xfz, final Throwable th) {
                    a.this.a.execute(new Runnable() {
                        public final void run() {
                            xgb.a(a.this, th);
                        }
                    });
                }

                public final void a(final xgo<T> xgo) {
                    a.this.a.execute(new Runnable() {
                        public final void run() {
                            if (a.this.b.c()) {
                                xgb.a(a.this, new IOException("Canceled"));
                            } else {
                                xgb.a(xgo);
                            }
                        }
                    });
                }
            });
        }

        public final void b() {
            this.b.b();
        }

        public final boolean c() {
            return this.b.c();
        }

        /* renamed from: d */
        public final xfz<T> clone() {
            return new a(this.a, this.b.d());
        }
    }

    xgf(Executor executor) {
        this.a = executor;
    }

    public final xga<?, ?> a(Type type) {
        if (xgr.a(type) != xfz.class) {
            return null;
        }
        final Type e = xgr.e(type);
        return new xga<Object, xfz<?>>() {
            public final /* synthetic */ Object a(xfz xfz) {
                return new a(xgf.this.a, xfz);
            }

            public final Type a() {
                return e;
            }
        };
    }
}
