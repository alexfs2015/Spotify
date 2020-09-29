package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

@cey
/* renamed from: cjw reason: default package */
public final class cjw implements blf {
    private final cjt a;

    public cjw(cjt cjt) {
        this.a = cjt;
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.a(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.b(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.c(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.d(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.e(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, bld bld) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        if (bld != null) {
            try {
                this.a.a(cas.a(mediationRewardedVideoAdAdapter), new cjx(bld));
            } catch (RemoteException e) {
                cow.b("#007 Could not call remote method.", e);
            }
        } else {
            this.a.a(cas.a(mediationRewardedVideoAdAdapter), new cjx("", 1));
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.b(cas.a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.g(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.h(cas.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void a(Bundle bundle) {
        bwx.b("#008 Must be called on the main UI thread.");
        cow.a(3);
        try {
            this.a.a(bundle);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }
}
