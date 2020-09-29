package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r.b;

/* renamed from: oe reason: default package */
public class oe extends om {
    private oh b;
    private oh c;

    public int[] a(i iVar, View view) {
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

    public int a(i iVar, int i, int i2) {
        int i3;
        int i4;
        if (!(iVar instanceof b)) {
            return -1;
        }
        int t = iVar.t();
        if (t == 0) {
            return -1;
        }
        View a = a(iVar);
        if (a == null) {
            return -1;
        }
        int c2 = i.c(a);
        if (c2 == -1) {
            return -1;
        }
        int i5 = t - 1;
        PointF d = ((b) iVar).d(i5);
        if (d == null) {
            return -1;
        }
        if (iVar.e()) {
            i3 = a(iVar, e(iVar), i, 0);
            if (d.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (iVar.f()) {
            i4 = a(iVar, d(iVar), 0, i2);
            if (d.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (iVar.f()) {
            i3 = i4;
        }
        if (i3 == 0) {
            return -1;
        }
        int i6 = c2 + i3;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 >= t) {
            i6 = i5;
        }
        return i6;
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

    private int a(i iVar, oh ohVar, int i, int i2) {
        int[] b2 = b(i, i2);
        float b3 = b(iVar, ohVar);
        if (b3 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(b2[0]) > Math.abs(b2[1]) ? b2[0] : b2[1])) / b3);
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

    private static float b(i iVar, oh ohVar) {
        int r = iVar.r();
        if (r == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < r; i3++) {
            View g = iVar.g(i3);
            int c2 = i.c(g);
            if (c2 != -1) {
                if (c2 < i) {
                    view = g;
                    i = c2;
                }
                if (c2 > i2) {
                    view2 = g;
                    i2 = c2;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(ohVar.b(view), ohVar.b(view2)) - Math.min(ohVar.a(view), ohVar.a(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
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
