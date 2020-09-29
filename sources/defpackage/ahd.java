package defpackage;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent.a;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ahd reason: default package */
final class ahd implements wkz {
    final wjf a;
    final Context b;
    final ahe c;
    final aic d;
    final wlh e;
    final aho f;
    final ScheduledExecutorService g;
    ahz h = new ahk();

    public ahd(wjf wjf, Context context, ahe ahe, aic aic, wlh wlh, ScheduledExecutorService scheduledExecutorService, aho aho) {
        this.a = wjf;
        this.b = context;
        this.c = ahe;
        this.d = aic;
        this.e = wlh;
        this.g = scheduledExecutorService;
        this.f = aho;
    }

    private void b(Runnable runnable) {
        try {
            this.g.submit(runnable).get();
        } catch (Exception e2) {
            wja.a().c("Answers", "Failed to run events task", e2);
        }
    }

    public final void a() {
        a(new Runnable() {
            public final void run() {
                try {
                    ahz ahz = ahd.this.h;
                    ahd.this.h = new ahk();
                    ahz.b();
                } catch (Exception e) {
                    wja.a().c("Answers", "Failed to disable events", e);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void a(final a aVar, boolean z, final boolean z2) {
        AnonymousClass6 r0 = new Runnable() {
            public final void run() {
                try {
                    ahd.this.h.a(aVar);
                    if (z2) {
                        ahd.this.h.c();
                    }
                } catch (Exception e) {
                    wja.a().c("Answers", "Failed to process event", e);
                }
            }
        };
        if (z) {
            b(r0);
        } else {
            a(r0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Runnable runnable) {
        try {
            this.g.submit(runnable);
        } catch (Exception e2) {
            wja.a().c("Answers", "Failed to submit events task", e2);
        }
    }

    public final void b() {
        a(new Runnable() {
            public final void run() {
                try {
                    ahd.this.h.a();
                } catch (Exception e) {
                    wja.a().c("Answers", "Failed to send events files", e);
                }
            }
        });
    }
}
