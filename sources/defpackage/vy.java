package defpackage;

import android.util.Log;
import com.adjust.sdk.LogLevel;
import java.util.Arrays;

/* renamed from: vy reason: default package */
public final class vy implements vr {
    private static String d = "Error formating log message: %s, with params: %s";
    private LogLevel a;
    private boolean b = false;
    private boolean c = false;

    public vy() {
        a(LogLevel.INFO, this.c);
    }

    public final void a(LogLevel logLevel, boolean z) {
        if (!this.b) {
            this.a = logLevel;
            this.c = z;
        }
    }

    public final void a(String str, Object... objArr) {
        if (!this.c && this.a.androidLogLevel <= 2) {
            try {
                wm.a(str, objArr);
            } catch (Exception unused) {
                Object[] objArr2 = {str, Arrays.toString(objArr)};
                String str2 = "Adjust";
                Log.e(str2, wm.a(d, objArr2));
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!this.c && this.a.androidLogLevel <= 3) {
            try {
                wm.a(str, objArr);
            } catch (Exception unused) {
                Object[] objArr2 = {str, Arrays.toString(objArr)};
                String str2 = "Adjust";
                Log.e(str2, wm.a(d, objArr2));
            }
        }
    }

    public final void c(String str, Object... objArr) {
        if (!this.c && this.a.androidLogLevel <= 4) {
            try {
                wm.a(str, objArr);
            } catch (Exception unused) {
                Object[] objArr2 = {str, Arrays.toString(objArr)};
                String str2 = "Adjust";
                Log.e(str2, wm.a(d, objArr2));
            }
        }
    }

    public final void d(String str, Object... objArr) {
        if (!this.c && this.a.androidLogLevel <= 5) {
            try {
                wm.a(str, objArr);
            } catch (Exception unused) {
                Object[] objArr2 = {str, Arrays.toString(objArr)};
                String str2 = "Adjust";
                Log.e(str2, wm.a(d, objArr2));
            }
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.a.androidLogLevel <= 5) {
            try {
                wm.a(str, objArr);
            } catch (Exception unused) {
                Object[] objArr2 = {str, Arrays.toString(objArr)};
                String str2 = "Adjust";
                Log.e(str2, wm.a(d, objArr2));
            }
        }
    }

    public final void f(String str, Object... objArr) {
        String str2 = "Adjust";
        if (!this.c && this.a.androidLogLevel <= 6) {
            try {
                Log.e(str2, wm.a(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, wm.a(d, str, Arrays.toString(objArr)));
            }
        }
    }

    public final void a() {
        this.b = true;
    }
}
