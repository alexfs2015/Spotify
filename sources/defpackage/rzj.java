package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: rzj reason: default package */
public final class rzj {
    public static String a(gzz gzz) {
        return a(gzz, "searchTerm", "");
    }

    public static String b(gzz gzz) {
        return a(gzz, "requestId", "");
    }

    public static String a(gzz gzz, String str, String str2) {
        return ((gzz) fay.a(gzz)).custom().string(str, str2);
    }

    public static boolean a(gzz gzz, String str) {
        if (!gyi.a(gzz) || gzz.overlays().isEmpty() || !str.equals(f((gzt) gzz.overlays().get(0)))) {
            return false;
        }
        return true;
    }

    private static String f(gzt gzt) {
        return ((gzt) fay.a(gzt)).custom().string("tag");
    }

    public static boolean a(gzt gzt) {
        String id = ((gzt) fay.a(gzt)).id();
        if (id != null) {
            return id.startsWith("offline-results");
        }
        return false;
    }

    public static String c(gzz gzz) {
        String title = ((gzz) fay.a(gzz)).title();
        return fax.a(title) ? "" : (String) fay.a(title);
    }

    public static int d(gzz gzz) {
        return ((gzz) fay.a(gzz)).custom().intValue("lastOffset", 0);
    }

    public static int b(gzt gzt) {
        return ((gzt) fay.a(gzt)).logging().intValue("ui:index_in_block").intValue();
    }

    public static String c(gzt gzt) {
        return ((gzt) fay.a(gzt)).logging().string("ui:group");
    }

    public static String d(gzt gzt) {
        return ((gzt) fay.a(gzt)).logging().string("ui:source", "");
    }

    public static String e(gzt gzt) {
        return ((gzt) fay.a(gzt)).metadata().string(SearchHistoryItem.SEARCH_HISTORY_TRACK_PREVIEW_ID);
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (str == null) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((String) jtc.a(str2, str3));
        return sb.toString();
    }

    public static gzq a(String str) {
        return HubsImmutableComponentBundle.builder().a("searchTerm", str).a();
    }

    public static gzq b(String str) {
        return HubsImmutableComponentBundle.builder().a("trackUri", str).a();
    }
}
