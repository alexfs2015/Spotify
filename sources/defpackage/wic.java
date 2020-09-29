package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: wic reason: default package */
public interface wic<V> extends Future<V> {
    boolean a(long j, TimeUnit timeUnit);

    wic<V> aX_();

    wic<V> b(wie<? extends wic<? super V>> wie);

    wic<V> c();

    boolean cancel(boolean z);

    V d();

    Throwable f();

    boolean g();
}
