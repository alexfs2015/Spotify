package defpackage;

/* renamed from: mdz reason: default package */
public final class mdz implements c {
    private final mdy a;

    public mdz(mdy mdy) {
        this.a = mdy;
    }

    public final void ai_() {
        this.a.a();
    }

    public final void aj_() {
        mdy mdy = this.a;
        mdy.a.bd_();
        if (mdy.c != null) {
            mdy.c.b();
        }
        if (mdy.b != null) {
            mdy.b.a.bd_();
        }
    }

    public final String c() {
        return "CappedOndemandFeatureObserver";
    }
}
