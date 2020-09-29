package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: but reason: default package */
final class but extends egv {
    private final /* synthetic */ bun a;

    but(bun bun, Looper looper) {
        this.a = bun;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            bun.b(this.a);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
        } else {
            bun.a(this.a);
        }
    }
}
