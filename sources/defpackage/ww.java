package defpackage;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ww reason: default package */
public final class ww {
    ScheduledFuture a;
    String b;
    Runnable c;
    vr d = vh.a();
    private wo e;

    public ww(Runnable runnable, String str) {
        this.b = str;
        this.e = new wr(str, true);
        this.c = runnable;
    }

    public final void a(long j) {
        a(false);
        DecimalFormat decimalFormat = wm.a;
        double d2 = (double) j;
        Double.isNaN(d2);
        String format = decimalFormat.format(d2 / 1000.0d);
        this.d.a("%s starting. Launching in %s seconds", this.b, format);
        this.a = this.e.a(new Runnable() {
            public final void run() {
                ww.this.d.a("%s fired", ww.this.b);
                ww.this.c.run();
                ww.this.a = null;
            }
        }, j);
    }

    public final long a() {
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture == null) {
            return 0;
        }
        return scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
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
