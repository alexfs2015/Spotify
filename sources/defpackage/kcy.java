package defpackage;

/* renamed from: kcy reason: default package */
public final class kcy implements c {
    private final kcx a;

    public final String c() {
        return "WazeInterAppConnection";
    }

    public kcy(kcx kcx) {
        this.a = kcx;
    }

    public final void ai_() {
        this.a.a();
    }

    public final void aj_() {
        kcx kcx = this.a;
        if (kcx.a != null && !kcx.a.b()) {
            kcx.a.bf_();
        }
    }
}
