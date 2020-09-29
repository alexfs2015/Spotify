package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

/* renamed from: egv reason: default package */
public class egv extends Handler {
    private static volatile egw a;

    public egv() {
    }

    public egv(Looper looper) {
        super(looper);
    }

    public egv(Looper looper, Callback callback) {
        super(looper, callback);
    }
}
