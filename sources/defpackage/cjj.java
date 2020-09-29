package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cjj reason: default package */
public abstract class cjj extends dkp implements cjh {
    public cjj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static cjh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof cjh ? (cjh) queryLocalInterface : new cjk(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [cjn] */
    /* JADX WARNING: type inference failed for: r1v2, types: [cjp] */
    /* JADX WARNING: type inference failed for: r1v4, types: [cjn] */
    /* JADX WARNING: type inference failed for: r1v5, types: [dqz] */
    /* JADX WARNING: type inference failed for: r1v6, types: [drb] */
    /* JADX WARNING: type inference failed for: r1v8, types: [dqz] */
    /* JADX WARNING: type inference failed for: r1v9, types: [cjf] */
    /* JADX WARNING: type inference failed for: r1v10, types: [cjg] */
    /* JADX WARNING: type inference failed for: r1v12, types: [cjf] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], drb, cjp, cjn, dqz, cjg, cjf]
      uses: [cjn, dqz, cjf]
      mth insns count: 76
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
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x00da
            r0 = 2
            if (r3 == r0) goto L_0x00d6
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00b8
            r0 = 34
            if (r3 == r0) goto L_0x00ad
            switch(r3) {
                case 5: goto L_0x00a2;
                case 6: goto L_0x009e;
                case 7: goto L_0x009a;
                case 8: goto L_0x0096;
                case 9: goto L_0x008a;
                case 10: goto L_0x007e;
                case 11: goto L_0x0071;
                case 12: goto L_0x0065;
                case 13: goto L_0x005c;
                case 14: goto L_0x003e;
                case 15: goto L_0x0032;
                case 16: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.cjf
            if (r0 == 0) goto L_0x0028
            r1 = r4
            cjf r1 = (defpackage.cjf) r1
            goto L_0x002d
        L_0x0028:
            cjg r1 = new cjg
            r1.<init>(r3)
        L_0x002d:
            r2.a(r1)
            goto L_0x00b4
        L_0x0032:
            android.os.Bundle r3 = r2.b()
            r5.writeNoException()
            defpackage.dkq.b(r5, r3)
            goto L_0x00e8
        L_0x003e:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0045
            goto L_0x0058
        L_0x0045:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.dqz
            if (r0 == 0) goto L_0x0053
            r1 = r4
            dqz r1 = (defpackage.dqz) r1
            goto L_0x0058
        L_0x0053:
            drb r1 = new drb
            r1.<init>(r3)
        L_0x0058:
            r2.a(r1)
            goto L_0x00b4
        L_0x005c:
            java.lang.String r3 = r4.readString()
            r2.a(r3)
            goto L_0x00e5
        L_0x0065:
            java.lang.String r3 = r2.g()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x00e8
        L_0x0071:
            android.os.IBinder r3 = r4.readStrongBinder()
            cbi r3 = defpackage.cbi.a.a(r3)
            r2.c(r3)
            goto L_0x00e5
        L_0x007e:
            android.os.IBinder r3 = r4.readStrongBinder()
            cbi r3 = defpackage.cbi.a.a(r3)
            r2.b(r3)
            goto L_0x00e5
        L_0x008a:
            android.os.IBinder r3 = r4.readStrongBinder()
            cbi r3 = defpackage.cbi.a.a(r3)
            r2.a(r3)
            goto L_0x00e5
        L_0x0096:
            r2.f()
            goto L_0x00e5
        L_0x009a:
            r2.e()
            goto L_0x00e5
        L_0x009e:
            r2.d()
            goto L_0x00e5
        L_0x00a2:
            boolean r3 = r2.c()
            r5.writeNoException()
            defpackage.dkq.a(r5, r3)
            goto L_0x00e8
        L_0x00ad:
            boolean r3 = defpackage.dkq.a(r4)
            r2.a(r3)
        L_0x00b4:
            r5.writeNoException()
            goto L_0x00e8
        L_0x00b8:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00bf
            goto L_0x00d2
        L_0x00bf:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.cjn
            if (r0 == 0) goto L_0x00cd
            r1 = r4
            cjn r1 = (defpackage.cjn) r1
            goto L_0x00d2
        L_0x00cd:
            cjp r1 = new cjp
            r1.<init>(r3)
        L_0x00d2:
            r2.a(r1)
            goto L_0x00e5
        L_0x00d6:
            r2.a()
            goto L_0x00e5
        L_0x00da:
            android.os.Parcelable$Creator<cjt> r3 = defpackage.cjt.CREATOR
            android.os.Parcelable r3 = defpackage.dkq.a(r4, r3)
            cjt r3 = (defpackage.cjt) r3
            r2.a(r3)
        L_0x00e5:
            r5.writeNoException()
        L_0x00e8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjj.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
