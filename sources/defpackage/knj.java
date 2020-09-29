package defpackage;

import android.util.Log;

/* renamed from: knj reason: default package */
public class knj<M, E, F> implements d<M, E, F> {
    private final String a;

    public knj(String str) {
        this.a = (String) koa.a(str);
    }

    public static <M, E, F> knj<M, E, F> a(String str) {
        return new knj<>(str);
    }

    public void a(M m) {
    }

    public void a(M m, E e) {
        new StringBuilder("Event received: ").append(e);
    }

    public void a(M m, E e, Throwable th) {
        Log.e(this.a, String.format("FATAL ERROR: exception updating model '%s' with event '%s'", new Object[]{m, e}), th);
    }

    public void a(M m, E e, kng<M, F> kng) {
        if (kng.c()) {
            new StringBuilder("Model updated: ").append(kng.d());
        }
        for (Object append : kng.b()) {
            new StringBuilder("Effect dispatched: ").append(append);
        }
    }

    public void a(M m, Throwable th) {
        String str = this.a;
        StringBuilder sb = new StringBuilder("FATAL ERROR: exception during initialization from model '");
        sb.append(m);
        sb.append("'");
        Log.e(str, sb.toString(), th);
    }

    public void a(M m, kmw<M, F> kmw) {
        new StringBuilder("Loop initialized, starting from model: ").append(kmw.a());
        for (Object append : kmw.b()) {
            new StringBuilder("Effect dispatched: ").append(append);
        }
    }
}
