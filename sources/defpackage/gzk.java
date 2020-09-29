package defpackage;

/* renamed from: gzk reason: default package */
public final class gzk {
    public static CharSequence a(hcm hcm) {
        return a(hcm.text().title(), hcm.custom().boolValue("glue:titleAsHtml", false));
    }

    static CharSequence a(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        return (!z || fbo.a(str)) ? str : jug.a(str);
    }

    public static CharSequence b(hcm hcm) {
        return a(hcm.text().subtitle(), hcm.custom().boolValue("glue:subtitleAsHtml", false));
    }

    public static CharSequence c(hcm hcm) {
        return a(hcm.text().description(), hcm.custom().boolValue("glue:descriptionAsHtml", false));
    }

    public static boolean d(hcm hcm) {
        return fbn.a(hcm.custom().string("glue:subtitleStyle", ""), "metadata");
    }

    public static boolean e(hcm hcm) {
        hco text = hcm.text();
        return (text.title() == null || (text.subtitle() == null && text.accessory() == null && text.description() == null)) ? false : true;
    }
}
