package defpackage;

/* renamed from: hut reason: default package */
public final class hut {
    public static String a(hcm hcm) {
        hcr target = hcm.target();
        if (target != null) {
            return target.uri();
        }
        return null;
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

    public static String b(hcm hcm) {
        hcp main = hcm.images().main();
        hcl images = hcm.images();
        hcp background = main == null ? images.background() : images.main();
        if (background == null) {
            return null;
        }
        return a(background.uri());
    }
}
