package defpackage;

import android.app.Activity;
import com.crashlytics.android.answers.SessionEvent;
import com.crashlytics.android.answers.SessionEvent.Type;

/* renamed from: ahy reason: default package */
final class ahy implements a {
    final long a;
    final ahd b;
    final wiy c;
    final ahj d;
    final ahg e;

    ahy(ahd ahd, wiy wiy, ahj ahj, ahg ahg, long j) {
        this.b = ahd;
        this.c = wiy;
        this.d = ahj;
        this.e = ahg;
        this.a = j;
    }

    public final void a() {
        wja.a().a("Answers", "Flush events when app is backgrounded");
        ahd ahd = this.b;
        ahd.a(new Runnable() {
            public final void run() {
                try {
                    ahd.this.h.c();
                } catch (Exception e) {
                    wja.a().c("Answers", "Failed to flush events", e);
                }
            }
        });
    }

    public final void a(Activity activity, Type type) {
        wji a2 = wja.a();
        StringBuilder sb = new StringBuilder("Logged lifecycle event: ");
        sb.append(type.name());
        a2.a("Answers", sb.toString());
        this.b.a(SessionEvent.a(type, activity), false, false);
    }

    public final void b() {
        this.c.a();
        this.b.a();
    }
}
