package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: eh reason: default package */
public final class eh {
    protected ConstraintWidget a;
    protected ConstraintWidget b;
    protected ConstraintWidget c;
    protected ConstraintWidget d;
    protected ConstraintWidget e;
    protected ConstraintWidget f;
    protected ConstraintWidget g;
    protected ArrayList<ConstraintWidget> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    protected boolean l;
    protected boolean m;
    boolean n;
    private int o;
    private boolean p = false;
    private boolean q;

    public eh(ConstraintWidget constraintWidget, int i2, boolean z) {
        this.a = constraintWidget;
        this.o = i2;
        this.p = z;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        boolean z = true;
        int i2 = this.o << 1;
        ConstraintWidget constraintWidget = this.a;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            ConstraintWidget constraintWidget3 = null;
            constraintWidget.ad[this.o] = null;
            constraintWidget.ac[this.o] = null;
            if (constraintWidget.U != 8) {
                if (this.b == null) {
                    this.b = constraintWidget;
                }
                this.d = constraintWidget;
                if (constraintWidget.C[this.o] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.i[this.o] == 0 || constraintWidget.i[this.o] == 3 || constraintWidget.i[this.o] == 2)) {
                    this.j++;
                    float f2 = constraintWidget.ab[this.o];
                    if (f2 > 0.0f) {
                        this.k += constraintWidget.ab[this.o];
                    }
                    int i3 = this.o;
                    if (constraintWidget.U != 8 && constraintWidget.C[i3] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.i[i3] == 0 || constraintWidget.i[i3] == 3)) {
                        if (f2 < 0.0f) {
                            this.l = true;
                        } else {
                            this.q = true;
                        }
                        if (this.h == null) {
                            this.h = new ArrayList<>();
                        }
                        this.h.add(constraintWidget);
                    }
                    if (this.f == null) {
                        this.f = constraintWidget;
                    }
                    ConstraintWidget constraintWidget4 = this.g;
                    if (constraintWidget4 != null) {
                        constraintWidget4.ac[this.o] = constraintWidget;
                    }
                    this.g = constraintWidget;
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.ad[this.o] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.A[i2 + 1].d;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.b;
                if (constraintWidget5.A[i2].d != null && constraintWidget5.A[i2].d.b == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 != null) {
                constraintWidget2 = constraintWidget;
                constraintWidget = constraintWidget3;
            } else {
                constraintWidget2 = constraintWidget;
                z2 = true;
            }
        }
        this.c = constraintWidget;
        if (this.o != 0 || !this.p) {
            this.e = this.a;
        } else {
            this.e = this.c;
        }
        if (!this.q || !this.l) {
            z = false;
        }
        this.m = z;
    }
}
