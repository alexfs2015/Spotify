package defpackage;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: ef reason: default package */
public final class ef extends el {
    public int a = 0;
    private ArrayList<eo> ag = new ArrayList<>(4);
    public boolean b = true;

    public final void a(int i) {
        eo eoVar;
        if (this.D != null && ((ei) this.D).j(2)) {
            int i2 = this.a;
            if (i2 == 0) {
                eoVar = this.u.a;
            } else if (i2 == 1) {
                eoVar = this.w.a;
            } else if (i2 == 2) {
                eoVar = this.v.a;
            } else if (i2 == 3) {
                eoVar = this.x.a;
            } else {
                return;
            }
            eoVar.e = 5;
            int i3 = this.a;
            if (i3 == 0 || i3 == 1) {
                this.v.a.a((eo) null, 0.0f);
                this.x.a.a((eo) null, 0.0f);
            } else {
                this.u.a.a((eo) null, 0.0f);
                this.w.a.a((eo) null, 0.0f);
            }
            this.ag.clear();
            for (int i4 = 0; i4 < this.af; i4++) {
                ConstraintWidget constraintWidget = this.ae[i4];
                if (this.b || constraintWidget.a()) {
                    int i5 = this.a;
                    eo eoVar2 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? null : constraintWidget.x.a : constraintWidget.v.a : constraintWidget.w.a : constraintWidget.u.a;
                    if (eoVar2 != null) {
                        this.ag.add(eoVar2);
                        eoVar2.a(eoVar);
                    }
                }
            }
        }
    }

    public final void a(eb ebVar) {
        boolean z;
        this.A[0] = this.u;
        this.A[2] = this.v;
        this.A[1] = this.w;
        this.A[3] = this.x;
        for (int i = 0; i < this.A.length; i++) {
            this.A[i].h = ebVar.a((Object) this.A[i]);
        }
        int i2 = this.a;
        if (i2 >= 0 && i2 < 4) {
            ConstraintAnchor constraintAnchor = this.A[this.a];
            int i3 = 0;
            while (true) {
                if (i3 >= this.af) {
                    z = false;
                    break;
                }
                ConstraintWidget constraintWidget = this.ae[i3];
                if (this.b || constraintWidget.a()) {
                    int i4 = this.a;
                    if ((i4 != 0 && i4 != 1) || constraintWidget.y() != DimensionBehaviour.MATCH_CONSTRAINT) {
                        int i5 = this.a;
                        if ((i5 == 2 || i5 == 3) && constraintWidget.z() == DimensionBehaviour.MATCH_CONSTRAINT) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            z = true;
            int i6 = this.a;
            if (i6 == 0 || i6 == 1 ? this.D.y() == DimensionBehaviour.WRAP_CONTENT : this.D.z() == DimensionBehaviour.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.af; i7++) {
                ConstraintWidget constraintWidget2 = this.ae[i7];
                if (this.b || constraintWidget2.a()) {
                    SolverVariable a2 = ebVar.a((Object) constraintWidget2.A[this.a]);
                    ConstraintAnchor[] constraintAnchorArr = constraintWidget2.A;
                    int i8 = this.a;
                    constraintAnchorArr[i8].h = a2;
                    if (i8 == 0 || i8 == 2) {
                        SolverVariable solverVariable = constraintAnchor.h;
                        dy c = ebVar.c();
                        SolverVariable d = ebVar.d();
                        d.c = 0;
                        c.b(solverVariable, a2, d, 0);
                        if (z) {
                            ebVar.a(c, (int) (c.d.b(d) * -1.0f), 1);
                        }
                        ebVar.a(c);
                    } else {
                        SolverVariable solverVariable2 = constraintAnchor.h;
                        dy c2 = ebVar.c();
                        SolverVariable d2 = ebVar.d();
                        d2.c = 0;
                        c2.a(solverVariable2, a2, d2, 0);
                        if (z) {
                            ebVar.a(c2, (int) (c2.d.b(d2) * -1.0f), 1);
                        }
                        ebVar.a(c2);
                    }
                }
            }
            int i9 = this.a;
            if (i9 == 0) {
                ebVar.c(this.w.h, this.u.h, 0, 6);
                if (!z) {
                    ebVar.c(this.u.h, this.D.w.h, 0, 5);
                }
            } else if (i9 == 1) {
                ebVar.c(this.u.h, this.w.h, 0, 6);
                if (!z) {
                    ebVar.c(this.u.h, this.D.u.h, 0, 5);
                }
            } else if (i9 == 2) {
                ebVar.c(this.x.h, this.v.h, 0, 6);
                if (!z) {
                    ebVar.c(this.v.h, this.D.x.h, 0, 5);
                }
            } else if (i9 == 3) {
                ebVar.c(this.v.h, this.x.h, 0, 6);
                if (!z) {
                    ebVar.c(this.v.h, this.D.v.h, 0, 5);
                }
            }
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        super.b();
        this.ag.clear();
    }

    public final void c() {
        eo eoVar;
        int i = this.a;
        float f = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                eoVar = this.w.a;
            } else if (i == 2) {
                eoVar = this.v.a;
            } else if (i == 3) {
                eoVar = this.x.a;
            } else {
                return;
            }
            f = 0.0f;
        } else {
            eoVar = this.u.a;
        }
        int size = this.ag.size();
        eo eoVar2 = null;
        int i2 = 0;
        while (i2 < size) {
            eo eoVar3 = (eo) this.ag.get(i2);
            if (eoVar3.g == 1) {
                int i3 = this.a;
                if (i3 == 0 || i3 == 2) {
                    if (eoVar3.d < f) {
                        f = eoVar3.d;
                        eoVar2 = eoVar3.c;
                    }
                } else if (eoVar3.d > f) {
                    f = eoVar3.d;
                    eoVar2 = eoVar3.c;
                }
                i2++;
            } else {
                return;
            }
        }
        if (eb.a() != null) {
            ec a2 = eb.a();
            a2.y++;
        }
        eoVar.c = eoVar2;
        eoVar.d = f;
        eoVar.d();
        int i4 = this.a;
        if (i4 == 0) {
            this.w.a.a(eoVar2, f);
        } else if (i4 == 1) {
            this.u.a.a(eoVar2, f);
        } else if (i4 == 2) {
            this.x.a.a(eoVar2, f);
        } else if (i4 == 3) {
            this.v.a.a(eoVar2, f);
        }
    }
}
