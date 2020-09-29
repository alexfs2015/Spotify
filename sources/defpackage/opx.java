package defpackage;

/* renamed from: opx reason: default package */
public final class opx implements wig<opw> {
    private final wzi<vkw> a;

    private opx(wzi<vkw> wzi) {
        this.a = wzi;
    }

    public static opx a(wzi<vkw> wzi) {
        return new opx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new opw((vkw) this.a.get());
    }
}
