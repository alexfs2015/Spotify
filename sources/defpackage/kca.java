package defpackage;

/* renamed from: kca reason: default package */
public final class kca implements kcb {
    public static final kca a = new kca("appload");
    public final String b;

    private kca(String str) {
        this.b = str;
    }

    public static kca a(String str) {
        return new kca(str);
    }

    public final String a() {
        return this.b;
    }
}
