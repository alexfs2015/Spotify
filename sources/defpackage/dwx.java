package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: dwx reason: default package */
public final class dwx extends bff {
    private final dwu a;
    private final List<b> b = new ArrayList();
    private final dvd c;
    private final beu d = new beu();
    private final a e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ RemoteException -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dwx(defpackage.dwu r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            beu r1 = new beu
            r1.<init>()
            r5.d = r1
            r5.a = r6
            r6 = 0
            dwu r1 = r5.a     // Catch:{ RemoteException -> 0x0057 }
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
            boolean r4 = r3 instanceof defpackage.dva     // Catch:{ RemoteException -> 0x0057 }
            if (r4 == 0) goto L_0x0042
            r2 = r3
            dva r2 = (defpackage.dva) r2     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x004a
        L_0x0042:
            dvc r3 = new dvc     // Catch:{ RemoteException -> 0x0057 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r2 = r3
            goto L_0x004a
        L_0x0049:
            r2 = r6
        L_0x004a:
            if (r2 == 0) goto L_0x0022
            java.util.List<bey$b> r3 = r5.b     // Catch:{ RemoteException -> 0x0057 }
            dvd r4 = new dvd     // Catch:{ RemoteException -> 0x0057 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x0022
        L_0x0057:
            r1 = move-exception
            defpackage.cow.a(r0, r1)
        L_0x005b:
            dwu r1 = r5.a     // Catch:{ RemoteException -> 0x0069 }
            dva r1 = r1.d()     // Catch:{ RemoteException -> 0x0069 }
            if (r1 == 0) goto L_0x006d
            dvd r2 = new dvd     // Catch:{ RemoteException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r1 = move-exception
            defpackage.cow.a(r0, r1)
        L_0x006d:
            r2 = r6
        L_0x006e:
            r5.c = r2
            dwu r1 = r5.a     // Catch:{ RemoteException -> 0x0085 }
            duw r1 = r1.s()     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x0089
            duz r1 = new duz     // Catch:{ RemoteException -> 0x0085 }
            dwu r2 = r5.a     // Catch:{ RemoteException -> 0x0085 }
            duw r2 = r2.s()     // Catch:{ RemoteException -> 0x0085 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0085 }
            r6 = r1
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            defpackage.cow.a(r0, r1)
        L_0x0089:
            r5.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwx.<init>(dwu):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final car k() {
        try {
            return this.a.n();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final String a() {
        try {
            return this.a.a();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final List<b> b() {
        return this.b;
    }

    public final String c() {
        try {
            return this.a.c();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final b d() {
        return this.c;
    }

    public final String e() {
        try {
            return this.a.e();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final String f() {
        try {
            return this.a.f();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final Double g() {
        try {
            double g = this.a.g();
            if (g == -1.0d) {
                return null;
            }
            return Double.valueOf(g);
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final String h() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final String i() {
        try {
            return this.a.i();
        } catch (RemoteException e2) {
            cow.a("", e2);
            return null;
        }
    }

    public final beu j() {
        try {
            if (this.a.j() != null) {
                this.d.a(this.a.j());
            }
        } catch (RemoteException e2) {
            cow.a("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }

    public final Object l() {
        try {
            car p = this.a.p();
            if (p != null) {
                return cas.a(p);
            }
        } catch (RemoteException e2) {
            cow.a("", e2);
        }
        return null;
    }
}
