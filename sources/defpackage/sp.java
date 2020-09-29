package defpackage;

import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: sp reason: default package */
public final class sp {
    public final Executor a = b();
    public final Executor b = b();
    public final tb c = tb.a();
    public final int d;
    public final int e;
    public final int f;
    private final int g;

    /* renamed from: sp$a */
    public static final class a {
        int a = 4;
        int b = 0;
        int c = Integer.MAX_VALUE;
        int d = 20;
    }

    /* renamed from: sp$b */
    public interface b {
        sp a();
    }

    public sp(a aVar) {
        this.d = aVar.a;
        this.e = 0;
        this.f = aVar.c;
        this.g = aVar.d;
    }

    private static Executor b() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public final int a() {
        return VERSION.SDK_INT == 23 ? this.g / 2 : this.g;
    }
}
