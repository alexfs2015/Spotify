package defpackage;

import android.view.View;

/* renamed from: eze reason: default package */
public final class eze {
    public int a;
    public int b;
    private final View c;
    private int d;
    private int e;

    public eze(View view) {
        this.c = view;
    }

    private void b() {
        View view = this.c;
        ip.g(view, this.b - (view.getTop() - this.a));
        View view2 = this.c;
        ip.h(view2, this.e - (view2.getLeft() - this.d));
    }

    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
        b();
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
