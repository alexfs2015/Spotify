package defpackage;

/* renamed from: hsb reason: default package */
public final class hsb {
    public static String a(gzt gzt) {
        gzy target = gzt.target();
        if (target != null) {
            return target.uri();
        }
        return null;
    }

    public static String b(gzt gzt) {
        gzw main = gzt.images().main();
        gzs images = gzt.images();
        gzw background = main == null ? images.background() : images.main();
        if (background == null) {
            return null;
        }
        return a(background.uri());
    }

    public static String a(String str) {
        if (str == null) {
            return str;
        }
        String str2 = "spotify:image:";
        if (str.startsWith(str2) || str.startsWith("spotify:mosaic:") || str.startsWith("spotify:dailymix:") || str.startsWith("https")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str2);
        sb.append(str);
        return sb.toString();
    }
}
