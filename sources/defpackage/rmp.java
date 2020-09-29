package defpackage;

/* renamed from: rmp reason: default package */
final class rmp {
    boolean a;

    rmp() {
    }

    static boolean a(String[] strArr, String str) {
        for (String startsWith : strArr) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }
}
