package defpackage;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r.a;
import androidx.recyclerview.widget.RecyclerView.r.b;

/* renamed from: on reason: default package */
public class on extends or {
    private om b;
    private om c;

    private static int a(View view, om omVar) {
        return (omVar.a(view) + (omVar.e(view) / 2)) - (omVar.b() + (omVar.e() / 2));
    }

    private static View a(i iVar, om omVar) {
        int r = iVar.r();
        View view = null;
        if (r == 0) {
            return null;
        }
        int b2 = iVar.o() ? omVar.b() + (omVar.e() / 2) : omVar.d() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < r; i2++) {
            View g = iVar.g(i2);
            int abs = Math.abs((omVar.a(g) + (omVar.e(g) / 2)) - b2);
            if (abs < i) {
                view = g;
                i = abs;
            }
        }
        return view;
    }

    private om d(i iVar) {
        om omVar = this.b;
        if (omVar == null || omVar.a != iVar) {
            this.b = om.b(iVar);
        }
        return this.b;
    }

    private om e(i iVar) {
        om omVar = this.c;
        if (omVar == null || omVar.a != iVar) {
            this.c = om.a(iVar);
        }
        return this.c;
    }

    public int a(i iVar, int i, int i2) {
        int t = iVar.t();
        if (t == 0) {
            return -1;
        }
        om omVar = iVar.f() ? d(iVar) : iVar.e() ? e(iVar) : null;
        if (omVar == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int r = iVar.r();
        boolean z = false;
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < r; i5++) {
            View g = iVar.g(i5);
            if (g != null) {
                int a = a(g, omVar);
                if (a <= 0 && a > i3) {
                    view2 = g;
                    i3 = a;
                }
                if (a >= 0 && a < i4) {
                    view = g;
                    i4 = a;
                }
            }
        }
        int i6 = 1;
        boolean z2 = !iVar.e() ? i2 > 0 : i > 0;
        if (z2 && view != null) {
            return i.c(view);
        }
        if (!z2 && view2 != null) {
            return i.c(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int c2 = i.c(view);
        int t2 = iVar.t();
        if (iVar instanceof b) {
            PointF d = ((b) iVar).d(t2 - 1);
            if (d != null && (d.x < 0.0f || d.y < 0.0f)) {
                z = true;
            }
        }
        if (z == z2) {
            i6 = -1;
        }
        int i7 = c2 + i6;
        if (i7 < 0 || i7 >= t) {
            return -1;
        }
        return i7;
    }

    public View a(i iVar) {
        if (iVar.f()) {
            return a(iVar, d(iVar));
        }
        if (iVar.e()) {
            return a(iVar, e(iVar));
        }
        return null;
    }

    public final int[] a(i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.e()) {
            iArr[0] = a(view, e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.f()) {
            iArr[1] = a(view, d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public final oi b(i iVar) {
        if (!(iVar instanceof b)) {
            return null;
        }
        return new oi(this.a.getContext()) {
            /* access modifiers changed from: protected */
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            public final void a(View view, a aVar) {
                on onVar = on.this;
                int[] a = onVar.a(onVar.a.d(), view);
                int i2 = a[0];
                int i3 = a[1];
                int a2 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                if (a2 > 0) {
                    aVar.a(i2, i3, a2, this.a);
                }
            }

            /* access modifiers changed from: protected */
            public final int b(int i2) {
                return Math.min(100, super.b(i2));
            }
        };
    }
}
