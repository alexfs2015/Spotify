package defpackage;

/* renamed from: edk reason: default package */
public abstract class edk extends dkp implements edj {
    public edk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        r12.writeNoException();
        defpackage.dkq.b(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
        r12.writeNoException();
        defpackage.dkq.a(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019e, code lost:
        r12.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d6, code lost:
        r12.writeNoException();
        defpackage.dkq.a(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            r13 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            switch(r10) {
                case 1: goto L_0x01dd;
                case 2: goto L_0x01d2;
                case 3: goto L_0x01a3;
                case 4: goto L_0x019b;
                case 5: goto L_0x0197;
                case 6: goto L_0x0156;
                case 7: goto L_0x011e;
                case 8: goto L_0x0119;
                case 9: goto L_0x0114;
                case 10: goto L_0x00ed;
                case 11: goto L_0x00dc;
                case 12: goto L_0x00d7;
                case 13: goto L_0x00cb;
                case 14: goto L_0x0086;
                case 15: goto L_0x0080;
                case 16: goto L_0x007a;
                case 17: goto L_0x006e;
                case 18: goto L_0x0069;
                case 19: goto L_0x0064;
                case 20: goto L_0x004f;
                case 21: goto L_0x0042;
                case 22: goto L_0x003c;
                case 23: goto L_0x0023;
                case 24: goto L_0x001d;
                case 25: goto L_0x0014;
                case 26: goto L_0x000e;
                case 27: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r10 = 0
            return r10
        L_0x0008:
            edz r10 = r9.p()
            goto L_0x01d6
        L_0x000e:
            drq r10 = r9.o()
            goto L_0x01d6
        L_0x0014:
            boolean r10 = defpackage.dkq.a(r11)
            r9.a(r10)
            goto L_0x019e
        L_0x001d:
            dwn r10 = r9.n()
            goto L_0x01d6
        L_0x0023:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r10 = defpackage.cbi.a.a(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            ckk r13 = defpackage.ckl.a(r13)
            java.util.ArrayList r11 = r11.createStringArrayList()
            r9.a(r10, r13, r11)
            goto L_0x019e
        L_0x003c:
            boolean r10 = r9.m()
            goto L_0x00cf
        L_0x0042:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r10 = defpackage.cbi.a.a(r10)
            r9.a(r10)
            goto L_0x019e
        L_0x004f:
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            dpp r10 = (defpackage.dpp) r10
            java.lang.String r13 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.a(r10, r13, r11)
            goto L_0x019e
        L_0x0064:
            android.os.Bundle r10 = r9.l()
            goto L_0x0072
        L_0x0069:
            android.os.Bundle r10 = r9.k()
            goto L_0x0072
        L_0x006e:
            android.os.Bundle r10 = r9.j()
        L_0x0072:
            r12.writeNoException()
            defpackage.dkq.b(r12, r10)
            goto L_0x021a
        L_0x007a:
            edw r10 = r9.i()
            goto L_0x01d6
        L_0x0080:
            eds r10 = r9.h()
            goto L_0x01d6
        L_0x0086:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r2 = defpackage.cbi.a.a(r10)
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r3 = r10
            dpp r3 = (defpackage.dpp) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x00a7
        L_0x00a5:
            r6 = r13
            goto L_0x00b8
        L_0x00a7:
            android.os.IInterface r13 = r10.queryLocalInterface(r0)
            boolean r0 = r13 instanceof defpackage.edm
            if (r0 == 0) goto L_0x00b2
            edm r13 = (defpackage.edm) r13
            goto L_0x00a5
        L_0x00b2:
            edo r13 = new edo
            r13.<init>(r10)
            goto L_0x00a5
        L_0x00b8:
            android.os.Parcelable$Creator<dvg> r10 = defpackage.dvg.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r7 = r10
            dvg r7 = (defpackage.dvg) r7
            java.util.ArrayList r8 = r11.createStringArrayList()
            r1 = r9
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x019e
        L_0x00cb:
            boolean r10 = r9.g()
        L_0x00cf:
            r12.writeNoException()
            defpackage.dkq.a(r12, r10)
            goto L_0x021a
        L_0x00d7:
            r9.f()
            goto L_0x019e
        L_0x00dc:
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            dpp r10 = (defpackage.dpp) r10
            java.lang.String r11 = r11.readString()
            r9.a(r10, r11)
            goto L_0x019e
        L_0x00ed:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r1 = defpackage.cbi.a.a(r10)
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r2 = r10
            dpp r2 = (defpackage.dpp) r2
            java.lang.String r3 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            ckk r4 = defpackage.ckl.a(r10)
            java.lang.String r5 = r11.readString()
            r0 = r9
            r0.a(r1, r2, r3, r4, r5)
            goto L_0x019e
        L_0x0114:
            r9.e()
            goto L_0x019e
        L_0x0119:
            r9.d()
            goto L_0x019e
        L_0x011e:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r2 = defpackage.cbi.a.a(r10)
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r3 = r10
            dpp r3 = (defpackage.dpp) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x013f
        L_0x013d:
            r6 = r13
            goto L_0x0151
        L_0x013f:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof defpackage.edm
            if (r13 == 0) goto L_0x014b
            r13 = r11
            edm r13 = (defpackage.edm) r13
            goto L_0x013d
        L_0x014b:
            edo r13 = new edo
            r13.<init>(r10)
            goto L_0x013d
        L_0x0151:
            r1 = r9
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x019e
        L_0x0156:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r2 = defpackage.cbi.a.a(r10)
            android.os.Parcelable$Creator<dpt> r10 = defpackage.dpt.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r3 = r10
            dpt r3 = (defpackage.dpt) r3
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r4 = r10
            dpp r4 = (defpackage.dpp) r4
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0180
        L_0x017e:
            r7 = r13
            goto L_0x0192
        L_0x0180:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof defpackage.edm
            if (r13 == 0) goto L_0x018c
            r13 = r11
            edm r13 = (defpackage.edm) r13
            goto L_0x017e
        L_0x018c:
            edo r13 = new edo
            r13.<init>(r10)
            goto L_0x017e
        L_0x0192:
            r1 = r9
            r1.a(r2, r3, r4, r5, r6, r7)
            goto L_0x019e
        L_0x0197:
            r9.c()
            goto L_0x019e
        L_0x019b:
            r9.b()
        L_0x019e:
            r12.writeNoException()
            goto L_0x021a
        L_0x01a3:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r10 = defpackage.cbi.a.a(r10)
            android.os.Parcelable$Creator<dpp> r1 = defpackage.dpp.CREATOR
            android.os.Parcelable r1 = defpackage.dkq.a(r11, r1)
            dpp r1 = (defpackage.dpp) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x01be
            goto L_0x01ce
        L_0x01be:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof defpackage.edm
            if (r0 == 0) goto L_0x01c9
            edm r13 = (defpackage.edm) r13
            goto L_0x01ce
        L_0x01c9:
            edo r13 = new edo
            r13.<init>(r11)
        L_0x01ce:
            r9.a(r10, r1, r2, r13)
            goto L_0x019e
        L_0x01d2:
            cbi r10 = r9.a()
        L_0x01d6:
            r12.writeNoException()
            defpackage.dkq.a(r12, r10)
            goto L_0x021a
        L_0x01dd:
            android.os.IBinder r10 = r11.readStrongBinder()
            cbi r2 = defpackage.cbi.a.a(r10)
            android.os.Parcelable$Creator<dpt> r10 = defpackage.dpt.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r3 = r10
            dpt r3 = (defpackage.dpt) r3
            android.os.Parcelable$Creator<dpp> r10 = defpackage.dpp.CREATOR
            android.os.Parcelable r10 = defpackage.dkq.a(r11, r10)
            r4 = r10
            dpp r4 = (defpackage.dpp) r4
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0203
        L_0x0201:
            r6 = r13
            goto L_0x0215
        L_0x0203:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof defpackage.edm
            if (r13 == 0) goto L_0x020f
            r13 = r11
            edm r13 = (defpackage.edm) r13
            goto L_0x0201
        L_0x020f:
            edo r13 = new edo
            r13.<init>(r10)
            goto L_0x0201
        L_0x0215:
            r1 = r9
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x019e
        L_0x021a:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edk.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
