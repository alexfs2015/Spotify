package defpackage;

import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: jwx reason: default package */
public final class jwx {
    private static final DateFormat b = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    private static final Date c = new Date();
    long a;
    private char d;
    private String e;
    private String f;
    private Throwable g;
    private long h;

    jwx() {
    }

    public final void a(char c2, String str, String str2, Throwable th, long j) {
        this.d = c2;
        this.e = str;
        this.f = str2;
        this.g = th;
        this.h = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.d);
        sb.append(9);
        c.setTime(this.h);
        synchronized (b) {
            sb.append(b.format(c));
        }
        sb.append(9);
        sb.append(this.e);
        sb.append(9);
        sb.append(this.f);
        if (this.g != null) {
            sb.append(' ');
            sb.append(Log.getStackTraceString(this.g));
        }
        return sb.toString();
    }
}
