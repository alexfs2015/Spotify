package defpackage;

import io.reactivex.disposables.Disposables;

/* renamed from: jvv reason: default package */
public final class jvv implements c {
    private final wlc<jvt> a;
    private jvt b;

    public final String c() {
        return "PlaybackErrorNotifier";
    }

    public jvv(wlc<jvt> wlc) {
        this.a = wlc;
    }

    public final void ai_() {
        this.b = (jvt) this.a.get();
        this.b.a();
    }

    public final void aj_() {
        jvt jvt = this.b;
        if (jvt != null) {
            jvt.a.a(Disposables.a());
            this.b = null;
        }
    }
}
