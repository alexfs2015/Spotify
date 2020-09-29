package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wwt reason: default package */
public final class wwt<T> implements a<T> {
    private Callable<? extends T> a;

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        try {
            wui.a(this.a.call());
        } catch (Throwable th) {
            wul.b(th);
            wui.a(th);
        }
    }

    public wwt(Callable<? extends T> callable) {
        this.a = callable;
    }
}
