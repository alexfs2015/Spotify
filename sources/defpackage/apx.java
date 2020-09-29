package defpackage;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.comscore.util.crashreport.CrashReportManager;
import com.github.anrwatchdog.ANRError;

/* renamed from: apx reason: default package */
public final class apx extends Thread {
    private static final a b = new a() {
        public final void a(ANRError aNRError) {
            throw aNRError;
        }
    };
    private static final b c = new b() {
        public final void a(InterruptedException interruptedException) {
            new StringBuilder("Interrupted: ").append(interruptedException.getMessage());
        }
    };
    public a a;
    private b d;
    private final Handler e;
    private final int f;
    private String g;
    private boolean h;
    private boolean i;
    /* access modifiers changed from: private */
    public volatile int j;
    private final Runnable k;

    /* renamed from: apx$a */
    public interface a {
        void a(ANRError aNRError);
    }

    /* renamed from: apx$b */
    public interface b {
        void a(InterruptedException interruptedException);
    }

    public apx() {
        this(CrashReportManager.TIME_WINDOW);
    }

    public apx(int i2) {
        this.a = b;
        this.d = c;
        this.e = new Handler(Looper.getMainLooper());
        this.g = "";
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = new Runnable() {
            public final void run() {
                apx apx = apx.this;
                apx.j = (apx.j + 1) % Integer.MAX_VALUE;
            }
        };
        this.f = i2;
    }

    public final void run() {
        setName("|ANR-WatchDog|");
        while (!isInterrupted()) {
            int i2 = this.j;
            this.e.post(this.k);
            try {
                Thread.sleep((long) this.f);
                if (this.j == i2) {
                    if (Debug.isDebuggerConnected()) {
                        int i3 = this.j;
                        int i4 = this.j;
                    } else {
                        String str = this.g;
                        this.a.a(str != null ? ANRError.a(str, false) : ANRError.a());
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                this.d.a(e2);
            }
        }
    }
}
