package defpackage;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: ek reason: default package */
public final class ek extends ConstraintWidget {
    private float a = -1.0f;
    private int ae = -1;
    private ConstraintAnchor af = this.v;
    private int ag;
    private boolean ah;
    private int ai;
    private en aj;
    private int ak;
    private int b = -1;

    public final boolean a() {
        return true;
    }

    public ek() {
        this.ag = 0;
        this.ah = false;
        this.ai = 0;
        this.aj = new en();
        this.ak = 8;
        this.B.clear();
        this.B.add(this.af);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.af;
        }
    }

    public final void j(int i) {
        if (this.ag != i) {
            this.ag = i;
            this.B.clear();
            if (this.ag == 1) {
                this.af = this.u;
            } else {
                this.af = this.v;
            }
            this.B.add(this.af);
            int length = this.A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.A[i2] = this.af;
            }
        }
    }

    public final ConstraintAnchor a(Type type) {
        switch (type) {
            case LEFT:
            case RIGHT:
                if (this.ag == 1) {
                    return this.af;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.ag == 0) {
                    return this.af;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(type.name());
    }

    public final ArrayList<ConstraintAnchor> v() {
        return this.B;
    }

    public final void a(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.ae = -1;
        }
    }

    public final void k(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.ae = -1;
        }
    }

    public final void l(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.ae = i;
        }
    }

    public final void a(int i) {
        ConstraintWidget constraintWidget = this.D;
        if (constraintWidget != null) {
            if (this.ag == 1) {
                this.v.a.a(1, constraintWidget.v.a, 0);
                this.x.a.a(1, constraintWidget.v.a, 0);
                if (this.b != -1) {
                    this.u.a.a(1, constraintWidget.u.a, this.b);
                    this.w.a.a(1, constraintWidget.u.a, this.b);
                } else if (this.ae != -1) {
                    this.u.a.a(1, constraintWidget.w.a, -this.ae);
                    this.w.a.a(1, constraintWidget.w.a, -this.ae);
                } else if (this.a != -1.0f && constraintWidget.y() == DimensionBehaviour.FIXED) {
                    int i2 = (int) (((float) constraintWidget.E) * this.a);
                    this.u.a.a(1, constraintWidget.u.a, i2);
                    this.w.a.a(1, constraintWidget.u.a, i2);
                }
            } else {
                this.u.a.a(1, constraintWidget.u.a, 0);
                this.w.a.a(1, constraintWidget.u.a, 0);
                if (this.b != -1) {
                    this.v.a.a(1, constraintWidget.v.a, this.b);
                    this.x.a.a(1, constraintWidget.v.a, this.b);
                } else if (this.ae != -1) {
                    this.v.a.a(1, constraintWidget.x.a, -this.ae);
                    this.x.a.a(1, constraintWidget.x.a, -this.ae);
                } else if (this.a != -1.0f && constraintWidget.z() == DimensionBehaviour.FIXED) {
                    int i3 = (int) (((float) constraintWidget.F) * this.a);
                    this.v.a.a(1, constraintWidget.v.a, i3);
                    this.x.a.a(1, constraintWidget.v.a, i3);
                }
            }
        }
    }

    public final void a(eb ebVar) {
        ei eiVar = (ei) this.D;
        if (eiVar != null) {
            ConstraintAnchor a2 = eiVar.a(Type.LEFT);
            ConstraintAnchor a3 = eiVar.a(Type.RIGHT);
            boolean z = this.D != null && this.D.C[0] == DimensionBehaviour.WRAP_CONTENT;
            if (this.ag == 0) {
                a2 = eiVar.a(Type.TOP);
                a3 = eiVar.a(Type.BOTTOM);
                z = this.D != null && this.D.C[1] == DimensionBehaviour.WRAP_CONTENT;
            }
            if (this.b != -1) {
                SolverVariable a4 = ebVar.a((Object) this.af);
                ebVar.c(a4, ebVar.a((Object) a2), this.b, 6);
                if (z) {
                    ebVar.a(ebVar.a((Object) a3), a4, 0, 5);
                }
            } else if (this.ae != -1) {
                SolverVariable a5 = ebVar.a((Object) this.af);
                SolverVariable a6 = ebVar.a((Object) a3);
                ebVar.c(a5, a6, -this.ae, 6);
                if (z) {
                    ebVar.a(a5, ebVar.a((Object) a2), 0, 5);
                    ebVar.a(a6, a5, 0, 5);
                }
            } else {
                if (this.a != -1.0f) {
                    ebVar.a(eb.a(ebVar, ebVar.a((Object) this.af), ebVar.a((Object) a2), ebVar.a((Object) a3), this.a, false));
                }
            }
        }
    }

    public final void c(eb ebVar) {
        if (this.D != null) {
            int b2 = eb.b((Object) this.af);
            if (this.ag == 1) {
                c(b2);
                d(0);
                f(this.D.n());
                e(0);
                return;
            }
            c(0);
            d(b2);
            e(this.D.m());
            f(0);
        }
    }
}
