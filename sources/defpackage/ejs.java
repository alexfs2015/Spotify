package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: ejs reason: default package */
public class ejs extends Handler {
    private static volatile ejt a;

    public ejs() {
    }

    public ejs(Looper looper) {
        super(looper);
    }

    public ejs(Looper looper, Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
