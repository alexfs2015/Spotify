package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: pzp reason: default package */
public final class pzp implements rza, rzb {
    public final boolean a(SearchHistoryItem searchHistoryItem) {
        return true;
    }

    public final gzt a(SearchHistoryItem searchHistoryItem, int i, String str) {
        hac create = hac.create((String) jtc.a(searchHistoryItem.getComponentId(), HubsGlueRow.NORMAL.id()), (String) jtc.a(searchHistoryItem.getComponentCategory(), HubsGlueRow.NORMAL.category()));
        a builder = hae.builder();
        StringBuilder sb = new StringBuilder("search-history-");
        sb.append(searchHistoryItem.getTargetUri());
        a a = builder.a(sb.toString()).a((gzr) create).a(haf.builder().a(searchHistoryItem.getTitle()).b(searchHistoryItem.getSubtitle())).a(had.builder().a(gxs.a(hag.builder().a(searchHistoryItem.getImageUri()).a(), searchHistoryItem.getTargetUri()))).a("click", pzj.a(str, i));
        return a.a("rightAccessoryClick", pzl.a(searchHistoryItem.getOriginUri(), i)).c("secondary_icon", SpotifyIconV2.X.toString()).f(gwf.a(false)).a();
    }
}
