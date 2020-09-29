package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: jvb reason: default package */
public final class jvb {
    public static boolean a(LinkType linkType) {
        switch (linkType) {
            case COLLECTION_ALBUM:
            case COLLECTION_ALBUM_OVERVIEW:
            case COLLECTION_PLAYLIST_FOLDER:
            case COLLECTION_ROOT:
            case COLLECTION_ROOTLIST:
            case COLLECTION_TRACKS:
            case COLLECTION_ARTIST:
            case COLLECTION_ARTIST_OVERVIEW:
            case COLLECTION_PODCASTS:
            case COLLECTION_PODCASTS_DOWNLOADS:
            case COLLECTION_PODCASTS_EPISODES:
            case COLLECTION_PODCASTS_FOLLOWING:
                return true;
            default:
                return false;
        }
    }

    public static boolean a(jva jva) {
        switch (jva.b) {
            case RADIO_ALBUM:
            case RADIO_ARTIST:
            case RADIO_GENRE:
            case RADIO_PLAYLIST:
            case RADIO_TRACK:
            case ALBUM_RADIO:
            case ARTIST_RADIO:
            case COLLECTION_RADIO:
            case GENRE_RADIO:
            case PLAYLIST_RADIO:
            case TRACK_RADIO:
            case USER_PLAYLIST_RADIO:
            case STATION:
            case STATION_CLUSTER:
            case STATION_PLAYLIST_V2:
            case DAILYMIX:
                return true;
            default:
                return false;
        }
    }

    public static boolean b(jva jva) {
        return a(jva.b);
    }
}
