package defpackage;

import io.netty.util.Signal;

/* renamed from: wrf reason: default package */
public class wrf {
    public static final wrf a = new wrf(c);
    private static Signal b;
    private static Signal c;
    private final Throwable d;

    static {
        Class<wrf> cls = wrf.class;
        b = Signal.a(cls, "UNFINISHED");
        c = Signal.a(cls, "SUCCESS");
        new wrf(b);
    }

    private wrf(Throwable th) {
        if (th != null) {
            this.d = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    public static wrf a(Throwable th) {
        if (th != null) {
            return new wrf(th);
        }
        throw new NullPointerException("cause");
    }

    public String toString() {
        boolean z = true;
        if (!(this.d != b)) {
            return "unfinished";
        }
        if (this.d == c) {
            return "success";
        }
        Throwable th = this.d;
        if (th == c || th == b) {
            z = false;
        }
        String th2 = (z ? this.d : null).toString();
        StringBuilder sb = new StringBuilder(th2.length() + 17);
        sb.append("failure(");
        sb.append(th2);
        sb.append(')');
        return sb.toString();
    }
}
