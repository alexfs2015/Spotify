package defpackage;

import android.os.Process;

/* renamed from: wjv reason: default package */
public abstract class wjv implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
