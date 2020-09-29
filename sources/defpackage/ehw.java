package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: ehw reason: default package */
public final class ehw {
    String a;
    private final String b;
    private final boolean c;
    private boolean d;
    private boolean e;

    private ehw(String str) {
        bwx.a(str, (Object) "The log tag cannot be null or empty.");
        this.b = str;
        this.c = str.length() <= 23;
        this.d = false;
        this.e = false;
    }

    public ehw(String str, byte b2) {
        this(str);
    }

    private final boolean a() {
        return this.c && Log.isLoggable(this.b, 3);
    }

    public final void a(String str, Object... objArr) {
        if (a()) {
            c(str, objArr);
        }
    }

    public final void a(Throwable th, String str, Object... objArr) {
        if (a()) {
            c(str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        Log.e(this.b, c(str, objArr));
    }

    public final void b(Throwable th, String str, Object... objArr) {
        Log.e(this.b, c(str, objArr), th);
    }

    public final String c(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.a)) {
            return str;
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
