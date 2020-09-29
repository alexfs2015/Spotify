package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@cfp
/* renamed from: cmm reason: default package */
public final class cmm extends Handler {
    public cmm(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            bkc.e();
            cmu.a(bkc.i().e, th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            bkc.i().a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }
}
