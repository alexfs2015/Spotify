package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: hrx reason: default package */
public final class hrx {
    private static Uri a = Uri.parse("https://car-prod.scdn.co/waze/empty-playlist-cover.png");

    public static MediaBrowserItem a(hsf hsf, Uri uri, Context context) {
        hpa hpa = new hpa(uri);
        hpa.b = hsf.b();
        hpa.a = ActionType.BROWSABLE;
        hpa.d = gbf.a(context, R.drawable.mediaservice_browse);
        return hpa.b();
    }

    public static MediaBrowserItem a(hsa hsa, Uri uri) {
        Bundle bundle = new gox().b(1).a(2).a;
        String str = hsa.a == null ? "" : hsa.a;
        hpa hpa = new hpa(uri);
        hpa.b = hsa.b();
        hpa a2 = hpa.a(bundle);
        a2.a = ActionType.BROWSABLE;
        a2.d = Uri.parse(str);
        return a2.b();
    }

    public static MediaBrowserItem a(hsd hsd, String str, hpg hpg) {
        Uri uri;
        Uri uri2;
        LinkType linkType = jst.a(hsd.a).b;
        switch (linkType) {
            case ALBUM:
            case ARTIST:
            case COLLECTION_ALBUM:
            case COLLECTION_ARTIST:
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
            case SHOW_SHOW:
                uri = Uri.parse(hsd.a);
                break;
            case COLLECTION_TRACKS:
            case COLLECTION_ROOT:
                String h = jst.g(str).h();
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
                uri = uhq.a(uhq.e(hsd.a));
                break;
            default:
                uri = Uri.EMPTY;
                break;
        }
        if (uri != Uri.EMPTY) {
            String str2 = hsd.d;
            if (LinkType.COLLECTION_ROOT == linkType) {
                uri2 = a;
            } else if (str2 == null || !str2.startsWith("https://i.scdn.co/image/")) {
                uri2 = hpg.a(str2);
            } else {
                uri2 = Uri.parse(str2);
            }
            Bundle bundle = new gox().a(hsd.c).a;
            hpa hpa = new hpa(uri);
            hpa.b = hsd.b;
            hpa.d = uri2;
            hpa.a = ActionType.PLAYABLE;
            return hpa.a(bundle).b();
        }
        throw new RecoverableAssertionError(String.format("Couldn't create a playable uri from the playlistUri = %s, linkType = %s", new Object[]{hsd.a, linkType}));
    }
}
