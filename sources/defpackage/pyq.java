package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

/* renamed from: pyq reason: default package */
public final class pyq implements ryy {
    private final fpt a;
    private final boolean b;
    private final String c;
    private final rza d;
    private final rzb e;

    public pyq(fpt fpt, boolean z, String str, rza rza, rzb rzb) {
        this.a = (fpt) fay.a(fpt);
        this.b = z;
        this.c = (String) fay.a(str);
        this.d = rza;
        this.e = (rzb) fay.a(rzb);
    }

    public final Optional<gzz> a(List<SearchHistoryItem> list) {
        String str;
        a g = ImmutableList.g();
        int i = 0;
        for (SearchHistoryItem searchHistoryItem : list) {
            if (searchHistoryItem == null) {
                throw new IllegalStateException("Search history can't have null items.");
            } else if (this.d.a(searchHistoryItem)) {
                i++;
                if (!ViewUris.u.b(searchHistoryItem.getOriginUri())) {
                    str = searchHistoryItem.getTargetUri();
                } else if (sgt.a(this.a) || this.b) {
                    str = searchHistoryItem.getOriginUri();
                } else {
                    str = searchHistoryItem.getTargetUri();
                }
                g.c(this.e.a(searchHistoryItem, i, str));
            }
        }
        if (i <= 0) {
            return Optional.e();
        }
        ImmutableList b2 = g.a();
        String str2 = this.c;
        a a2 = hai.builder().a("search-history");
        if (str2 != null) {
            a2 = a2.b(hae.builder().a("search-history-header").a(HubsGlueSectionHeader.SECTION_HEADER.id(), HubsComponentCategory.HEADER.mId).a(haf.builder().a(str2)).a());
        }
        String str3 = "click";
        return Optional.b(a2.b((List<? extends gzt>) b2).b(hae.builder().a("search-history-clear").a("search:clearSearchHistory", HubsComponentCategory.ROW.mId).a(str3, pwb.a()).a()).a());
    }

    public final boolean a(gzz gzz) {
        return faw.a(gzz.id(), "search-history");
    }
}
