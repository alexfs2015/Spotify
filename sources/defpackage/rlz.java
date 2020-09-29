package defpackage;

import android.os.SystemClock;
import java.util.Date;

/* renamed from: rlz reason: default package */
public final class rlz implements jsq {
    private final rli a;
    private final rmb b;
    private long c = Long.MIN_VALUE;

    rlz(rli rli, rmb rmb) {
        this.a = rli;
        this.b = rmb;
    }

    public final void a(Throwable th) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > this.c + 30000) {
            if (this.a.a && vuu.c()) {
                this.b.a(false);
                aia aia = agj.d().a;
                if (!aia.d && aia.c("prior to logging exceptions.")) {
                    if (th == null) {
                        vuu.a().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
                    } else {
                        ahz ahz = aia.c;
                        Thread currentThread = Thread.currentThread();
                        ahz.e.a((Runnable) new Runnable(new Date(), currentThread, th) {
                            private /* synthetic */ Date a;
                            private /* synthetic */ Thread b;
                            private /* synthetic */ Throwable c;

                            {
                                this.a = r2;
                                this.b = r3;
                                this.c = r4;
                            }

                            public final void run() {
                                if (!ahz.this.c()) {
                                    ahz.b(ahz.this, this.a, this.b, this.c);
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
