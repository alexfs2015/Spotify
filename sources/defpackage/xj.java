package defpackage;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;

/* renamed from: xj reason: default package */
public final class xj {
    public xc a;
    public ScheduledFuture b;
    public String c;
    Runnable d;
    public long e;
    public long f;
    public boolean g = true;
    public wf h = vv.a();

    public xj(Runnable runnable, long j, long j2, String str) {
        this.a = new xf(str, true);
        this.c = str;
        this.d = runnable;
        this.e = j;
        this.f = j2;
        DecimalFormat decimalFormat = xa.a;
        double d2 = (double) j2;
        Double.isNaN(d2);
        String format = decimalFormat.format(d2 / 1000.0d);
        DecimalFormat decimalFormat2 = xa.a;
        double d3 = (double) j;
        Double.isNaN(d3);
        String format2 = decimalFormat2.format(d3 / 1000.0d);
        this.h.a("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, format2, format);
    }
}