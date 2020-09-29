package defpackage;

/* renamed from: jlu reason: default package */
public final class jlu implements wig<jlt> {
    private final wzi<jlr> a;

    private jlu(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static jlu a(wzi<jlr> wzi) {
        return new jlu(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jlt((jlr) this.a.get());
    }
}
