package defpackage;

/* renamed from: gwz reason: default package */
public final class gwz {
    public static CharSequence a(gzt gzt) {
        return a(gzt.text().title(), gzt.custom().boolValue("glue:titleAsHtml", false));
    }

    public static CharSequence b(gzt gzt) {
        return a(gzt.text().subtitle(), gzt.custom().boolValue("glue:subtitleAsHtml", false));
    }

    public static CharSequence c(gzt gzt) {
        return a(gzt.text().description(), gzt.custom().boolValue("glue:descriptionAsHtml", false));
    }

    public static boolean d(gzt gzt) {
        return faw.a(gzt.custom().string("glue:subtitleStyle", ""), "metadata");
    }

    public static boolean e(gzt gzt) {
        gzv text = gzt.text();
        return (text.title() == null || (text.subtitle() == null && text.accessory() == null && text.description() == null)) ? false : true;
    }

    static CharSequence a(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        return (!z || fax.a(str)) ? str : jrw.a(str);
    }
}
