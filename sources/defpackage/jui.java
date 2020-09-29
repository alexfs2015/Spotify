package defpackage;

import android.util.Log;
import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;

/* renamed from: jui reason: default package */
public final class jui implements gbv {
    private static final gby a = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gby b = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gby c = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gby d = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gby e = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
            Log.e("Spotify", str);
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
            Log.e("Spotify", str, th);
        }
    };
    private static final gby f = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
            Log.e("YELL", str);
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
            Log.e("YELL", str, th);
        }
    };
    private final gby g;
    private final gby h;
    private final gby i;
    private final gby j;
    private final gby k;
    private final gby l;

    /* renamed from: jui$a */
    static abstract class a implements gby {
        /* access modifiers changed from: 0000 */
        public abstract void a(String str);

        /* access modifiers changed from: 0000 */
        public abstract void a(String str, Throwable th);

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void a(String str, String str2) {
            a(b(str, str2));
        }

        public final void a(String str, String str2, Throwable th) {
            a(b(str, str2), th);
        }

        private static String b(String str, String str2) {
            StringBuilder sb = new StringBuilder(Logger.a(str) + 3 + Logger.a(str2));
            sb.append('[');
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
            return sb.toString();
        }
    }

    public jui(EnumSet<LogLevel> enumSet) {
        this.g = enumSet.contains(LogLevel.VERBOSE) ? b : gby.a;
        this.h = enumSet.contains(LogLevel.DEBUG) ? a : gby.a;
        this.i = enumSet.contains(LogLevel.INFO) ? c : gby.a;
        this.j = enumSet.contains(LogLevel.WARNING) ? d : gby.a;
        this.k = enumSet.contains(LogLevel.ERROR) ? e : gby.a;
        this.l = enumSet.contains(LogLevel.YELL) ? f : gby.a;
    }

    public final gby a() {
        return this.g;
    }

    public final gby b() {
        return this.h;
    }

    public final gby c() {
        return this.i;
    }

    public final gby d() {
        return this.j;
    }

    public final gby e() {
        return this.k;
    }
}
