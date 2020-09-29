package defpackage;

/* renamed from: qds reason: default package */
public final class qds extends qdn implements b {
    private int[] a = {0, 1, 2, 3, 4};

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

    public final int a(int i) {
        return this.a[i];
    }
}
