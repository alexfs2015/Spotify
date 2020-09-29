package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

/* renamed from: qho reason: default package */
public final class qho implements sim {
    private final fqn a;
    private final boolean b;
    private final String c;
    private final sio d;
    private final sip e;

    public qho(fqn fqn, boolean z, String str, sio sio, sip sip) {
        this.a = (fqn) fbp.a(fqn);
        this.b = z;
        this.c = (String) fbp.a(str);
        this.d = sio;
        this.e = (sip) fbp.a(sip);
    }

    public final Optional<hcs> a(List<SearchHistoryItem> list) {
        a g = ImmutableList.g();
        int i = 0;
        for (SearchHistoryItem searchHistoryItem : list) {
            if (searchHistoryItem == null) {
                throw new IllegalStateException("Search history can't have null items.");
            } else if (this.d.a(searchHistoryItem)) {
                i++;
                String str = ViewUris.t.b(searchHistoryItem.getOriginUri()) ? (sra.a(this.a) || this.b) ? searchHistoryItem.getOriginUri() : searchHistoryItem.getTargetUri() : searchHistoryItem.getTargetUri();
                g.c(this.e.a(searchHistoryItem, i, str));
            }
        }
        if (i <= 0) {
            return Optional.e();
        }
        ImmutableList b2 = g.a();
        String str2 = this.c;
        a a2 = hdb.builder().a("search-history");
        if (str2 != null) {
            a2 = a2.b(hcx.builder().a("search-history-header").a(HubsGlueSectionHeader.SECTION_HEADER.id(), HubsComponentCategory.HEADER.mId).a(hcy.builder().a(str2)).a());
        }
        return Optional.b(a2.b((List<? extends hcm>) b2).b(hcx.builder().a("search-history-clear").a("search:clearSearchHistory", HubsComponentCategory.ROW.mId).a("click", qex.a()).a()).a());
    }

    public final boolean a(hcs hcs) {
        return fbn.a(hcs.id(), "search-history");
    }
}
