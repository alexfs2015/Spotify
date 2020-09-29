package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: ffe reason: default package */
public interface ffe<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
