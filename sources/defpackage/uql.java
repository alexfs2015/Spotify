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

/* renamed from: uql reason: default package */
public final class uql {
    private static final ThreadLocal<SimpleDateFormat> a = new ThreadLocal<SimpleDateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    };

    public static Builder a(Builder builder, fqn fqn, rqb rqb, int i, jty jty) {
        String str = "locale";
        Builder appendQueryParameter = ((Builder) fbp.a(builder)).appendQueryParameter("card-columns", String.valueOf(i)).appendQueryParameter(str, SpotifyLocale.a()).appendQueryParameter(PlayerProviders.MFT, String.valueOf(!((Boolean) fqn.a(gwf.a)).booleanValue()));
        String a2 = jty.a();
        Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("client-version", a2).appendQueryParameter("capabilities", a(fqn));
        String format = ((SimpleDateFormat) a.get()).format(new Date());
        String str2 = "video-shows";
        Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("date-time", format).appendQueryParameter("shows", String.valueOf(isu.a(fqn))).appendQueryParameter(str2, String.valueOf(isu.c(fqn)));
        String a3 = a("podcast", String.valueOf(isu.b(fqn)));
        String str3 = "signal";
        Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter(str3, a3).appendQueryParameter(str3, a("video", String.valueOf(isu.c(fqn))));
        if (rqb.a(fqn)) {
            appendQueryParameter4.appendQueryParameter(str3, "application:nft");
        }
        return appendQueryParameter4;
    }

    private static String a(fqn fqn) {
        ArrayList a2 = Lists.a();
        if (kbb.a(fqn)) {
            a2.add("video");
        }
        if (kbb.b(fqn)) {
            a2.add("video-drm");
        }
        return fbl.a(',').a((Iterable<?>) a2);
    }

    private static String a(String str, String str2) {
        return String.format("%s:%s", new Object[]{str, str2});
    }

    public static List<String> a(fqn fqn, rqb rqb) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a("podcast", String.valueOf(isu.b(fqn))));
        arrayList.add(a("video", String.valueOf(isu.c(fqn))));
        if (rqb.a(fqn)) {
            arrayList.add("application:nft");
        }
        return arrayList;
    }

    public static Map<String, String> a(fqn fqn, int i, jty jty) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        linkedHashMap.put("card-columns", String.valueOf(i));
        linkedHashMap.put("locale", SpotifyLocale.a());
        linkedHashMap.put(PlayerProviders.MFT, String.valueOf(!((Boolean) fqn.a(gwf.a)).booleanValue()));
        linkedHashMap.put("client-version", jty.a());
        linkedHashMap.put("capabilities", a(fqn));
        linkedHashMap.put("date-time", ((SimpleDateFormat) a.get()).format(new Date()));
        linkedHashMap.put("shows", String.valueOf(isu.a(fqn)));
        linkedHashMap.put("video-shows", String.valueOf(isu.c(fqn)));
        return linkedHashMap;
    }
}
