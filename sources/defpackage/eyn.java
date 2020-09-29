package defpackage;

import android.view.View;

/* renamed from: eyn reason: default package */
public final class eyn {
    public int a;
    public int b;
    private final View c;
    private int d;
    private int e;

    public eyn(View view) {
        this.c = view;
    }

    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
        b();
    }

    private void b() {
        View view = this.c;
        ip.f(view, this.b - (view.getTop() - this.a));
        View view2 = this.c;
        ip.g(view2, this.e - (view2.getLeft() - this.d));
    }

    public final boolean a(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        b();
        return true;
    }
}
