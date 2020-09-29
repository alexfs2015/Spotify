package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: dwi reason: default package */
public final class dwi extends bfs {
    private final dwf a;
    private final List<b> b = new ArrayList();
    private final dvu c;
    private final bfl d = new bfl();
    private final a e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ RemoteException -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dwi(defpackage.dwf r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            bfl r1 = new bfl
            r1.<init>()
            r5.d = r1
            r5.a = r6
            r6 = 0
            dwf r1 = r5.a     // Catch:{ RemoteException -> 0x0057 }
            java.util.List r1 = r1.b()     // Catch:{ RemoteException -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0057 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x0057 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0057 }
            if (r3 == 0) goto L_0x0049
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x0049
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x0057 }
            boolean r4 = r3 instanceof defpackage.dvr     // Catch:{ RemoteException -> 0x0057 }
            if (r4 == 0) goto L_0x0042
            r2 = r3
            dvr r2 = (defpackage.dvr) r2     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x004a
        L_0x0042:
            dvt r3 = new dvt     // Catch:{ RemoteException -> 0x0057 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r2 = r3
            goto L_0x004a
        L_0x0049:
            r2 = r6
        L_0x004a:
            if (r2 == 0) goto L_0x0022
            java.util.List<bfp$b> r3 = r5.b     // Catch:{ RemoteException -> 0x0057 }
            dvu r4 = new dvu     // Catch:{ RemoteException -> 0x0057 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x0022
        L_0x0057:
            r1 = move-exception
            defpackage.cpn.a(r0, r1)
        L_0x005b:
            dwf r1 = r5.a     // Catch:{ RemoteException -> 0x0069 }
            dvr r1 = r1.d()     // Catch:{ RemoteException -> 0x0069 }
            if (r1 == 0) goto L_0x006d
            dvu r2 = new dvu     // Catch:{ RemoteException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r1 = move-exception
            defpackage.cpn.a(r0, r1)
        L_0x006d:
            r2 = r6
        L_0x006e:
            r5.c = r2
            dwf r1 = r5.a     // Catch:{ RemoteException -> 0x0085 }
            dvn r1 = r1.r()     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x0089
            dvq r1 = new dvq     // Catch:{ RemoteException -> 0x0085 }
            dwf r2 = r5.a     // Catch:{ RemoteException -> 0x0085 }
            dvn r2 = r2.r()     // Catch:{ RemoteException -> 0x0085 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0085 }
            r6 = r1
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            defpackage.cpn.a(r0, r1)
        L_0x0089:
            r5.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwi.<init>(dwf):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final cbi a() {
        try {
            return this.a.j();
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final CharSequence b() {
        try {
            return this.a.a();
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final List<b> c() {
        return this.b;
    }

    public final CharSequence d() {
        try {
            return this.a.c();
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final b e() {
        return this.c;
    }

    public final CharSequence f() {
        try {
            return this.a.e();
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final Double g() {
        try {
            double f = this.a.f();
            if (f == -1.0d) {
                return null;
            }
            return Double.valueOf(f);
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final CharSequence h() {
        try {
            return this.a.g();
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final CharSequence i() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            cpn.a("", e2);
            return null;
        }
    }

    public final bfl j() {
        try {
            if (this.a.i() != null) {
                this.d.a(this.a.i());
            }
        } catch (RemoteException e2) {
            cpn.a("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }
}
