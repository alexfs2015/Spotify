package defpackage;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: xk reason: default package */
public final class xk {
    ScheduledFuture a;
    String b;
    Runnable c;
    wf d = vv.a();
    private xc e;

    public xk(Runnable runnable, String str) {
        this.b = str;
        this.e = new xf(str, true);
        this.c = runnable;
    }

    public final long a() {
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture == null) {
            return 0;
        }
        return scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
    }

    public final void a(long j) {
        a(false);
        DecimalFormat decimalFormat = xa.a;
        double d2 = (double) j;
        Double.isNaN(d2);
        String format = decimalFormat.format(d2 / 1000.0d);
        this.d.a("%s starting. Launching in %s seconds", this.b, format);
        this.a = this.e.a(new Runnable() {
            public final void run() {
                xk.this.d.a("%s fired", xk.this.b);
                xk.this.c.run();
                xk.this.a = null;
            }
        }, j);
    }

    public void a(boolean z) {
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.d.a("%s canceled", this.b);
    }
}
