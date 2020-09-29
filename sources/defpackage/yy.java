package defpackage;

import java.util.List;

/* renamed from: yy reason: default package */
public final class yy {
    public final List<aaa> a;
    public final double b;
    private final char c;
    private final double d;
    private final String e;
    private final String f;

    public static int a(char c2, String str, String str2) {
        return ((((c2 + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public yy(List<aaa> list, char c2, double d2, double d3, String str, String str2) {
        this.a = list;
        this.c = c2;
        this.d = d2;
        this.b = d3;
        this.e = str;
        this.f = str2;
    }

    public final int hashCode() {
        return a(this.c, this.f, this.e);
    }
}
