package defpackage;

import android.app.Activity;

/* renamed from: jhb reason: default package */
public final class jhb implements c {
    private final jha a;
    private final rpe b;
    private final a c = new $$Lambda$jhb$hTHL6Fto3_0HptiHYTtfs0zzhU(this);

    public final String c() {
        return "DockingWakeLock";
    }

    public jhb(jha jha, rpe rpe) {
        this.a = jha;
        this.b = rpe;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        jha jha = this.a;
        jha.b = this.b.a((fps<?>) rpy.a);
        jha.a((Activity) jha.a.get());
    }

    public final void ai_() {
        this.b.a(this.c);
    }

    public final void aj_() {
        this.b.b(this.c);
    }
}
