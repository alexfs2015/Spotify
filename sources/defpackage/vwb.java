package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: vwb reason: default package */
public final class vwb {
    private final String a;
    private final String b;
    private final boolean c;
    private long d;
    private long e;

    public vwb(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = !Log.isLoggable(str2, 2);
    }

    public final synchronized void a() {
        if (!this.c) {
            this.d = SystemClock.elapsedRealtime();
            this.e = 0;
        }
    }

    public final synchronized void b() {
        if (!this.c) {
            if (this.e == 0) {
                this.e = SystemClock.elapsedRealtime() - this.d;
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(": ");
                sb.append(this.e);
                sb.append("ms");
            }
        }
    }
}
