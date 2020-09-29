package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@cey
/* renamed from: clv reason: default package */
public final class clv extends Handler {
    public clv(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            bjl.i().a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            bjl.e();
            cmd.a(bjl.i().e, th);
            throw th;
        }
    }
}
