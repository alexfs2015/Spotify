package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;

/* renamed from: em reason: default package */
public final class em {
    static boolean[] a = new boolean[3];

    public static void a(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        constraintWidget.g();
        eo eoVar = constraintWidget2.u.a;
        eo eoVar2 = constraintWidget2.v.a;
        eo eoVar3 = constraintWidget2.w.a;
        eo eoVar4 = constraintWidget2.x.a;
        boolean z = (i & 8) == 8;
        boolean z2 = constraintWidget2.C[0] == DimensionBehaviour.MATCH_CONSTRAINT && a(constraintWidget2, 0);
        if (!(eoVar.e == 4 || eoVar3.e == 4)) {
            if (constraintWidget2.C[0] == DimensionBehaviour.FIXED || (z2 && constraintWidget2.U == 8)) {
                if (constraintWidget2.u.d == null && constraintWidget2.w.d == null) {
                    eoVar.e = 1;
                    eoVar3.e = 1;
                    if (z) {
                        eoVar3.a(eoVar, 1, constraintWidget.i());
                    } else {
                        eoVar3.a(eoVar, constraintWidget.m());
                    }
                } else if (constraintWidget2.u.d != null && constraintWidget2.w.d == null) {
                    eoVar.e = 1;
                    eoVar3.e = 1;
                    if (z) {
                        eoVar3.a(eoVar, 1, constraintWidget.i());
                    } else {
                        eoVar3.a(eoVar, constraintWidget.m());
                    }
                } else if (constraintWidget2.u.d == null && constraintWidget2.w.d != null) {
                    eoVar.e = 1;
                    eoVar3.e = 1;
                    eoVar.a(eoVar3, -constraintWidget.m());
                    if (z) {
                        eoVar.a(eoVar3, -1, constraintWidget.i());
                    } else {
                        eoVar.a(eoVar3, -constraintWidget.m());
                    }
                } else if (!(constraintWidget2.u.d == null || constraintWidget2.w.d == null)) {
                    eoVar.e = 2;
                    eoVar3.e = 2;
                    if (z) {
                        constraintWidget.i().a(eoVar);
                        constraintWidget.i().a(eoVar3);
                        eoVar.b(eoVar3, -1, constraintWidget.i());
                        eoVar3.b(eoVar, 1, constraintWidget.i());
                    } else {
                        eoVar.b(eoVar3, (float) (-constraintWidget.m()));
                        eoVar3.b(eoVar, (float) constraintWidget.m());
                    }
                }
            } else if (z2) {
                int m = constraintWidget.m();
                eoVar.e = 1;
                eoVar3.e = 1;
                if (constraintWidget2.u.d == null && constraintWidget2.w.d == null) {
                    if (z) {
                        eoVar3.a(eoVar, 1, constraintWidget.i());
                    } else {
                        eoVar3.a(eoVar, m);
                    }
                } else if (constraintWidget2.u.d == null || constraintWidget2.w.d != null) {
                    if (constraintWidget2.u.d != null || constraintWidget2.w.d == null) {
                        if (!(constraintWidget2.u.d == null || constraintWidget2.w.d == null)) {
                            if (z) {
                                constraintWidget.i().a(eoVar);
                                constraintWidget.i().a(eoVar3);
                            }
                            if (constraintWidget2.G == 0.0f) {
                                eoVar.e = 3;
                                eoVar3.e = 3;
                                eoVar.b(eoVar3, 0.0f);
                                eoVar3.b(eoVar, 0.0f);
                            } else {
                                eoVar.e = 2;
                                eoVar3.e = 2;
                                eoVar.b(eoVar3, (float) (-m));
                                eoVar3.b(eoVar, (float) m);
                                constraintWidget2.e(m);
                            }
                        }
                    } else if (z) {
                        eoVar.a(eoVar3, -1, constraintWidget.i());
                    } else {
                        eoVar.a(eoVar3, -m);
                    }
                } else if (z) {
                    eoVar3.a(eoVar, 1, constraintWidget.i());
                } else {
                    eoVar3.a(eoVar, m);
                }
            }
        }
        boolean z3 = constraintWidget2.C[1] == DimensionBehaviour.MATCH_CONSTRAINT && a(constraintWidget2, 1);
        if (!(eoVar2.e == 4 || eoVar4.e == 4)) {
            if (constraintWidget2.C[1] == DimensionBehaviour.FIXED || (z3 && constraintWidget2.U == 8)) {
                if (constraintWidget2.v.d == null && constraintWidget2.x.d == null) {
                    eoVar2.e = 1;
                    eoVar4.e = 1;
                    if (z) {
                        eoVar4.a(eoVar2, 1, constraintWidget.j());
                    } else {
                        eoVar4.a(eoVar2, constraintWidget.n());
                    }
                    if (constraintWidget2.y.d != null) {
                        constraintWidget2.y.a.e = 1;
                        eoVar2.a(1, constraintWidget2.y.a, -constraintWidget2.M);
                    }
                } else if (constraintWidget2.v.d != null && constraintWidget2.x.d == null) {
                    eoVar2.e = 1;
                    eoVar4.e = 1;
                    if (z) {
                        eoVar4.a(eoVar2, 1, constraintWidget.j());
                    } else {
                        eoVar4.a(eoVar2, constraintWidget.n());
                    }
                    if (constraintWidget2.M > 0) {
                        constraintWidget2.y.a.a(1, eoVar2, constraintWidget2.M);
                    }
                } else if (constraintWidget2.v.d == null && constraintWidget2.x.d != null) {
                    eoVar2.e = 1;
                    eoVar4.e = 1;
                    if (z) {
                        eoVar2.a(eoVar4, -1, constraintWidget.j());
                    } else {
                        eoVar2.a(eoVar4, -constraintWidget.n());
                    }
                    if (constraintWidget2.M > 0) {
                        constraintWidget2.y.a.a(1, eoVar2, constraintWidget2.M);
                    }
                } else if (!(constraintWidget2.v.d == null || constraintWidget2.x.d == null)) {
                    eoVar2.e = 2;
                    eoVar4.e = 2;
                    if (z) {
                        eoVar2.b(eoVar4, -1, constraintWidget.j());
                        eoVar4.b(eoVar2, 1, constraintWidget.j());
                        constraintWidget.j().a(eoVar2);
                        constraintWidget.i().a(eoVar4);
                    } else {
                        eoVar2.b(eoVar4, (float) (-constraintWidget.n()));
                        eoVar4.b(eoVar2, (float) constraintWidget.n());
                    }
                    if (constraintWidget2.M > 0) {
                        constraintWidget2.y.a.a(1, eoVar2, constraintWidget2.M);
                    }
                }
            } else if (z3) {
                int n = constraintWidget.n();
                eoVar2.e = 1;
                eoVar4.e = 1;
                if (constraintWidget2.v.d == null && constraintWidget2.x.d == null) {
                    if (z) {
                        eoVar4.a(eoVar2, 1, constraintWidget.j());
                    } else {
                        eoVar4.a(eoVar2, n);
                    }
                } else if (constraintWidget2.v.d == null || constraintWidget2.x.d != null) {
                    if (constraintWidget2.v.d != null || constraintWidget2.x.d == null) {
                        if (!(constraintWidget2.v.d == null || constraintWidget2.x.d == null)) {
                            if (z) {
                                constraintWidget.j().a(eoVar2);
                                constraintWidget.i().a(eoVar4);
                            }
                            if (constraintWidget2.G == 0.0f) {
                                eoVar2.e = 3;
                                eoVar4.e = 3;
                                eoVar2.b(eoVar4, 0.0f);
                                eoVar4.b(eoVar2, 0.0f);
                                return;
                            }
                            eoVar2.e = 2;
                            eoVar4.e = 2;
                            eoVar2.b(eoVar4, (float) (-n));
                            eoVar4.b(eoVar2, (float) n);
                            constraintWidget2.f(n);
                            if (constraintWidget2.M > 0) {
                                constraintWidget2.y.a.a(1, eoVar2, constraintWidget2.M);
                            }
                        }
                    } else if (z) {
                        eoVar2.a(eoVar4, -1, constraintWidget.j());
                    } else {
                        eoVar2.a(eoVar4, -n);
                    }
                } else if (z) {
                    eoVar4.a(eoVar2, 1, constraintWidget.j());
                } else {
                    eoVar4.a(eoVar2, n);
                }
            }
        }
    }

    static void a(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i << 1;
        int i4 = i3 + 1;
        constraintWidget.A[i3].a.c = constraintWidget.D.u.a;
        constraintWidget.A[i3].a.d = (float) i2;
        constraintWidget.A[i3].a.g = 1;
        constraintWidget.A[i4].a.c = constraintWidget.A[i3].a;
        constraintWidget.A[i4].a.d = (float) constraintWidget.b(i);
        constraintWidget.A[i4].a.g = 1;
    }

    static void a(ei eiVar, eb ebVar, ConstraintWidget constraintWidget) {
        if (eiVar.C[0] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.C[0] == DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.u.e;
            int m = eiVar.m() - constraintWidget.w.e;
            constraintWidget.u.h = ebVar.a((Object) constraintWidget.u);
            constraintWidget.w.h = ebVar.a((Object) constraintWidget.w);
            ebVar.a(constraintWidget.u.h, i);
            ebVar.a(constraintWidget.w.h, m);
            constraintWidget.c = 2;
            constraintWidget.c(i, m);
        }
        if (eiVar.C[1] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.C[1] == DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.v.e;
            int n = eiVar.n() - constraintWidget.x.e;
            constraintWidget.v.h = ebVar.a((Object) constraintWidget.v);
            constraintWidget.x.h = ebVar.a((Object) constraintWidget.x);
            ebVar.a(constraintWidget.v.h, i2);
            ebVar.a(constraintWidget.x.h, n);
            if (constraintWidget.M > 0 || constraintWidget.U == 8) {
                constraintWidget.y.h = ebVar.a((Object) constraintWidget.y);
                ebVar.a(constraintWidget.y.h, constraintWidget.M + i2);
            }
            constraintWidget.d = 2;
            constraintWidget.d(i2, n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(androidx.constraintlayout.solver.widgets.ConstraintWidget r4, int r5) {
        /*
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r4.C
            r0 = r0[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            float r0 = r4.G
            r1 = 0
            r3 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r4.C
            if (r5 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r4 = r4[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x001e
        L_0x001e:
            return r2
        L_0x001f:
            if (r5 != 0) goto L_0x002f
            int r5 = r4.g
            if (r5 == 0) goto L_0x0026
            return r2
        L_0x0026:
            int r5 = r4.j
            if (r5 != 0) goto L_0x002e
            int r4 = r4.k
            if (r4 == 0) goto L_0x003d
        L_0x002e:
            return r2
        L_0x002f:
            int r5 = r4.h
            if (r5 == 0) goto L_0x0034
            return r2
        L_0x0034:
            int r5 = r4.m
            if (r5 != 0) goto L_0x003e
            int r4 = r4.n
            if (r4 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            return r3
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em.a(androidx.constraintlayout.solver.widgets.ConstraintWidget, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r7.Z == 2) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r7.aa == 2) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(defpackage.ei r21, defpackage.eb r22, int r23, int r24, defpackage.eh r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r25
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r2.c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r2.b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r2.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r2.e
            float r2 = r2.k
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 2
            r10 = 1
            if (r1 != 0) goto L_0x002e
            int r11 = r7.Z
            if (r11 != 0) goto L_0x001e
            r11 = 1
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            int r12 = r7.Z
            if (r12 != r10) goto L_0x0025
            r12 = 1
            goto L_0x0026
        L_0x0025:
            r12 = 0
        L_0x0026:
            int r7 = r7.Z
            if (r7 != r8) goto L_0x002c
        L_0x002a:
            r7 = 1
            goto L_0x0041
        L_0x002c:
            r7 = 0
            goto L_0x0041
        L_0x002e:
            int r11 = r7.aa
            if (r11 != 0) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            int r12 = r7.aa
            if (r12 != r10) goto L_0x003b
            r12 = 1
            goto L_0x003c
        L_0x003b:
            r12 = 0
        L_0x003c:
            int r7 = r7.aa
            if (r7 != r8) goto L_0x002c
            goto L_0x002a
        L_0x0041:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0049:
            r8 = 8
            if (r13 != 0) goto L_0x00fa
            int r9 = r14.U
            if (r9 == r8) goto L_0x0095
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x005a
            int r9 = r14.m()
            goto L_0x005e
        L_0x005a:
            int r9 = r14.n()
        L_0x005e:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x006e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.A
            r9 = r9[r24]
            int r9 = r9.b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x006e:
            if (r14 == r6) goto L_0x007d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.A
            int r19 = r24 + 1
            r9 = r9[r19]
            int r9 = r9.b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.A
            r9 = r9[r24]
            int r9 = r9.b()
            float r9 = (float) r9
            float r17 = r17 + r9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.A
            int r19 = r24 + 1
            r9 = r9[r19]
            int r9 = r9.b()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x0095:
            int r9 = r14.U
            if (r9 == r8) goto L_0x00cd
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r14.C
            r8 = r8[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x00cd
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00b5
            int r8 = r14.g
            if (r8 == 0) goto L_0x00ab
            r8 = 0
            return r8
        L_0x00ab:
            r8 = 0
            int r9 = r14.j
            if (r9 != 0) goto L_0x00b4
            int r9 = r14.k
            if (r9 == 0) goto L_0x00c4
        L_0x00b4:
            return r8
        L_0x00b5:
            r8 = 0
            int r9 = r14.h
            if (r9 == 0) goto L_0x00bb
            return r8
        L_0x00bb:
            int r9 = r14.m
            if (r9 != 0) goto L_0x00cc
            int r9 = r14.n
            if (r9 == 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            float r9 = r14.G
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00cd
        L_0x00cc:
            return r8
        L_0x00cd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r14.A
            int r9 = r24 + 1
            r8 = r8[r9]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            if (r8 == 0) goto L_0x00ef
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r8.b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r8.A
            r9 = r9[r24]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 == 0) goto L_0x00ef
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r8.A
            r9 = r9[r24]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r9.b
            if (r9 == r14) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            r19 = r8
            goto L_0x00f1
        L_0x00ef:
            r19 = 0
        L_0x00f1:
            if (r19 == 0) goto L_0x00f7
            r14 = r19
            goto L_0x0049
        L_0x00f7:
            r13 = 1
            goto L_0x0049
        L_0x00fa:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r3.A
            r9 = r9[r24]
            eo r9 = r9.a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r13 = r4.A
            int r19 = r24 + 1
            r13 = r13[r19]
            eo r13 = r13.a
            eo r8 = r9.b
            if (r8 == 0) goto L_0x030f
            eo r8 = r13.b
            if (r8 != 0) goto L_0x0112
            goto L_0x030f
        L_0x0112:
            eo r8 = r9.b
            int r8 = r8.g
            r20 = r3
            r3 = 1
            if (r8 != r3) goto L_0x030d
            eo r8 = r13.b
            int r8 = r8.g
            if (r8 == r3) goto L_0x0123
            goto L_0x030d
        L_0x0123:
            if (r10 <= 0) goto L_0x0129
            if (r10 == r15) goto L_0x0129
            r3 = 0
            return r3
        L_0x0129:
            if (r7 != 0) goto L_0x0132
            if (r11 != 0) goto L_0x0132
            if (r12 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r8 = 0
            goto L_0x014b
        L_0x0132:
            if (r5 == 0) goto L_0x013e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r5.A
            r3 = r3[r24]
            int r3 = r3.b()
            float r8 = (float) r3
            goto L_0x013f
        L_0x013e:
            r8 = 0
        L_0x013f:
            if (r6 == 0) goto L_0x014b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r6.A
            r3 = r3[r19]
            int r3 = r3.b()
            float r3 = (float) r3
            float r8 = r8 + r3
        L_0x014b:
            eo r3 = r9.b
            float r3 = r3.d
            eo r6 = r13.b
            float r6 = r6.d
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x0159
            float r6 = r6 - r3
            goto L_0x015b
        L_0x0159:
            float r6 = r3 - r6
        L_0x015b:
            float r6 = r6 - r16
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 <= 0) goto L_0x01e7
            if (r10 != r15) goto L_0x01e7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r14.D
            if (r5 == 0) goto L_0x0173
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r14.D
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r5.C
            r5 = r5[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r7) goto L_0x0173
            r5 = 0
            return r5
        L_0x0173:
            float r6 = r6 + r16
            float r6 = r6 - r17
            r5 = r3
            r3 = r20
        L_0x017a:
            if (r3 == 0) goto L_0x01e5
            ec r7 = defpackage.eb.f
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r3.ad
            r7 = r7[r1]
            if (r7 != 0) goto L_0x0186
            if (r3 != r4) goto L_0x01e3
        L_0x0186:
            float r8 = (float) r10
            float r8 = r6 / r8
            r11 = 0
            int r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x019f
            float[] r8 = r3.ab
            r8 = r8[r1]
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x0198
            r8 = 0
            goto L_0x019f
        L_0x0198:
            float[] r8 = r3.ab
            r8 = r8[r1]
            float r8 = r8 * r6
            float r8 = r8 / r2
        L_0x019f:
            int r11 = r3.U
            r12 = 8
            if (r11 != r12) goto L_0x01a6
            r8 = 0
        L_0x01a6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r3.A
            r11 = r11[r24]
            int r11 = r11.b()
            float r11 = (float) r11
            float r5 = r5 + r11
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r3.A
            r11 = r11[r24]
            eo r11 = r11.a
            eo r12 = r9.c
            r11.a(r12, r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r3.A
            r11 = r11[r19]
            eo r11 = r11.a
            eo r12 = r9.c
            float r5 = r5 + r8
            r11.a(r12, r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r3.A
            r8 = r8[r24]
            eo r8 = r8.a
            r8.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r3.A
            r8 = r8[r19]
            eo r8 = r8.a
            r8.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.A
            r3 = r3[r19]
            int r3 = r3.b()
            float r3 = (float) r3
            float r5 = r5 + r3
        L_0x01e3:
            r3 = r7
            goto L_0x017a
        L_0x01e5:
            r3 = 1
            return r3
        L_0x01e7:
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ef
            r7 = 1
            r11 = 0
            r12 = 0
        L_0x01ef:
            if (r7 == 0) goto L_0x025a
            float r6 = r6 - r8
            if (r1 != 0) goto L_0x01f9
            r2 = r20
            float r13 = r2.R
            goto L_0x0200
        L_0x01f9:
            r2 = r20
            r5 = 1
            if (r1 != r5) goto L_0x0200
            float r13 = r2.S
        L_0x0200:
            float r6 = r6 * r13
            float r3 = r3 + r6
        L_0x0203:
            if (r2 == 0) goto L_0x0261
            ec r5 = defpackage.eb.f
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r2.ad
            r5 = r5[r1]
            if (r5 != 0) goto L_0x020f
            if (r2 != r4) goto L_0x0258
        L_0x020f:
            if (r1 != 0) goto L_0x0216
            int r6 = r2.m()
            goto L_0x021a
        L_0x0216:
            int r6 = r2.n()
        L_0x021a:
            float r6 = (float) r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r2.A
            r7 = r7[r24]
            int r7 = r7.b()
            float r7 = (float) r7
            float r3 = r3 + r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r2.A
            r7 = r7[r24]
            eo r7 = r7.a
            eo r8 = r9.c
            r7.a(r8, r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r2.A
            r7 = r7[r19]
            eo r7 = r7.a
            eo r8 = r9.c
            float r3 = r3 + r6
            r7.a(r8, r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r2.A
            r6 = r6[r24]
            eo r6 = r6.a
            r6.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r2.A
            r6 = r6[r19]
            eo r6 = r6.a
            r6.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.A
            r2 = r2[r19]
            int r2 = r2.b()
            float r2 = (float) r2
            float r3 = r3 + r2
        L_0x0258:
            r2 = r5
            goto L_0x0203
        L_0x025a:
            r2 = r20
            if (r11 != 0) goto L_0x0264
            if (r12 == 0) goto L_0x0261
            goto L_0x0264
        L_0x0261:
            r0 = 1
            goto L_0x030c
        L_0x0264:
            if (r11 == 0) goto L_0x0268
        L_0x0266:
            float r6 = r6 - r8
            goto L_0x026b
        L_0x0268:
            if (r12 == 0) goto L_0x026b
            goto L_0x0266
        L_0x026b:
            int r7 = r15 + 1
            float r7 = (float) r7
            float r7 = r6 / r7
            if (r12 == 0) goto L_0x027d
            r8 = 1
            if (r15 <= r8) goto L_0x0279
            int r7 = r15 + -1
            float r7 = (float) r7
            goto L_0x027b
        L_0x0279:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x027b:
            float r7 = r6 / r7
        L_0x027d:
            int r6 = r2.U
            r8 = 8
            if (r6 == r8) goto L_0x0286
            float r6 = r3 + r7
            goto L_0x0287
        L_0x0286:
            r6 = r3
        L_0x0287:
            if (r12 == 0) goto L_0x0296
            r8 = 1
            if (r15 <= r8) goto L_0x0296
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r5.A
            r6 = r6[r24]
            int r6 = r6.b()
            float r6 = (float) r6
            float r6 = r6 + r3
        L_0x0296:
            if (r11 == 0) goto L_0x02a4
            if (r5 == 0) goto L_0x02a4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r5.A
            r3 = r3[r24]
            int r3 = r3.b()
            float r3 = (float) r3
            float r6 = r6 + r3
        L_0x02a4:
            if (r2 == 0) goto L_0x0261
            ec r3 = defpackage.eb.f
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r3 = r2.ad
            r3 = r3[r1]
            if (r3 != 0) goto L_0x02b4
            if (r2 != r4) goto L_0x02b1
            goto L_0x02b4
        L_0x02b1:
            r8 = 8
            goto L_0x030a
        L_0x02b4:
            if (r1 != 0) goto L_0x02bb
            int r8 = r2.m()
            goto L_0x02bf
        L_0x02bb:
            int r8 = r2.n()
        L_0x02bf:
            float r8 = (float) r8
            if (r2 == r5) goto L_0x02cc
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.A
            r10 = r10[r24]
            int r10 = r10.b()
            float r10 = (float) r10
            float r6 = r6 + r10
        L_0x02cc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.A
            r10 = r10[r24]
            eo r10 = r10.a
            eo r11 = r9.c
            r10.a(r11, r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.A
            r10 = r10[r19]
            eo r10 = r10.a
            eo r11 = r9.c
            float r12 = r6 + r8
            r10.a(r11, r12)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.A
            r10 = r10[r24]
            eo r10 = r10.a
            r10.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.A
            r10 = r10[r19]
            eo r10 = r10.a
            r10.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.A
            r2 = r2[r19]
            int r2 = r2.b()
            float r2 = (float) r2
            float r8 = r8 + r2
            float r6 = r6 + r8
            if (r3 == 0) goto L_0x02b1
            int r2 = r3.U
            r8 = 8
            if (r2 == r8) goto L_0x030a
            float r6 = r6 + r7
        L_0x030a:
            r2 = r3
            goto L_0x02a4
        L_0x030c:
            return r0
        L_0x030d:
            r0 = 0
            return r0
        L_0x030f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em.a(ei, eb, int, int, eh):boolean");
    }
}
