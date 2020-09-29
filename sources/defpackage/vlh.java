package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import com.spotify.playlist.models.Show.MediaType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vlh reason: default package */
public final class vlh {
    private static final ImmutableMap<String, ConsumptionOrder> a = ImmutableMap.a("episodic", ConsumptionOrder.EPISODIC, "sequential", ConsumptionOrder.SEQUENTIAL, "recent", ConsumptionOrder.RECENT);
    private static final ImmutableMap<Integer, MediaType> b = ImmutableMap.a(Integer.valueOf(0), MediaType.MIXED, Integer.valueOf(1), MediaType.AUDIO, Integer.valueOf(2), MediaType.VIDEO);

    public static ConsumptionOrder a(String str) {
        return (ConsumptionOrder) jvi.a(a.get(str), ConsumptionOrder.UNKNOWN);
    }

    public static MediaType a(int i) {
        return (MediaType) jvi.a(b.get(Integer.valueOf(i)), MediaType.UNKNOWN);
    }

    public static String a(Covers covers, Size size) {
        String xlargeUri = covers.getXlargeUri();
        if (size == Size.XLARGE && !fbo.a(xlargeUri)) {
            return xlargeUri;
        }
        String largeUri = covers.getLargeUri();
        if ((size == Size.LARGE || size == Size.XLARGE) && !fbo.a(largeUri)) {
            return largeUri;
        }
        String smallUri = covers.getSmallUri();
        return (size != Size.SMALL || fbo.a(smallUri)) ? covers.getUri() : smallUri;
    }

    public static String a(Covers covers, Covers covers2, Show show, Size size) {
        String str = "";
        String imageUri = covers != null ? covers.getImageUri(size) : str;
        if (imageUri.length() == 0) {
            imageUri = covers2 != null ? covers2.getImageUri(size) : str;
        }
        if (imageUri.length() != 0 || show == null) {
            return imageUri;
        }
        Covers b2 = show.b();
        if (b2 != null) {
            str = b2.getImageUri(size);
        }
        return str;
    }

    public static Map<String, String> a(Covers covers, Covers covers2, String str, String str2, Show show, MediaType mediaType) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        Covers covers3 = covers;
        Covers covers4 = covers2;
        Show show2 = show;
        a((Map<String, String>) hashMap2, "image_url", Size.NORMAL, covers3, covers4, show2);
        a((Map<String, String>) hashMap2, "image_small_url", Size.SMALL, covers3, covers4, show2);
        a((Map<String, String>) hashMap2, "image_large_url", Size.LARGE, covers3, covers4, show2);
        a((Map<String, String>) hashMap2, "image_xlarge_url", Size.XLARGE, covers3, covers4, show2);
        if (!fbo.a(str)) {
            hashMap.put("title", str);
        }
        String str3 = "media.type";
        if (mediaType != MediaType.AUDIO) {
            hashMap.put(str3, "video");
            hashMap.put("media.manifest_id", str2);
        } else {
            hashMap.put(str3, "audio");
        }
        if (show != null && !fbo.a(show.a())) {
            hashMap.put("artist_name", show.a());
        }
        return hashMap;
    }

    private static void a(Map<String, String> map, String str, Size size, Covers covers, Covers covers2, Show show) {
        String a2 = a(covers, covers2, show, size);
        if (!fbo.a(a2)) {
            map.put(str, a2);
        }
    }

    public static boolean a(vle vle) {
        vlf b2 = vle.b();
        vkv a2 = vle.a();
        return (b2 != null && b2.isExplicit()) || (a2 != null && a2.i());
    }
}
