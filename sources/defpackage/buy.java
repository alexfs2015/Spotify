package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: buy reason: default package */
final class buy extends egv {
    private final /* synthetic */ buw a;

    buy(buw buw, Looper looper) {
        this.a = buw;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((bux) message.obj).a(this.a);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
