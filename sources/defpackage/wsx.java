package defpackage;

import io.netty.handler.logging.LogLevel;
import io.netty.util.internal.logging.InternalLogLevel;
import java.net.SocketAddress;

@a
/* renamed from: wsx reason: default package */
public final class wsx extends wov {
    private static final LogLevel b = LogLevel.DEBUG;
    private wyc c;
    private InternalLogLevel d;
    private final LogLevel e;

    public wsx() {
        this(b);
    }

    private wsx(LogLevel logLevel) {
        if (logLevel != null) {
            this.c = wyd.a(getClass());
            this.e = logLevel;
            this.d = logLevel.internalLevel;
            return;
        }
        throw new NullPointerException("level");
    }

    private static String a(wpb wpb, String str) {
        String obj = wpb.a().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 1 + str.length());
        sb.append(obj);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }

    private static String a(wpb wpb, String str, Object obj) {
        return obj instanceof wnb ? a(wpb, str, (wnb) obj) : obj instanceof wnd ? a(wpb, str, (wnd) obj) : b(wpb, str, obj);
    }

    private static String a(wpb wpb, String str, wnb wnb) {
        String obj = wpb.a().toString();
        int g = wnb.g();
        if (g == 0) {
            StringBuilder sb = new StringBuilder(obj.length() + 1 + str.length() + 4);
            sb.append(obj);
            sb.append(' ');
            sb.append(str);
            sb.append(": 0B");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(obj.length() + 1 + str.length() + 2 + 10 + 1 + 2 + (((g / 16) + (g % 15 == 0 ? 0 : 1) + 4) * 80));
        sb2.append(obj);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(": ");
        sb2.append(g);
        sb2.append('B');
        sb2.append(wxt.a);
        wng.a(sb2, wnb);
        return sb2.toString();
    }

    private static String a(wpb wpb, String str, wnd wnd) {
        String obj = wpb.a().toString();
        String obj2 = wnd.toString();
        wnb a = wnd.a();
        int g = a.g();
        String str2 = ", ";
        if (g == 0) {
            StringBuilder sb = new StringBuilder(obj.length() + 1 + str.length() + 2 + obj2.length() + 4);
            sb.append(obj);
            sb.append(' ');
            sb.append(str);
            sb.append(str2);
            sb.append(obj2);
            sb.append(", 0B");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(obj.length() + 1 + str.length() + 2 + obj2.length() + 2 + 10 + 1 + 2 + (((g / 16) + (g % 15 == 0 ? 0 : 1) + 4) * 80));
        sb2.append(obj);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj2);
        sb2.append(str2);
        sb2.append(g);
        sb2.append('B');
        sb2.append(wxt.a);
        wng.a(sb2, a);
        return sb2.toString();
    }

    private static String b(wpb wpb, String str, Object obj) {
        String obj2 = wpb.a().toString();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(obj2.length() + 1 + str.length() + 2 + valueOf.length());
        sb.append(obj2);
        sb.append(' ');
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void a(wpb wpb) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "ACTIVE"));
        }
        wpb.g();
    }

    public final void a(wpb wpb, Object obj) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "RECEIVED", obj));
        }
        wpb.d(obj);
    }

    public final void a(wpb wpb, Object obj, wpo wpo) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "WRITE", obj));
        }
        wpb.a(obj, wpo);
    }

    public final void a(wpb wpb, Throwable th) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "EXCEPTION", (Object) th), th);
        }
        wpb.a(th);
    }

    public final void a(wpb wpb, SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        String str;
        if (this.c.a(this.d)) {
            wyc wyc = this.c;
            InternalLogLevel internalLogLevel = this.d;
            String str2 = "CONNECT";
            if (socketAddress2 == null) {
                str = b(wpb, str2, socketAddress);
            } else {
                String obj = wpb.a().toString();
                String valueOf = String.valueOf(socketAddress);
                String obj2 = socketAddress2.toString();
                StringBuilder sb = new StringBuilder();
                sb.append(obj.length() + 1);
                sb.append(str2);
                sb.append(2);
                sb.append(valueOf.length());
                sb.append(2);
                sb.append(obj2.length());
                StringBuilder sb2 = new StringBuilder(sb.toString());
                sb2.append(obj);
                sb2.append(' ');
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(valueOf);
                sb2.append(", ");
                sb2.append(obj2);
                str = sb2.toString();
            }
            wyc.a(internalLogLevel, str);
        }
        wpb.a(socketAddress, socketAddress2, wpo);
    }

    public final void a(wpb wpb, wpo wpo) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "DISCONNECT"));
        }
        wpb.a(wpo);
    }

    public final void b(wpb wpb) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "INACTIVE"));
        }
        wpb.h();
    }

    public final void b(wpb wpb, Object obj) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "USER_EVENT", obj));
        }
        wpb.c(obj);
    }

    public final void b(wpb wpb, wpo wpo) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "CLOSE"));
        }
        wpb.b(wpo);
    }

    public final void d(wpb wpb) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "FLUSH"));
        }
        wpb.o();
    }

    public final void g(wpb wpb) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "REGISTERED"));
        }
        wpb.e();
    }

    public final void h(wpb wpb) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wpb, "UNREGISTERED"));
        }
        wpb.f();
    }
}
