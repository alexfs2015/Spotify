package defpackage;

import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: sb reason: default package */
public final class sb {
    public final Executor a = b();
    public final Executor b = b();
    public final sn c = sn.a();
    public final int d;
    public final int e;
    public final int f;
    private final int g;

    /* renamed from: sb$a */
    public static final class a {
        int a = 4;
        int b = 0;
        int c = Integer.MAX_VALUE;
        int d = 20;
    }

    /* renamed from: sb$b */
    public interface b {
        sb a();
    }

    public sb(a aVar) {
        this.d = aVar.a;
        this.e = 0;
        this.f = aVar.c;
        this.g = aVar.d;
    }

    public final int a() {
        if (VERSION.SDK_INT == 23) {
            return this.g / 2;
        }
        return this.g;
    }

    private static Executor b() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
