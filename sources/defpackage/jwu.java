package defpackage;

import android.os.SystemClock;

/* renamed from: jwu reason: default package */
public final class jwu {
    public final jws a;
    public final Object b = new Object();

    public jwu(jws jws) {
        this.a = jws;
    }

    /* access modifiers changed from: 0000 */
    public void a(char c, String str, String str2, Throwable th) {
        long a2 = jtp.a.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.b) {
            this.a.a(elapsedRealtime).a(c, str, str2, th, a2);
        }
    }

    public final void a(String str, String str2) {
        a('E', str, str2, null);
    }

    public final void a(String str, String str2, Throwable th) {
        a('E', str, str2, th);
    }
}
