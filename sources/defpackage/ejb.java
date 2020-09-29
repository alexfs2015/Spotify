package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: ejb reason: default package */
public class ejb extends Handler {
    private static volatile ejc a;

    public ejb() {
    }

    public ejb(Looper looper) {
        super(looper);
    }

    public ejb(Looper looper, Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
