package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: fgs reason: default package */
final /* synthetic */ class fgs implements Callback {
    private final fgr a;

    fgs(fgr fgr) {
        this.a = fgr;
    }

    public final boolean handleMessage(Message message) {
        return this.a.a(message);
    }
}
