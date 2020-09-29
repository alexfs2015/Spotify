package defpackage;

/* renamed from: wkz reason: default package */
public final class wkz {
    public static int a(int i) {
        if (i <= 1073741824) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        }
        StringBuilder sb = new StringBuilder("There is no larger power of 2 int for value:");
        sb.append(i);
        sb.append(" since it exceeds 2^31.");
        throw new IllegalArgumentException(sb.toString());
    }
}
