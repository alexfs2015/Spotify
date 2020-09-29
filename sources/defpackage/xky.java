package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xky reason: default package */
public final class xky<T> implements a<T> {
    private Callable<? extends T> a;

    public xky(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        try {
            xin.a(this.a.call());
        } catch (Throwable th) {
            xiq.b(th);
            xin.a(th);
        }
    }
}
