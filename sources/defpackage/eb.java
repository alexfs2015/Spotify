package defpackage;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.SolverVariable.Type;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: eb reason: default package */
public final class eb {
    public static ec f = null;
    private static int g = 1000;
    public a a;
    public dy[] b;
    public boolean c;
    public int d;
    public final dz e;
    private int h = 0;
    private HashMap<String, SolverVariable> i = null;
    private int j = 32;
    private int k;
    private boolean[] l;
    private int m;
    private int n;
    private SolverVariable[] o;
    private int p;
    private dy[] q;
    private final a r;

    /* renamed from: eb$a */
    interface a {
        SolverVariable a(boolean[] zArr);

        void a();

        void a(a aVar);

        SolverVariable b();

        void c(SolverVariable solverVariable);
    }

    public static ec a() {
        return null;
    }

    public eb() {
        int i2 = this.j;
        this.k = i2;
        this.b = null;
        this.c = false;
        this.l = new boolean[i2];
        this.m = 1;
        this.d = 0;
        this.n = i2;
        this.o = new SolverVariable[g];
        this.p = 0;
        this.q = new dy[i2];
        this.b = new dy[i2];
        g();
        this.e = new dz();
        this.a = new ea(this.e);
        this.r = new dy(this.e);
    }

    private void f() {
        this.j <<= 1;
        this.b = (dy[]) Arrays.copyOf(this.b, this.j);
        dz dzVar = this.e;
        dzVar.c = (SolverVariable[]) Arrays.copyOf(dzVar.c, this.j);
        int i2 = this.j;
        this.l = new boolean[i2];
        this.k = i2;
        this.n = i2;
    }

    private void g() {
        int i2 = 0;
        while (true) {
            dy[] dyVarArr = this.b;
            if (i2 < dyVarArr.length) {
                dy dyVar = dyVarArr[i2];
                if (dyVar != null) {
                    this.e.a.a(dyVar);
                }
                this.b[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        for (SolverVariable solverVariable : this.e.c) {
            if (solverVariable != null) {
                solverVariable.a();
            }
        }
        this.e.b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.e.c, null);
        this.h = 0;
        this.a.a();
        this.m = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            this.b[i2].c = false;
        }
        g();
        this.d = 0;
    }

    public final SolverVariable a(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.m + 1 >= this.k) {
            f();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.h;
            if (solverVariable == null) {
                constraintAnchor.a();
                solverVariable = constraintAnchor.h;
            }
            if (solverVariable.a == -1 || solverVariable.a > this.h || this.e.c[solverVariable.a] == null) {
                if (solverVariable.a != -1) {
                    solverVariable.a();
                }
                this.h++;
                this.m++;
                solverVariable.a = this.h;
                solverVariable.f = Type.UNRESTRICTED;
                this.e.c[this.h] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final dy c() {
        dy dyVar = (dy) this.e.a.a();
        if (dyVar == null) {
            return new dy(this.e);
        }
        dyVar.a = null;
        dyVar.d.a();
        dyVar.b = 0.0f;
        dyVar.e = false;
        return dyVar;
    }

    public final SolverVariable d() {
        if (this.m + 1 >= this.k) {
            f();
        }
        SolverVariable a2 = a(Type.SLACK, (String) null);
        this.h++;
        this.m++;
        a2.a = this.h;
        this.e.c[this.h] = a2;
        return a2;
    }

    public final void a(dy dyVar, int i2, int i3) {
        dyVar.d.a(a(i3, (String) null), (float) i2);
    }

    public final SolverVariable a(int i2, String str) {
        if (this.m + 1 >= this.k) {
            f();
        }
        SolverVariable a2 = a(Type.ERROR, str);
        this.h++;
        this.m++;
        a2.a = this.h;
        a2.c = i2;
        this.e.c[this.h] = a2;
        this.a.c(a2);
        return a2;
    }

    private SolverVariable a(Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.e.b.a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f = type;
        } else {
            solverVariable.a();
            solverVariable.f = type;
        }
        int i2 = this.p;
        int i3 = g;
        if (i2 >= i3) {
            g = i3 << 1;
            this.o = (SolverVariable[]) Arrays.copyOf(this.o, g);
        }
        SolverVariable[] solverVariableArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        solverVariableArr[i4] = solverVariable;
        return solverVariable;
    }

    public static int b(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).h;
        if (solverVariable != null) {
            return (int) (solverVariable.d + 0.5f);
        }
        return 0;
    }

    public final void a(a aVar) {
        b((dy) aVar);
        h();
        b(aVar);
        e();
    }

    private final void b(dy dyVar) {
        if (this.d > 0) {
            dyVar.d.a(dyVar, this.b);
            if (dyVar.d.a == 0) {
                dyVar.e = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dy r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r0.d
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.n
            if (r2 >= r4) goto L_0x0016
            int r2 = r0.m
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 < r4) goto L_0x0019
        L_0x0016:
            r17.f()
        L_0x0019:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x018c
            r17.b(r18)
            androidx.constraintlayout.solver.SolverVariable r2 = r1.a
            r5 = 0
            if (r2 != 0) goto L_0x0033
            float r2 = r1.b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0033
            dx r2 = r1.d
            int r2 = r2.a
            if (r2 != 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            float r2 = r1.b
            r6 = -1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            float r2 = r1.b
            float r2 = -r2
            r1.b = r2
            dx r2 = r1.d
            int r7 = r2.g
            r8 = 0
        L_0x0048:
            if (r7 == r6) goto L_0x005c
            int r9 = r2.a
            if (r8 >= r9) goto L_0x005c
            float[] r9 = r2.f
            r10 = r9[r7]
            float r10 = -r10
            r9[r7] = r10
            int[] r9 = r2.e
            r7 = r9[r7]
            int r8 = r8 + 1
            goto L_0x0048
        L_0x005c:
            dx r2 = r1.d
            int r7 = r2.g
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0067:
            if (r7 == r6) goto L_0x00f8
            int r4 = r2.a
            if (r9 >= r4) goto L_0x00f8
            float[] r4 = r2.f
            r4 = r4[r7]
            dz r6 = r2.c
            androidx.constraintlayout.solver.SolverVariable[] r6 = r6.c
            int[] r8 = r2.d
            r8 = r8[r7]
            r6 = r6[r8]
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0090
            r8 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a1
            float[] r4 = r2.f
            r4[r7] = r5
            dy r4 = r2.b
            r6.b(r4)
            goto L_0x00a0
        L_0x0090:
            r8 = 981668463(0x3a83126f, float:0.001)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a1
            float[] r4 = r2.f
            r4[r7] = r5
            dy r4 = r2.b
            r6.b(r4)
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00ee
            androidx.constraintlayout.solver.SolverVariable$Type r8 = r6.f
            androidx.constraintlayout.solver.SolverVariable$Type r3 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r8 != r3) goto L_0x00ca
            if (r11 != 0) goto L_0x00b5
            boolean r3 = defpackage.dx.a(r6)
        L_0x00b1:
            r13 = r3
            r12 = r4
            r11 = r6
            goto L_0x00ee
        L_0x00b5:
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00be
            boolean r3 = defpackage.dx.a(r6)
            goto L_0x00b1
        L_0x00be:
            if (r13 != 0) goto L_0x00ee
            boolean r3 = defpackage.dx.a(r6)
            if (r3 == 0) goto L_0x00ee
            r12 = r4
            r11 = r6
            r13 = 1
            goto L_0x00ee
        L_0x00ca:
            if (r11 != 0) goto L_0x00ee
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ee
            if (r10 != 0) goto L_0x00da
            boolean r3 = defpackage.dx.a(r6)
        L_0x00d6:
            r15 = r3
            r14 = r4
            r10 = r6
            goto L_0x00ee
        L_0x00da:
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e3
            boolean r3 = defpackage.dx.a(r6)
            goto L_0x00d6
        L_0x00e3:
            if (r15 != 0) goto L_0x00ee
            boolean r3 = defpackage.dx.a(r6)
            if (r3 == 0) goto L_0x00ee
            r14 = r4
            r10 = r6
            r15 = 1
        L_0x00ee:
            int[] r3 = r2.e
            r7 = r3[r7]
            int r9 = r9 + 1
            r3 = 1
            r6 = -1
            goto L_0x0067
        L_0x00f8:
            if (r11 == 0) goto L_0x00fb
            r10 = r11
        L_0x00fb:
            if (r10 != 0) goto L_0x00ff
            r2 = 1
            goto L_0x0103
        L_0x00ff:
            r1.b(r10)
            r2 = 0
        L_0x0103:
            dx r3 = r1.d
            int r3 = r3.a
            if (r3 != 0) goto L_0x010d
            r3 = 1
            r1.e = r3
            goto L_0x010e
        L_0x010d:
            r3 = 1
        L_0x010e:
            if (r2 == 0) goto L_0x016e
            int r2 = r0.m
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 < r4) goto L_0x011a
            r17.f()
        L_0x011a:
            androidx.constraintlayout.solver.SolverVariable$Type r2 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK
            r4 = 0
            androidx.constraintlayout.solver.SolverVariable r2 = r0.a(r2, r4)
            int r4 = r0.h
            int r4 = r4 + r3
            r0.h = r4
            int r4 = r0.m
            int r4 = r4 + r3
            r0.m = r4
            int r3 = r0.h
            r2.a = r3
            dz r3 = r0.e
            androidx.constraintlayout.solver.SolverVariable[] r3 = r3.c
            int r4 = r0.h
            r3[r4] = r2
            r1.a = r2
            r17.c(r18)
            eb$a r3 = r0.r
            r3.a(r1)
            eb$a r3 = r0.r
            r0.b(r3)
            int r3 = r2.b
            r4 = -1
            if (r3 != r4) goto L_0x016b
            androidx.constraintlayout.solver.SolverVariable r3 = r1.a
            if (r3 != r2) goto L_0x015b
            dx r3 = r1.d
            r4 = 0
            androidx.constraintlayout.solver.SolverVariable r2 = r3.a(r4, r2)
            if (r2 == 0) goto L_0x015b
            r1.b(r2)
        L_0x015b:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0164
            androidx.constraintlayout.solver.SolverVariable r2 = r1.a
            r2.c(r1)
        L_0x0164:
            int r2 = r0.d
            r3 = 1
            int r2 = r2 - r3
            r0.d = r2
            goto L_0x016c
        L_0x016b:
            r3 = 1
        L_0x016c:
            r4 = 1
            goto L_0x016f
        L_0x016e:
            r4 = 0
        L_0x016f:
            androidx.constraintlayout.solver.SolverVariable r2 = r1.a
            if (r2 == 0) goto L_0x0184
            androidx.constraintlayout.solver.SolverVariable r2 = r1.a
            androidx.constraintlayout.solver.SolverVariable$Type r2 = r2.f
            androidx.constraintlayout.solver.SolverVariable$Type r6 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r2 == r6) goto L_0x0181
            float r2 = r1.b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
        L_0x0181:
            r16 = 1
            goto L_0x0186
        L_0x0184:
            r16 = 0
        L_0x0186:
            if (r16 != 0) goto L_0x0189
            return
        L_0x0189:
            r16 = r4
            goto L_0x018e
        L_0x018c:
            r16 = 0
        L_0x018e:
            if (r16 != 0) goto L_0x0193
            r17.c(r18)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb.a(dy):void");
    }

    private final void c(dy dyVar) {
        if (this.b[this.d] != null) {
            this.e.a.a(this.b[this.d]);
        }
        this.b[this.d] = dyVar;
        SolverVariable solverVariable = dyVar.a;
        int i2 = this.d;
        solverVariable.b = i2;
        this.d = i2 + 1;
        dyVar.a.c(dyVar);
    }

    private final int b(a aVar) {
        for (int i2 = 0; i2 < this.m; i2++) {
            this.l[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.m * 2) {
                return i3;
            }
            if (aVar.b() != null) {
                this.l[aVar.b().a] = true;
            }
            SolverVariable a2 = aVar.a(this.l);
            if (a2 != null) {
                if (this.l[a2.a]) {
                    return i3;
                }
                this.l[a2.a] = true;
            }
            if (a2 != null) {
                int i4 = -1;
                float f2 = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.d; i5++) {
                    dy dyVar = this.b[i5];
                    if (dyVar.a.f != Type.UNRESTRICTED && !dyVar.e && dyVar.a(a2)) {
                        float b2 = dyVar.d.b(a2);
                        if (b2 < 0.0f) {
                            float f3 = (-dyVar.b) / b2;
                            if (f3 < f2) {
                                i4 = i5;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i4 >= 0) {
                    dy dyVar2 = this.b[i4];
                    dyVar2.a.b = -1;
                    dyVar2.b(a2);
                    dyVar2.a.b = i4;
                    dyVar2.a.c(dyVar2);
                }
            }
            z = true;
        }
        return i3;
    }

    private int h() {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 < this.d) {
                if (this.b[i2].a.f != Type.UNRESTRICTED && this.b[i2].b < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            float f3 = Float.MAX_VALUE;
            int i7 = 0;
            while (i4 < this.d) {
                dy dyVar = this.b[i4];
                if (dyVar.a.f != Type.UNRESTRICTED && !dyVar.e && dyVar.b < f2) {
                    int i8 = i7;
                    float f4 = f3;
                    int i9 = i6;
                    int i10 = i5;
                    int i11 = 1;
                    while (i11 < this.m) {
                        SolverVariable solverVariable = this.e.c[i11];
                        float b2 = dyVar.d.b(solverVariable);
                        if (b2 > f2) {
                            int i12 = i8;
                            float f5 = f4;
                            int i13 = i9;
                            int i14 = i10;
                            for (int i15 = 0; i15 < 7; i15++) {
                                float f6 = solverVariable.e[i15] / b2;
                                if ((f6 < f5 && i15 == i12) || i15 > i12) {
                                    f5 = f6;
                                    i14 = i4;
                                    i13 = i11;
                                    i12 = i15;
                                }
                            }
                            i10 = i14;
                            i9 = i13;
                            f4 = f5;
                            i8 = i12;
                        }
                        i11++;
                        f2 = 0.0f;
                    }
                    i5 = i10;
                    i6 = i9;
                    f3 = f4;
                    i7 = i8;
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                dy dyVar2 = this.b[i5];
                dyVar2.a.b = -1;
                dyVar2.b(this.e.c[i6]);
                dyVar2.a.b = i5;
                dyVar2.a.c(dyVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.m / 2) {
                z2 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    public void e() {
        for (int i2 = 0; i2 < this.d; i2++) {
            dy dyVar = this.b[i2];
            dyVar.a.d = dyVar.b;
        }
    }

    public final void a(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        dy c2 = c();
        SolverVariable d2 = d();
        d2.c = 0;
        c2.a(solverVariable, solverVariable2, d2, i2);
        if (i3 != 6) {
            a(c2, (int) (c2.d.b(d2) * -1.0f), i3);
        }
        a(c2);
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        dy c2 = c();
        SolverVariable d2 = d();
        d2.c = 0;
        c2.b(solverVariable, solverVariable2, d2, i2);
        if (i3 != 6) {
            a(c2, (int) (c2.d.b(d2) * -1.0f), i3);
        }
        a(c2);
    }

    public final void a(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        dy c2 = c();
        if (solverVariable2 == solverVariable3) {
            c2.d.a(solverVariable, 1.0f);
            c2.d.a(solverVariable4, 1.0f);
            c2.d.a(solverVariable2, -2.0f);
        } else if (f2 == 0.5f) {
            c2.d.a(solverVariable, 1.0f);
            c2.d.a(solverVariable2, -1.0f);
            c2.d.a(solverVariable3, -1.0f);
            c2.d.a(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                c2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            c2.d.a(solverVariable, -1.0f);
            c2.d.a(solverVariable2, 1.0f);
            c2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            c2.d.a(solverVariable3, -1.0f);
            c2.d.a(solverVariable4, 1.0f);
            c2.b = (float) i3;
        } else {
            float f3 = 1.0f - f2;
            c2.d.a(solverVariable, f3 * 1.0f);
            c2.d.a(solverVariable2, f3 * -1.0f);
            c2.d.a(solverVariable3, -1.0f * f2);
            c2.d.a(solverVariable4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                c2.b = (((float) (-i2)) * f3) + (((float) i3) * f2);
            }
        }
        if (i4 != 6) {
            c2.a(this, i4);
        }
        a(c2);
    }

    public final void a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2, int i2) {
        dy c2 = c();
        c2.a(solverVariable, solverVariable2, solverVariable3, solverVariable4, f2);
        a(c2);
    }

    public final dy c(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        dy c2 = c();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            c2.b = (float) i2;
        }
        if (!z) {
            c2.d.a(solverVariable, -1.0f);
            c2.d.a(solverVariable2, 1.0f);
        } else {
            c2.d.a(solverVariable, 1.0f);
            c2.d.a(solverVariable2, -1.0f);
        }
        if (i3 != 6) {
            c2.a(this, i3);
        }
        a(c2);
        return c2;
    }

    public final void a(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.b;
        if (solverVariable.b != -1) {
            dy dyVar = this.b[i3];
            if (dyVar.e) {
                dyVar.b = (float) i2;
            } else if (dyVar.d.a == 0) {
                dyVar.e = true;
                dyVar.b = (float) i2;
            } else {
                dy c2 = c();
                if (i2 < 0) {
                    c2.b = (float) (i2 * -1);
                    c2.d.a(solverVariable, 1.0f);
                } else {
                    c2.b = (float) i2;
                    c2.d.a(solverVariable, -1.0f);
                }
                a(c2);
            }
        } else {
            dy c3 = c();
            c3.a = solverVariable;
            float f2 = (float) i2;
            solverVariable.d = f2;
            c3.b = f2;
            c3.e = true;
            a(c3);
        }
    }

    public static dy a(eb ebVar, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f2, boolean z) {
        dy c2 = ebVar.c();
        if (z) {
            c2.a(ebVar, 0);
        }
        c2.d.a(solverVariable, -1.0f);
        c2.d.a(solverVariable2, 1.0f - f2);
        c2.d.a(solverVariable3, f2);
        return c2;
    }
}
