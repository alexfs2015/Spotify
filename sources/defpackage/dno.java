package defpackage;

/* renamed from: dno reason: default package */
public final class dno {
    public static int a(int i) {
        if (i >= 0 && i <= 1) {
            return i;
        }
        if (i >= 1000 && i <= 1000) {
            return i;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(i);
        sb.append(" is not a valid enum EnumBoolean");
        throw new IllegalArgumentException(sb.toString());
    }
}
