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

/* renamed from: rzt reason: default package */
public final class rzt implements Function<rzz, gzz> {
    private final sag a;
    private final sac b;
    private final sae c;
    private final rzh d;
    private final saa e;
    private final int f;

    public final /* synthetic */ Object apply(Object obj) {
        Optional optional;
        rzz rzz = (rzz) obj;
        List a2 = rzp.a((List<Entity>) rzz.c().d);
        String str = "pageIdentifier";
        String str2 = "requestId";
        String str3 = "searchTerm";
        if (a2.isEmpty()) {
            return this.d.a(rzz.b(), false).toBuilder().a(str3, rzz.b()).a(str2, rzz.a()).a(str, PageIdentifiers.SEARCH.toString()).a();
        }
        String str4 = rzz.c().a(0).g;
        sag sag = this.a;
        String a3 = rzz.a();
        ArrayList arrayList = new ArrayList(a2.size());
        int i = 0;
        while (i < a2.size()) {
            Entity entity = (Entity) a2.get(i);
            rzy rzy = r9;
            Entity entity2 = entity;
            List list = a2;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            rzy rzy2 = new rzy(sag.b, sag.a, entity, i, a3, "top-results");
            rzy.a = sag.c;
            rzy.b = true;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(sag.d.a(entity2, rzy.a()));
            i = i2 + 1;
            arrayList = arrayList3;
            a2 = list;
        }
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = new ArrayList(arrayList4.size() + 1);
        arrayList5.addAll(arrayList4);
        MainViewResponse c2 = rzz.c();
        if (c2.k().d.size() > 0) {
            RecommendationsType k = c2.k().k();
            if ((k == RecommendationsType.UNRECOGNIZED || k == RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN) ? false : true) {
                Recommendations k2 = c2.k();
                List a4 = this.b.apply(rzz);
                if (a4.isEmpty()) {
                    optional = Optional.e();
                } else {
                    optional = Optional.b(hae.builder().a("top-recs-content-results-carousel").a((gzr) HubsGlueComponent.CAROUSEL).a(a4).a());
                }
                if (optional.b()) {
                    arrayList5.add(this.f, optional.c());
                    arrayList5.add(this.f, hae.builder().a("top-recs-content-results-header").a((gzr) HubsGlueSectionHeader.SECTION_HEADER).a(haf.builder().a(this.e.a(k2.k(), c2.a(0).f))).a());
                }
            }
        }
        gzt a5 = hae.builder().a("top-section").a((gzr) HubsGlueComponent.BACKGROUND).a(had.builder().a(hag.builder().a(str4))).a((List<? extends gzt>) arrayList5).a();
        List a6 = this.c.apply(rzz);
        ArrayList arrayList6 = new ArrayList(a6.size() + 1);
        arrayList6.add(a5);
        arrayList6.addAll(a6);
        return hai.builder().a((List<? extends gzt>) arrayList6).a(HubsImmutableComponentBundle.builder().a(str3, rzz.b()).a("backgroundUri", str4).a(str2, rzz.a()).a(str, PageIdentifiers.SEARCH.toString()).a()).a();
    }

    public rzt(sag sag, sac sac, sae sae, rzh rzh, saa saa, int i) {
        this.a = sag;
        this.b = sac;
        this.c = sae;
        this.d = rzh;
        this.e = saa;
        this.f = i;
    }
}
