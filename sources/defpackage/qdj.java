package defpackage;

/* renamed from: qdj reason: default package */
public final class qdj extends qdn implements b {
    private int[] a = {2, 3, 4};

    public final int b(int i) {
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        return i == 4 ? 2 : 0;
    }

    public final int a(int i) {
        return this.a[i];
    }
}
