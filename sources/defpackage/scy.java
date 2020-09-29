package defpackage;

/* renamed from: scy reason: default package */
public final class scy {
    public static boolean a(sbd sbd, sbd sbd2, sbd sbd3) {
        fay.a(sbd3);
        fay.a(sbd2);
        fay.a(sbd);
        return a(sbd.a(), sbd2.a(), sbd3.a());
    }

    public static boolean a(f fVar, f fVar2, f fVar3) {
        fay.a(fVar3);
        fay.a(fVar2);
        fay.a(fVar);
        return a(fVar.a, fVar2.a, fVar3.a);
    }

    public static boolean a(String str, String str2, String str3) {
        fay.a(str);
        fay.a(str2);
        fay.a(str3);
        if (a(str) && a(str2) && !a(str3)) {
            return false;
        }
        if (str2.equals(str3)) {
            return true;
        }
        if (!str.startsWith(str3) && !str3.startsWith(str)) {
            return false;
        }
        if (a(str2) || ((!str.startsWith(str2) && !str2.startsWith(str)) || Math.abs(str.length() - str3.length()) < Math.abs(str.length() - str2.length()))) {
            return true;
        }
        return false;
    }

    private static boolean a(String str) {
        return ((String) fay.a(str)).isEmpty();
    }
}
