package defpackage;

import android.content.Context;

/* renamed from: vve reason: default package */
public abstract class vve<T> implements vvg<T> {
    private final vvg<T> a;

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public vve(vvg<T> vvg) {
        this.a = vvg;
    }

    public final synchronized T a(Context context, vvh<T> vvh) {
        T a2;
        a2 = a();
        if (a2 == null) {
            a2 = this.a != null ? this.a.a(context, vvh) : vvh.a(context);
            if (a2 != null) {
                a(a2);
            } else {
                throw new NullPointerException();
            }
        }
        return a2;
    }
}
