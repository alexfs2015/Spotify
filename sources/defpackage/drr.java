package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: drr reason: default package */
public abstract class drr extends dkp implements drq {
    public drr() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static drq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof drq ? (drq) queryLocalInterface : new drs(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r3.writeNoException();
        r3.writeFloat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r3.writeNoException();
        defpackage.dkq.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0071;
                case 2: goto L_0x006d;
                case 3: goto L_0x0065;
                case 4: goto L_0x005a;
                case 5: goto L_0x004f;
                case 6: goto L_0x0044;
                case 7: goto L_0x003f;
                case 8: goto L_0x001f;
                case 9: goto L_0x001a;
                case 10: goto L_0x0015;
                case 11: goto L_0x000a;
                case 12: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            boolean r1 = r0.j()
            goto L_0x005e
        L_0x000a:
            drt r1 = r0.h()
            r3.writeNoException()
            defpackage.dkq.a(r3, r1)
            goto L_0x0077
        L_0x0015:
            boolean r1 = r0.i()
            goto L_0x005e
        L_0x001a:
            float r1 = r0.e()
            goto L_0x0048
        L_0x001f:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x003b
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof defpackage.drt
            if (r4 == 0) goto L_0x0035
            r1 = r2
            drt r1 = (defpackage.drt) r1
            goto L_0x003b
        L_0x0035:
            drv r2 = new drv
            r2.<init>(r1)
            r1 = r2
        L_0x003b:
            r0.a(r1)
            goto L_0x0074
        L_0x003f:
            float r1 = r0.g()
            goto L_0x0048
        L_0x0044:
            float r1 = r0.f()
        L_0x0048:
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x0077
        L_0x004f:
            int r1 = r0.d()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L_0x0077
        L_0x005a:
            boolean r1 = r0.c()
        L_0x005e:
            r3.writeNoException()
            defpackage.dkq.a(r3, r1)
            goto L_0x0077
        L_0x0065:
            boolean r1 = defpackage.dkq.a(r2)
            r0.a(r1)
            goto L_0x0074
        L_0x006d:
            r0.b()
            goto L_0x0074
        L_0x0071:
            r0.a()
        L_0x0074:
            r3.writeNoException()
        L_0x0077:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drr.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
