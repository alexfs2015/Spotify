package defpackage;

import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;

/* renamed from: vl reason: default package */
public final class vl implements Runnable {
    private static final String a = su.a("StopWorkRunnable");
    private tj b;
    private String c;

    public vl(tj tjVar, String str) {
        this.b = tjVar;
        this.c = str;
    }

    public final void run() {
        WorkDatabase workDatabase = this.b.c;
        uy j = workDatabase.j();
        workDatabase.e();
        try {
            if (j.f(this.c) == State.RUNNING) {
                j.a(State.ENQUEUED, this.c);
            }
            boolean a2 = this.b.f.a(this.c);
            su.a();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.c, Boolean.valueOf(a2)});
            workDatabase.g();
        } finally {
            workDatabase.f();
        }
    }
}
