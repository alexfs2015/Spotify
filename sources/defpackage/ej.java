package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ej reason: default package */
public final class ej {
    public List<ConstraintWidget> a;
    public boolean b = false;
    public final int[] c = {this.j, this.k};
    List<ConstraintWidget> d = new ArrayList();
    List<ConstraintWidget> e = new ArrayList();
    HashSet<ConstraintWidget> f = new HashSet<>();
    HashSet<ConstraintWidget> g = new HashSet<>();
    List<ConstraintWidget> h = new ArrayList();
    List<ConstraintWidget> i = new ArrayList();
    private int j = -1;
    private int k = -1;

    ej(List<ConstraintWidget> list) {
        this.a = list;
    }

    ej(List<ConstraintWidget> list, boolean z) {
        this.a = list;
        this.b = true;
    }

    /* access modifiers changed from: 0000 */
    public final void a(ConstraintWidget constraintWidget, int i2) {
        if (i2 == 0) {
            this.f.add(constraintWidget);
            return;
        }
        if (i2 == 1) {
            this.g.add(constraintWidget);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        if (!constraintWidget.Y) {
            arrayList.add(constraintWidget);
            constraintWidget.Y = true;
            if (!constraintWidget.h()) {
                if (constraintWidget instanceof el) {
                    el elVar = (el) constraintWidget;
                    int i2 = elVar.af;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, elVar.ae[i3]);
                    }
                }
                for (ConstraintAnchor constraintAnchor : constraintWidget.A) {
                    ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
                    if (constraintAnchor2 != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor2.b;
                        if (!(constraintAnchor2 == null || constraintWidget2 == constraintWidget.D)) {
                            a(arrayList, constraintWidget2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((ConstraintWidget) this.i.get(i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.constraintlayout.solver.widgets.ConstraintWidget r7) {
        /*
            r6 = this;
            boolean r0 = r7.W
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r7.h()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.w
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.w
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
            goto L_0x0021
        L_0x001d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.u
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
        L_0x0021:
            if (r3 == 0) goto L_0x004b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.b
            boolean r4 = r4.X
            if (r4 != 0) goto L_0x002e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.b
            r6.a(r4)
        L_0x002e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r3.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r4 != r5) goto L_0x0040
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.b
            int r4 = r4.I
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.b
            int r3 = r3.m()
            int r3 = r3 + r4
            goto L_0x004c
        L_0x0040:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r3.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r4 != r5) goto L_0x004b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.b
            int r3 = r3.I
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x0056
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.w
            int r0 = r0.b()
            int r3 = r3 - r0
            goto L_0x0062
        L_0x0056:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.u
            int r0 = r0.b()
            int r4 = r7.m()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x0062:
            int r0 = r7.m()
            int r0 = r3 - r0
            r7.c(r0, r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.y
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            if (r0 == 0) goto L_0x0095
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.y
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.b
            boolean r1 = r1.X
            if (r1 != 0) goto L_0x0080
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.b
            r6.a(r1)
        L_0x0080:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.b
            int r1 = r1.J
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.b
            int r0 = r0.M
            int r1 = r1 + r0
            int r0 = r7.M
            int r1 = r1 - r0
            int r0 = r7.F
            int r0 = r0 + r1
            r7.d(r1, r0)
            r7.X = r2
            return
        L_0x0095:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.x
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            if (r0 == 0) goto L_0x009c
            r1 = 1
        L_0x009c:
            if (r1 == 0) goto L_0x00a3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.x
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            goto L_0x00a7
        L_0x00a3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.v
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
        L_0x00a7:
            if (r0 == 0) goto L_0x00d0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.b
            boolean r4 = r4.X
            if (r4 != 0) goto L_0x00b4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.b
            r6.a(r4)
        L_0x00b4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r0.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 != r5) goto L_0x00c6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.b
            int r3 = r3.J
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.b
            int r0 = r0.n()
            int r3 = r3 + r0
            goto L_0x00d0
        L_0x00c6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r0.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r4 != r5) goto L_0x00d0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.b
            int r3 = r0.J
        L_0x00d0:
            if (r1 == 0) goto L_0x00da
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.x
            int r0 = r0.b()
            int r3 = r3 - r0
            goto L_0x00e6
        L_0x00da:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.v
            int r0 = r0.b()
            int r1 = r7.n()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00e6:
            int r0 = r7.n()
            int r0 = r3 - r0
            r7.d(r0, r3)
            r7.X = r2
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej.a(androidx.constraintlayout.solver.widgets.ConstraintWidget):void");
    }
}
