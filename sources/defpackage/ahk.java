package defpackage;

import android.app.Activity;
import com.crashlytics.android.answers.SessionEvent;
import com.crashlytics.android.answers.SessionEvent.Type;

/* renamed from: ahk reason: default package */
final class ahk implements a {
    final long a;
    final agp b;
    final vus c;
    final agv d;
    final ags e;

    ahk(agp agp, vus vus, agv agv, ags ags, long j) {
        this.b = agp;
        this.c = vus;
        this.d = agv;
        this.e = ags;
        this.a = j;
    }

    public final void b() {
        this.c.a();
        this.b.a();
    }

    public final void a(Activity activity, Type type) {
        vvc a2 = vuu.a();
        StringBuilder sb = new StringBuilder("Logged lifecycle event: ");
        sb.append(type.name());
        a2.a("Answers", sb.toString());
        this.b.a(SessionEvent.a(type, activity), false, false);
    }

    public final void a() {
        vuu.a().a("Answers", "Flush events when app is backgrounded");
        agp agp = this.b;
        agp.a(new Runnable() {
            public final void run() {
                try {
                    agp.this.h.c();
                } catch (Exception e) {
                    vuu.a().c("Answers", "Failed to flush events", e);
                }
            }
        });
    }
}
