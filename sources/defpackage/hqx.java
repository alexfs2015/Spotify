package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hqx reason: default package */
public interface hqx {
    public static final Uri a = Uri.parse("https://car-prod.scdn.co/waze/empty-playlist-cover.png");

    /* renamed from: hqx$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Uri a(LinkType linkType, String str, hpg hpg) {
            if (LinkType.COLLECTION_ROOT == linkType) {
                return hqx.a;
            }
            if (str == null || !str.startsWith("https://i.scdn.co/image/")) {
                return hpg.a(str);
            }
            return Uri.parse(str);
        }

        public static Map<String, String> a(jro jro, SimpleDateFormat simpleDateFormat, jrf jrf) {
            HashMap hashMap = new HashMap(10);
            String str = "50";
            hashMap.put("limit", str);
            hashMap.put("page", str);
            hashMap.put("per_page", str);
            hashMap.put("locale", SpotifyLocale.a());
            hashMap.put("platform", "android");
            hashMap.put("version", jro.a());
            hashMap.put("dt", simpleDateFormat.format(new Date(System.currentTimeMillis())));
            String str2 = "1";
            hashMap.put("suppress404", str2);
            hashMap.put("suppress_response_codes", str2);
            return hashMap;
        }

        public static Optional<hpa> a(gzt gzt, hpg hpg, ActionType actionType) {
            String a = hsb.a(gzt);
            if (a == null) {
                return Optional.e();
            }
            Uri a2 = a(jst.a(a).b, hsb.b(gzt), hpg);
            hpa hpa = new hpa(a);
            hpa.b = gzt.text().title();
            hpa.d = a2;
            hpa.a = actionType;
            return Optional.b(hpa);
        }
    }

    Single<List<MediaBrowserItem>> a(hnd hnd, String str);
}
