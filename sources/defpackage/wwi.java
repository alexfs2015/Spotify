package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: wwi reason: default package */
public interface wwi<V> extends Future<V> {
    boolean a(long j, TimeUnit timeUnit);

    wwi<V> aV_();

    wwi<V> b(wwk<? extends wwi<? super V>> wwk);

    wwi<V> c();

    boolean cancel(boolean z);

    V d();

    Throwable f();

    boolean g();
}
