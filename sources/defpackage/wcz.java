package defpackage;

import io.netty.util.Signal;

/* renamed from: wcz reason: default package */
public class wcz {
    public static final wcz a = new wcz(c);
    private static Signal b;
    private static Signal c;
    private final Throwable d;

    static {
        Class<wcz> cls = wcz.class;
        b = Signal.a(cls, "UNFINISHED");
        c = Signal.a(cls, "SUCCESS");
        new wcz(b);
    }

    public static wcz a(Throwable th) {
        if (th != null) {
            return new wcz(th);
        }
        throw new NullPointerException("cause");
    }

    private wcz(Throwable th) {
        if (th != null) {
            this.d = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    public String toString() {
        Throwable th;
        boolean z = true;
        if (!(this.d != b)) {
            return "unfinished";
        }
        if (this.d == c) {
            return "success";
        }
        Throwable th2 = this.d;
        if (th2 == c || th2 == b) {
            z = false;
        }
        if (z) {
            th = this.d;
        } else {
            th = null;
        }
        String th3 = th.toString();
        StringBuilder sb = new StringBuilder(th3.length() + 17);
        sb.append("failure(");
        sb.append(th3);
        sb.append(')');
        return sb.toString();
    }
}
