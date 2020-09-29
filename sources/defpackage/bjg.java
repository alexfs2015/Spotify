package defpackage;

import android.os.Debug;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* renamed from: bjg reason: default package */
final class bjg extends TimerTask {
    private final /* synthetic */ CountDownLatch a;
    private final /* synthetic */ Timer b;
    private final /* synthetic */ bif c;

    bjg(bif bif, CountDownLatch countDownLatch, Timer timer) {
        this.c = bif;
        this.a = countDownLatch;
        this.b = timer;
    }

    public final void run() {
        if (((long) ((Integer) dqe.f().a(dtg.cn)).intValue()) != this.a.getCount()) {
            cpn.a(3);
            Debug.stopMethodTracing();
            if (this.a.getCount() == 0) {
                this.b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.c.e.c.getPackageName()).concat("_adsTrace_");
        try {
            cpn.a(3);
            this.a.countDown();
            long a2 = bkc.l().a();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(a2);
            Debug.startMethodTracing(sb.toString(), ((Integer) dqe.f().a(dtg.co)).intValue());
        } catch (Exception e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
