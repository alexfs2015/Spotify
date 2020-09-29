package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzae;
import java.util.concurrent.BlockingQueue;

/* renamed from: dsv reason: default package */
public final class dsv extends Thread {
    volatile boolean a = false;
    private final BlockingQueue<dwv<?>> b;
    private final dsc c;
    private final dch d;
    private final cck e;

    public dsv(BlockingQueue<dwv<?>> blockingQueue, dsc dsc, dch dch, cck cck) {
        this.b = blockingQueue;
        this.c = dsc;
        this.d = dch;
        this.e = cck;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                dwv dwv = (dwv) this.b.take();
                try {
                    dwv.b("network-queue-take");
                    TrafficStats.setThreadStatsTag(dwv.c);
                    duu a2 = this.c.a(dwv);
                    dwv.b("network-http-complete");
                    if (!a2.e || !dwv.e()) {
                        ecs a3 = dwv.a(a2);
                        dwv.b("network-parse-complete");
                        if (dwv.h && a3.b != null) {
                            this.d.a(dwv.b, a3.b);
                            dwv.b("network-cache-written");
                        }
                        dwv.d();
                        this.e.a(dwv, a3);
                        dwv.a(a3);
                    } else {
                        dwv.c("not-modified");
                        dwv.f();
                    }
                } catch (zzae e2) {
                    e2.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(dwv, e2);
                    dwv.f();
                } catch (Exception e3) {
                    chg.a(e3, "Unhandled exception %s", e3.toString());
                    zzae zzae = new zzae((Throwable) e3);
                    zzae.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(dwv, zzae);
                    dwv.f();
                }
            } catch (InterruptedException unused) {
                if (this.a) {
                    return;
                }
            }
        }
    }
}
