package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: nik reason: default package */
public final class nik implements nil {
    private final neq a;

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        int i;
        gzz gzz = (gzz) obj;
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj2;
        String str = "recentlyPlayed";
        gzq bundle = gzz.custom().bundle(str);
        if (bundle != null) {
            i = bundle.intValue("position", -1);
        } else {
            i = -1;
        }
        if (!(!gzz.body().isEmpty() && recentlyPlayedItems.length > 0 && i != -1)) {
            return gzz;
        }
        gzq bundle2 = gzz.custom().bundle(str);
        String str2 = null;
        String string = bundle2 != null ? bundle2.string("title") : null;
        gzq bundle3 = gzz.custom().bundle(str);
        String str3 = "ui:source";
        if (bundle3 != null) {
            gzq bundle4 = bundle3.bundle("logging");
            if (bundle4 != null) {
                str2 = bundle4.string(str3);
            }
        }
        String str4 = "shows-recently-played-group";
        gzq a2 = HubsImmutableComponentBundle.builder().a(str3, str2).a("ui:group", str4).a("ui:index_in_block", Integer.valueOf(i).intValue()).a();
        List body = gzz.body();
        Integer valueOf = Integer.valueOf(i);
        List a3 = this.a.call(recentlyPlayedItems, str2);
        ArrayList arrayList = new ArrayList(body.size() + 2);
        arrayList.addAll(body);
        arrayList.addAll(valueOf.intValue(), Arrays.asList(new gzt[]{hae.builder().a((gzr) HubsGlueSectionHeader.SECTION_HEADER).a(haf.builder().a(string)).a(), hae.builder().a(str4).a("home:recentlyPlayedCarousel", HubsComponentCategory.ROW.name()).a(a3).c(a2).a()}));
        return gzz.toBuilder().a((List<? extends gzt>) arrayList).a();
    }

    public nik(neq neq) {
        this.a = (neq) fay.a(neq);
    }
}
