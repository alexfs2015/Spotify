package defpackage;

/* renamed from: lpa reason: default package */
public final class lpa {
    public static boolean a(hcm hcm) {
        return hcm.metadata().boolValue("explicit", false);
    }

    public static boolean b(hcm hcm) {
        return hcm.custom().string("label", "").contains("explicit");
    }
}
