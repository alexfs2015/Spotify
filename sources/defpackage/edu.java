package defpackage;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

/* renamed from: edu reason: default package */
final class edu implements Runnable {
    private final /* synthetic */ ErrorCode a;
    private final /* synthetic */ edt b;

    edu(edt edt, ErrorCode errorCode) {
        this.b = edt;
        this.a = errorCode;
    }

    public final void run() {
        try {
            this.b.a.a(edx.a(this.a));
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }
}
