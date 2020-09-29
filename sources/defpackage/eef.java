package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

@cfp
/* renamed from: eef reason: default package */
public final class eef implements blf, blg, blh {
    bli a;
    bln b;
    bfu c;
    private final edm d;

    public eef(edm edm) {
        this.d = edm;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, bln bln, bli bli) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            new bfl().a(new eec());
        }
    }

    public final void a() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(int i) {
        bxo.b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        sb.toString();
        cpn.a(3);
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(bfu bfu) {
        bxo.b("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(bfu.a());
        String str = "Adapter called onAdLoaded with template id ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(3);
        this.c = bfu;
        try {
            this.d.e();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(bfu bfu, String str) {
        if (bfu instanceof dwq) {
            try {
                this.d.a(((dwq) bfu).a, str);
            } catch (RemoteException e) {
                cpn.b("#007 Could not call remote method.", e);
            }
        } else {
            cpn.a(5);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, bli bli) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        this.a = bli;
        this.b = null;
        a(mediationNativeAdapter, this.b, this.a);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, bln bln) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        this.b = bln;
        this.a = null;
        a(mediationNativeAdapter, this.b, this.a);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(String str, String str2) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.a(str, str2);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void b() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.d();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void b(int i) {
        bxo.b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        sb.toString();
        cpn.a(3);
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void c() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.b();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void c(int i) {
        bxo.b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        sb.toString();
        cpn.a(3);
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void d() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.c();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void e() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.a();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void f() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.e();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void g() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.d();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void h() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.b();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void i() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.c();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void j() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.a();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void k() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.d();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void l() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.b();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void m() {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.d.c();
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void n() {
        bxo.b("#008 Must be called on the main UI thread.");
        bli bli = this.a;
        bln bln = this.b;
        String str = "#007 Could not call remote method.";
        if (this.c == null) {
            if (bli == null && bln == null) {
                cpn.b(str, null);
                return;
            } else if (bln != null && !bln.n) {
                cpn.a(3);
                return;
            } else if (bli != null && !bli.b()) {
                cpn.a(3);
                return;
            }
        }
        cpn.a(3);
        try {
            this.d.a();
        } catch (RemoteException e) {
            cpn.b(str, e);
        }
    }

    public final void o() {
        bxo.b("#008 Must be called on the main UI thread.");
        bli bli = this.a;
        bln bln = this.b;
        String str = "#007 Could not call remote method.";
        if (this.c == null) {
            if (bli == null && bln == null) {
                cpn.b(str, null);
                return;
            } else if (bln != null && !bln.m) {
                cpn.a(3);
                return;
            } else if (bli != null && !bli.a()) {
                cpn.a(3);
                return;
            }
        }
        cpn.a(3);
        try {
            this.d.f();
        } catch (RemoteException e) {
            cpn.b(str, e);
        }
    }
}
