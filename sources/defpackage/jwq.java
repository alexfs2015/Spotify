package defpackage;

import android.util.Log;
import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;

/* renamed from: jwq reason: default package */
public final class jwq implements gcu {
    private static final gcx a = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gcx b = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gcx c = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gcx d = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
        }
    };
    private static final gcx e = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
            Log.e("Spotify", str);
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
            Log.e("Spotify", str, th);
        }
    };
    private static final gcx f = new a() {
        /* access modifiers changed from: 0000 */
        public final void a(String str) {
            Log.e("YELL", str);
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, Throwable th) {
            Log.e("YELL", str, th);
        }
    };
    private final gcx g;
    private final gcx h;
    private final gcx i;
    private final gcx j;
    private final gcx k;
    private final gcx l;

    /* renamed from: jwq$a */
    static abstract class a implements gcx {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        private static String b(String str, String str2) {
            StringBuilder sb = new StringBuilder(Logger.a(str) + 3 + Logger.a(str2));
            sb.append('[');
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(String str);

        public final void a(String str, String str2) {
            a(b(str, str2));
        }

        public final void a(String str, String str2, Throwable th) {
            a(b(str, str2), th);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(String str, Throwable th);
    }

    public jwq(EnumSet<LogLevel> enumSet) {
        this.g = enumSet.contains(LogLevel.VERBOSE) ? b : gcx.a;
        this.h = enumSet.contains(LogLevel.DEBUG) ? a : gcx.a;
        this.i = enumSet.contains(LogLevel.INFO) ? c : gcx.a;
        this.j = enumSet.contains(LogLevel.WARNING) ? d : gcx.a;
        this.k = enumSet.contains(LogLevel.ERROR) ? e : gcx.a;
        this.l = enumSet.contains(LogLevel.YELL) ? f : gcx.a;
    }

    public final gcx a() {
        return this.g;
    }

    public final gcx b() {
        return this.h;
    }

    public final gcx c() {
        return this.i;
    }

    public final gcx d() {
        return this.j;
    }

    public final gcx e() {
        return this.k;
    }
}
