package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

@cey
/* renamed from: edo reason: default package */
public final class edo implements bko, bkp, bkq {
    bkr a;
    bkw b;
    bfd c;
    private final ecv d;

    public edo(ecv ecv) {
        this.d = ecv;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, bkw bkw, bkr bkr) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            new beu().a(new edl());
        }
    }

    public final void a(String str, String str2) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.a(str, str2);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void e() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.a();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void c() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.b();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(int i) {
        bwx.b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        sb.toString();
        cow.a(3);
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void d() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.c();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void b() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.d();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void j() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.a();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void h() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.b();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void b(int i) {
        bwx.b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        sb.toString();
        cow.a(3);
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void i() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.c();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void g() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.d();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void f() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, bkr bkr) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        this.a = bkr;
        this.b = null;
        a(mediationNativeAdapter, this.b, this.a);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, bkw bkw) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        this.b = bkw;
        this.a = null;
        a(mediationNativeAdapter, this.b, this.a);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(bfd bfd) {
        bwx.b("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(bfd.a());
        String str = "Adapter called onAdLoaded with template id ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(3);
        this.c = bfd;
        try {
            this.d.e();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(bfd bfd, String str) {
        if (bfd instanceof dvz) {
            try {
                this.d.a(((dvz) bfd).a, str);
            } catch (RemoteException e) {
                cow.b("#007 Could not call remote method.", e);
            }
        } else {
            cow.a(5);
        }
    }

    public final void c(int i) {
        bwx.b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        sb.toString();
        cow.a(3);
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void k() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.d();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void l() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.b();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void m() {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.d.c();
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void n() {
        bwx.b("#008 Must be called on the main UI thread.");
        bkr bkr = this.a;
        bkw bkw = this.b;
        String str = "#007 Could not call remote method.";
        if (this.c == null) {
            if (bkr == null && bkw == null) {
                cow.b(str, null);
                return;
            } else if (bkw != null && !bkw.n) {
                cow.a(3);
                return;
            } else if (bkr != null && !bkr.b()) {
                cow.a(3);
                return;
            }
        }
        cow.a(3);
        try {
            this.d.a();
        } catch (RemoteException e) {
            cow.b(str, e);
        }
    }

    public final void o() {
        bwx.b("#008 Must be called on the main UI thread.");
        bkr bkr = this.a;
        bkw bkw = this.b;
        String str = "#007 Could not call remote method.";
        if (this.c == null) {
            if (bkr == null && bkw == null) {
                cow.b(str, null);
                return;
            } else if (bkw != null && !bkw.m) {
                cow.a(3);
                return;
            } else if (bkr != null && !bkr.a()) {
                cow.a(3);
                return;
            }
        }
        cow.a(3);
        try {
            this.d.f();
        } catch (RemoteException e) {
            cow.b(str, e);
        }
    }
}
