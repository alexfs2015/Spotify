package defpackage;

/* renamed from: rzr reason: default package */
public final class rzr {
    public static long a(String str, String str2) {
        if (fbo.a(str2)) {
            return 0;
        }
        if ("inter_app".equals(str2)) {
            return 7;
        }
        if ("Bmw".equals(str)) {
            return 4;
        }
        if ("Mini".equals(str)) {
            return 3;
        }
        if ("AndroidAuto".equals(str2)) {
            return 5;
        }
        if ("AndroidWear".equals(str2)) {
            return 10;
        }
        return "AndroidOther".equals(str2) ? 999 : 0;
    }
}
