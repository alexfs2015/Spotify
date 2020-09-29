package defpackage;

import android.content.Context;
import com.adjust.sdk.LogLevel;
import java.util.List;

/* renamed from: vf reason: default package */
public final class vf {
    public String a;
    public String b;
    public Context c;
    String d;
    public String e;
    boolean f;
    String g;
    public wa h;
    boolean i;
    public List<vu> j;
    public String k;
    public Boolean l;
    public boolean m;
    private vr n = vh.a();

    public vf(Context context, String str, String str2, boolean z) {
        if ("production".equals(str2)) {
            a(LogLevel.SUPRESS, str2);
        } else {
            a(LogLevel.INFO, str2);
        }
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = false;
        this.i = false;
    }

    public final boolean a() {
        if (a(this.d) && b(this.e) && a(this.c)) {
            return true;
        }
        return false;
    }

    public void a(LogLevel logLevel, String str) {
        this.n.a(logLevel, "production".equals(str));
    }

    private boolean a(Context context) {
        if (context == null) {
            this.n.f("Missing context", new Object[0]);
            return false;
        } else if (wm.a(context, "android.permission.INTERNET")) {
            return true;
        } else {
            this.n.f("Missing permission: INTERNET", new Object[0]);
            return false;
        }
    }

    private boolean a(String str) {
        if (str == null) {
            this.n.f("Missing App Token", new Object[0]);
            return false;
        } else if (str.length() == 12) {
            return true;
        } else {
            this.n.f("Malformed App Token '%s'", str);
            return false;
        }
    }

    private boolean b(String str) {
        if (str == null) {
            this.n.f("Missing environment", new Object[0]);
            return false;
        } else if (str.equals("sandbox")) {
            this.n.e("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        } else if (str.equals("production")) {
            this.n.e("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else {
            this.n.f("Unknown environment '%s'", str);
            return false;
        }
    }
}
