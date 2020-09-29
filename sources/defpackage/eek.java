package defpackage;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.aqd;

@cfp
/* renamed from: eek reason: default package */
public final class eek<NETWORK_EXTRAS extends aqd, SERVER_PARAMETERS extends MediationServerParameters> implements aqb, aqc {
    final edm a;

    public eek(edm edm) {
        this.a = edm;
    }

    public final void a(ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        sb.toString();
        cpn.a(3);
        dqe.a();
        if (!cpc.b()) {
            cpn.b("#008 Must be called on the main UI thread.", null);
            cpc.a.post(new eel(this, errorCode));
            return;
        }
        try {
            this.a.a(eeo.a(errorCode));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public final void b(ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        sb.toString();
        cpn.a(3);
        dqe.a();
        if (!cpc.b()) {
            cpn.b("#008 Must be called on the main UI thread.", null);
            cpc.a.post(new een(this, errorCode));
            return;
        }
        try {
            this.a.a(eeo.a(errorCode));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }
}
