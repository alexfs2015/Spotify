package defpackage;

import android.os.Debug;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* renamed from: bip reason: default package */
final class bip extends TimerTask {
    private final /* synthetic */ CountDownLatch a;
    private final /* synthetic */ Timer b;
    private final /* synthetic */ bho c;

    bip(bho bho, CountDownLatch countDownLatch, Timer timer) {
        this.c = bho;
        this.a = countDownLatch;
        this.b = timer;
    }

    public final void run() {
        if (((long) ((Integer) dpn.f().a(dsp.cn)).intValue()) != this.a.getCount()) {
            cow.a(3);
            Debug.stopMethodTracing();
            if (this.a.getCount() == 0) {
                this.b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.c.e.c.getPackageName()).concat("_adsTrace_");
        try {
            cow.a(3);
            this.a.countDown();
            long a2 = bjl.l().a();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(a2);
            Debug.startMethodTracing(sb.toString(), ((Integer) dpn.f().a(dsp.co)).intValue());
        } catch (Exception e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
