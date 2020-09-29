package defpackage;

/* renamed from: mpu reason: default package */
public final class mpu implements wig<mpt> {
    private final wzi<rzo> a;

    private mpu(wzi<rzo> wzi) {
        this.a = wzi;
    }

    public static mpu a(wzi<rzo> wzi) {
        return new mpu(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mpt((rzo) this.a.get());
    }
}
