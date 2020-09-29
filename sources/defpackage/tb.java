package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.WorkerParameters.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: tb reason: default package */
public final class tb implements so, a, tj {
    final Context a;
    final int b;
    final String c;
    final tc d;
    final tk e;
    WakeLock f;
    boolean g = false;
    private final Object h = new Object();
    private int i = 0;

    static {
        sg.a("DelayMetCommandHandler");
    }

    tb(Context context, int i2, String str, tc tcVar) {
        this.a = context;
        this.b = i2;
        this.d = tcVar;
        this.c = str;
        this.e = new tk(this.a, tcVar.c, this);
    }

    public final void a(List<String> list) {
        if (list.contains(this.c)) {
            synchronized (this.h) {
                if (this.i == 0) {
                    this.i = 1;
                    sg.a();
                    String.format("onAllConstraintsMet for %s", new Object[]{this.c});
                    if (this.d.e.a(this.c, (a) null)) {
                        te teVar = this.d.d;
                        String str = this.c;
                        synchronized (teVar.d) {
                            sg.a();
                            String.format("Starting timer for %s", new Object[]{str});
                            teVar.a(str);
                            b bVar = new b(teVar, str);
                            teVar.b.put(str, bVar);
                            teVar.c.put(str, this);
                            teVar.a.schedule(bVar, 600000, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        b();
                    }
                } else {
                    sg.a();
                    String.format("Already started work for %s", new Object[]{this.c});
                }
            }
        }
    }

    public final void a(String str, boolean z) {
        sg.a();
        String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        b();
        if (z) {
            Intent a2 = sz.a(this.a, this.c);
            tc tcVar = this.d;
            tcVar.a((Runnable) new a(tcVar, a2, this.b));
        }
        if (this.g) {
            Intent a3 = sz.a(this.a);
            tc tcVar2 = this.d;
            tcVar2.a((Runnable) new a(tcVar2, a3, this.b));
        }
    }

    public final void a(String str) {
        sg.a();
        String.format("Exceeded time limits on execution for %s", new Object[]{str});
        a();
    }

    public final void b(List<String> list) {
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        synchronized (this.h) {
            if (this.i < 2) {
                this.i = 2;
                sg.a();
                String.format("Stopping work for WorkSpec %s", new Object[]{this.c});
                this.d.a((Runnable) new a(this.d, sz.c(this.a, this.c), this.b));
                if (this.d.e.d(this.c)) {
                    sg.a();
                    String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.c});
                    this.d.a((Runnable) new a(this.d, sz.a(this.a, this.c), this.b));
                } else {
                    sg.a();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.c});
                }
            } else {
                sg.a();
                String.format("Already stopped work for %s", new Object[]{this.c});
            }
        }
    }

    private void b() {
        synchronized (this.h) {
            this.e.a();
            this.d.d.a(this.c);
            if (this.f != null && this.f.isHeld()) {
                sg.a();
                String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f, this.c});
                this.f.release();
            }
        }
    }
}
