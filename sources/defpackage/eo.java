package defpackage;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;

/* renamed from: eo reason: default package */
public final class eo extends eq {
    public ConstraintAnchor a;
    eo b;
    eo c;
    public float d;
    public int e = 0;
    private float h;
    private float i;
    private eo j;
    private float k;
    private ep l = null;
    private int m = 1;
    private ep n = null;
    private int o = 1;

    public eo(ConstraintAnchor constraintAnchor) {
        this.a = constraintAnchor;
    }

    private static String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public final void a() {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.g != 1 && this.e != 4) {
            ep epVar = this.l;
            if (epVar != null) {
                if (epVar.g == 1) {
                    this.i = ((float) this.m) * this.l.a;
                } else {
                    return;
                }
            }
            ep epVar2 = this.n;
            if (epVar2 != null) {
                if (epVar2.g == 1) {
                    this.k = ((float) this.o) * this.n.a;
                } else {
                    return;
                }
            }
            if (this.e == 1) {
                eo eoVar = this.b;
                if (eoVar == null || eoVar.g == 1) {
                    eo eoVar2 = this.b;
                    if (eoVar2 == null) {
                        this.c = this;
                        this.d = this.i;
                    } else {
                        this.c = eoVar2.c;
                        this.d = eoVar2.d + this.i;
                    }
                    d();
                    return;
                }
            }
            if (this.e == 2) {
                eo eoVar3 = this.b;
                if (eoVar3 != null && eoVar3.g == 1) {
                    eo eoVar4 = this.j;
                    if (eoVar4 != null) {
                        eo eoVar5 = eoVar4.b;
                        if (eoVar5 != null && eoVar5.g == 1) {
                            if (eb.a() != null) {
                                ec a2 = eb.a();
                                a2.v++;
                            }
                            this.c = this.b.c;
                            eo eoVar6 = this.j;
                            eoVar6.c = eoVar6.b.c;
                            int i2 = 0;
                            if (!(this.a.c == Type.RIGHT || this.a.c == Type.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f2 = this.b.d;
                                f = this.j.b.d;
                            } else {
                                f2 = this.j.b.d;
                                f = this.b.d;
                            }
                            float f5 = f2 - f;
                            if (this.a.c == Type.LEFT || this.a.c == Type.RIGHT) {
                                f4 = f5 - ((float) this.a.b.m());
                                f3 = this.a.b.R;
                            } else {
                                f4 = f5 - ((float) this.a.b.n());
                                f3 = this.a.b.S;
                            }
                            int b2 = this.a.b();
                            int b3 = this.j.a.b();
                            if (this.a.d == this.j.a.d) {
                                f3 = 0.5f;
                                b3 = 0;
                            } else {
                                i2 = b2;
                            }
                            float f6 = (float) i2;
                            float f7 = (float) b3;
                            float f8 = (f4 - f6) - f7;
                            if (z) {
                                eo eoVar7 = this.j;
                                eoVar7.d = eoVar7.b.d + f7 + (f8 * f3);
                                this.d = (this.b.d - f6) - (f8 * (1.0f - f3));
                            } else {
                                this.d = this.b.d + f6 + (f8 * f3);
                                eo eoVar8 = this.j;
                                eoVar8.d = (eoVar8.b.d - f7) - (f8 * (1.0f - f3));
                            }
                            d();
                            this.j.d();
                            return;
                        }
                    }
                }
            }
            if (this.e == 3) {
                eo eoVar9 = this.b;
                if (eoVar9 != null && eoVar9.g == 1) {
                    eo eoVar10 = this.j;
                    if (eoVar10 != null) {
                        eo eoVar11 = eoVar10.b;
                        if (eoVar11 != null && eoVar11.g == 1) {
                            if (eb.a() != null) {
                                ec a3 = eb.a();
                                a3.w++;
                            }
                            eo eoVar12 = this.b;
                            this.c = eoVar12.c;
                            eo eoVar13 = this.j;
                            eo eoVar14 = eoVar13.b;
                            eoVar13.c = eoVar14.c;
                            this.d = eoVar12.d + this.i;
                            eoVar13.d = eoVar14.d + eoVar13.i;
                            d();
                            this.j.d();
                            return;
                        }
                    }
                }
            }
            if (this.e == 5) {
                this.a.b.c();
            }
        }
    }

    public final void a(int i2, eo eoVar, int i3) {
        this.e = 1;
        this.b = eoVar;
        this.i = (float) i3;
        this.b.a(this);
    }

    public final void a(eb ebVar) {
        SolverVariable solverVariable = this.a.h;
        eo eoVar = this.c;
        if (eoVar == null) {
            ebVar.a(solverVariable, (int) (this.d + 0.5f));
        } else {
            ebVar.c(solverVariable, ebVar.a((Object) eoVar.a), (int) (this.d + 0.5f), 6);
        }
    }

    public final void a(eo eoVar, float f) {
        if (this.g == 0 || !(this.c == eoVar || this.d == f)) {
            this.c = eoVar;
            this.d = f;
            if (this.g == 1) {
                c();
            }
            d();
        }
    }

    public final void a(eo eoVar, int i2) {
        this.b = eoVar;
        this.i = (float) i2;
        this.b.a(this);
    }

    public final void a(eo eoVar, int i2, ep epVar) {
        this.b = eoVar;
        this.b.a(this);
        this.l = epVar;
        this.m = i2;
        this.l.a(this);
    }

    public final void b() {
        super.b();
        this.b = null;
        this.i = 0.0f;
        this.l = null;
        this.m = 1;
        this.n = null;
        this.o = 1;
        this.c = null;
        this.d = 0.0f;
        this.h = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.e = 0;
    }

    public final void b(eo eoVar, float f) {
        this.j = eoVar;
        this.k = f;
    }

    public final void b(eo eoVar, int i2, ep epVar) {
        this.j = eoVar;
        this.n = epVar;
        this.o = i2;
    }

    public final String toString() {
        if (this.g == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.c == this) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(this.a);
                sb.append(str);
                sb.append(this.d);
                sb.append("]  type: ");
                sb.append(a(this.e));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(this.a);
            sb2.append(str);
            sb2.append(this.c);
            sb2.append(":");
            sb2.append(this.d);
            sb2.append("] type: ");
            sb2.append(a(this.e));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("{ ");
        sb3.append(this.a);
        sb3.append(" UNRESOLVED} type: ");
        sb3.append(a(this.e));
        return sb3.toString();
    }
}
