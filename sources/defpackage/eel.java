package defpackage;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

/* renamed from: eel reason: default package */
final class eel implements Runnable {
    private final /* synthetic */ ErrorCode a;
    private final /* synthetic */ eek b;

    eel(eek eek, ErrorCode errorCode) {
        this.b = eek;
        this.a = errorCode;
    }

    public final void run() {
        try {
            this.b.a.a(eeo.a(this.a));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }
}
