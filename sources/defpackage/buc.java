package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: buc reason: default package */
final class buc extends ege {
    private final /* synthetic */ btw a;

    buc(btw btw, Looper looper) {
        this.a = btw;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            btw.b(this.a);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
        } else {
            btw.a(this.a);
        }
    }
}
