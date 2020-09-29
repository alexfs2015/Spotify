package defpackage;

@cfp
/* renamed from: cdt reason: default package */
public final class cdt {
    /* JADX WARNING: type inference failed for: r7v0, types: [cnm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [cdw] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ceb] */
    /* JADX WARNING: type inference failed for: r7v3, types: [cdv] */
    /* JADX WARNING: type inference failed for: r7v4, types: [cdy] */
    /* JADX WARNING: type inference failed for: r0v11, types: [cdz] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v12, types: [ceb] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r0v13, types: [cdz] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v6
      assigns: [ceb, cdz]
      uses: [java.lang.Object, cnm, ceb, cdz]
      mth insns count: 59
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
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cnm a(android.content.Context r8, defpackage.bif r9, defpackage.clr r10, defpackage.dio r11, defpackage.cti r12, defpackage.edg r13, defpackage.cdu r14, defpackage.dtt r15) {
        /*
            cgp r2 = r10.b
            boolean r4 = r2.g
            if (r4 == 0) goto L_0x0013
            cdz r7 = new cdz
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x006e
        L_0x0013:
            boolean r4 = r2.s
            if (r4 != 0) goto L_0x0052
            boolean r4 = r9 instanceof defpackage.bjj
            if (r4 == 0) goto L_0x001c
            goto L_0x0052
        L_0x001c:
            dsw<java.lang.Boolean> r0 = defpackage.dtg.af
            dte r2 = defpackage.dqe.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004c
            boolean r0 = defpackage.caf.e()
            if (r0 == 0) goto L_0x004c
            boolean r0 = defpackage.caf.g()
            if (r0 != 0) goto L_0x004c
            if (r12 == 0) goto L_0x004c
            cuv r0 = r12.v()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x004c
            cdy r7 = new cdy
            r7.<init>(r8, r10, r12, r14)
            goto L_0x006e
        L_0x004c:
            cdv r7 = new cdv
            r7.<init>(r8, r10, r12, r14)
            goto L_0x006e
        L_0x0052:
            boolean r2 = r2.s
            if (r2 == 0) goto L_0x0069
            boolean r2 = r9 instanceof defpackage.bjj
            if (r2 == 0) goto L_0x0069
            ceb r7 = new ceb
            r2 = r9
            bjj r2 = (defpackage.bjj) r2
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x006e
        L_0x0069:
            cdw r7 = new cdw
            r7.<init>(r10, r14)
        L_0x006e:
            java.lang.String r0 = "AdRenderer: "
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0086
            r0.concat(r1)
            goto L_0x008b
        L_0x0086:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
        L_0x008b:
            r0 = 3
            defpackage.cpn.a(r0)
            r7.c()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdt.a(android.content.Context, bif, clr, dio, cti, edg, cdu, dtt):cnm");
    }
}
