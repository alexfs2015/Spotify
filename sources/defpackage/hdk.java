package defpackage;

/* renamed from: hdk reason: default package */
public final class hdk {
    public static final int[] a = new int[0];

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            throw new IllegalArgumentException("Invalid empty path");
        } else if (length == 1) {
            return a;
        } else {
            int[] iArr2 = new int[(length - 1)];
            System.arraycopy(iArr, 1, iArr2, 0, iArr2.length);
            return iArr2;
        }
    }
}
