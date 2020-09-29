package defpackage;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.apm;

@cey
/* renamed from: edt reason: default package */
public final class edt<NETWORK_EXTRAS extends apm, SERVER_PARAMETERS extends MediationServerParameters> implements apk, apl {
    final ecv a;

    public edt(ecv ecv) {
        this.a = ecv;
    }

    public final void a(ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        sb.toString();
        cow.a(3);
        dpn.a();
        if (!col.b()) {
            cow.b("#008 Must be called on the main UI thread.", null);
            col.a.post(new edu(this, errorCode));
            return;
        }
        try {
            this.a.a(edx.a(errorCode));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public final void b(ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        sb.toString();
        cow.a(3);
        dpn.a();
        if (!col.b()) {
            cow.b("#008 Must be called on the main UI thread.", null);
            col.a.post(new edw(this, errorCode));
            return;
        }
        try {
            this.a.a(edx.a(errorCode));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }
}
