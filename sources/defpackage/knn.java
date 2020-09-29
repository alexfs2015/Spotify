package defpackage;

/* renamed from: knn reason: default package */
public final class knn implements kno {
    private final kno[] a;

    private knn(kno[] knoArr) {
        this.a = new kno[knoArr.length];
        koa.a(knoArr);
        System.arraycopy(knoArr, 0, this.a, 0, knoArr.length);
    }

    public static kno a(kno... knoArr) {
        return new knn(knoArr);
    }

    public final synchronized void dispose() {
        for (kno dispose : this.a) {
            dispose.dispose();
        }
    }
}
