package defpackage;

import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;

/* renamed from: jwr reason: default package */
public final class jwr implements gcu {
    final jwu a;
    private final gcx b;
    private final gcx c;
    private final gcx d;
    private final gcx e;
    private final gcx f;
    private final gcx g;

    public jwr(jwu jwu, EnumSet<LogLevel> enumSet) {
        gcx r0 = new gcx() {
            public final void a(String str, String str2) {
                jwr.this.a.a('D', "Spotify", jwr.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                jwr.this.a.a('D', "Spotify", jwr.a(str, str2), th);
            }
        };
        gcx r1 = new gcx() {
            public final void a(String str, String str2) {
                jwr.this.a.a('V', "Spotify", jwr.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                jwr.this.a.a('V', "Spotify", jwr.a(str, str2), th);
            }
        };
        gcx r2 = new gcx() {
            public final void a(String str, String str2) {
                jwr.this.a.a('I', "Spotify", jwr.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                jwr.this.a.a('I', "Spotify", jwr.a(str, str2), th);
            }
        };
        gcx r3 = new gcx() {
            public final void a(String str, String str2) {
                jwr.this.a.a('W', "Spotify", jwr.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                jwr.this.a.a('W', "Spotify", jwr.a(str, str2), th);
            }
        };
        gcx r4 = new gcx() {
            public final void a(String str, String str2) {
                jwr.this.a.a("Spotify", jwr.a(str, str2));
            }

            public final void a(String str, String str2, Throwable th) {
                jwr.this.a.a("Spotify", jwr.a(str, str2), th);
            }
        };
        gcx r5 = new gcx() {
            public final void a(String str, String str2) {
                jwr.this.a.a("YELL", jwr.a(str, str2));
            }

            public final void a(String str, String str2, Throwable th) {
                jwr.this.a.a("YELL", jwr.a(str, str2), th);
            }
        };
        this.a = jwu;
        if (!enumSet.contains(LogLevel.VERBOSE)) {
            r1 = gcx.a;
        }
        this.b = r1;
        if (!enumSet.contains(LogLevel.DEBUG)) {
            r0 = gcx.a;
        }
        this.c = r0;
        if (!enumSet.contains(LogLevel.INFO)) {
            r2 = gcx.a;
        }
        this.d = r2;
        if (!enumSet.contains(LogLevel.WARNING)) {
            r3 = gcx.a;
        }
        this.e = r3;
        if (!enumSet.contains(LogLevel.ERROR)) {
            r4 = gcx.a;
        }
        this.f = r4;
        if (!enumSet.contains(LogLevel.YELL)) {
            r5 = gcx.a;
        }
        this.g = r5;
    }

    static /* synthetic */ String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(Logger.a(str) + 3 + Logger.a(str2));
        sb.append('[');
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public final gcx a() {
        return this.b;
    }

    public final gcx b() {
        return this.c;
    }

    public final gcx c() {
        return this.d;
    }

    public final gcx d() {
        return this.e;
    }

    public final gcx e() {
        return this.f;
    }
}
