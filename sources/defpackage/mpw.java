package defpackage;

/* renamed from: mpw reason: default package */
public final class mpw implements c {
    private final mpv a;

    public mpw(mpv mpv) {
        this.a = mpv;
    }

    public final void ai_() {
        this.a.a();
    }

    public final void aj_() {
        mpv mpv = this.a;
        mpv.a.bd_();
        mpv.b.bd_();
        mpv.c = false;
    }

    public final String c() {
        return "DataSaverModeObserver";
    }
}
