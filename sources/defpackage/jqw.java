package defpackage;

/* renamed from: jqw reason: default package */
public final class jqw implements jrb {
    private final String a;

    private jqw(String str) {
        this.a = str;
    }

    public static jqw c(String str) {
        return new jqw(str);
    }

    public final boolean a(String str) {
        return this.a.length() == str.length();
    }

    public final boolean b(String str) {
        return this.a.equals(str);
    }
}
