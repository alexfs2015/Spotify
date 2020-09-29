package defpackage;

/* renamed from: jjt reason: default package */
public final class jjt extends jkj {
    public jjt() {
        super("HandlingCommand");
    }

    public final void e() {
        fbp.b(g(), "Trying to enter command handling phase without leaving it first");
        ag_();
    }

    public final void f() {
        fbp.b(this.e, "Trying to leave command handling phase without entering it first");
        ah_();
    }
}
