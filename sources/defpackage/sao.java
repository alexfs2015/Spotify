package defpackage;

import io.reactivex.disposables.Disposables;

/* renamed from: sao reason: default package */
public final class sao implements c {
    private final wzi<sam> a;
    private sam b;

    public sao(wzi<sam> wzi) {
        this.a = wzi;
    }

    public final void ai_() {
        this.b = (sam) this.a.get();
        this.b.a();
    }

    public final void aj_() {
        sam sam = this.b;
        if (sam != null) {
            sam.a.a(Disposables.a());
            this.b = null;
        }
    }

    public final String c() {
        return "SocialErrorNotifier";
    }
}
