package defpackage;

/* renamed from: qmv reason: default package */
public final class qmv extends qmq implements b {
    private int[] a = {0, 1, 2, 3, 4};

    public final int a(int i) {
        return this.a[i];
    }

    public final int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        return i == 4 ? 4 : 0;
    }
}
