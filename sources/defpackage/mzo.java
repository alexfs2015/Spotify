package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.R;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.playlist.models.Covers.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: mzo reason: default package */
public final class mzo {
    private final Context a;

    public mzo(Context context) {
        this.a = context;
    }

    private static hcj a(String str, int i, String str2) {
        a a2 = HubsImmutableComponentBundle.builder().a("ui:group", str).a("ui:index_in_block", i).a("ui:source", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(i);
        return a2.a("interaction:item_id", sb.toString()).a();
    }

    private static Map<String, hci> a(String str, hcj hcj, irf irf) {
        vkt header = irf.getHeader();
        a g = ImmutableMap.g();
        String str2 = "uri";
        String str3 = "context";
        String str4 = "player";
        String str5 = "click";
        g.b(str5, hct.builder().a("playFromContext").b(HubsImmutableComponentBundle.builder().a(str2, str).a(str4, HubsImmutableComponentBundle.builder().a(str3, HubsImmutableComponentBundle.builder().a(str2, header.getUri()).a("pages", b(irf)).a()).a("options", hcj).a()).a()).a());
        return g.b();
    }

    private static hcj[] b(irf irf) {
        vkt header = irf.getHeader();
        vlf[] vlfArr = (vlf[]) irf.getItems();
        hcj[] hcjArr = new hcj[vlfArr.length];
        for (int i = 0; i < hcjArr.length; i++) {
            String str = "album_uri";
            String str2 = "metadata";
            hcjArr[i] = HubsImmutableComponentBundle.builder().a("uri", vlfArr[i].getUri()).a(str2, HubsImmutableComponentBundle.builder().a("artist_uri", header.getArtist().getUri()).a(str, header.getUri()).a()).a();
        }
        return new hcj[]{HubsImmutableComponentBundle.builder().a("tracks", hcjArr).a()};
    }

    public final hcs a(irf irf) {
        irf irf2 = irf;
        vkt header = irf.getHeader();
        vlf[] vlfArr = (vlf[]) irf.getItems();
        ArrayList arrayList = new ArrayList(vlfArr.length + 2);
        vkt header2 = irf.getHeader();
        String str = "";
        a a2 = hcx.builder().a("freetier:entityTopContainer", str).a(hcy.builder().a(header2.getName()).b(this.a.getString(R.string.album_header_album_by_format, new Object[]{header2.getArtist().getName()})).a()).a(hcw.builder().a(hcz.builder().a((!TextUtils.isEmpty(header2.getImageUri(Size.LARGE)) ? Uri.parse(header2.getImageUri(Size.LARGE)) : Uri.EMPTY).toString()).b("album").a()).a());
        vkt header3 = irf.getHeader();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(hcx.builder().a(HubsGlueComponent.SHUFFLE_BUTTON.id(), HubsComponentCategory.ROW.mId).a(hcy.builder().a(this.a.getString(R.string.header_shuffle_play)).a()).d(a("album-entity-view-header-button", 0, str)).b(a(header3.getUri(), HubsImmutableComponentBundle.builder().a("player_options_override", HubsImmutableComponentBundle.builder().a("shuffling_context", true).a()).a(), irf2)).a());
        String str2 = "uri";
        arrayList.add(a2.a((List<? extends hcm>) arrayList2).d(a("album-entity-view-header", 0, str)).a(str2, (Serializable) header2.getUri()).a());
        String str3 = "metadata";
        String str4 = "glue:subtitleStyle";
        String str5 = "download";
        arrayList.add(hcx.builder().a("row:downloadToggle", HubsComponentCategory.ROW.mId).a(hcy.builder().a(header.getName()).b(header.getArtist().getName()).a()).a(hcw.builder().a()).c(str4, str3).a("click", hct.builder().a(str5).a(HubsImmutableComponentBundle.builder().a(str5, true).a()).a()).a());
        int i = 0;
        while (i < vlfArr.length) {
            vlf vlf = vlfArr[i];
            vkt header4 = irf.getHeader();
            hcj a3 = HubsImmutableComponentBundle.builder().a("skip_to", HubsImmutableComponentBundle.builder().a(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, vlf.getUri()).a("page_index", 0).a()).a();
            a builder = hcx.builder();
            StringBuilder sb = new StringBuilder("album-entity-view-track-list_row");
            sb.append(i);
            a a4 = builder.a(sb.toString()).a(HubsGlueRow.ENTITY.id(), HubsComponentCategory.ROW.mId).a(hcy.builder().a(vlf.getName()).b(header4.getName()).a()).a(hcw.builder().a());
            a a5 = HubsImmutableComponentBundle.builder().a(str4, str3);
            String str6 = "explicit";
            if (vlf.isExplicit()) {
                a5 = a5.a("label", str6);
            }
            a d = a4.f(a5.a()).d(a("album-entity-view-track-list", i, str));
            vlf[] vlfArr2 = vlfArr;
            a a6 = HubsImmutableComponentBundle.builder().a(str2, vlf.getUri()).a(SearchHistoryItem.SEARCH_HISTORY_TRACK_PREVIEW_ID, vlf.previewId());
            arrayList.add(d.b(vlf.isExplicit() ? a6.a(str6, true).a() : a6.a()).a("rightAccessoryClick", hct.builder().a("contextMenu").a(str2, vlf.getUri()).a()).b(a(header4.getUri(), a3, irf2)).a());
            i++;
            vlfArr = vlfArr2;
        }
        return hdb.builder().a("album-entity-view").b(header.getName()).a((List<? extends hcm>) arrayList).a();
    }
}
