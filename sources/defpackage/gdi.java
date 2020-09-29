package defpackage;

/* renamed from: gdi reason: default package */
public final class gdi implements wig<gdh> {
    private final wzi<gdg> a;

    private gdi(wzi<gdg> wzi) {
        this.a = wzi;
    }

    public static gdi a(wzi<gdg> wzi) {
        return new gdi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gdh((gdg) this.a.get());
    }
}
