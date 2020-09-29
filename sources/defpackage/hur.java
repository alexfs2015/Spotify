package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: hur reason: default package */
public final class hur {
    private static Uri a = Uri.parse("https://car-prod.scdn.co/waze/empty-playlist-cover.png");

    public static MediaBrowserItem a(huv huv, String str, hre hre, jty jty) {
        Uri uri;
        LinkType linkType = jva.a(huv.a).b;
        switch (linkType) {
            case ALBUM:
            case ARTIST:
            case COLLECTION_ALBUM:
            case COLLECTION_ARTIST:
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
            case SHOW_SHOW:
                uri = Uri.parse(huv.a);
                break;
            case COLLECTION_TRACKS:
            case COLLECTION_ROOT:
                String h = jva.g(str).h();
                if (h == null) {
                    uri = Uri.EMPTY;
                    break;
                } else {
                    uri = Uri.parse(h);
                    break;
                }
            case RADIO_ALBUM:
            case RADIO_ARTIST:
            case RADIO_GENRE:
            case RADIO_PLAYLIST:
            case STATION_PLAYLIST_V2:
            case RADIO_TRACK:
            case STATION:
            case ALBUM_RADIO:
            case ARTIST_RADIO:
            case COLLECTION_RADIO:
            case GENRE_RADIO:
            case PLAYLIST_RADIO:
            case TRACK_RADIO:
            case USER_PLAYLIST_RADIO:
            case STATION_CLUSTER:
            case DAILYMIX:
                uri = ute.a(ute.d(huv.a), jty);
                break;
            default:
                uri = Uri.EMPTY;
                break;
        }
        if (uri != Uri.EMPTY) {
            String str2 = huv.d;
            Uri uri2 = LinkType.COLLECTION_ROOT == linkType ? a : (str2 == null || !str2.startsWith("https://i.scdn.co/image/")) ? hre.a(str2) : Uri.parse(str2);
            Bundle bundle = new gqn().a(huv.c).a;
            hup hup = new hup(uri);
            hup.b = huv.b;
            hup.d = uri2;
            hup.e = uri;
            hup.a = ActionType.PLAYABLE;
            return hup.a(bundle).b();
        }
        throw new RecoverableAssertionError(String.format("Couldn't create a playable uri from the playlistUri = %s, linkType = %s", new Object[]{huv.a, linkType}));
    }

    public static MediaBrowserItem a(hux hux, Uri uri, Context context) {
        hup hup = new hup(uri);
        hup.b = hux.a();
        hup.a = ActionType.BROWSABLE;
        hup.d = gcd.a(context, R.drawable.mediaservice_browse);
        return hup.b();
    }
}
