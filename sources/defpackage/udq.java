package defpackage;

import android.net.Uri.Builder;
import com.google.common.collect.Lists;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: udq reason: default package */
public final class udq {
    private static final ThreadLocal<SimpleDateFormat> a = new ThreadLocal<SimpleDateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    };

    public static Builder a(Builder builder, fpt fpt, rgz rgz, int i, jro jro) {
        String str = "locale";
        Builder appendQueryParameter = ((Builder) fay.a(builder)).appendQueryParameter("card-columns", String.valueOf(i)).appendQueryParameter(str, SpotifyLocale.a()).appendQueryParameter(PlayerProviders.MFT, String.valueOf(!((Boolean) fpt.a(guf.a)).booleanValue()));
        String a2 = jro.a();
        Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("client-version", a2).appendQueryParameter("capabilities", a(fpt));
        String format = ((SimpleDateFormat) a.get()).format(new Date());
        String str2 = "video-shows";
        Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("date-time", format).appendQueryParameter("shows", String.valueOf(iqh.a(fpt))).appendQueryParameter(str2, String.valueOf(iqh.c(fpt)));
        String a3 = a("podcast", String.valueOf(iqh.b(fpt)));
        String str3 = "signal";
        Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter(str3, a3).appendQueryParameter(str3, a("video", String.valueOf(iqh.c(fpt))));
        if (rgz.a(fpt)) {
            appendQueryParameter4.appendQueryParameter(str3, "application:nft");
        }
        return appendQueryParameter4;
    }

    public static Map<String, String> a(fpt fpt, int i, jro jro) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        linkedHashMap.put("card-columns", String.valueOf(i));
        linkedHashMap.put("locale", SpotifyLocale.a());
        linkedHashMap.put(PlayerProviders.MFT, String.valueOf(!((Boolean) fpt.a(guf.a)).booleanValue()));
        linkedHashMap.put("client-version", jro.a());
        linkedHashMap.put("capabilities", a(fpt));
        linkedHashMap.put("date-time", ((SimpleDateFormat) a.get()).format(new Date()));
        linkedHashMap.put("shows", String.valueOf(iqh.a(fpt)));
        linkedHashMap.put("video-shows", String.valueOf(iqh.c(fpt)));
        return linkedHashMap;
    }

    public static List<String> a(fpt fpt, rgz rgz) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a("podcast", String.valueOf(iqh.b(fpt))));
        arrayList.add(a("video", String.valueOf(iqh.c(fpt))));
        if (rgz.a(fpt)) {
            arrayList.add("application:nft");
        }
        return arrayList;
    }

    private static String a(String str, String str2) {
        return String.format("%s:%s", new Object[]{str, str2});
    }

    private static String a(fpt fpt) {
        ArrayList a2 = Lists.a();
        if (jzb.a(fpt)) {
            a2.add("video");
        }
        if (jzb.b(fpt)) {
            a2.add("video-drm");
        }
        return fau.a(',').a((Iterable<?>) a2);
    }
}
