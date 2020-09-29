package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ltk reason: default package */
public final class ltk implements rza, rzb {
    private final Set<String> a = new HashSet(10);

    public ltk(Bundle bundle) {
        ArrayList stringArrayList = bundle.getStringArrayList("track_uris_to_ignore");
        if (stringArrayList != null) {
            this.a.clear();
            this.a.addAll(stringArrayList);
        }
    }

    public final boolean a(SearchHistoryItem searchHistoryItem) {
        return !this.a.contains(searchHistoryItem.getTargetUri());
    }

    static boolean b(SearchHistoryItem searchHistoryItem) {
        return jst.a(((SearchHistoryItem) fay.a(searchHistoryItem)).getOriginUri(), LinkType.TRACK);
    }

    public final gzt a(final SearchHistoryItem searchHistoryItem, int i, String str) {
        gzr gzr;
        a aVar;
        a builder = hae.builder();
        StringBuilder sb = new StringBuilder("search-history-");
        sb.append(searchHistoryItem.getTargetUri());
        a a2 = builder.a(sb.toString());
        String componentId = searchHistoryItem.getComponentId();
        String componentCategory = searchHistoryItem.getComponentCategory();
        if (fax.a(componentId) || fax.a(componentCategory)) {
            gzr = new gzr() {
                public final String id() {
                    return ltk.b(searchHistoryItem) ? "ac:track" : HubsGlueRow.NORMAL.id();
                }

                public final String category() {
                    return HubsGlueRow.NORMAL.category();
                }
            };
        } else {
            gzr = hac.create(componentId, componentCategory);
        }
        a f = a2.a(gzr).a(haf.builder().a(searchHistoryItem.getTitle()).b(searchHistoryItem.getSubtitle())).a(had.builder().a(gxs.a(hag.builder().a(searchHistoryItem.getImageUri()).a(), searchHistoryItem.getTargetUri()))).f(gwf.a(false));
        boolean isExplicit = searchHistoryItem.isExplicit();
        String str2 = "click";
        if (b(searchHistoryItem)) {
            String str3 = (String) jtc.a(searchHistoryItem.getPreviewId(), "");
            String a3 = rzj.a(str3, "history");
            aVar = f.a("preview_key", (Serializable) a3).a(SearchHistoryItem.SEARCH_HISTORY_TRACK_PREVIEW_ID, (Serializable) str3).a(str2, lss.a(str, str3, a3, isExplicit)).a("imageClick", lss.a(str, str3, a3, isExplicit)).a("rightAccessoryClick", lsk.a(str, i));
        } else {
            aVar = f.a(str2, lsq.a(str, i));
        }
        if (isExplicit) {
            aVar = aVar.f(HubsImmutableComponentBundle.builder().a("label", "explicit").a());
        }
        return aVar.f(gww.a(searchHistoryItem.shouldAppearDisabled())).a();
    }
}
