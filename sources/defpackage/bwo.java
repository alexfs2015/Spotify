package defpackage;

/* renamed from: bwo reason: default package */
public final class bwo {
    private final String a;
    private final String b;

    private bwo(String str, String str2) {
        bwx.a(str, (Object) "log tag cannot be null");
        Object[] objArr = {str, Integer.valueOf(23)};
        if (str.length() <= 23) {
            this.a = str;
            this.b = null;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public bwo(String str) {
        this(str, null);
    }
}
