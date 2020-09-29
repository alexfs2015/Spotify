package defpackage;

import com.google.common.base.Function;
import com.google.common.util.concurrent.DirectExecutor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: fey reason: default package */
public abstract class fey<I, O, F, T> extends a<O> implements Runnable {
    private ffe<? extends I> a;
    private F b;

    /* renamed from: fey$a */
    static final class a<I, O> extends fey<I, O, Function<? super I, ? extends O>, O> {
        a(ffe<? extends I> ffe, Function<? super I, ? extends O> function) {
            super(ffe, function);
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            return ((Function) obj).apply(obj2);
        }

        /* access modifiers changed from: 0000 */
        public final void a(O o) {
            set(o);
        }
    }

    fey(ffe<? extends I> ffe, F f) {
        this.a = (ffe) fbp.a(ffe);
        this.b = fbp.a(f);
    }

    public static <I, O> ffe<O> a(ffe<I> ffe, Function<? super I, ? extends O> function, Executor executor) {
        fbp.a(function);
        a aVar = new a(ffe, function);
        fbp.a(executor);
        fbp.a(aVar);
        ffe.addListener(aVar, executor == DirectExecutor.INSTANCE ? executor : new Executor(executor, aVar) {
            boolean a = true;
            private /* synthetic */ Executor b;
            private /* synthetic */ fex c;

            {
                this.b = r1;
                this.c = r2;
            }

            public final void execute(final Runnable runnable) {
                try {
                    this.b.execute(new Runnable() {
                        public final void run() {
                            AnonymousClass1.this.a = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    if (this.a) {
                        this.c.setException(e);
                    }
                }
            }
        });
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    public abstract T a(F f, I i);

    /* access modifiers changed from: 0000 */
    public abstract void a(T t);

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.a);
        this.a = null;
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public String pendingToString() {
        String str;
        ffe<? extends I> ffe = this.a;
        F f = this.b;
        String pendingToString = super.pendingToString();
        if (ffe != null) {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(ffe);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(pendingToString);
            return sb3.toString();
        }
    }

    public final void run() {
        ffe<? extends I> ffe = this.a;
        F f = this.b;
        if (!(isCancelled() | (ffe == null)) && !(f == null)) {
            this.a = null;
            if (ffe.isCancelled()) {
                setFuture(ffe);
                return;
            }
            try {
                String str = "Future was expected to be done: %s";
                if (ffe.isDone()) {
                    try {
                        Object a2 = a(f, ffh.a(ffe));
                        this.b = null;
                        a(a2);
                    } catch (Throwable th) {
                        this.b = null;
                        throw th;
                    }
                } else {
                    throw new IllegalStateException(fbt.a(str, ffe));
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                setException(e.getCause());
            } catch (RuntimeException e2) {
                setException(e2);
            } catch (Error e3) {
                setException(e3);
            }
        }
    }
}
