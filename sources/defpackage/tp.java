package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.WorkerParameters.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: tp reason: default package */
public final class tp implements tc, a, tx {
    final Context a;
    final int b;
    final String c;
    final tq d;
    final ty e;
    WakeLock f;
    boolean g = false;
    private final Object h = new Object();
    private int i = 0;

    static {
        su.a("DelayMetCommandHandler");
    }

    tp(Context context, int i2, String str, tq tqVar) {
        this.a = context;
        this.b = i2;
        this.d = tqVar;
        this.c = str;
        this.e = new ty(this.a, tqVar.c, this);
    }

    private void b() {
        synchronized (this.h) {
            this.e.a();
            this.d.d.a(this.c);
            if (this.f != null && this.f.isHeld()) {
                su.a();
                String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f, this.c});
                this.f.release();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        synchronized (this.h) {
            if (this.i < 2) {
                this.i = 2;
                su.a();
                String.format("Stopping work for WorkSpec %s", new Object[]{this.c});
                this.d.a((Runnable) new a(this.d, tn.c(this.a, this.c), this.b));
                if (this.d.e.d(this.c)) {
                    su.a();
                    String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.c});
                    this.d.a((Runnable) new a(this.d, tn.a(this.a, this.c), this.b));
                } else {
                    su.a();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.c});
                }
            } else {
                su.a();
                String.format("Already stopped work for %s", new Object[]{this.c});
            }
        }
    }

    public final void a(String str) {
        su.a();
        String.format("Exceeded time limits on execution for %s", new Object[]{str});
        a();
    }

    public final void a(String str, boolean z) {
        su.a();
        String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        b();
        if (z) {
            Intent a2 = tn.a(this.a, this.c);
            tq tqVar = this.d;
            tqVar.a((Runnable) new a(tqVar, a2, this.b));
        }
        if (this.g) {
            Intent a3 = tn.a(this.a);
            tq tqVar2 = this.d;
            tqVar2.a((Runnable) new a(tqVar2, a3, this.b));
        }
    }

    public final void a(List<String> list) {
        if (list.contains(this.c)) {
            synchronized (this.h) {
                if (this.i == 0) {
                    this.i = 1;
                    su.a();
                    String.format("onAllConstraintsMet for %s", new Object[]{this.c});
                    if (this.d.e.a(this.c, (a) null)) {
                        ts tsVar = this.d.d;
                        String str = this.c;
                        synchronized (tsVar.d) {
                            su.a();
                            String.format("Starting timer for %s", new Object[]{str});
                            tsVar.a(str);
                            b bVar = new b(tsVar, str);
                            tsVar.b.put(str, bVar);
                            tsVar.c.put(str, this);
                            tsVar.a.schedule(bVar, 600000, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        b();
                    }
                } else {
                    su.a();
                    String.format("Already started work for %s", new Object[]{this.c});
                }
            }
        }
    }

    public final void b(List<String> list) {
        a();
    }
}
