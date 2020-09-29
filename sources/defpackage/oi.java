package defpackage;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r.a;
import androidx.recyclerview.widget.RecyclerView.r.b;

/* renamed from: oi reason: default package */
public class oi extends om {
    private oh b;
    private oh c;

    public final int[] a(i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.e()) {
            iArr[0] = a(iVar, view, e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.f()) {
            iArr[1] = a(iVar, view, d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final View a(i iVar) {
        if (iVar.f()) {
            return a(iVar, d(iVar));
        }
        if (iVar.e()) {
            return a(iVar, e(iVar));
        }
        return null;
    }

    public int a(i iVar, int i, int i2) {
        int t = iVar.t();
        if (t == 0) {
            return -1;
        }
        View view = null;
        if (iVar.f()) {
            view = b(iVar, d(iVar));
        } else if (iVar.e()) {
            view = b(iVar, e(iVar));
        }
        if (view == null) {
            return -1;
        }
        int c2 = i.c(view);
        if (c2 == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !iVar.e() ? i2 > 0 : i > 0;
        if (iVar instanceof b) {
            PointF d = ((b) iVar).d(t - 1);
            if (d != null && (d.x < 0.0f || d.y < 0.0f)) {
                z = true;
            }
        }
        if (z) {
            if (z2) {
                c2--;
            }
            return c2;
        }
        if (z2) {
            c2++;
        }
        return c2;
    }

    /* access modifiers changed from: protected */
    public final od b(i iVar) {
        if (!(iVar instanceof b)) {
            return null;
        }
        return new od(this.a.getContext()) {
            public final void a(View view, a aVar) {
                oi oiVar = oi.this;
                int[] a = oiVar.a(oiVar.a.d(), view);
                int i2 = a[0];
                int i3 = a[1];
                int a2 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                if (a2 > 0) {
                    aVar.a(i2, i3, a2, this.a);
                }
            }

            /* access modifiers changed from: protected */
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            public final int b(int i2) {
                return Math.min(100, super.b(i2));
            }
        };
    }

    private static int a(i iVar, View view, oh ohVar) {
        int i;
        int a = ohVar.a(view) + (ohVar.e(view) / 2);
        if (iVar.o()) {
            i = ohVar.b() + (ohVar.e() / 2);
        } else {
            i = ohVar.d() / 2;
        }
        return a - i;
    }

    private static View a(i iVar, oh ohVar) {
        int i;
        int r = iVar.r();
        View view = null;
        if (r == 0) {
            return null;
        }
        if (iVar.o()) {
            i = ohVar.b() + (ohVar.e() / 2);
        } else {
            i = ohVar.d() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < r; i3++) {
            View g = iVar.g(i3);
            int abs = Math.abs((ohVar.a(g) + (ohVar.e(g) / 2)) - i);
            if (abs < i2) {
                view = g;
                i2 = abs;
            }
        }
        return view;
    }

    private static View b(i iVar, oh ohVar) {
        int r = iVar.r();
        View view = null;
        if (r == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < r; i2++) {
            View g = iVar.g(i2);
            int a = ohVar.a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    private oh d(i iVar) {
        oh ohVar = this.b;
        if (ohVar == null || ohVar.a != iVar) {
            this.b = oh.b(iVar);
        }
        return this.b;
    }

    private oh e(i iVar) {
        oh ohVar = this.c;
        if (ohVar == null || ohVar.a != iVar) {
            this.c = oh.a(iVar);
        }
        return this.c;
    }
}
