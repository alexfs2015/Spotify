package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qoh reason: default package */
public final class qoh {
    private static final jwk a = ((jwk) fbp.a(jwl.a(LinkType.SHOW_SHOW)));
    private static final jwk b = ((jwk) fbp.a(jwl.a(LinkType.SHOW_EPISODE)));
    private static final jwk c = ((jwk) fbp.a(jwl.a(LinkType.SHOW_PODCAST)));
    private static final jwk d = ((jwk) fbp.a(jwl.a(LinkType.PODCAST_EPISODE)));
    private static final jwk e = ((jwk) fbp.a(jwl.a(LinkType.VIDEO_EPISODE)));
    private static final jwk f = ((jwk) fbp.a(jwl.a(LinkType.SHOW_VIDEO)));
    private static final jwk g = ((jwk) fbp.a(jwl.a(LinkType.HOME_ROOT)));

    private static String a(LinkType linkType, String str) {
        jwk jwk = (jwk) fbp.a(jwl.a(linkType));
        String[] split = jwk.d.split(str);
        String[] split2 = ((String) jwk.a.get(0)).split(":");
        String str2 = split[2];
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < split2.length - 1; i++) {
            sb.append(split2[i]);
            sb.append(':');
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String a(String str) {
        if (c(str)) {
            return a(a, str);
        }
        Assertion.a(String.format("Unexpected uri:%s", new Object[]{str}));
        return g.toString();
    }

    public static String a(String str, MediaType mediaType) {
        if (a.a(str)) {
            return mediaType == MediaType.VIDEO ? a(LinkType.SHOW_VIDEO, str) : a(LinkType.SHOW_PODCAST, str);
        }
        if (b.a(str)) {
            return mediaType == MediaType.VIDEO ? a(LinkType.VIDEO_EPISODE, str) : a(LinkType.PODCAST_EPISODE, str);
        }
        Assertion.a(String.format("Unexpected uri:%s", new Object[]{str}));
        return g.toString();
    }

    private static String a(jwk jwk, String str) {
        String[] split = jwk.d.split(str);
        String str2 = split[split.length - 1];
        String[] split2 = ((String) jwk.a.get(0)).split(":");
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < split2.length - 1; i++) {
            sb.append(split2[i]);
            sb.append(':');
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String b(String str) {
        if (c(str)) {
            return a(b, str);
        }
        Assertion.a(String.format("Unexpected uri:%s", new Object[]{str}));
        return g.toString();
    }

    private static boolean c(String str) {
        return c.a(str) || f.a(str) || d.a(str) || e.a(str);
    }
}
