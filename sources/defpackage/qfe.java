package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qfe reason: default package */
public final class qfe {
    private static final juc a = ((juc) fay.a(jud.a(LinkType.SHOW_SHOW)));
    private static final juc b = ((juc) fay.a(jud.a(LinkType.SHOW_EPISODE)));
    private static final juc c = ((juc) fay.a(jud.a(LinkType.SHOW_PODCAST)));
    private static final juc d = ((juc) fay.a(jud.a(LinkType.PODCAST_EPISODE)));
    private static final juc e = ((juc) fay.a(jud.a(LinkType.VIDEO_EPISODE)));
    private static final juc f = ((juc) fay.a(jud.a(LinkType.SHOW_VIDEO)));
    private static final juc g = ((juc) fay.a(jud.a(LinkType.HOME_ROOT)));

    private static boolean c(String str) {
        return c.a(str) || f.a(str) || d.a(str) || e.a(str);
    }

    public static String a(String str) {
        if (c(str)) {
            return a(a, str);
        }
        Assertion.a(String.format("Unexpected uri:%s", new Object[]{str}));
        return g.toString();
    }

    public static String b(String str) {
        if (c(str)) {
            return a(b, str);
        }
        Assertion.a(String.format("Unexpected uri:%s", new Object[]{str}));
        return g.toString();
    }

    public static String a(String str, MediaType mediaType) {
        if (a.a(str)) {
            if (mediaType == MediaType.VIDEO) {
                return a(LinkType.SHOW_VIDEO, str);
            }
            return a(LinkType.SHOW_PODCAST, str);
        } else if (!b.a(str)) {
            Assertion.a(String.format("Unexpected uri:%s", new Object[]{str}));
            return g.toString();
        } else if (mediaType == MediaType.VIDEO) {
            return a(LinkType.VIDEO_EPISODE, str);
        } else {
            return a(LinkType.PODCAST_EPISODE, str);
        }
    }

    private static String a(LinkType linkType, String str) {
        juc juc = (juc) fay.a(jud.a(linkType));
        String[] split = juc.d.split(str);
        String[] split2 = ((String) juc.a.get(0)).split(":");
        String str2 = split[2];
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < split2.length - 1; i++) {
            sb.append(split2[i]);
            sb.append(':');
        }
        sb.append(str2);
        return sb.toString();
    }

    private static String a(juc juc, String str) {
        String[] split = juc.d.split(str);
        String str2 = split[split.length - 1];
        String[] split2 = ((String) juc.a.get(0)).split(":");
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < split2.length - 1; i++) {
            sb.append(split2[i]);
            sb.append(':');
        }
        sb.append(str2);
        return sb.toString();
    }
}
