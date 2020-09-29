package defpackage;

import java.util.concurrent.Callable;

/* renamed from: lin reason: default package */
public final class lin implements vua<Callable<Boolean>> {
    private static final lin a = new lin();

    public static lin a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Callable) vuf.a(new Callable<Boolean>() {
            public final /* bridge */ /* synthetic */ Object call() {
                return Boolean.FALSE;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
