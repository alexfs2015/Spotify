package defpackage;

import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;

/* renamed from: juj reason: default package */
public final class juj implements gbv {
    final jum a;
    private final gby b;
    private final gby c;
    private final gby d;
    private final gby e;
    private final gby f;
    private final gby g;

    public juj(jum jum, EnumSet<LogLevel> enumSet) {
        gby r0 = new gby() {
            public final void a(String str, String str2) {
                juj.this.a.a('D', "Spotify", juj.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                juj.this.a.a('D', "Spotify", juj.a(str, str2), th);
            }
        };
        gby r1 = new gby() {
            public final void a(String str, String str2) {
                juj.this.a.a('V', "Spotify", juj.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                juj.this.a.a('V', "Spotify", juj.a(str, str2), th);
            }
        };
        gby r2 = new gby() {
            public final void a(String str, String str2) {
                juj.this.a.a('I', "Spotify", juj.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                juj.this.a.a('I', "Spotify", juj.a(str, str2), th);
            }
        };
        gby r3 = new gby() {
            public final void a(String str, String str2) {
                juj.this.a.a('W', "Spotify", juj.a(str, str2), null);
            }

            public final void a(String str, String str2, Throwable th) {
                juj.this.a.a('W', "Spotify", juj.a(str, str2), th);
            }
        };
        gby r4 = new gby() {
            public final void a(String str, String str2) {
                juj.this.a.a("Spotify", juj.a(str, str2));
            }

            public final void a(String str, String str2, Throwable th) {
                juj.this.a.a("Spotify", juj.a(str, str2), th);
            }
        };
        gby r5 = new gby() {
            public final void a(String str, String str2) {
                juj.this.a.a("YELL", juj.a(str, str2));
            }

            public final void a(String str, String str2, Throwable th) {
                juj.this.a.a("YELL", juj.a(str, str2), th);
            }
        };
        this.a = jum;
        if (!enumSet.contains(LogLevel.VERBOSE)) {
            r1 = gby.a;
        }
        this.b = r1;
        if (!enumSet.contains(LogLevel.DEBUG)) {
            r0 = gby.a;
        }
        this.c = r0;
        if (!enumSet.contains(LogLevel.INFO)) {
            r2 = gby.a;
        }
        this.d = r2;
        if (!enumSet.contains(LogLevel.WARNING)) {
            r3 = gby.a;
        }
        this.e = r3;
        if (!enumSet.contains(LogLevel.ERROR)) {
            r4 = gby.a;
        }
        this.f = r4;
        if (!enumSet.contains(LogLevel.YELL)) {
            r5 = gby.a;
        }
        this.g = r5;
    }

    public final gby a() {
        return this.b;
    }

    public final gby b() {
        return this.c;
    }

    public final gby c() {
        return this.d;
    }

    public final gby d() {
        return this.e;
    }

    public final gby e() {
        return this.f;
    }

    static /* synthetic */ String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(Logger.a(str) + 3 + Logger.a(str2));
        sb.append('[');
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }
}
