package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: buh reason: default package */
final class buh extends ege {
    private final /* synthetic */ buf a;

    buh(buf buf, Looper looper) {
        this.a = buf;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((bug) message.obj).a(this.a);
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
