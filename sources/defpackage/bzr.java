package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: bzr reason: default package */
public final class bzr {
    private final String a;
    private final String b;
    private final bxf c;
    private final int d;

    private bzr(String str, String str2) {
        this.b = str2;
        this.a = str;
        this.c = new bxf(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.d = i;
    }

    public bzr(String str, String... strArr) {
        this(str, "");
    }

    private boolean a(int i) {
        return this.d <= 3;
    }

    private final String b(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public final void a(String str, Object... objArr) {
        if (a(3)) {
            b(str, objArr);
        }
    }
}
