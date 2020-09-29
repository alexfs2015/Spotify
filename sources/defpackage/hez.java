package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.internal.operators.NeverObservableHolder;
import rx.internal.operators.OnSubscribeAmb;
import rx.internal.operators.OperatorPublish;
import rx.internal.util.ScalarSynchronousObservable;

@Deprecated
/* renamed from: hez reason: default package */
public final class hez<T> implements c<T, T> {
    private final int a;
    private final T b;
    private final wug c;

    /* renamed from: hez$a */
    public static final class a<T> {
        public int a = 800;
        private final T b;
        private final wug c;

        public a(T t, wug wug) {
            this.b = t;
            this.c = wug;
        }

        public final hez<T> a() {
            return new hez<>(this.a, this.b, this.c, 0);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        return OperatorPublish.a((wud) obj, new $$Lambda$hez$tPbNrO_FztaSzeXllrFq44doivE(this), false);
    }

    /* synthetic */ hez(int i, Object obj, wug wug, byte b2) {
        this(i, obj, wug);
    }

    public static <T> a<T> a(T t, wug wug) {
        return new a<>(t, wug);
    }

    private hez(int i, T t, wug wug) {
        this.a = i;
        this.b = fay.a(t);
        this.c = (wug) fay.a(wug);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(wud wud) {
        return wud.b(OnSubscribeAmb.a(wud.a((wus<? extends wud<U>>) new $$Lambda$hez$GN1Xif8H_1W51Msfd6jQjNaRIHE<Object>(this), (wut<? super T, ? extends wud<V>>) $$Lambda$hez$yqaMLgULEX2GHRxTbTmDyt_U0U0.INSTANCE, null).g($$Lambda$hez$sZnxAr8uwaQr6bKQgwgrMAOk3zc.INSTANCE), wud.b(wud, ScalarSynchronousObservable.d(this.b).b((long) this.a, TimeUnit.MILLISECONDS, this.c))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a() {
        return wud.a((long) this.a, TimeUnit.MILLISECONDS, this.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(Throwable th) {
        if (th instanceof TimeoutException) {
            return NeverObservableHolder.a();
        }
        return wud.a(th);
    }
}
