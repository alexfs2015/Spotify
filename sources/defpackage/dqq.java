package defpackage;

/* renamed from: dqq reason: default package */
public abstract class dqq extends dkp implements dqp {
    public dqq() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [dqj] */
    /* JADX WARNING: type inference failed for: r7v4, types: [dql] */
    /* JADX WARNING: type inference failed for: r7v6, types: [dqj] */
    /* JADX WARNING: type inference failed for: r7v7, types: [dwr] */
    /* JADX WARNING: type inference failed for: r7v9, types: [dwt] */
    /* JADX WARNING: type inference failed for: r7v11, types: [dwr] */
    /* JADX WARNING: type inference failed for: r7v12, types: [dwu] */
    /* JADX WARNING: type inference failed for: r7v14, types: [dwx] */
    /* JADX WARNING: type inference failed for: r7v16, types: [dwu] */
    /* JADX WARNING: type inference failed for: r7v17, types: [dwy] */
    /* JADX WARNING: type inference failed for: r7v20, types: [dxa] */
    /* JADX WARNING: type inference failed for: r7v21, types: [dwy] */
    /* JADX WARNING: type inference failed for: r7v22, types: [drj] */
    /* JADX WARNING: type inference failed for: r7v24, types: [drk] */
    /* JADX WARNING: type inference failed for: r7v26, types: [drj] */
    /* JADX WARNING: type inference failed for: r7v27, types: [dxe] */
    /* JADX WARNING: type inference failed for: r7v30, types: [dxf] */
    /* JADX WARNING: type inference failed for: r7v31, types: [dxe] */
    /* JADX WARNING: type inference failed for: r7v32, types: [dxg] */
    /* JADX WARNING: type inference failed for: r7v34, types: [dxi] */
    /* JADX WARNING: type inference failed for: r7v36, types: [dxg] */
    /* JADX WARNING: type inference failed for: r7v37 */
    /* JADX WARNING: type inference failed for: r7v38 */
    /* JADX WARNING: type inference failed for: r7v39 */
    /* JADX WARNING: type inference failed for: r7v40 */
    /* JADX WARNING: type inference failed for: r7v41 */
    /* JADX WARNING: type inference failed for: r7v42 */
    /* JADX WARNING: type inference failed for: r7v43 */
    /* JADX WARNING: type inference failed for: r7v44 */
    /* JADX WARNING: type inference failed for: r7v45 */
    /* JADX WARNING: type inference failed for: r7v46 */
    /* JADX WARNING: type inference failed for: r7v47 */
    /* JADX WARNING: type inference failed for: r7v48 */
    /* JADX WARNING: type inference failed for: r7v49 */
    /* JADX WARNING: type inference failed for: r7v50 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r6.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r6.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], dwt, dql, dqj, dwr, dwx, dwu, dxa, dwy, drk, drj, dxf, dxe, dxi, dxg]
      uses: [dqj, dwr, dwu, dwy, drj, dxe, dxg]
      mth insns count: 118
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
    /* JADX WARNING: Unknown variable types count: 15 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 0
            switch(r4) {
                case 1: goto L_0x012b;
                case 2: goto L_0x010a;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00c8;
                case 5: goto L_0x008b;
                case 6: goto L_0x007b;
                case 7: goto L_0x005d;
                case 8: goto L_0x0038;
                case 9: goto L_0x0028;
                case 10: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r4 = 0
            return r4
        L_0x0006:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof defpackage.dxg
            if (r7 == 0) goto L_0x001b
            r7 = r5
            dxg r7 = (defpackage.dxg) r7
            goto L_0x0020
        L_0x001b:
            dxi r7 = new dxi
            r7.<init>(r4)
        L_0x0020:
            r3.a(r7)
            r6.writeNoException()
            goto L_0x0135
        L_0x0028:
            android.os.Parcelable$Creator<bfv> r4 = defpackage.bfv.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            bfv r4 = (defpackage.bfv) r4
            r3.a(r4)
        L_0x0033:
            r6.writeNoException()
            goto L_0x0135
        L_0x0038:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x003f
            goto L_0x0051
        L_0x003f:
            java.lang.String r7 = "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener"
            android.os.IInterface r7 = r4.queryLocalInterface(r7)
            boolean r0 = r7 instanceof defpackage.dxe
            if (r0 == 0) goto L_0x004c
            dxe r7 = (defpackage.dxe) r7
            goto L_0x0051
        L_0x004c:
            dxf r7 = new dxf
            r7.<init>(r4)
        L_0x0051:
            android.os.Parcelable$Creator<dpt> r4 = defpackage.dpt.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            dpt r4 = (defpackage.dpt) r4
            r3.a(r7, r4)
            goto L_0x0033
        L_0x005d:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0064
            goto L_0x0077
        L_0x0064:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof defpackage.drj
            if (r7 == 0) goto L_0x0072
            r7 = r5
            drj r7 = (defpackage.drj) r7
            goto L_0x0077
        L_0x0072:
            drk r7 = new drk
            r7.<init>(r4)
        L_0x0077:
            r3.a(r7)
            goto L_0x0086
        L_0x007b:
            android.os.Parcelable$Creator<dvg> r4 = defpackage.dvg.CREATOR
            android.os.Parcelable r4 = defpackage.dkq.a(r5, r4)
            dvg r4 = (defpackage.dvg) r4
            r3.a(r4)
        L_0x0086:
            r6.writeNoException()
            goto L_0x0135
        L_0x008b:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x0097
            r0 = r7
            goto L_0x00ab
        L_0x0097:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dxb
            if (r2 == 0) goto L_0x00a5
            r0 = r1
            dxb r0 = (defpackage.dxb) r0
            goto L_0x00ab
        L_0x00a5:
            dxd r1 = new dxd
            r1.<init>(r0)
            r0 = r1
        L_0x00ab:
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x00b2
            goto L_0x00c4
        L_0x00b2:
            java.lang.String r7 = "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener"
            android.os.IInterface r7 = r5.queryLocalInterface(r7)
            boolean r1 = r7 instanceof defpackage.dwy
            if (r1 == 0) goto L_0x00bf
            dwy r7 = (defpackage.dwy) r7
            goto L_0x00c4
        L_0x00bf:
            dxa r7 = new dxa
            r7.<init>(r5)
        L_0x00c4:
            r3.a(r4, r0, r7)
            goto L_0x0086
        L_0x00c8:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x00cf
            goto L_0x00e2
        L_0x00cf:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof defpackage.dwu
            if (r7 == 0) goto L_0x00dd
            r7 = r5
            dwu r7 = (defpackage.dwu) r7
            goto L_0x00e2
        L_0x00dd:
            dwx r7 = new dwx
            r7.<init>(r4)
        L_0x00e2:
            r3.a(r7)
            r6.writeNoException()
            goto L_0x0135
        L_0x00e9:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x00f0
            goto L_0x0103
        L_0x00f0:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof defpackage.dwr
            if (r7 == 0) goto L_0x00fe
            r7 = r5
            dwr r7 = (defpackage.dwr) r7
            goto L_0x0103
        L_0x00fe:
            dwt r7 = new dwt
            r7.<init>(r4)
        L_0x0103:
            r3.a(r7)
            r6.writeNoException()
            goto L_0x0135
        L_0x010a:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0111
            goto L_0x0124
        L_0x0111:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof defpackage.dqj
            if (r7 == 0) goto L_0x011f
            r7 = r5
            dqj r7 = (defpackage.dqj) r7
            goto L_0x0124
        L_0x011f:
            dql r7 = new dql
            r7.<init>(r4)
        L_0x0124:
            r3.a(r7)
            r6.writeNoException()
            goto L_0x0135
        L_0x012b:
            dqm r4 = r3.a()
            r6.writeNoException()
            defpackage.dkq.a(r6, r4)
        L_0x0135:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqq.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
