package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: fvw reason: default package */
public final class fvw {
    public int a;
    private final View b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    public fvw(View view) {
        this.b = view;
    }

    private static void a(View view) {
        float k = ip.k(view);
        ip.a(view, 1.0f + k);
        ip.a(view, k);
    }

    private void b() {
        int i = this.a;
        if (this.h) {
            i = Math.max(this.f, Math.min(this.g, i));
        }
        View view = this.b;
        ip.g(view, i - (view.getTop() - this.c));
        View view2 = this.b;
        ip.h(view2, this.e - (view2.getLeft() - this.d));
        if (VERSION.SDK_INT < 23) {
            a(this.b);
            ViewParent parent = this.b.getParent();
            if (parent instanceof View) {
                a((View) parent);
            }
        }
    }

    public final void a() {
        this.c = this.b.getTop();
        this.d = this.b.getLeft();
        b();
    }

    public final void a(int i, int i2) {
        this.f = i;
        this.g = i2;
        this.h = true;
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
