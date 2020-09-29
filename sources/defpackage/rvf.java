package defpackage;

import android.os.SystemClock;
import java.util.Date;

/* renamed from: rvf reason: default package */
public final class rvf implements jux {
    private final ruo a;
    private final rvh b;
    private long c = Long.MIN_VALUE;

    rvf(ruo ruo, rvh rvh) {
        this.a = ruo;
        this.b = rvh;
    }

    public final void a(Throwable th) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > this.c + 30000) {
            if (this.a.a && wja.c()) {
                this.b.a(false);
                aio aio = agx.d().a;
                if (!aio.d && aio.c("prior to logging exceptions.")) {
                    if (th == null) {
                        wja.a().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
                    } else {
                        ain ain = aio.c;
                        Thread currentThread = Thread.currentThread();
                        ain.e.a((Runnable) new Runnable(new Date(), currentThread, th) {
                            private /* synthetic */ Date a;
                            private /* synthetic */ Thread b;
                            private /* synthetic */ Throwable c;

                            {
                                this.a = r2;
                                this.b = r3;
                                this.c = r4;
                            }

                            public final void run() {
                                if (!ain.this.c()) {
                                    ain.b(ain.this, this.a, this.b, this.c);
                                }
                            }
                        });
                    }
                }
            }
            this.c = elapsedRealtime;
        }
    }
}
