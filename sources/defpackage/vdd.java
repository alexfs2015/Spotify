package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: vdd reason: default package */
public final class vdd implements vua<ExecutorService> {
    private static final vdd a = new vdd();

    public static vdd a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (ExecutorService) vuf.a(Executors.newSingleThreadExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
