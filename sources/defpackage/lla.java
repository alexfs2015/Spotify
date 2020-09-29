package defpackage;

/* renamed from: lla reason: default package */
public final class lla {
    public static boolean a(gzt gzt) {
        return gzt.metadata().boolValue("explicit", false);
    }

    public static boolean b(gzt gzt) {
        return gzt.custom().string("label", "").contains("explicit");
    }
}
