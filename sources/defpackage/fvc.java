package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: fvc reason: default package */
public final class fvc {
    public int a;
    private final View b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    public fvc(View view) {
        this.b = view;
    }

    public final void a(int i, int i2) {
        this.f = i;
        this.g = i2;
        this.h = true;
    }

    public final void a() {
        this.c = this.b.getTop();
        this.d = this.b.getLeft();
        b();
    }

    private void b() {
        int i = this.a;
        if (this.h) {
            i = Math.max(this.f, Math.min(this.g, i));
        }
        View view = this.b;
        ip.f(view, i - (view.getTop() - this.c));
        View view2 = this.b;
        ip.g(view2, this.e - (view2.getLeft() - this.d));
        if (VERSION.SDK_INT < 23) {
            a(this.b);
            ViewParent parent = this.b.getParent();
            if (parent instanceof View) {
                a((View) parent);
            }
        }
    }

    private static void a(View view) {
        float k = ip.k(view);
        ip.a(view, 1.0f + k);
        ip.a(view, k);
    }

    public final boolean a(int i) {
        if (this.a == i) {
            return false;
        }
        this.a = i;
        b();
        return true;
    }
}
