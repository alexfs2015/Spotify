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
    private volatile gjr<T> c;
    private volatile Throwable d;

    static class MonitorException extends RuntimeException {
        MonitorException(Throwable th) {
            super(th);
        }
    }

    public interface a<T> {
        void a(gjr<T> gjr);

        void a(gjr<T> gjr, Throwable th);

        void b(gjr<T> gjr);
    }

    public CommandRunner(Observable<gjr<T>> observable) {
        observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return CommandRunner.this.b((gjr) obj);
            }
        }, 2).c(1).subscribe(new Observer<Throwable>() {
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

            public final void onError(Throwable th) {
                CommandRunner.this.a("fatal error", th);
            }

            public final void onComplete() {
                CommandRunner.this.a("queue has been shut down");
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(gjr gjr) {
        return gjr.a().e().a(Throwable.class).c((Consumer<? super Disposable>) new Consumer(gjr) {
            private final /* synthetic */ gjr f$1;

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
        }).e((Function<? super Throwable, ? extends T>) new Function(gjr) {
            private final /* synthetic */ gjr f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return CommandRunner.this.a(this.f$1, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gjr gjr, Disposable disposable) {
        a(gjr);
        a<T> aVar = this.b;
        if (aVar != null) {
            aVar.a(gjr);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        gjr a2 = a(null);
        a<T> aVar = this.b;
        if (aVar != null) {
            aVar.b(a2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Throwable a(gjr gjr, Throwable th) {
        a("command failed", th);
        a<T> aVar = this.b;
        if (aVar == null) {
            return th;
        }
        try {
            aVar.a(gjr, th);
            return th;
        } catch (RuntimeException e) {
            return new MonitorException(e);
        }
    }

    private synchronized gjr<T> a(gjr<T> gjr) {
        gjr<T> gjr2;
        gjr2 = this.c;
        this.c = gjr;
        return gjr2;
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
