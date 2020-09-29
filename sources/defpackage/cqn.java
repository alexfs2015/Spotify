package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: cqn reason: default package */
public interface cqn extends ExecutorService {
    cqi<?> a(Runnable runnable);

    <T> cqi<T> a(Callable<T> callable);
}
