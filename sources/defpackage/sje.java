package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.MainViewResponse;
import com.spotify.searchview.proto.Recommendations;
import com.spotify.searchview.proto.RecommendationsType;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sje reason: default package */
public final class sje implements Function<sjh, hcs> {
    private final sjm a;
    private final sji b;
    private final sjk c;
    private final siv d;
    private final ska e;
    private final int f;

    public sje(sjm sjm, sji sji, sjk sjk, siv siv, ska ska, int i) {
        this.a = sjm;
        this.b = sji;
        this.c = sjk;
        this.d = siv;
        this.e = ska;
        this.f = i;
    }

    public final /* synthetic */ Object apply(Object obj) {
        sjh sjh = (sjh) obj;
        List a2 = sjd.a((List<Entity>) sjh.c().d);
        String str = "pageIdentifier";
        String str2 = "requestId";
        String str3 = "searchTerm";
        if (a2.isEmpty()) {
            return this.d.a(sjh.b(), false).toBuilder().a(str3, sjh.b()).a(str2, sjh.a()).a(str, PageIdentifiers.SEARCH.toString()).a();
        }
        String str4 = sjh.c().a(0).g;
        sjm sjm = this.a;
        String a3 = sjh.a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (int i = 0; i < a2.size(); i++) {
            Entity entity = (Entity) a2.get(i);
            sjx a4 = sjm.a.a(entity, i, a3, "top-results");
            a4.a = sjm.b;
            a4.b = true;
            arrayList.add(sjm.c.a(entity, a4.a()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        arrayList2.addAll(arrayList);
        MainViewResponse c2 = sjh.c();
        if (c2.k().d.size() > 0) {
            RecommendationsType k = c2.k().k();
            if ((k == RecommendationsType.UNRECOGNIZED || k == RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN) ? false : true) {
                Recommendations k2 = c2.k();
                List a5 = this.b.apply(sjh);
                Optional e2 = a5.isEmpty() ? Optional.e() : Optional.b(hcx.builder().a("top-recs-content-results-carousel").a((hck) HubsGlueComponent.CAROUSEL).a(a5).a());
                if (e2.b()) {
                    arrayList2.add(this.f, e2.c());
                    arrayList2.add(this.f, hcx.builder().a("top-recs-content-results-header").a((hck) HubsGlueSectionHeader.SECTION_HEADER).a(hcy.builder().a(this.e.a(k2.k(), c2.a(0).f))).a());
                }
            }
        }
        hcm a6 = hcx.builder().a("top-section").a((hck) HubsGlueComponent.BACKGROUND).a(hcw.builder().a(hcz.builder().a(str4))).a((List<? extends hcm>) arrayList2).a();
        List a7 = this.c.apply(sjh);
        ArrayList arrayList3 = new ArrayList(a7.size() + 1);
        arrayList3.add(a6);
        arrayList3.addAll(a7);
        return hdb.builder().a((List<? extends hcm>) arrayList3).a(HubsImmutableComponentBundle.builder().a(str3, sjh.b()).a("backgroundUri", str4).a(str2, sjh.a()).a(str, PageIdentifiers.SEARCH.toString()).a()).a();
    }
}
