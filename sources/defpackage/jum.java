package defpackage;

import android.os.SystemClock;

/* renamed from: jum reason: default package */
public final class jum {
    public final juk a;
    public final Object b = new Object();

    public jum(juk juk) {
        this.a = juk;
    }

    public final void a(String str, String str2) {
        a('E', str, str2, null);
    }

    public final void a(String str, String str2, Throwable th) {
        a('E', str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    public void a(char c, String str, String str2, Throwable th) {
        long a2 = jrf.a.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.b) {
            this.a.a(elapsedRealtime).a(c, str, str2, th, a2);
        }
    }
}
