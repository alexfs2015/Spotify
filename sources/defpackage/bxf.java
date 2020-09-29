package defpackage;

/* renamed from: bxf reason: default package */
public final class bxf {
    private final String a;
    private final String b;

    public bxf(String str) {
        this(str, null);
    }

    private bxf(String str, String str2) {
        bxo.a(str, (Object) "log tag cannot be null");
        Object[] objArr = {str, Integer.valueOf(23)};
        if (str.length() <= 23) {
            this.a = str;
            this.b = null;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }
}
