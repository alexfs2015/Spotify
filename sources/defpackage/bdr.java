package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: bdr reason: default package */
final class bdr implements bdc {
    private final Handler a;

    public bdr(Handler handler) {
        this.a = handler;
    }

    public final Looper a() {
        return this.a.getLooper();
    }

    public final Message a(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public final Message a(int i, int i2, int i3) {
        return this.a.obtainMessage(i, i2, 0);
    }

    public final Message a(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(0, i2, i3, obj);
    }

    public final boolean a(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final boolean a(int i, long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    public final void b(int i) {
        this.a.removeMessages(2);
    }
}
