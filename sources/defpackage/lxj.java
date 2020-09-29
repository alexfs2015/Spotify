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

/* renamed from: lxj reason: default package */
public final class lxj implements sio, sip {
    private final Set<String> a = new HashSet(10);

    public lxj(Bundle bundle) {
        ArrayList stringArrayList = bundle.getStringArrayList("track_uris_to_ignore");
        if (stringArrayList != null) {
            this.a.clear();
            this.a.addAll(stringArrayList);
        }
    }

    static boolean b(SearchHistoryItem searchHistoryItem) {
        return jva.a(((SearchHistoryItem) fbp.a(searchHistoryItem)).getOriginUri(), LinkType.TRACK);
    }

    public final hcm a(final SearchHistoryItem searchHistoryItem, int i, String str) {
        a aVar;
        a builder = hcx.builder();
        StringBuilder sb = new StringBuilder("search-history-");
        sb.append(searchHistoryItem.getTargetUri());
        a a2 = builder.a(sb.toString());
        String componentId = searchHistoryItem.getComponentId();
        String componentCategory = searchHistoryItem.getComponentCategory();
        a f = a2.a((fbo.a(componentId) || fbo.a(componentCategory)) ? new hck() {
            public final String category() {
                return HubsGlueRow.NORMAL.category();
            }

            public final String id() {
                return lxj.b(searchHistoryItem) ? "ac:track" : HubsGlueRow.NORMAL.id();
            }
        } : hcv.create(componentId, componentCategory)).a(hcy.builder().a(searchHistoryItem.getTitle()).b(searchHistoryItem.getSubtitle())).a(hcw.builder().a(hal.a(hcz.builder().a(searchHistoryItem.getImageUri()).a(), searchHistoryItem.getTargetUri()))).f(gyg.a(false));
        boolean isExplicit = searchHistoryItem.isExplicit();
        String str2 = "click";
        if (b(searchHistoryItem)) {
            String str3 = (String) jvi.a(searchHistoryItem.getPreviewId(), "");
            String a3 = six.a(str3, "history");
            aVar = f.a("preview_key", (Serializable) a3).a(SearchHistoryItem.SEARCH_HISTORY_TRACK_PREVIEW_ID, (Serializable) str3).a(str2, lwr.a(str, str3, a3, isExplicit)).a("imageClick", lwr.a(str, str3, a3, isExplicit)).a("rightAccessoryClick", lwj.a(str, i));
        } else {
            aVar = f.a(str2, lwp.a(str, i));
        }
        if (isExplicit) {
            aVar = aVar.f(HubsImmutableComponentBundle.builder().a("label", "explicit").a());
        }
        return aVar.f(gzg.a(searchHistoryItem.shouldAppearDisabled())).a();
    }

    public final boolean a(SearchHistoryItem searchHistoryItem) {
        return !this.a.contains(searchHistoryItem.getTargetUri());
    }
}
