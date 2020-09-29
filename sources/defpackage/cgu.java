package defpackage;

/* renamed from: cgu reason: default package */
public abstract class cgu extends dkp implements cgt {
    public cgu() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [cgw] */
    /* JADX WARNING: type inference failed for: r1v3, types: [cgy] */
    /* JADX WARNING: type inference failed for: r1v5, types: [cgw] */
    /* JADX WARNING: type inference failed for: r1v6, types: [cgz] */
    /* JADX WARNING: type inference failed for: r1v8, types: [cha] */
    /* JADX WARNING: type inference failed for: r1v10, types: [cgz] */
    /* JADX WARNING: type inference failed for: r1v11, types: [cgz] */
    /* JADX WARNING: type inference failed for: r1v13, types: [cha] */
    /* JADX WARNING: type inference failed for: r1v15, types: [cgz] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], cha, cgy, cgw, cgz]
      uses: [cgw, cgz]
      mth insns count: 58
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x0082
            r0 = 2
            r1 = 0
            if (r4 == r0) goto L_0x0059
            r0 = 4
            java.lang.String r2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            if (r4 == r0) goto L_0x0035
            r0 = 5
            if (r4 == r0) goto L_0x0011
            r4 = 0
            return r4
        L_0x0011:
            android.os.Parcelable$Creator<che> r4 = defpackage.che.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            che r4 = (defpackage.che) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0020
            goto L_0x0031
        L_0x0020:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.cgz
            if (r1 == 0) goto L_0x002c
            r1 = r0
            cgz r1 = (defpackage.cgz) r1
            goto L_0x0031
        L_0x002c:
            cha r1 = new cha
            r1.<init>(r5)
        L_0x0031:
            r3.b(r4, r1)
            goto L_0x007e
        L_0x0035:
            android.os.Parcelable$Creator<che> r4 = defpackage.che.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            che r4 = (defpackage.che) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0044
            goto L_0x0055
        L_0x0044:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.cgz
            if (r1 == 0) goto L_0x0050
            r1 = r0
            cgz r1 = (defpackage.cgz) r1
            goto L_0x0055
        L_0x0050:
            cha r1 = new cha
            r1.<init>(r5)
        L_0x0055:
            r3.a(r4, r1)
            goto L_0x007e
        L_0x0059:
            android.os.Parcelable$Creator<cgl> r4 = defpackage.cgl.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            cgl r4 = (defpackage.cgl) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.cgw
            if (r1 == 0) goto L_0x0076
            r1 = r0
            cgw r1 = (defpackage.cgw) r1
            goto L_0x007b
        L_0x0076:
            cgy r1 = new cgy
            r1.<init>(r5)
        L_0x007b:
            r3.a(r4, r1)
        L_0x007e:
            r6.writeNoException()
            goto L_0x0094
        L_0x0082:
            android.os.Parcelable$Creator<cgl> r4 = defpackage.cgl.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            cgl r4 = (defpackage.cgl) r4
            cgp r4 = r3.a(r4)
            r6.writeNoException()
            defpackage.dkq.b(r6, r4)
        L_0x0094:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgu.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
