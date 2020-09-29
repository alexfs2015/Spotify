package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: cpw reason: default package */
public interface cpw extends ExecutorService {
    cpr<?> a(Runnable runnable);

    <T> cpr<T> a(Callable<T> callable);
}
