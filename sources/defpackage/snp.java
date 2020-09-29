package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: snp reason: default package */
public final class snp implements Function<sqn<QueryAutocompleteResult>, hcs> {
    private final String a;

    public snp(String str) {
        this.a = str;
    }

    private static hci a(String str, String str2, int i) {
        fbp.a(str);
        return hct.builder().a("queryAutocomplete").a("query", str).a("suggestionIndex", Integer.valueOf(i)).a("requestId", str2).a();
    }

    /* renamed from: a */
    public hcs apply(sqn<QueryAutocompleteResult> sqn) {
        QueryAutocompleteResult queryAutocompleteResult = (QueryAutocompleteResult) fbp.a(sqn.b);
        ArrayList arrayList = new ArrayList(queryAutocompleteResult.options.size());
        int i = 0;
        for (String str : queryAutocompleteResult.options) {
            a a2 = hcx.builder().a(this.a, HubsComponentCategory.ROW.mId);
            StringBuilder sb = new StringBuilder("query-suggestion-");
            sb.append(i);
            String str2 = "requestId";
            String str3 = "suggestionIndex";
            String str4 = "click";
            arrayList.add(a2.a(sb.toString()).a(hcw.builder().a((Enum<?>) SpotifyIconV2.SEARCH).a()).a(hcy.builder().a(str).a()).c("query", sqn.a).c(str2, queryAutocompleteResult.requestid).c(str3, Integer.valueOf(i)).a(str4, a(str, queryAutocompleteResult.requestid, i)).a("rightAccessoryClick", a(str, queryAutocompleteResult.requestid, i)).a());
            i++;
        }
        return hdb.builder().b((List<? extends hcm>) arrayList).a("isQuack", Boolean.TRUE).a();
    }
}
