package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: fek reason: default package */
public interface fek<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
