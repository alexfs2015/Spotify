package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: buz reason: default package */
public final class buz {
    private static final ExecutorService a = Executors.newFixedThreadPool(2, new cam("GAC_Executor"));

    public static ExecutorService a() {
        return a;
    }
}
