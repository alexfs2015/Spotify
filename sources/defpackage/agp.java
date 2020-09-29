package defpackage;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent.a;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agp reason: default package */
final class agp implements vwt {
    final vuz a;
    final Context b;
    final agq c;
    final aho d;
    final vxb e;
    final aha f;
    final ScheduledExecutorService g;
    ahl h = new agw();

    public agp(vuz vuz, Context context, agq agq, aho aho, vxb vxb, ScheduledExecutorService scheduledExecutorService, aha aha) {
        this.a = vuz;
        this.b = context;
        this.c = agq;
        this.d = aho;
        this.e = vxb;
        this.g = scheduledExecutorService;
        this.f = aha;
    }

    public final void a() {
        a(new Runnable() {
            public final void run() {
                try {
                    ahl ahl = agp.this.h;
                    agp.this.h = new agw();
                    ahl.b();
                } catch (Exception e) {
                    vuu.a().c("Answers", "Failed to disable events", e);
                }
            }
        });
    }

    public final void b() {
        a(new Runnable() {
            public final void run() {
                try {
                    agp.this.h.a();
                } catch (Exception e) {
                    vuu.a().c("Answers", "Failed to send events files", e);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void a(final a aVar, boolean z, final boolean z2) {
        AnonymousClass6 r0 = new Runnable() {
            public final void run() {
                try {
                    agp.this.h.a(aVar);
                    if (z2) {
                        agp.this.h.c();
                    }
                } catch (Exception e) {
                    vuu.a().c("Answers", "Failed to process event", e);
                }
            }
        };
        if (z) {
            b(r0);
        } else {
            a(r0);
        }
    }

    private void b(Runnable runnable) {
        try {
            this.g.submit(runnable).get();
        } catch (Exception e2) {
            vuu.a().c("Answers", "Failed to run events task", e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Runnable runnable) {
        try {
            this.g.submit(runnable);
        } catch (Exception e2) {
            vuu.a().c("Answers", "Failed to submit events task", e2);
        }
    }
}
