package defpackage;

import com.google.common.base.Function;
import com.google.common.util.concurrent.DirectExecutor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: fee reason: default package */
public abstract class fee<I, O, F, T> extends a<O> implements Runnable {
    private fek<? extends I> a;
    private F b;

    /* renamed from: fee$a */
    static final class a<I, O> extends fee<I, O, Function<? super I, ? extends O>, O> {
        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            return ((Function) obj).apply(obj2);
        }

        a(fek<? extends I> fek, Function<? super I, ? extends O> function) {
            super(fek, function);
        }

        /* access modifiers changed from: 0000 */
        public final void a(O o) {
            set(o);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract T a(F f, I i);

    /* access modifiers changed from: 0000 */
    public abstract void a(T t);

    public static <I, O> fek<O> a(fek<I> fek, Function<? super I, ? extends O> function, Executor executor) {
        Executor executor2;
        fay.a(function);
        a aVar = new a(fek, function);
        fay.a(executor);
        fay.a(aVar);
        if (executor == DirectExecutor.INSTANCE) {
            executor2 = executor;
        } else {
            executor2 = new Executor(executor, aVar) {
                boolean a = true;
                private /* synthetic */ Executor b;
                private /* synthetic */ fed c;

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
            };
        }
        fek.addListener(aVar, executor2);
        return aVar;
    }

    fee(fek<? extends I> fek, F f) {
        this.a = (fek) fay.a(fek);
        this.b = fay.a(f);
    }

    public final void run() {
        fek<? extends I> fek = this.a;
        F f = this.b;
        if (!(isCancelled() | (fek == null)) && !(f == null)) {
            this.a = null;
            if (fek.isCancelled()) {
                setFuture(fek);
                return;
            }
            try {
                String str = "Future was expected to be done: %s";
                if (fek.isDone()) {
                    try {
                        Object a2 = a(f, fen.a(fek));
                        this.b = null;
                        a(a2);
                    } catch (Throwable th) {
                        this.b = null;
                        throw th;
                    }
                } else {
                    throw new IllegalStateException(fbc.a(str, fek));
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

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.a);
        this.a = null;
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public String pendingToString() {
        String str;
        fek<? extends I> fek = this.a;
        F f = this.b;
        String pendingToString = super.pendingToString();
        if (fek != null) {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(fek);
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
}
