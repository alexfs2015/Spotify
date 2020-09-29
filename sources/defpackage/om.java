package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;

/* renamed from: om reason: default package */
public abstract class om {
    protected final i a;
    public int b;
    final Rect c;

    private om(i iVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = iVar;
    }

    /* synthetic */ om(i iVar, byte b2) {
        this(iVar);
    }

    public static om a(i iVar) {
        return new om(iVar) {
            public final int a(View view) {
                return this.a.k(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public final void a(int i) {
                this.a.h(i);
            }

            public final int b() {
                return this.a.getPaddingLeft();
            }

            public final int b(View view) {
                return this.a.m(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            public final int c() {
                return this.a.v - this.a.getPaddingRight();
            }

            public final int c(View view) {
                this.a.a(view, true, this.c);
                return this.c.right;
            }

            public final int d() {
                return this.a.v;
            }

            public final int d(View view) {
                this.a.a(view, true, this.c);
                return this.c.left;
            }

            public final int e() {
                return (this.a.v - this.a.getPaddingLeft()) - this.a.getPaddingRight();
            }

            public final int e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return this.a.i(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            public final int f() {
                return this.a.getPaddingRight();
            }

            public final int f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return i.j(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            public final int g() {
                return this.a.t;
            }

            public final int h() {
                return this.a.u;
            }
        };
    }

    public static om a(i iVar, int i) {
        if (i == 0) {
            return a(iVar);
        }
        if (i == 1) {
            return b(iVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static om b(i iVar) {
        return new om(iVar) {
            public final int a(View view) {
                return this.a.l(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            public final void a(int i) {
                this.a.i(i);
            }

            public final int b() {
                return this.a.getPaddingTop();
            }

            public final int b(View view) {
                return this.a.n(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            public final int c() {
                return this.a.w - this.a.getPaddingBottom();
            }

            public final int c(View view) {
                this.a.a(view, true, this.c);
                return this.c.bottom;
            }

            public final int d() {
                return this.a.w;
            }

            public final int d(View view) {
                this.a.a(view, true, this.c);
                return this.c.top;
            }

            public final int e() {
                return (this.a.w - this.a.getPaddingTop()) - this.a.getPaddingBottom();
            }

            public final int e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return i.j(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            public final int f() {
                return this.a.getPaddingBottom();
            }

            public final int f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return this.a.i(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            public final int g() {
                return this.a.u;
            }

            public final int h() {
                return this.a.t;
            }
        };
    }

    public final int a() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return e() - this.b;
    }

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();
}
