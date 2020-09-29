package defpackage;

import androidx.constraintlayout.solver.SolverVariable;

/* renamed from: dy reason: default package */
public class dy implements a {
    SolverVariable a = null;
    float b = 0.0f;
    boolean c = false;
    public final dx d;
    public boolean e = false;

    public dy(dz dzVar) {
        this.d = new dx(this, dzVar);
    }

    public final SolverVariable a(boolean[] zArr) {
        return this.d.a(zArr, (SolverVariable) null);
    }

    public final dy a(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.d.a(solverVariable, 1.0f);
            this.d.a(solverVariable2, -1.0f);
            this.d.a(solverVariable4, 1.0f);
            this.d.a(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.d.a(solverVariable, 1.0f);
            this.d.a(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.d.a(solverVariable3, 1.0f);
            this.d.a(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.d.a(solverVariable, 1.0f);
            this.d.a(solverVariable2, -1.0f);
            this.d.a(solverVariable4, f4);
            this.d.a(solverVariable3, -f4);
        }
        return this;
    }

    public final dy a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.a(solverVariable, -1.0f);
            this.d.a(solverVariable2, 1.0f);
            this.d.a(solverVariable3, 1.0f);
        } else {
            this.d.a(solverVariable, 1.0f);
            this.d.a(solverVariable2, -1.0f);
            this.d.a(solverVariable3, -1.0f);
        }
        return this;
    }

    public final dy a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.d.a(solverVariable, -1.0f);
        this.d.a(solverVariable2, 1.0f);
        this.d.a(solverVariable3, f);
        this.d.a(solverVariable4, -f);
        return this;
    }

    public final dy a(eb ebVar, int i) {
        this.d.a(ebVar.a(i, "ep"), 1.0f);
        this.d.a(ebVar.a(i, "em"), -1.0f);
        return this;
    }

    public final void a() {
        this.d.a();
        this.a = null;
        this.b = 0.0f;
    }

    public final void a(a aVar) {
        if (aVar instanceof dy) {
            dy dyVar = (dy) aVar;
            this.a = null;
            this.d.a();
            for (int i = 0; i < dyVar.d.a; i++) {
                this.d.a(dyVar.d.a(i), dyVar.d.b(i), true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(SolverVariable solverVariable) {
        dx dxVar = this.d;
        if (dxVar.g != -1) {
            int i = dxVar.g;
            int i2 = 0;
            while (i != -1 && i2 < dxVar.a) {
                if (dxVar.d[i] == solverVariable.a) {
                    return true;
                }
                i = dxVar.e[i];
                i2++;
            }
        }
        return false;
    }

    public final SolverVariable b() {
        return this.a;
    }

    public final dy b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.a(solverVariable, -1.0f);
            this.d.a(solverVariable2, 1.0f);
            this.d.a(solverVariable3, -1.0f);
        } else {
            this.d.a(solverVariable, 1.0f);
            this.d.a(solverVariable2, -1.0f);
            this.d.a(solverVariable3, 1.0f);
        }
        return this;
    }

    public final dy b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.d.a(solverVariable3, 0.5f);
        this.d.a(solverVariable4, 0.5f);
        this.d.a(solverVariable, -0.5f);
        this.d.a(solverVariable2, -0.5f);
        this.b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void b(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.d.a(solverVariable2, -1.0f);
            this.a = null;
        }
        float f = -this.d.a(solverVariable, true);
        this.a = solverVariable;
        if (f != 1.0f) {
            this.b /= f;
            this.d.a(f);
        }
    }

    public void c(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.c != 1) {
            if (solverVariable.c == 2) {
                f = 1000.0f;
            } else if (solverVariable.c == 3) {
                f = 1000000.0f;
            } else if (solverVariable.c == 4) {
                f = 1.0E9f;
            } else if (solverVariable.c == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(solverVariable, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r9.a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.solver.SolverVariable r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            dx r5 = r9.d
            int r5 = r5.a
        L_0x005b:
            if (r2 >= r5) goto L_0x00e5
            dx r6 = r9.d
            androidx.constraintlayout.solver.SolverVariable r6 = r6.a(r2)
            if (r6 == 0) goto L_0x00e1
            dx r7 = r9.d
            float r7 = r7.b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00e1
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x008b
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b2
        L_0x008b:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b3
        L_0x00a1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b2:
            float r7 = -r7
        L_0x00b3:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e0
        L_0x00c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e0:
            r1 = 1
        L_0x00e1:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00e5:
            if (r1 != 0) goto L_0x00f8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00f8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy.toString():java.lang.String");
    }
}
