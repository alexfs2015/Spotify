package defpackage;

import android.os.Process;

/* renamed from: vvp reason: default package */
public abstract class vvp implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
