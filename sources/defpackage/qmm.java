package defpackage;

/* renamed from: qmm reason: default package */
public final class qmm extends qmq implements b {
    private int[] a = {2, 3, 4};

    public final int a(int i) {
        return this.a[i];
    }

    public final int b(int i) {
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        return i == 4 ? 2 : 0;
    }
}
