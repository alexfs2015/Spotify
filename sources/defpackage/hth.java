package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hth reason: default package */
public interface hth {
    public static final Uri a = Uri.parse("https://car-prod.scdn.co/waze/empty-playlist-cover.png");

    /* renamed from: hth$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Uri a(LinkType linkType, String str, hre hre) {
            return LinkType.COLLECTION_ROOT == linkType ? hth.a : (str == null || !str.startsWith("https://i.scdn.co/image/")) ? hre.a(str) : Uri.parse(str);
        }

        public static Optional<hup> a(hcm hcm, hre hre, ActionType actionType) {
            String a = hut.a(hcm);
            if (a == null) {
                return Optional.e();
            }
            Uri a2 = a(jva.a(a).b, hut.b(hcm), hre);
            hup hup = new hup(a);
            hup.b = hcm.text().title();
            hup.d = a2;
            hup.a = actionType;
            return Optional.b(hup);
        }

        public static Map<String, String> a(jty jty, SimpleDateFormat simpleDateFormat, jtp jtp) {
            HashMap hashMap = new HashMap(10);
            String str = "50";
            hashMap.put("limit", str);
            hashMap.put("page", str);
            hashMap.put("per_page", str);
            hashMap.put("locale", SpotifyLocale.a());
            hashMap.put("platform", "android");
            hashMap.put("version", jty.a());
            hashMap.put("dt", simpleDateFormat.format(new Date(jtp.a())));
            String str2 = "1";
            hashMap.put("suppress404", str2);
            hashMap.put("suppress_response_codes", str2);
            return hashMap;
        }
    }

    Single<List<MediaBrowserItem>> a(huo huo, boolean z);
}
