package defpackage;

/* renamed from: pbs reason: default package */
public final class pbs implements wig<pbr> {
    private final wzi<a> a;

    private pbs(wzi<a> wzi) {
        this.a = wzi;
    }

    public static pbs a(wzi<a> wzi) {
        return new pbs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pbr((a) this.a.get());
    }
}
