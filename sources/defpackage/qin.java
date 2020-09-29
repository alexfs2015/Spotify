package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: qin reason: default package */
public final class qin implements sio, sip {
    public final hcm a(SearchHistoryItem searchHistoryItem, int i, String str) {
        hcv create = hcv.create((String) jvi.a(searchHistoryItem.getComponentId(), HubsGlueRow.NORMAL.id()), (String) jvi.a(searchHistoryItem.getComponentCategory(), HubsGlueRow.NORMAL.category()));
        a builder = hcx.builder();
        StringBuilder sb = new StringBuilder("search-history-");
        sb.append(searchHistoryItem.getTargetUri());
        a a = builder.a(sb.toString()).a((hck) create).a(hcy.builder().a(searchHistoryItem.getTitle()).b(searchHistoryItem.getSubtitle())).a(hcw.builder().a(hal.a(hcz.builder().a(searchHistoryItem.getImageUri()).a(), searchHistoryItem.getTargetUri()))).a("click", qih.a(str, i));
        return a.a("rightAccessoryClick", qij.a(searchHistoryItem.getOriginUri(), i)).c("secondary_icon", SpotifyIconV2.X.toString()).f(gyg.a(false)).a();
    }

    public final boolean a(SearchHistoryItem searchHistoryItem) {
        return true;
    }
}
