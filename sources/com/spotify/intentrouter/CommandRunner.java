package com.spotify.intentrouter;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

public final class CommandRunner<T> {
    Disposable a;
    public a<T> b;
    private volatile glc<T> c;
    private volatile Throwable d;

    static class MonitorException extends RuntimeException {
        MonitorException(Throwable th) {
            super(th);
        }
    }

    public interface a<T> {
        void a(glc<T> glc);

        void a(glc<T> glc, Throwable th);

        void b(glc<T> glc);
    }

    public CommandRunner(Observable<glc<T>> observable) {
        observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return CommandRunner.this.b((glc) obj);
            }
        }, 2).c(1).subscribe(new Observer<Throwable>() {
            public final void onComplete() {
                CommandRunner.this.a("queue has been shut down");
            }

            public final void onError(Throwable th) {
                CommandRunner.this.a("fatal error", th);
            }

            public final /* synthetic */ void onNext(Object obj) {
                Throwable th = (Throwable) obj;
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw new RuntimeException(th);
            }

            public final void onSubscribe(Disposable disposable) {
                CommandRunner.this.a = disposable;
            }
        });
    }

    private synchronized glc<T> a(glc<T> glc) {
        glc<T> glc2;
        glc2 = this.c;
        this.c = glc;
        return glc2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Throwable a(glc glc, Throwable th) {
        a("command failed", th);
        a<T> aVar = this.b;
        if (aVar == null) {
            return th;
        }
        try {
            aVar.a(glc, th);
            return th;
        } catch (RuntimeException e) {
            return new MonitorException(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        glc a2 = a(null);
        a<T> aVar = this.b;
        if (aVar != null) {
            aVar.b(a2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(glc glc, Disposable disposable) {
        a(glc);
        a<T> aVar = this.b;
        if (aVar != null) {
            aVar.a(glc);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(glc glc) {
        return glc.a().e().a(Throwable.class).c((Consumer<? super Disposable>) new Consumer(glc) {
            private final /* synthetic */ glc f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                CommandRunner.this.a(this.f$1, (Disposable) obj);
            }
        }).b((Action) new Action() {
            public final void run() {
                CommandRunner.this.a();
            }
        }).e((Function<? super Throwable, ? extends T>) new Function(glc) {
            private final /* synthetic */ glc f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return CommandRunner.this.a(this.f$1, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(String str) {
        this.c = null;
        this.d = new IllegalStateException(str);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(String str, Throwable th) {
        this.c = null;
        this.d = new IllegalStateException(str, th);
    }
}
