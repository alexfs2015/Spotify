package defpackage;

import android.os.RemoteException;

/* renamed from: cjg reason: default package */
final class cjg implements Runnable {
    private final /* synthetic */ ecs a;
    private final /* synthetic */ doy b;
    private final /* synthetic */ cjl c;
    private final /* synthetic */ cje d;

    cjg(cje cje, ecs ecs, doy doy, cjl cjl) {
        this.d = cje;
        this.a = ecs;
        this.b = doy;
        this.c = cjl;
    }

    public final void run() {
        try {
            this.a.a(cas.a(this.d.b), this.b, (String) null, (cjt) this.c, this.d.c);
        } catch (RemoteException unused) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.d.a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            this.d.a(0);
        }
    }
}
