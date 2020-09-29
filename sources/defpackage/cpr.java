package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: cpr reason: default package */
public interface cpr<A> extends Future<A> {
    void a(Runnable runnable, Executor executor);
}
