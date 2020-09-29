package defpackage;

/* renamed from: kke reason: default package */
public final class kke implements kkf {
    private final kkf[] a;

    public static kkf a(kkf... kkfArr) {
        return new kke(kkfArr);
    }

    private kke(kkf[] kkfArr) {
        this.a = new kkf[kkfArr.length];
        kkr.a(kkfArr);
        System.arraycopy(kkfArr, 0, this.a, 0, kkfArr.length);
    }

    public final synchronized void dispose() {
        for (kkf dispose : this.a) {
            dispose.dispose();
        }
    }
}
