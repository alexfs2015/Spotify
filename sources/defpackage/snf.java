package defpackage;

/* renamed from: snf reason: default package */
public final class snf {
    private static boolean a(String str) {
        return ((String) fbp.a(str)).isEmpty();
    }

    public static boolean a(String str, String str2, String str3) {
        fbp.a(str);
        fbp.a(str2);
        fbp.a(str3);
        if (a(str) && a(str2) && !a(str3)) {
            return false;
        }
        if (str2.equals(str3)) {
            return true;
        }
        if (str.startsWith(str3) || str3.startsWith(str)) {
            return a(str2) || (!str.startsWith(str2) && !str2.startsWith(str)) || Math.abs(str.length() - str3.length()) < Math.abs(str.length() - str2.length());
        }
        return false;
    }

    public static boolean a(slk slk, slk slk2, slk slk3) {
        fbp.a(slk3);
        fbp.a(slk2);
        fbp.a(slk);
        return a(slk.a(), slk2.a(), slk3.a());
    }

    public static boolean a(f fVar, f fVar2, f fVar3) {
        fbp.a(fVar3);
        fbp.a(fVar2);
        fbp.a(fVar);
        return a(fVar.a, fVar2.a, fVar3.a);
    }
}
