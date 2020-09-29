package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: nou reason: default package */
public final class nou implements xiz<hcs, RecentlyPlayedItems, hcs> {
    private final nkf a;

    nou(nkf nkf) {
        this.a = (nkf) fbp.a(nkf);
    }

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        hcs hcs = (hcs) obj;
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj2;
        String str = "recentlyPlayed";
        hcj bundle = hcs.custom().bundle(str);
        int intValue = bundle != null ? bundle.intValue("position", -1) : -1;
        if (!(!hcs.body().isEmpty() && recentlyPlayedItems.length > 0 && intValue != -1)) {
            return hcs;
        }
        hcj bundle2 = hcs.custom().bundle(str);
        String str2 = null;
        String string = bundle2 != null ? bundle2.string("title") : null;
        hcj bundle3 = hcs.custom().bundle(str);
        String str3 = "ui:source";
        if (bundle3 != null) {
            hcj bundle4 = bundle3.bundle("logging");
            if (bundle4 != null) {
                str2 = bundle4.string(str3);
            }
        }
        String str4 = "shows-recently-played-group";
        hcj a2 = HubsImmutableComponentBundle.builder().a(str3, str2).a("ui:group", str4).a("ui:index_in_block", Integer.valueOf(intValue).intValue()).a();
        List body = hcs.body();
        Integer valueOf = Integer.valueOf(intValue);
        List a3 = this.a.call(recentlyPlayedItems, str2);
        ArrayList arrayList = new ArrayList(body.size() + 2);
        arrayList.addAll(body);
        arrayList.addAll(valueOf.intValue(), Arrays.asList(new hcm[]{hcx.builder().a(rrh.a).a(hcy.builder().a(string)).a(), hcx.builder().a(str4).a("home:carousel", HubsComponentCategory.ROW.name()).a(a3).c(a2).a()}));
        return hcs.toBuilder().a((List<? extends hcm>) arrayList).a();
    }
}
