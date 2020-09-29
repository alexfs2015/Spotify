package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

@cfp
/* renamed from: ckn reason: default package */
public final class ckn implements blw {
    private final ckk a;

    public ckn(ckk ckk) {
        this.a = ckk;
    }

    public final void a(Bundle bundle) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.a(bundle);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.a(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.b(cbj.a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, blu blu) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        if (blu != null) {
            try {
                this.a.a(cbj.a(mediationRewardedVideoAdAdapter), new cko(blu));
            } catch (RemoteException e) {
                cpn.b("#007 Could not call remote method.", e);
            }
        } else {
            this.a.a(cbj.a(mediationRewardedVideoAdAdapter), new cko("", 1));
        }
    }

    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.b(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.c(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.d(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.e(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.g(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bxo.b("#008 Must be called on the main UI thread.");
        cpn.a(3);
        try {
            this.a.h(cbj.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }
}
