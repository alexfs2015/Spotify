package defpackage;

/* renamed from: rpf reason: default package */
public final class rpf {
    private static final dw<String> a;

    static {
        dw<String> dwVar = new dw<>();
        a = dwVar;
        dwVar.b(1, "disconnected");
        String str = "connecting";
        a.b(3, str);
        a.b(2, str);
        String str2 = "connected";
        a.b(5, str2);
        a.b(4, str2);
    }

    public static String a(int i) {
        String str = (String) a.a(i, null);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(String.format("%s is an invalid state", new Object[]{Integer.valueOf(i)}));
    }
}
