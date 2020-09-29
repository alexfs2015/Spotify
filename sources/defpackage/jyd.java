package defpackage;

import io.reactivex.disposables.Disposables;

/* renamed from: jyd reason: default package */
public final class jyd implements c {
    private final wzi<jyb> a;
    private jyb b;

    public jyd(wzi<jyb> wzi) {
        this.a = wzi;
    }

    public final void ai_() {
        this.b = (jyb) this.a.get();
        this.b.a();
    }

    public final void aj_() {
        jyb jyb = this.b;
        if (jyb != null) {
            jyb.a.a(Disposables.a());
            this.b = null;
        }
    }

    public final String c() {
        return "PlaybackErrorNotifier";
    }
}
