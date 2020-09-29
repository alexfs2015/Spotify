package defpackage;

import io.netty.handler.logging.LogLevel;
import io.netty.util.internal.logging.InternalLogLevel;
import java.net.SocketAddress;

@a
/* renamed from: wer reason: default package */
public final class wer extends wap {
    private static final LogLevel b = LogLevel.DEBUG;
    private wjw c;
    private InternalLogLevel d;
    private final LogLevel e;

    public wer() {
        this(b);
    }

    private wer(LogLevel logLevel) {
        if (logLevel != null) {
            this.c = wjx.a(getClass());
            this.e = logLevel;
            this.d = logLevel.internalLevel;
            return;
        }
        throw new NullPointerException("level");
    }

    public final void g(wav wav) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "REGISTERED"));
        }
        wav.e();
    }

    public final void h(wav wav) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "UNREGISTERED"));
        }
        wav.f();
    }

    public final void a(wav wav) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "ACTIVE"));
        }
        wav.g();
    }

    public final void b(wav wav) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "INACTIVE"));
        }
        wav.h();
    }

    public final void a(wav wav, Throwable th) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "EXCEPTION", (Object) th), th);
        }
        wav.a(th);
    }

    public final void b(wav wav, Object obj) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "USER_EVENT", obj));
        }
        wav.c(obj);
    }

    public final void a(wav wav, SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
        String str;
        if (this.c.a(this.d)) {
            wjw wjw = this.c;
            InternalLogLevel internalLogLevel = this.d;
            String str2 = "CONNECT";
            if (socketAddress2 == null) {
                str = b(wav, str2, socketAddress);
            } else {
                String obj = wav.a().toString();
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
            wjw.a(internalLogLevel, str);
        }
        wav.a(socketAddress, socketAddress2, wbi);
    }

    public final void a(wav wav, wbi wbi) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "DISCONNECT"));
        }
        wav.a(wbi);
    }

    public final void b(wav wav, wbi wbi) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "CLOSE"));
        }
        wav.b(wbi);
    }

    public final void a(wav wav, Object obj) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "RECEIVED", obj));
        }
        wav.d(obj);
    }

    public final void a(wav wav, Object obj, wbi wbi) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "WRITE", obj));
        }
        wav.a(obj, wbi);
    }

    public final void d(wav wav) {
        if (this.c.a(this.d)) {
            this.c.a(this.d, a(wav, "FLUSH"));
        }
        wav.o();
    }

    private static String a(wav wav, String str) {
        String obj = wav.a().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 1 + str.length());
        sb.append(obj);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }

    private static String a(wav wav, String str, Object obj) {
        if (obj instanceof vyv) {
            return a(wav, str, (vyv) obj);
        }
        if (obj instanceof vyx) {
            return a(wav, str, (vyx) obj);
        }
        return b(wav, str, obj);
    }

    private static String a(wav wav, String str, vyv vyv) {
        String obj = wav.a().toString();
        int g = vyv.g();
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
        sb2.append(wjn.a);
        vza.a(sb2, vyv);
        return sb2.toString();
    }

    private static String a(wav wav, String str, vyx vyx) {
        String obj = wav.a().toString();
        String obj2 = vyx.toString();
        vyv a = vyx.a();
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
        sb2.append(wjn.a);
        vza.a(sb2, a);
        return sb2.toString();
    }

    private static String b(wav wav, String str, Object obj) {
        String obj2 = wav.a().toString();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(obj2.length() + 1 + str.length() + 2 + valueOf.length());
        sb.append(obj2);
        sb.append(' ');
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        return sb.toString();
    }
}
