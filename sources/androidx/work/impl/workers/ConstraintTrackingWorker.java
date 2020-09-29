package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.a;
import androidx.work.ListenableWorker.a.C0004a;
import androidx.work.ListenableWorker.a.b;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements tx {
    static final String d = su.a("ConstraintTrkngWrkr");
    WorkerParameters e;
    final Object f = new Object();
    volatile boolean g = false;
    vo<a> h = vo.a();
    ListenableWorker i;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = workerParameters;
    }

    public final void a(List<String> list) {
    }

    public final void b(List<String> list) {
        su.a();
        String.format("Constraints changed for %s", new Object[]{list});
        synchronized (this.f) {
            this.g = true;
        }
    }

    public final ffe<a> c() {
        f().execute(new Runnable() {
            public final void run() {
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = constraintTrackingWorker.b().b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                if (TextUtils.isEmpty(str)) {
                    su.a().a(ConstraintTrackingWorker.d, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.g();
                    return;
                }
                constraintTrackingWorker.i = constraintTrackingWorker.b.e.a(constraintTrackingWorker.a, str, constraintTrackingWorker.e);
                if (constraintTrackingWorker.i == null) {
                    su.a();
                    constraintTrackingWorker.g();
                    return;
                }
                ux b = tj.a(constraintTrackingWorker.a).c.j().b(constraintTrackingWorker.a().toString());
                if (b == null) {
                    constraintTrackingWorker.g();
                    return;
                }
                ty tyVar = new ty(constraintTrackingWorker.a, tj.a(constraintTrackingWorker.a).d, constraintTrackingWorker);
                tyVar.a(Collections.singletonList(b));
                if (tyVar.a(constraintTrackingWorker.a().toString())) {
                    su.a();
                    String.format("Constraints met for delegate %s", new Object[]{str});
                    try {
                        ffe c = constraintTrackingWorker.i.c();
                        c.addListener(new Runnable(c) {
                            private /* synthetic */ ffe a;

                            {
                                this.a = r2;
                            }

                            public final void run() {
                                synchronized (ConstraintTrackingWorker.this.f) {
                                    if (ConstraintTrackingWorker.this.g) {
                                        ConstraintTrackingWorker.this.h();
                                    } else {
                                        ConstraintTrackingWorker.this.h.a(this.a);
                                    }
                                }
                            }
                        }, constraintTrackingWorker.f());
                    } catch (Throwable th) {
                        su.a();
                        String.format("Delegated worker %s threw exception in startWork.", new Object[]{str});
                        new Throwable[1][0] = th;
                        synchronized (constraintTrackingWorker.f) {
                            if (constraintTrackingWorker.g) {
                                su.a();
                                constraintTrackingWorker.h();
                            } else {
                                constraintTrackingWorker.g();
                            }
                        }
                    }
                } else {
                    su.a();
                    String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str});
                    constraintTrackingWorker.h();
                }
            }
        });
        return this.h;
    }

    public final void e() {
        super.e();
        ListenableWorker listenableWorker = this.i;
        if (listenableWorker != null) {
            listenableWorker.d();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        this.h.a(new C0004a());
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.h.a(new b());
    }
}
