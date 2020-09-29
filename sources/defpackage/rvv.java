package defpackage;

/* renamed from: rvv reason: default package */
final class rvv {
    boolean a;

    rvv() {
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
