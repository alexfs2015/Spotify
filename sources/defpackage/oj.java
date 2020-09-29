package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r.b;

/* renamed from: oj reason: default package */
public class oj extends or {
    private om b;
    private om c;

    private static int a(View view, om omVar) {
        return (omVar.a(view) + (omVar.e(view) / 2)) - (omVar.b() + (omVar.e() / 2));
    }

    private int a(i iVar, om omVar, int i, int i2) {
        int[] b2 = b(i, i2);
        float b3 = b(iVar, omVar);
        if (b3 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(b2[0]) > Math.abs(b2[1]) ? b2[0] : b2[1])) / b3);
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

    private static float b(i iVar, om omVar) {
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
        int max = Math.max(omVar.b(view), omVar.b(view2)) - Math.min(omVar.a(view), omVar.a(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
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

    public int[] a(i iVar, View view) {
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
}
