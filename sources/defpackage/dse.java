package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzae;
import java.util.concurrent.BlockingQueue;

/* renamed from: dse reason: default package */
public final class dse extends Thread {
    volatile boolean a = false;
    private final BlockingQueue<dwe<?>> b;
    private final drl c;
    private final dbq d;
    private final cbt e;

    public dse(BlockingQueue<dwe<?>> blockingQueue, drl drl, dbq dbq, cbt cbt) {
        this.b = blockingQueue;
        this.c = drl;
        this.d = dbq;
        this.e = cbt;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                dwe dwe = (dwe) this.b.take();
                try {
                    dwe.b("network-queue-take");
                    TrafficStats.setThreadStatsTag(dwe.c);
                    dud a2 = this.c.a(dwe);
                    dwe.b("network-http-complete");
                    if (!a2.e || !dwe.e()) {
                        ecb a3 = dwe.a(a2);
                        dwe.b("network-parse-complete");
                        if (dwe.h && a3.b != null) {
                            this.d.a(dwe.b, a3.b);
                            dwe.b("network-cache-written");
                        }
                        dwe.d();
                        this.e.a(dwe, a3);
                        dwe.a(a3);
                    } else {
                        dwe.c("not-modified");
                        dwe.f();
                    }
                } catch (zzae e2) {
                    e2.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(dwe, e2);
                    dwe.f();
                } catch (Exception e3) {
                    cgp.a(e3, "Unhandled exception %s", e3.toString());
                    zzae zzae = new zzae((Throwable) e3);
                    zzae.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(dwe, zzae);
                    dwe.f();
                }
            } catch (InterruptedException unused) {
                if (this.a) {
                    return;
                }
            }
        }
    }
}
