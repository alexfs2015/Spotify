package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: cqi reason: default package */
public interface cqi<A> extends Future<A> {
    void a(Runnable runnable, Executor executor);
}
