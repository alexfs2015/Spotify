package defpackage;

/* renamed from: hso reason: default package */
public final class hso implements wig<hsn> {
    private final wzi<hul> a;

    private hso(wzi<hul> wzi) {
        this.a = wzi;
    }

    public static hso a(wzi<hul> wzi) {
        return new hso(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hsn(wif.b(this.a));
    }
}
