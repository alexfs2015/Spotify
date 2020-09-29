package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: sjy reason: default package */
public final class sjy {
    private final sjv a;

    public sjy(sjv sjv) {
        this.a = sjv;
    }

    public final boolean a(String str, String str2) {
        return a(this.a, str2, str) || b(this.a, str2, str);
    }

    public final boolean b(String str, String str2) {
        return d(this.a, str2, str) || c(this.a, str2, str);
    }

    private static boolean a(sjv sjv, String str, String str2) {
        return sjv.c() && "playback".equals(str) && a(str2);
    }

    private static boolean b(sjv sjv, String str, String str2) {
        return (sjv.a() || sjv.b()) && "popup_close".equals(str) && (ViewUris.u.b(str2) || jst.a(str2, LinkType.TRACK_AUTOPLAY));
    }

    private static boolean c(sjv sjv, String str, String str2) {
        return sjv.c() && c(str, str2);
    }

    private static boolean d(sjv sjv, String str, String str2) {
        return (sjv.a() || sjv.b()) && "popup".equals(str) && ViewUris.u.b(str2);
    }

    private static boolean c(String str, String str2) {
        return "entity".equals(str) && (ViewUris.aK.b(str2) || ViewUris.u.b(str2) || ViewUris.aJ.b(str2) || ViewUris.aB.b(str2));
    }

    private static boolean a(String str) {
        return jst.a(str, LinkType.ARTIST_AUTOPLAY) || jst.a(str, LinkType.TRACK_AUTOPLAY) || jst.a(str, LinkType.ALBUM_AUTOPLAY) || jst.a(str, LinkType.PLAYLIST_AUTOPLAY) || jst.a(str, LinkType.PLAYLIST_V2_AUTOPLAY);
    }
}
