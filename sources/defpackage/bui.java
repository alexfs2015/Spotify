package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bui reason: default package */
public final class bui {
    private static final ExecutorService a = Executors.newFixedThreadPool(2, new bzv("GAC_Executor"));

    public static ExecutorService a() {
        return a;
    }
}
