package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: ute reason: default package */
public final class ute {
    private static final Pattern a = Pattern.compile("radio:", 16);

    public static int a(jva jva) {
        switch (jva.b) {
            case ALBUM:
                return R.string.context_menu_go_to_album_radio;
            case ARTIST:
                return R.string.context_menu_go_to_artist_radio;
            case BROWSE_GENRES:
                return R.string.context_menu_go_to_genre_radio;
            case PLAYLIST_V2:
            case PROFILE_PLAYLIST:
                return R.string.context_menu_go_to_playlist_radio;
            case TRACK:
                return R.string.context_menu_go_to_song_radio;
            default:
                return R.string.context_menu_go_to_radio;
        }
    }

    public static Uri a(String str, jty jty) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("content://");
        sb2.append(jty.d());
        sb.append(Uri.parse(sb2.toString()));
        sb.append("/radio/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    public static PlayerTrack a(PlayerTrack playerTrack, ThumbState thumbState) {
        HashMap hashMap = new HashMap(playerTrack.metadata());
        hashMap.put(Metadata.TRACK_RADIO_THUMB_STATE, thumbState.mPlayerValue);
        PlayerTrack playerTrack2 = new PlayerTrack(playerTrack.uri(), playerTrack.uid(), (String) playerTrack.metadata().get("album_uri"), (String) playerTrack.metadata().get("artist_uri"), playerTrack.provider(), hashMap);
        return playerTrack2;
    }

    public static RadioStationModel a(RadioStationModel radioStationModel, boolean z) {
        if (radioStationModel.explicitSave == z) {
            return radioStationModel;
        }
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, z);
        return radioStationModel2;
    }

    public static ThumbState a(PlayerTrack playerTrack) {
        return ThumbState.a((String) playerTrack.metadata().get(Metadata.TRACK_RADIO_THUMB_STATE));
    }

    public static String a(Context context, jva jva) {
        LinkType linkType = jva.b;
        Resources resources = context.getResources();
        switch (linkType) {
            case ALBUM:
                return resources.getString(R.string.radio_section_your_stations_album_subtitle);
            case ARTIST:
                return resources.getString(R.string.radio_section_your_stations_artist_subtitle);
            case BROWSE_GENRES:
                return resources.getString(R.string.radio_section_your_stations_genre_subtitle);
            case PLAYLIST_V2:
            case PROFILE_PLAYLIST:
                return resources.getString(R.string.radio_section_your_stations_playlist_subtitle);
            case TRACK:
                return resources.getString(R.string.radio_section_your_stations_song_subtitle);
            default:
                return " ";
        }
    }

    public static String a(Uri uri, jty jty) {
        fbp.a(uri);
        if (!jty.d().equals(uri.getAuthority())) {
            return null;
        }
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2 && ((String) pathSegments.get(0)).equals("radio")) {
            return uri.getEncodedPath().substring(7);
        }
        return null;
    }

    public static String a(String str) {
        return b(str);
    }

    public static String a(String str, PlayerTrack[] playerTrackArr) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return str;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PlayerTrack uri : playerTrackArr) {
            linkedHashSet.add(uri.uri().substring(14));
        }
        Iterator it = linkedHashSet.iterator();
        while (linkedHashSet.size() > 40 && it.hasNext()) {
            it.next();
            it.remove();
        }
        String substring = str.substring(0, indexOf);
        String queryParameter = Uri.parse(str).getQueryParameter("salt");
        String join = TextUtils.join(",", linkedHashSet);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(queryParameter)) {
            StringBuilder sb = new StringBuilder("salt=");
            sb.append(queryParameter);
            arrayList.add(sb.toString());
        }
        if (!TextUtils.isEmpty(join)) {
            StringBuilder sb2 = new StringBuilder("prev_tracks=");
            sb2.append(join);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(substring);
        if (arrayList.size() > 0) {
            sb3.append('?');
            sb3.append(TextUtils.join("&", arrayList));
        }
        return sb3.toString();
    }

    public static String a(String str, PlayerTrack[] playerTrackArr, long j) {
        String a2 = a(str, playerTrackArr);
        if (a2 == null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder(a2);
        sb.append("&time=");
        sb.append(j);
        return sb.toString();
    }

    public static boolean a(fqn fqn) {
        return !((Boolean) fqn.a(url.a)).booleanValue();
    }

    public static boolean a(fqn fqn, String str) {
        if (a(fqn)) {
            return true;
        }
        if (fqn.b(url.e)) {
            if (jva.a(str, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                return true;
            }
        }
        if (str != null) {
            if (jva.a(str, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                String a2 = gcf.a(jtv.a(jva.a(jva.a(str).q()).b()));
                return a2.startsWith("666f726d6174f117") || a2.startsWith("666f726d6174f123");
            }
        }
        return false;
    }

    public static String[] a(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i].substring(14);
        }
        return strArr2;
    }

    @Deprecated
    public static String b(String str) {
        if (str == null || !str.startsWith("spotify:")) {
            return null;
        }
        String str2 = "spotify:station:";
        if (!str.startsWith(str2) && !str.startsWith("spotify:dailymix:")) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str.substring(8));
            str = sb.toString();
        }
        return str;
    }

    public static String c(String str) {
        if (str != null) {
            String str2 = "spotify:";
            if (str.startsWith("spotify:station:")) {
                if (str.contains("cluster:")) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str2);
                sb.append(str.substring(16));
                return sb.toString();
            } else if (str.startsWith("spotify:radio:")) {
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(str.substring(14));
                return sb2.toString();
            } else if (str.startsWith(str2)) {
                return str;
            }
        }
        return null;
    }

    public static String d(String str) {
        if (str != null) {
            if (str.startsWith("spotify:station:")) {
                StringBuilder sb = new StringBuilder("spotify:");
                sb.append(str.substring(16));
                return sb.toString();
            } else if (str.startsWith("spotify:dailymix")) {
                return str;
            }
        }
        return null;
    }

    public static boolean e(String str) {
        return str != null && str.startsWith("spotify:radio:");
    }

    public static boolean f(String str) {
        return str != null && (str.startsWith("spotify:station:") || ViewUris.am.b(str));
    }

    public static boolean g(String str) {
        return f(str) && !i(str);
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        return a.matcher(str).replaceAll("");
    }

    public static boolean i(String str) {
        return ViewUris.ak.b(str) || ViewUris.am.b(str);
    }

    public static String j(String str) {
        jva a2 = jva.a(str);
        return AnonymousClass1.a[a2.b.ordinal()] != 7 ? "" : jun.b(a2.b(), Locale.getDefault());
    }
}
