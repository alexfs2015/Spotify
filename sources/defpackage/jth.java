package defpackage;

/* renamed from: jth reason: default package */
public final class jth implements jtm {
    private final String a;

    private jth(String str) {
        this.a = str;
    }

    public static jth c(String str) {
        return new jth(str);
    }

    public final boolean a(String str) {
        return this.a.length() == str.length();
    }

    public final boolean b(String str) {
        return this.a.equals(str);
    }
}
