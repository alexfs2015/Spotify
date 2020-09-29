package defpackage;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

/* renamed from: edw reason: default package */
final class edw implements Runnable {
    private final /* synthetic */ ErrorCode a;
    private final /* synthetic */ edt b;

    edw(edt edt, ErrorCode errorCode) {
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
