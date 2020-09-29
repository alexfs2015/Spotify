package defpackage;

/* renamed from: eg reason: default package */
final class eg {
    static void a(ei eiVar, eb ebVar, int i) {
        int i2;
        eh[] ehVarArr;
        int i3;
        if (i == 0) {
            int i4 = eiVar.b;
            ehVarArr = eiVar.ag;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = eiVar.ae;
            i2 = i5;
            ehVarArr = eiVar.af;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            eh ehVar = ehVarArr[i6];
            if (!ehVar.n) {
                ehVar.a();
            }
            ehVar.n = true;
            if (!eiVar.j(4) || !em.a(eiVar, ebVar, i, i3, ehVar)) {
                a(eiVar, ebVar, i, i3, ehVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.Z == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r2.aa == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0387 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.ei r35, defpackage.eb r36, int r37, int r38, defpackage.eh r39) {
        /*
            r0 = r35
            r9 = r36
            r1 = r39
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r1.a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r1.c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r1.b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r1.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.e
            float r3 = r1.k
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.C
            r4 = r4[r37]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r37 != 0) goto L_0x0034
            int r8 = r2.Z
            if (r8 != 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r14 = r2.Z
            if (r14 != r7) goto L_0x002e
            r14 = 1
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            int r15 = r2.Z
            if (r15 != r5) goto L_0x0048
            goto L_0x0046
        L_0x0034:
            int r8 = r2.aa
            if (r8 != 0) goto L_0x003a
            r8 = 1
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            int r14 = r2.aa
            if (r14 != r7) goto L_0x0041
            r14 = 1
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            int r15 = r2.aa
            if (r15 != r5) goto L_0x0048
        L_0x0046:
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x004f:
            r21 = 0
            if (r5 != 0) goto L_0x012f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r8.A
            r7 = r7[r38]
            if (r4 != 0) goto L_0x005f
            if (r14 == 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r23 = 4
            goto L_0x0061
        L_0x005f:
            r23 = 1
        L_0x0061:
            int r24 = r7.b()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r7.d
            if (r6 == 0) goto L_0x0073
            if (r8 == r10) goto L_0x0073
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r7.d
            int r6 = r6.b()
            int r24 = r24 + r6
        L_0x0073:
            r6 = r24
            if (r14 == 0) goto L_0x0081
            if (r8 == r10) goto L_0x0081
            if (r8 == r12) goto L_0x0081
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0091
        L_0x0081:
            if (r15 == 0) goto L_0x008b
            if (r4 == 0) goto L_0x008b
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0091
        L_0x008b:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0091:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r7.d
            if (r5 == 0) goto L_0x00be
            if (r8 != r12) goto L_0x00a6
            androidx.constraintlayout.solver.SolverVariable r5 = r7.h
            r25 = r15
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r7.d
            androidx.constraintlayout.solver.SolverVariable r15 = r15.h
            r26 = r2
            r2 = 5
            r9.a(r5, r15, r6, r2)
            goto L_0x00b4
        L_0x00a6:
            r26 = r2
            r25 = r15
            androidx.constraintlayout.solver.SolverVariable r2 = r7.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r7.d
            androidx.constraintlayout.solver.SolverVariable r5 = r5.h
            r15 = 6
            r9.a(r2, r5, r6, r15)
        L_0x00b4:
            androidx.constraintlayout.solver.SolverVariable r2 = r7.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r7.d
            androidx.constraintlayout.solver.SolverVariable r5 = r5.h
            r9.c(r2, r5, r6, r3)
            goto L_0x00c2
        L_0x00be:
            r26 = r2
            r25 = r15
        L_0x00c2:
            if (r4 == 0) goto L_0x00f7
            int r2 = r8.U
            r3 = 8
            if (r2 == r3) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r8.C
            r2 = r2[r37]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r8.A
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r8.A
            r3 = r3[r38]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            r5 = 5
            r6 = 0
            r9.a(r2, r3, r6, r5)
            goto L_0x00e7
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r8.A
            r2 = r2[r38]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r0.A
            r3 = r3[r38]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            r5 = 6
            r9.a(r2, r3, r6, r5)
        L_0x00f7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r8.A
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.d
            if (r2 == 0) goto L_0x0118
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r2.A
            r3 = r3[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
            if (r3 == 0) goto L_0x0118
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r2.A
            r3 = r3[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.b
            if (r3 == r8) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r21 = r2
        L_0x0118:
            if (r21 == 0) goto L_0x0126
            r8 = r21
            r5 = r23
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x004f
        L_0x0126:
            r3 = r24
            r15 = r25
            r2 = r26
            r5 = 1
            goto L_0x004f
        L_0x012f:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x0159
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.A
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.d
            if (r2 == 0) goto L_0x0159
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.A
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r5 = r2.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r11.A
            r3 = r6[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            int r2 = r2.b()
            int r2 = -r2
            r6 = 5
            r9.b(r5, r3, r2, r6)
            goto L_0x015a
        L_0x0159:
            r6 = 5
        L_0x015a:
            if (r4 == 0) goto L_0x0176
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.A
            int r2 = r38 + 1
            r0 = r0[r2]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r11.A
            r3 = r3[r2]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.A
            r2 = r4[r2]
            int r2 = r2.b()
            r4 = 6
            r9.a(r0, r3, r2, r4)
        L_0x0176:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r1.h
            if (r0 == 0) goto L_0x022e
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x022e
            boolean r4 = r1.l
            if (r4 == 0) goto L_0x018d
            boolean r4 = r1.m
            if (r4 != 0) goto L_0x018d
            int r4 = r1.j
            float r4 = (float) r4
            goto L_0x018f
        L_0x018d:
            r4 = r24
        L_0x018f:
            r5 = 0
            r8 = r21
            r7 = 0
            r28 = 0
        L_0x0195:
            if (r7 >= r2) goto L_0x022e
            java.lang.Object r15 = r0.get(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            float[] r3 = r15.ab
            r3 = r3[r37]
            int r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r23 >= 0) goto L_0x01c3
            boolean r3 = r1.m
            if (r3 == 0) goto L_0x01bf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.A
            int r23 = r38 + 1
            r3 = r3[r23]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r15 = r15.A
            r15 = r15[r38]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.h
            r5 = 4
            r6 = 0
            r9.c(r3, r15, r6, r5)
            r5 = 0
            r6 = 6
            goto L_0x01dc
        L_0x01bf:
            r5 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01c4
        L_0x01c3:
            r5 = 4
        L_0x01c4:
            r6 = 0
            int r20 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r20 != 0) goto L_0x01e1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.A
            int r20 = r38 + 1
            r3 = r3[r20]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r15 = r15.A
            r15 = r15[r38]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.h
            r5 = 0
            r6 = 6
            r9.c(r3, r15, r5, r6)
        L_0x01dc:
            r24 = r0
            r22 = r2
            goto L_0x0223
        L_0x01e1:
            r5 = 0
            r6 = 6
            if (r8 == 0) goto L_0x021c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r8.A
            r5 = r5[r38]
            androidx.constraintlayout.solver.SolverVariable r5 = r5.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r8.A
            int r22 = r38 + 1
            r8 = r8[r22]
            androidx.constraintlayout.solver.SolverVariable r8 = r8.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r15.A
            r6 = r6[r38]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.h
            r24 = r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r15.A
            r0 = r0[r22]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.h
            r22 = r2
            dy r2 = r36.c()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r6
            r34 = r0
            r27.a(r28, r29, r30, r31, r32, r33, r34)
            r9.a(r2)
            goto L_0x0220
        L_0x021c:
            r24 = r0
            r22 = r2
        L_0x0220:
            r28 = r3
            r8 = r15
        L_0x0223:
            int r7 = r7 + 1
            r2 = r22
            r0 = r24
            r3 = 1
            r5 = 0
            r6 = 5
            goto L_0x0195
        L_0x022e:
            if (r12 == 0) goto L_0x0298
            if (r12 == r13) goto L_0x0234
            if (r14 == 0) goto L_0x0298
        L_0x0234:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r10.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.A
            int r2 = r38 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r10.A
            r3 = r3[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
            if (r3 == 0) goto L_0x024f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r10.A
            r3 = r3[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.d
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            goto L_0x0251
        L_0x024f:
            r3 = r21
        L_0x0251:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.A
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.d
            if (r4 == 0) goto L_0x0263
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.A
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.d
            androidx.constraintlayout.solver.SolverVariable r4 = r4.h
            r5 = r4
            goto L_0x0265
        L_0x0263:
            r5 = r21
        L_0x0265:
            if (r12 != r13) goto L_0x026f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r12.A
            r1 = r1[r2]
        L_0x026f:
            if (r3 == 0) goto L_0x04b4
            if (r5 == 0) goto L_0x04b4
            if (r37 != 0) goto L_0x027a
            r2 = r26
            float r2 = r2.R
            goto L_0x027e
        L_0x027a:
            r2 = r26
            float r2 = r2.S
        L_0x027e:
            r4 = r2
            int r6 = r0.b()
            int r7 = r1.b()
            androidx.constraintlayout.solver.SolverVariable r2 = r0.h
            androidx.constraintlayout.solver.SolverVariable r8 = r1.h
            r10 = 5
            r0 = r36
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b4
        L_0x0298:
            if (r25 == 0) goto L_0x038b
            if (r12 == 0) goto L_0x038b
            int r0 = r1.j
            if (r0 <= 0) goto L_0x02a9
            int r0 = r1.i
            int r1 = r1.j
            if (r0 != r1) goto L_0x02a9
            r17 = 1
            goto L_0x02ab
        L_0x02a9:
            r17 = 0
        L_0x02ab:
            r14 = r12
            r15 = r14
        L_0x02ad:
            if (r14 == 0) goto L_0x04b4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.ad
            r0 = r0[r37]
            r8 = r0
        L_0x02b4:
            if (r8 == 0) goto L_0x02c1
            int r0 = r8.U
            r7 = 8
            if (r0 != r7) goto L_0x02c3
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r8.ad
            r8 = r0[r37]
            goto L_0x02b4
        L_0x02c1:
            r7 = 8
        L_0x02c3:
            if (r8 != 0) goto L_0x02d0
            if (r14 != r13) goto L_0x02c8
            goto L_0x02d0
        L_0x02c8:
            r18 = r8
            r19 = 4
            r20 = 6
            goto L_0x0380
        L_0x02d0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.d
            if (r2 == 0) goto L_0x02df
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.d
            androidx.constraintlayout.solver.SolverVariable r2 = r2.h
            goto L_0x02e1
        L_0x02df:
            r2 = r21
        L_0x02e1:
            if (r15 == r14) goto L_0x02ec
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.A
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.h
            goto L_0x0303
        L_0x02ec:
            if (r14 != r12) goto L_0x0303
            if (r15 != r14) goto L_0x0303
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.A
            r2 = r2[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.d
            if (r2 == 0) goto L_0x0301
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.A
            r2 = r2[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.d
            androidx.constraintlayout.solver.SolverVariable r2 = r2.h
            goto L_0x0303
        L_0x0301:
            r2 = r21
        L_0x0303:
            int r0 = r0.b()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r14.A
            int r4 = r38 + 1
            r3 = r3[r4]
            int r3 = r3.b()
            if (r8 == 0) goto L_0x031a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r8.A
            r5 = r5[r38]
            androidx.constraintlayout.solver.SolverVariable r6 = r5.h
            goto L_0x0327
        L_0x031a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r11.A
            r5 = r5[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.d
            if (r5 == 0) goto L_0x0325
            androidx.constraintlayout.solver.SolverVariable r6 = r5.h
            goto L_0x0327
        L_0x0325:
            r6 = r21
        L_0x0327:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.A
            r7 = r7[r4]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.h
            if (r5 == 0) goto L_0x0334
            int r5 = r5.b()
            int r3 = r3 + r5
        L_0x0334:
            if (r15 == 0) goto L_0x033f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r15.A
            r5 = r5[r4]
            int r5 = r5.b()
            int r0 = r0 + r5
        L_0x033f:
            if (r1 == 0) goto L_0x02c8
            if (r2 == 0) goto L_0x02c8
            if (r6 == 0) goto L_0x02c8
            if (r7 == 0) goto L_0x02c8
            if (r14 != r12) goto L_0x0351
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.A
            r0 = r0[r38]
            int r0 = r0.b()
        L_0x0351:
            r5 = r0
            if (r14 != r13) goto L_0x035f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r13.A
            r0 = r0[r4]
            int r0 = r0.b()
            r18 = r0
            goto L_0x0361
        L_0x035f:
            r18 = r3
        L_0x0361:
            if (r17 == 0) goto L_0x0366
            r22 = 6
            goto L_0x0368
        L_0x0366:
            r22 = 4
        L_0x0368:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r36
            r3 = r5
            r20 = 4
            r5 = r6
            r23 = 6
            r6 = r7
            r19 = 4
            r20 = 6
            r7 = r18
            r18 = r8
            r8 = r22
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0380:
            int r0 = r14.U
            r8 = 8
            if (r0 == r8) goto L_0x0387
            r15 = r14
        L_0x0387:
            r14 = r18
            goto L_0x02ad
        L_0x038b:
            r8 = 8
            r19 = 4
            r20 = 6
            if (r16 == 0) goto L_0x04b4
            if (r12 == 0) goto L_0x04b4
            int r0 = r1.j
            if (r0 <= 0) goto L_0x03a2
            int r0 = r1.i
            int r1 = r1.j
            if (r0 != r1) goto L_0x03a2
            r17 = 1
            goto L_0x03a4
        L_0x03a2:
            r17 = 0
        L_0x03a4:
            r14 = r12
            r15 = r14
        L_0x03a6:
            if (r14 == 0) goto L_0x0456
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.ad
            r0 = r0[r37]
        L_0x03ac:
            if (r0 == 0) goto L_0x03b7
            int r1 = r0.U
            if (r1 != r8) goto L_0x03b7
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r0.ad
            r0 = r0[r37]
            goto L_0x03ac
        L_0x03b7:
            if (r14 == r12) goto L_0x0445
            if (r14 == r13) goto L_0x0445
            if (r0 == 0) goto L_0x0445
            if (r0 != r13) goto L_0x03c2
            r7 = r21
            goto L_0x03c3
        L_0x03c2:
            r7 = r0
        L_0x03c3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.A
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.h
            int r0 = r0.b()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r14.A
            r4 = r4[r3]
            int r4 = r4.b()
            if (r7 == 0) goto L_0x03f1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r7.A
            r5 = r5[r38]
            androidx.constraintlayout.solver.SolverVariable r6 = r5.h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.d
            if (r8 == 0) goto L_0x03ee
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.d
            androidx.constraintlayout.solver.SolverVariable r8 = r8.h
            goto L_0x0404
        L_0x03ee:
            r8 = r21
            goto L_0x0404
        L_0x03f1:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r14.A
            r5 = r5[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.d
            if (r5 == 0) goto L_0x03fc
            androidx.constraintlayout.solver.SolverVariable r6 = r5.h
            goto L_0x03fe
        L_0x03fc:
            r6 = r21
        L_0x03fe:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r14.A
            r8 = r8[r3]
            androidx.constraintlayout.solver.SolverVariable r8 = r8.h
        L_0x0404:
            if (r5 == 0) goto L_0x040b
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x040b:
            r18 = r4
            if (r15 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r15.A
            r3 = r4[r3]
            int r3 = r3.b()
            int r0 = r0 + r3
        L_0x0418:
            r3 = r0
            if (r17 == 0) goto L_0x041e
            r22 = 6
            goto L_0x0420
        L_0x041e:
            r22 = 4
        L_0x0420:
            if (r1 == 0) goto L_0x043c
            if (r2 == 0) goto L_0x043c
            if (r6 == 0) goto L_0x043c
            if (r8 == 0) goto L_0x043c
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r36
            r5 = r6
            r6 = r8
            r23 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r22
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0442
        L_0x043c:
            r23 = r7
            r18 = r15
            r15 = 8
        L_0x0442:
            r0 = r23
            goto L_0x0449
        L_0x0445:
            r18 = r15
            r15 = 8
        L_0x0449:
            int r1 = r14.U
            if (r1 == r15) goto L_0x044e
            goto L_0x0450
        L_0x044e:
            r14 = r18
        L_0x0450:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03a6
        L_0x0456:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r10.A
            r1 = r1[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.A
            int r3 = r38 + 1
            r10 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.A
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r2.d
            if (r1 == 0) goto L_0x04a3
            if (r12 == r13) goto L_0x047d
            androidx.constraintlayout.solver.SolverVariable r2 = r0.h
            androidx.constraintlayout.solver.SolverVariable r1 = r1.h
            int r0 = r0.b()
            r15 = 5
            r9.c(r2, r1, r0, r15)
            goto L_0x04a4
        L_0x047d:
            r15 = 5
            if (r14 == 0) goto L_0x04a4
            androidx.constraintlayout.solver.SolverVariable r2 = r0.h
            androidx.constraintlayout.solver.SolverVariable r3 = r1.h
            int r4 = r0.b()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r6 = r10.h
            androidx.constraintlayout.solver.SolverVariable r7 = r14.h
            int r8 = r10.b()
            r17 = 5
            r0 = r36
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a4
        L_0x04a3:
            r15 = 5
        L_0x04a4:
            if (r14 == 0) goto L_0x04b4
            if (r12 == r13) goto L_0x04b4
            androidx.constraintlayout.solver.SolverVariable r0 = r10.h
            androidx.constraintlayout.solver.SolverVariable r1 = r14.h
            int r2 = r10.b()
            int r2 = -r2
            r9.c(r0, r1, r2, r15)
        L_0x04b4:
            if (r25 != 0) goto L_0x04b8
            if (r16 == 0) goto L_0x051c
        L_0x04b8:
            if (r12 == 0) goto L_0x051c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.A
            int r2 = r38 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.d
            if (r3 == 0) goto L_0x04cd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.d
            androidx.constraintlayout.solver.SolverVariable r3 = r3.h
            goto L_0x04cf
        L_0x04cd:
            r3 = r21
        L_0x04cf:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.d
            if (r4 == 0) goto L_0x04d8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.d
            androidx.constraintlayout.solver.SolverVariable r4 = r4.h
            goto L_0x04da
        L_0x04d8:
            r4 = r21
        L_0x04da:
            if (r11 == r13) goto L_0x04eb
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.A
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r4.d
            if (r5 == 0) goto L_0x04e9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.d
            androidx.constraintlayout.solver.SolverVariable r4 = r4.h
            goto L_0x04eb
        L_0x04e9:
            r4 = r21
        L_0x04eb:
            r5 = r4
            if (r12 != r13) goto L_0x04f6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.A
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r12.A
            r1 = r1[r2]
        L_0x04f6:
            if (r3 == 0) goto L_0x051c
            if (r5 == 0) goto L_0x051c
            int r4 = r0.b()
            if (r13 != 0) goto L_0x0501
            goto L_0x0502
        L_0x0501:
            r11 = r13
        L_0x0502:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r11.A
            r2 = r6[r2]
            int r7 = r2.b()
            androidx.constraintlayout.solver.SolverVariable r2 = r0.h
            r6 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r8 = r1.h
            r10 = 5
            r0 = r36
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x051c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg.a(ei, eb, int, int, eh):void");
    }
}
