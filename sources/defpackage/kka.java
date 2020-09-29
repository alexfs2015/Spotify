package defpackage;

import android.util.Log;

/* renamed from: kka reason: default package */
public class kka<M, E, F> implements d<M, E, F> {
    private final String a;

    public void a(M m) {
    }

    public static <M, E, F> kka<M, E, F> a(String str) {
        return new kka<>(str);
    }

    public kka(String str) {
        this.a = (String) kkr.a(str);
    }

    public void a(M m, kjn<M, F> kjn) {
        new StringBuilder("Loop initialized, starting from model: ").append(kjn.a());
        for (Object append : kjn.b()) {
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

    public void a(M m, E e) {
        new StringBuilder("Event received: ").append(e);
    }

    public void a(M m, E e, kjx<M, F> kjx) {
        if (kjx.c()) {
            new StringBuilder("Model updated: ").append(kjx.d());
        }
        for (Object append : kjx.b()) {
            new StringBuilder("Effect dispatched: ").append(append);
        }
    }

    public void a(M m, E e, Throwable th) {
        Log.e(this.a, String.format("FATAL ERROR: exception updating model '%s' with event '%s'", new Object[]{m, e}), th);
    }
}
