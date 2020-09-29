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

/* renamed from: uhq reason: default package */
public final class uhq {
    private static final Pattern a = Pattern.compile("radio:", 16);

    public static Uri a(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("content://");
        sb2.append(a());
        sb.append(Uri.parse(sb2.toString()));
        sb.append("/radio/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    private static String a() {
        return ((jro) ggw.a(jro.class)).d();
    }

    public static String a(Uri uri) {
        fay.a(uri);
        if (!a().equals(uri.getAuthority())) {
            return null;
        }
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2 && ((String) pathSegments.get(0)).equals("radio")) {
            return uri.getEncodedPath().substring(7);
        }
        return null;
    }

    public static String b(String str) {
        return c(str);
    }

    @Deprecated
    public static String c(String str) {
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

    public static String d(String str) {
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

    public static String e(String str) {
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

    public static boolean f(String str) {
        return str != null && str.startsWith("spotify:radio:");
    }

    public static boolean g(String str) {
        return str != null && (str.startsWith("spotify:station:") || ViewUris.an.b(str));
    }

    public static boolean h(String str) {
        return g(str) && !j(str);
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

    public static PlayerTrack a(PlayerTrack playerTrack, ThumbState thumbState) {
        HashMap hashMap = new HashMap(playerTrack.metadata());
        hashMap.put(Metadata.TRACK_RADIO_THUMB_STATE, thumbState.mPlayerValue);
        PlayerTrack playerTrack2 = new PlayerTrack(playerTrack.uri(), playerTrack.uid(), (String) playerTrack.metadata().get("album_uri"), (String) playerTrack.metadata().get("artist_uri"), playerTrack.provider(), hashMap);
        return playerTrack2;
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

    public static boolean a(fpt fpt) {
        return !((Boolean) fpt.a(ufx.a)).booleanValue();
    }

    public static boolean a(fpt fpt, String str) {
        if (a(fpt)) {
            return true;
        }
        if (fpt.b(ufx.e)) {
            if (jst.a(str, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                return true;
            }
        }
        if (str != null) {
            if (jst.a(str, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                String a2 = gbh.a(jrl.a(jst.a(jst.a(str).q()).b()));
                if (a2.startsWith("666f726d6174f117") || a2.startsWith("666f726d6174f123")) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        return a.matcher(str).replaceAll("");
    }

    public static boolean j(String str) {
        return ViewUris.al.b(str) || ViewUris.an.b(str);
    }

    public static String[] a(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i].substring(14);
        }
        return strArr2;
    }

    public static String k(String str) {
        jst a2 = jst.a(str);
        if (AnonymousClass1.a[a2.b.ordinal()] != 7) {
            return "";
        }
        return jsd.b(a2.b(), Locale.getDefault());
    }

    public static String a(Context context, jst jst) {
        LinkType linkType = jst.b;
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

    public static int a(jst jst) {
        switch (jst.b) {
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
}
