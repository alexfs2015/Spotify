package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;

/* renamed from: gxs reason: default package */
public final class gxs {
    public static gzw a(gzw gzw, String str) {
        return gzw.toBuilder().b(a(str).mSetting).a((Enum<?>) b(str)).a();
    }

    public static Style a(String str) {
        switch (jst.a(str).b) {
            case ARTIST:
            case COLLECTION_ARTIST:
            case PROFILE:
                return Style.CIRCULAR;
            case RADIO_ARTIST:
                return Style.CIRCULAR_WITH_RIPPLE;
            case RADIO_ALBUM:
            case RADIO_PLAYLIST:
            case STATION_PLAYLIST_V2:
            case RADIO_TRACK:
                return Style.SQUARE_WITH_RIPPLE;
            default:
                return Style.DEFAULT;
        }
    }

    public static SpotifyIconV2 b(String str) {
        int i = AnonymousClass1.a[jst.a(str).b.ordinal()];
        if (i == 1 || i == 2) {
            return SpotifyIconV2.ARTIST;
        }
        if (i == 3) {
            return SpotifyIconV2.USER;
        }
        switch (i) {
            case 9:
                return SpotifyIconV2.ALBUM;
            case 10:
            case 11:
                return SpotifyIconV2.PLAYLIST;
            case 12:
            case 13:
                return SpotifyIconV2.PLAY;
            case 14:
                return SpotifyIconV2.TRACK;
            case 15:
                return SpotifyIconV2.RADIO;
            case 16:
                return SpotifyIconV2.BROWSE;
            default:
                return SpotifyIconV2.TRACK;
        }
    }
}
