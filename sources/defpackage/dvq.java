package defpackage;

import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: dvq reason: default package */
public final class dvq extends a {
    private final dvn a;
    private final List<b> b = new ArrayList();
    private String c;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[Catch:{ RemoteException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0025 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dvq(defpackage.dvn r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.b = r1
            r4.a = r5
            dvn r1 = r4.a     // Catch:{ RemoteException -> 0x0017 }
            java.lang.String r1 = r1.a()     // Catch:{ RemoteException -> 0x0017 }
            r4.c = r1     // Catch:{ RemoteException -> 0x0017 }
            goto L_0x001d
        L_0x0017:
            r1 = move-exception
            defpackage.cpn.a(r0, r1)
            r4.c = r0
        L_0x001d:
            java.util.List r5 = r5.b()     // Catch:{ RemoteException -> 0x0059 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RemoteException -> 0x0059 }
        L_0x0025:
            boolean r1 = r5.hasNext()     // Catch:{ RemoteException -> 0x0059 }
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r5.next()     // Catch:{ RemoteException -> 0x0059 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0059 }
            if (r2 == 0) goto L_0x004a
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0059 }
            if (r1 == 0) goto L_0x004a
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0059 }
            boolean r3 = r2 instanceof defpackage.dvr     // Catch:{ RemoteException -> 0x0059 }
            if (r3 == 0) goto L_0x0044
            dvr r2 = (defpackage.dvr) r2     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x004b
        L_0x0044:
            dvt r2 = new dvt     // Catch:{ RemoteException -> 0x0059 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x0025
            java.util.List<bfp$b> r1 = r4.b     // Catch:{ RemoteException -> 0x0059 }
            dvu r3 = new dvu     // Catch:{ RemoteException -> 0x0059 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0059 }
            r1.add(r3)     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x0025
        L_0x0058:
            return
        L_0x0059:
            r5 = move-exception
            defpackage.cpn.a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.<init>(dvn):void");
    }
}
