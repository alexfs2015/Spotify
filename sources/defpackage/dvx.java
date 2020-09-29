package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: dvx reason: default package */
public abstract class dvx extends djy implements dvw {
    public dvx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static dvw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof dvw ? (dvw) queryLocalInterface : new dvy(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r3.writeNoException();
        defpackage.djz.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0059;
                case 2: goto L_0x004a;
                case 3: goto L_0x003f;
                case 4: goto L_0x003a;
                case 5: goto L_0x002f;
                case 6: goto L_0x002b;
                case 7: goto L_0x0026;
                case 8: goto L_0x0022;
                case 9: goto L_0x001d;
                case 10: goto L_0x000a;
                case 11: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            car r1 = r0.b()
            goto L_0x0052
        L_0x000a:
            android.os.IBinder r1 = r2.readStrongBinder()
            car r1 = defpackage.car.a.a(r1)
            boolean r1 = r0.a(r1)
            r3.writeNoException()
            defpackage.djz.a(r3, r1)
            goto L_0x0067
        L_0x001d:
            car r1 = r0.e()
            goto L_0x0052
        L_0x0022:
            r0.f()
            goto L_0x0036
        L_0x0026:
            dqz r1 = r0.c()
            goto L_0x0052
        L_0x002b:
            r0.d()
            goto L_0x0036
        L_0x002f:
            java.lang.String r1 = r2.readString()
            r0.c(r1)
        L_0x0036:
            r3.writeNoException()
            goto L_0x0067
        L_0x003a:
            java.lang.String r1 = r0.l()
            goto L_0x0061
        L_0x003f:
            java.util.List r1 = r0.a()
            r3.writeNoException()
            r3.writeStringList(r1)
            goto L_0x0067
        L_0x004a:
            java.lang.String r1 = r2.readString()
            dva r1 = r0.b(r1)
        L_0x0052:
            r3.writeNoException()
            defpackage.djz.a(r3, r1)
            goto L_0x0067
        L_0x0059:
            java.lang.String r1 = r2.readString()
            java.lang.String r1 = r0.a(r1)
        L_0x0061:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0067:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvx.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
