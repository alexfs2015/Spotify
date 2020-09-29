package defpackage;

/* renamed from: jhd reason: default package */
public final class jhd extends jht {
    public jhd() {
        super("HandlingCommand");
    }

    public final void e() {
        fay.b(g(), "Trying to enter command handling phase without leaving it first");
        ag_();
    }

    public final void f() {
        fay.b(this.e, "Trying to leave command handling phase without entering it first");
        ah_();
    }
}
