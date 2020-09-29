package defpackage;

import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;

/* renamed from: ux reason: default package */
public final class ux implements Runnable {
    private static final String a = sg.a("StopWorkRunnable");
    private sv b;
    private String c;

    public ux(sv svVar, String str) {
        this.b = svVar;
        this.c = str;
    }

    public final void run() {
        WorkDatabase workDatabase = this.b.c;
        uk j = workDatabase.j();
        workDatabase.e();
        try {
            if (j.f(this.c) == State.RUNNING) {
                j.a(State.ENQUEUED, this.c);
            }
            boolean a2 = this.b.f.a(this.c);
            sg.a();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.c, Boolean.valueOf(a2)});
            workDatabase.g();
        } finally {
            workDatabase.f();
        }
    }
}
