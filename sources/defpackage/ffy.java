package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: ffy reason: default package */
final /* synthetic */ class ffy implements Callback {
    private final ffx a;

    ffy(ffx ffx) {
        this.a = ffx;
    }

    public final boolean handleMessage(Message message) {
        return this.a.a(message);
    }
}
