package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: fgn reason: default package */
final class fgn extends ejb {
    private final /* synthetic */ fgm a;

    fgn(fgm fgm, Looper looper) {
        this.a = fgm;
        super(looper);
    }

    public final void handleMessage(Message message) {
        fgm.a(this.a, message);
    }
}
