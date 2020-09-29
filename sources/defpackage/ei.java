package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ei reason: default package */
public final class ei extends es {
    public boolean a = false;
    int ae = 0;
    eh[] af = new eh[4];
    eh[] ag = new eh[4];
    public List<ej> ah = new ArrayList();
    public boolean ai = false;
    public boolean aj = false;
    public boolean ak = false;
    public int al = 0;
    public int am = 0;
    public int an = 7;
    public boolean ao = false;
    public boolean ap = false;
    public boolean aq = false;
    private eb as = new eb();
    private er at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay = 0;
    int b = 0;

    private void F() {
        int size = this.ar.size();
        b();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.ar.get(i)).b();
        }
    }

    private void G() {
        this.b = 0;
        this.ae = 0;
    }

    private void a(eb ebVar, boolean[] zArr) {
        zArr[2] = false;
        c(ebVar);
        int size = this.ar.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.ar.get(i);
            constraintWidget.c(ebVar);
            if (constraintWidget.C[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.m() < constraintWidget.P) {
                zArr[2] = true;
            }
            if (constraintWidget.C[1] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.n() < constraintWidget.Q) {
                zArr[2] = true;
            }
        }
    }

    private void c(ConstraintWidget constraintWidget) {
        int i = this.b + 1;
        eh[] ehVarArr = this.ag;
        if (i >= ehVarArr.length) {
            this.ag = (eh[]) Arrays.copyOf(ehVarArr, ehVarArr.length << 1);
        }
        this.ag[this.b] = new eh(constraintWidget, 0, this.a);
        this.b++;
    }

    private void d(ConstraintWidget constraintWidget) {
        int i = this.ae + 1;
        eh[] ehVarArr = this.af;
        if (i >= ehVarArr.length) {
            this.af = (eh[]) Arrays.copyOf(ehVarArr, ehVarArr.length << 1);
        }
        this.af[this.ae] = new eh(constraintWidget, 1, this.a);
        this.ae++;
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v62 */
    /* JADX WARNING: type inference failed for: r8v63 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v13, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 496
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x031c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0404 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r26 = this;
            r1 = r26
            int r2 = r1.I
            int r3 = r1.J
            int r0 = r26.m()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r26.n()
            int r6 = java.lang.Math.max(r4, r0)
            r1.ap = r4
            r1.aq = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.D
            if (r0 == 0) goto L_0x009d
            er r0 = r1.at
            if (r0 != 0) goto L_0x002a
            er r0 = new er
            r0.<init>(r1)
            r1.at = r0
        L_0x002a:
            er r0 = r1.at
            int r7 = r26.k()
            r0.a = r7
            int r7 = r26.l()
            r0.b = r7
            int r7 = r26.m()
            r0.c = r7
            int r7 = r26.n()
            r0.d = r7
            java.util.ArrayList<er$a> r7 = r0.e
            int r7 = r7.size()
            r8 = 0
        L_0x004b:
            if (r8 >= r7) goto L_0x008c
            java.util.ArrayList<er$a> r9 = r0.e
            java.lang.Object r9 = r9.get(r8)
            er$a r9 = (defpackage.er.a) r9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = r10.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r1.a(r10)
            r9.a = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.a
            if (r10 == 0) goto L_0x007e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.d
            r9.b = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.a
            int r10 = r10.b()
            r9.c = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Strength r10 = r10.f
            r9.d = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.a
            int r10 = r10.g
            r9.e = r10
            goto L_0x0089
        L_0x007e:
            r10 = 0
            r9.b = r10
            r9.c = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Strength r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength.STRONG
            r9.d = r10
            r9.e = r4
        L_0x0089:
            int r8 = r8 + 1
            goto L_0x004b
        L_0x008c:
            r1.c(r4)
            r1.d(r4)
            r26.x()
            eb r0 = r1.as
            dz r0 = r0.e
            r1.a(r0)
            goto L_0x00a1
        L_0x009d:
            r1.I = r4
            r1.J = r4
        L_0x00a1:
            int r0 = r1.an
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r1.j(r8)
            if (r0 != 0) goto L_0x00b3
            r26.F()
        L_0x00b3:
            boolean r0 = r1.j(r7)
            if (r0 != 0) goto L_0x00c7
            boolean r0 = r1.j(r8)
            if (r0 != 0) goto L_0x00c4
            int r0 = r1.an
            r1.a(r0)
        L_0x00c4:
            r26.C()
        L_0x00c7:
            eb r0 = r1.as
            r0.c = r9
            goto L_0x00d0
        L_0x00cc:
            eb r0 = r1.as
            r0.c = r4
        L_0x00d0:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            r10 = r0[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            r11 = r0[r4]
            r26.G()
            java.util.List<ej> r0 = r1.ah
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00f4
            java.util.List<ej> r0 = r1.ah
            r0.clear()
            java.util.List<ej> r0 = r1.ah
            ej r12 = new ej
            java.util.ArrayList r13 = r1.ar
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x00f4:
            java.util.List<ej> r0 = r1.ah
            int r12 = r0.size()
            java.util.ArrayList r13 = r1.ar
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r26.y()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r14) goto L_0x010f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r26.z()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r14) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r14 = 0
            goto L_0x0110
        L_0x010f:
            r14 = 1
        L_0x0110:
            r0 = 0
            r15 = 0
        L_0x0112:
            if (r15 >= r12) goto L_0x043d
            boolean r8 = r1.ao
            if (r8 != 0) goto L_0x043d
            java.util.List<ej> r8 = r1.ah
            java.lang.Object r8 = r8.get(r15)
            ej r8 = (defpackage.ej) r8
            boolean r8 = r8.b
            if (r8 != 0) goto L_0x0427
            boolean r8 = r1.j(r7)
            if (r8 == 0) goto L_0x0198
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r26.y()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r7) goto L_0x018a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r26.z()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 != r8) goto L_0x018a
            java.util.List<ej> r7 = r1.ah
            java.lang.Object r7 = r7.get(r15)
            ej r7 = (defpackage.ej) r7
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r7.h
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x014d
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r7.h
            goto L_0x0185
        L_0x014d:
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r7.a
            int r8 = r8.size()
        L_0x0153:
            if (r4 >= r8) goto L_0x0170
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r9 = r7.a
            java.lang.Object r9 = r9.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r9
            r19 = r8
            boolean r8 = r9.W
            if (r8 != 0) goto L_0x016a
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r7.h
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r7.a(r8, r9)
        L_0x016a:
            int r4 = r4 + 1
            r8 = r19
            r9 = 1
            goto L_0x0153
        L_0x0170:
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r7.i
            r4.clear()
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r7.i
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r7.a
            r4.addAll(r8)
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r7.i
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r7.h
            r4.removeAll(r8)
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r7.h
        L_0x0185:
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.ar = r7
            goto L_0x0198
        L_0x018a:
            java.util.List<ej> r4 = r1.ah
            java.lang.Object r4 = r4.get(r15)
            ej r4 = (defpackage.ej) r4
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r4.a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.ar = r4
        L_0x0198:
            r26.G()
            java.util.ArrayList r4 = r1.ar
            int r4 = r4.size()
            r7 = 0
        L_0x01a2:
            if (r7 >= r4) goto L_0x01b8
            java.util.ArrayList r8 = r1.ar
            java.lang.Object r8 = r8.get(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r8
            boolean r9 = r8 instanceof defpackage.es
            if (r9 == 0) goto L_0x01b5
            es r8 = (defpackage.es) r8
            r8.A()
        L_0x01b5:
            int r7 = r7 + 1
            goto L_0x01a2
        L_0x01b8:
            r9 = r0
            r0 = 0
            r7 = 1
        L_0x01bb:
            if (r7 == 0) goto L_0x0411
            r19 = r7
            r8 = 1
            int r7 = r0 + 1
            eb r0 = r1.as     // Catch:{ Exception -> 0x02ac }
            r0.b()     // Catch:{ Exception -> 0x02ac }
            r26.G()     // Catch:{ Exception -> 0x02ac }
            eb r0 = r1.as     // Catch:{ Exception -> 0x02ac }
            r1.b(r0)     // Catch:{ Exception -> 0x02ac }
            r0 = 0
        L_0x01d0:
            if (r0 >= r4) goto L_0x01eb
            java.util.ArrayList r8 = r1.ar     // Catch:{ Exception -> 0x01e6 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ Exception -> 0x01e6 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r8     // Catch:{ Exception -> 0x01e6 }
            r20 = r9
            eb r9 = r1.as     // Catch:{ Exception -> 0x02a6 }
            r8.b(r9)     // Catch:{ Exception -> 0x02a6 }
            int r0 = r0 + 1
            r9 = r20
            goto L_0x01d0
        L_0x01e6:
            r0 = move-exception
            r20 = r9
            goto L_0x02a7
        L_0x01eb:
            r20 = r9
            eb r0 = r1.as     // Catch:{ Exception -> 0x02a6 }
            r1.a(r0)     // Catch:{ Exception -> 0x02a6 }
            java.util.ArrayList r8 = r1.ar     // Catch:{ Exception -> 0x02a6 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x02a6 }
            r9 = 0
        L_0x01f9:
            if (r9 >= r8) goto L_0x025f
            r21 = r8
            java.util.ArrayList r8 = r1.ar     // Catch:{ Exception -> 0x02a6 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x02a6 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r8     // Catch:{ Exception -> 0x02a6 }
            r22 = r12
            boolean r12 = r8 instanceof defpackage.ei     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0244
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r8.C     // Catch:{ Exception -> 0x0259 }
            r17 = 0
            r12 = r12[r17]     // Catch:{ Exception -> 0x0259 }
            r23 = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r8.C     // Catch:{ Exception -> 0x023f }
            r18 = 1
            r3 = r3[r18]     // Catch:{ Exception -> 0x023f }
            r24 = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ Exception -> 0x02a4 }
            if (r12 != r2) goto L_0x0224
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ Exception -> 0x02a4 }
            r8.a(r2)     // Catch:{ Exception -> 0x02a4 }
        L_0x0224:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ Exception -> 0x02a4 }
            if (r3 != r2) goto L_0x022d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ Exception -> 0x02a4 }
            r8.b(r2)     // Catch:{ Exception -> 0x02a4 }
        L_0x022d:
            r8.a(r0)     // Catch:{ Exception -> 0x02a4 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ Exception -> 0x02a4 }
            if (r12 != r2) goto L_0x0237
            r8.a(r12)     // Catch:{ Exception -> 0x02a4 }
        L_0x0237:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ Exception -> 0x02a4 }
            if (r3 != r2) goto L_0x024e
            r8.b(r3)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x024e
        L_0x023f:
            r0 = move-exception
            r24 = r2
            goto L_0x02b5
        L_0x0244:
            r24 = r2
            r23 = r3
            defpackage.em.a(r1, r0, r8)     // Catch:{ Exception -> 0x02a4 }
            r8.a(r0)     // Catch:{ Exception -> 0x02a4 }
        L_0x024e:
            int r9 = r9 + 1
            r8 = r21
            r12 = r22
            r3 = r23
            r2 = r24
            goto L_0x01f9
        L_0x0259:
            r0 = move-exception
            r24 = r2
            r23 = r3
            goto L_0x02b5
        L_0x025f:
            r24 = r2
            r23 = r3
            r22 = r12
            int r2 = r1.b     // Catch:{ Exception -> 0x02a4 }
            if (r2 <= 0) goto L_0x026d
            r2 = 0
            defpackage.eg.a(r1, r0, r2)     // Catch:{ Exception -> 0x02a4 }
        L_0x026d:
            int r2 = r1.ae     // Catch:{ Exception -> 0x02a4 }
            if (r2 <= 0) goto L_0x0275
            r2 = 1
            defpackage.eg.a(r1, r0, r2)     // Catch:{ Exception -> 0x02a4 }
        L_0x0275:
            eb r0 = r1.as     // Catch:{ Exception -> 0x02a1 }
            boolean r2 = r0.c     // Catch:{ Exception -> 0x02a1 }
            if (r2 == 0) goto L_0x029a
            r2 = 0
        L_0x027c:
            int r3 = r0.d     // Catch:{ Exception -> 0x02a1 }
            if (r2 >= r3) goto L_0x028d
            dy[] r3 = r0.b     // Catch:{ Exception -> 0x02a1 }
            r3 = r3[r2]     // Catch:{ Exception -> 0x02a1 }
            boolean r3 = r3.e     // Catch:{ Exception -> 0x02a1 }
            if (r3 != 0) goto L_0x028a
            r2 = 0
            goto L_0x028e
        L_0x028a:
            int r2 = r2 + 1
            goto L_0x027c
        L_0x028d:
            r2 = 1
        L_0x028e:
            if (r2 != 0) goto L_0x0296
            eb$a r2 = r0.a     // Catch:{ Exception -> 0x02a1 }
            r0.a(r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x029f
        L_0x0296:
            r0.e()     // Catch:{ Exception -> 0x02a1 }
            goto L_0x029f
        L_0x029a:
            eb$a r2 = r0.a     // Catch:{ Exception -> 0x02a1 }
            r0.a(r2)     // Catch:{ Exception -> 0x02a1 }
        L_0x029f:
            r9 = 1
            goto L_0x02cd
        L_0x02a1:
            r0 = move-exception
            r9 = 1
            goto L_0x02b7
        L_0x02a4:
            r0 = move-exception
            goto L_0x02b5
        L_0x02a6:
            r0 = move-exception
        L_0x02a7:
            r24 = r2
            r23 = r3
            goto L_0x02b3
        L_0x02ac:
            r0 = move-exception
            r24 = r2
            r23 = r3
            r20 = r9
        L_0x02b3:
            r22 = r12
        L_0x02b5:
            r9 = r19
        L_0x02b7:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "EXCEPTION : "
            r3.<init>(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.println(r0)
        L_0x02cd:
            r0 = 2
            if (r9 == 0) goto L_0x02d8
            eb r2 = r1.as
            boolean[] r3 = defpackage.em.a
            r1.a(r2, r3)
            goto L_0x0318
        L_0x02d8:
            eb r2 = r1.as
            r1.c(r2)
            r2 = 0
        L_0x02de:
            if (r2 >= r4) goto L_0x0318
            java.util.ArrayList r3 = r1.ar
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r3.C
            r9 = 0
            r8 = r8[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x02ff
            int r8 = r3.m()
            int r9 = r3.P
            if (r8 >= r9) goto L_0x02ff
            boolean[] r2 = defpackage.em.a
            r8 = 1
            r2[r0] = r8
            goto L_0x0318
        L_0x02ff:
            r8 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r3.C
            r9 = r9[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r12) goto L_0x0315
            int r9 = r3.n()
            int r3 = r3.Q
            if (r9 >= r3) goto L_0x0315
            boolean[] r2 = defpackage.em.a
            r2[r0] = r8
            goto L_0x0318
        L_0x0315:
            int r2 = r2 + 1
            goto L_0x02de
        L_0x0318:
            r2 = 8
            if (r14 == 0) goto L_0x038a
            if (r7 >= r2) goto L_0x038a
            boolean[] r3 = defpackage.em.a
            boolean r0 = r3[r0]
            if (r0 == 0) goto L_0x038a
            r0 = 0
            r3 = 0
            r8 = 0
        L_0x0327:
            if (r0 >= r4) goto L_0x034b
            java.util.ArrayList r9 = r1.ar
            java.lang.Object r9 = r9.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r9
            int r12 = r9.I
            int r16 = r9.m()
            int r12 = r12 + r16
            int r3 = java.lang.Math.max(r3, r12)
            int r12 = r9.J
            int r9 = r9.n()
            int r12 = r12 + r9
            int r8 = java.lang.Math.max(r8, r12)
            int r0 = r0 + 1
            goto L_0x0327
        L_0x034b:
            int r0 = r1.N
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r1.O
            int r3 = java.lang.Math.max(r3, r8)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r8) goto L_0x036f
            int r8 = r26.m()
            if (r8 >= r0) goto L_0x036f
            r1.e(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r20 = 1
            goto L_0x0370
        L_0x036f:
            r0 = 0
        L_0x0370:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r10 != r8) goto L_0x0387
            int r8 = r26.n()
            if (r8 >= r3) goto L_0x0387
            r1.f(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 1
            r0[r8] = r3
            r0 = 1
            r9 = 1
            goto L_0x038d
        L_0x0387:
            r9 = r20
            goto L_0x038d
        L_0x038a:
            r9 = r20
            r0 = 0
        L_0x038d:
            int r3 = r1.N
            int r8 = r26.m()
            int r3 = java.lang.Math.max(r3, r8)
            int r8 = r26.m()
            if (r3 <= r8) goto L_0x03a9
            r1.e(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = 0
            r0[r8] = r3
            r0 = 1
            r9 = 1
        L_0x03a9:
            int r3 = r1.O
            int r8 = r26.n()
            int r3 = java.lang.Math.max(r3, r8)
            int r8 = r26.n()
            if (r3 <= r8) goto L_0x03c6
            r1.f(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = 1
            r0[r8] = r3
            r0 = 1
            r9 = 1
            goto L_0x03c7
        L_0x03c6:
            r8 = 1
        L_0x03c7:
            if (r9 != 0) goto L_0x0404
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r1.C
            r12 = 0
            r3 = r3[r12]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r2) goto L_0x03e7
            if (r5 <= 0) goto L_0x03e7
            int r2 = r26.m()
            if (r2 <= r5) goto L_0x03e7
            r1.ap = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r12] = r2
            r1.e(r5)
            r0 = 1
            r9 = 1
        L_0x03e7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.C
            r2 = r2[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0404
            if (r6 <= 0) goto L_0x0404
            int r2 = r26.n()
            if (r2 <= r6) goto L_0x0404
            r1.aq = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r8] = r2
            r1.f(r6)
            r0 = 1
            r9 = 1
        L_0x0404:
            r12 = r22
            r3 = r23
            r2 = r24
            r25 = r7
            r7 = r0
            r0 = r25
            goto L_0x01bb
        L_0x0411:
            r24 = r2
            r23 = r3
            r20 = r9
            r22 = r12
            java.util.List<ej> r0 = r1.ah
            java.lang.Object r0 = r0.get(r15)
            ej r0 = (defpackage.ej) r0
            r0.a()
            r0 = r20
            goto L_0x042d
        L_0x0427:
            r24 = r2
            r23 = r3
            r22 = r12
        L_0x042d:
            int r15 = r15 + 1
            r12 = r22
            r3 = r23
            r2 = r24
            r4 = 0
            r7 = 32
            r8 = 8
            r9 = 1
            goto L_0x0112
        L_0x043d:
            r24 = r2
            r23 = r3
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r1.ar = r13
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.D
            if (r2 == 0) goto L_0x0469
            int r2 = r1.N
            int r3 = r26.m()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.O
            int r4 = r26.n()
            int r3 = java.lang.Math.max(r3, r4)
            er r4 = r1.at
            r4.a(r1)
            r1.e(r2)
            r1.f(r3)
            goto L_0x0471
        L_0x0469:
            r2 = r24
            r1.I = r2
            r2 = r23
            r1.J = r2
        L_0x0471:
            if (r0 == 0) goto L_0x047d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            r2 = 0
            r0[r2] = r11
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.C
            r2 = 1
            r0[r2] = r10
        L_0x047d:
            eb r0 = r1.as
            dz r0 = r0.e
            r1.a(r0)
            ei r0 = r26.D()
            if (r1 != r0) goto L_0x048d
            r26.w()
        L_0x048d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei.A():void");
    }

    public final void B() {
        F();
        a(this.an);
    }

    public final void C() {
        eo eoVar = a(Type.LEFT).a;
        eo eoVar2 = a(Type.TOP).a;
        eoVar.a((eo) null, 0.0f);
        eoVar2.a((eo) null, 0.0f);
    }

    public final void a(int i) {
        super.a(i);
        int size = this.ar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.ar.get(i2)).a(i);
        }
    }

    public final void a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            c(constraintWidget);
            return;
        }
        if (i == 1) {
            d(constraintWidget);
        }
    }

    public final void f() {
        this.as.b();
        this.au = 0;
        this.aw = 0;
        this.av = 0;
        this.ax = 0;
        this.ah.clear();
        this.ao = false;
        super.f();
    }

    public final void f(int i, int i2) {
        if (!(this.C[0] == DimensionBehaviour.WRAP_CONTENT || this.e == null)) {
            this.e.a(i);
        }
        if (this.C[1] != DimensionBehaviour.WRAP_CONTENT && this.f != null) {
            this.f.a(i2);
        }
    }

    public final boolean j(int i) {
        return (this.an & i) == i;
    }
}
