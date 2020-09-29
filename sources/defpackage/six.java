package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: six reason: default package */
public final class six {
    public static hcj a(String str) {
        return HubsImmutableComponentBundle.builder().a("searchTerm", str).a();
    }

    public static String a(hcs hcs) {
        return a(hcs, "searchTerm", "");
    }

    public static String a(hcs hcs, String str, String str2) {
        return ((hcs) fbp.a(hcs)).custom().string(str, str2);
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (str == null) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((String) jvi.a(str2, str3));
        return sb.toString();
    }

    public static boolean a(hcm hcm) {
        String id = ((hcm) fbp.a(hcm)).id();
        if (id != null) {
            return id.startsWith("offline-results");
        }
        return false;
    }

    public static boolean a(hcs hcs, String str) {
        return hbb.a(hcs) && !hcs.overlays().isEmpty() && str.equals(f((hcm) hcs.overlays().get(0)));
    }

    public static int b(hcm hcm) {
        return ((hcm) fbp.a(hcm)).logging().intValue("ui:index_in_block").intValue();
    }

    public static hcj b(String str) {
        return HubsImmutableComponentBundle.builder().a("trackUri", str).a();
    }

    public static String b(hcs hcs) {
        return a(hcs, "requestId", "");
    }

    public static String c(hcm hcm) {
        return ((hcm) fbp.a(hcm)).logging().string("ui:group");
    }

    public static String c(hcs hcs) {
        String title = ((hcs) fbp.a(hcs)).title();
        return fbo.a(title) ? "" : (String) fbp.a(title);
    }

    public static int d(hcs hcs) {
        return ((hcs) fbp.a(hcs)).custom().intValue("lastOffset", 0);
    }

    public static String d(hcm hcm) {
        return ((hcm) fbp.a(hcm)).logging().string("ui:source", "");
    }

    public static String e(hcm hcm) {
        return ((hcm) fbp.a(hcm)).metadata().string(SearchHistoryItem.SEARCH_HISTORY_TRACK_PREVIEW_ID);
    }

    private static String f(hcm hcm) {
        return ((hcm) fbp.a(hcm)).custom().string("tag");
    }
}
