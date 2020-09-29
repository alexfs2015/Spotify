package defpackage;

import android.content.Context;

/* renamed from: wjk reason: default package */
public abstract class wjk<T> implements wjm<T> {
    private final wjm<T> a;

    public wjk(wjm<T> wjm) {
        this.a = wjm;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final synchronized T a(Context context, wjn<T> wjn) {
        T a2;
        a2 = a();
        if (a2 == null) {
            a2 = this.a != null ? this.a.a(context, wjn) : wjn.a(context);
            if (a2 != null) {
                a(a2);
            } else {
                throw new NullPointerException();
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);
}
