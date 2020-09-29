package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: suf reason: default package */
public final class suf {
    private final suc a;

    public suf(suc suc) {
        this.a = suc;
    }

    private static boolean a(String str) {
        return jva.a(str, LinkType.ARTIST_AUTOPLAY) || jva.a(str, LinkType.TRACK_AUTOPLAY) || jva.a(str, LinkType.ALBUM_AUTOPLAY) || jva.a(str, LinkType.PLAYLIST_AUTOPLAY) || jva.a(str, LinkType.PLAYLIST_V2_AUTOPLAY);
    }

    private static boolean a(suc suc, String str, String str2) {
        return suc.c() && "playback".equals(str) && a(str2);
    }

    private static boolean b(suc suc, String str, String str2) {
        return (suc.a() || suc.b()) && "popup_close".equals(str) && (ViewUris.t.b(str2) || jva.a(str2, LinkType.TRACK_AUTOPLAY));
    }

    private static boolean c(String str, String str2) {
        return "entity".equals(str) && (ViewUris.aJ.b(str2) || ViewUris.t.b(str2) || ViewUris.aI.b(str2) || ViewUris.aA.b(str2));
    }

    private static boolean c(suc suc, String str, String str2) {
        return suc.c() && c(str, str2);
    }

    private static boolean d(suc suc, String str, String str2) {
        return (suc.a() || suc.b()) && "popup".equals(str) && ViewUris.t.b(str2);
    }

    public final boolean a(String str, String str2) {
        return a(this.a, str2, str) || b(this.a, str2, str);
    }

    public final boolean b(String str, String str2) {
        return d(this.a, str2, str) || c(this.a, str2, str);
    }
}
