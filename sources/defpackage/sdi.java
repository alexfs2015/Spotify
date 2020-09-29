package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sdi reason: default package */
public final class sdi implements Function<sgg<QueryAutocompleteResult>, gzz> {
    private final String a;

    public sdi(String str) {
        this.a = str;
    }

    private static gzp a(String str, String str2, int i) {
        fay.a(str);
        return haa.builder().a("queryAutocomplete").a("query", str).a("suggestionIndex", Integer.valueOf(i)).a("requestId", str2).a();
    }

    /* renamed from: a */
    public gzz apply(sgg<QueryAutocompleteResult> sgg) {
        QueryAutocompleteResult queryAutocompleteResult = (QueryAutocompleteResult) fay.a(sgg.b);
        ArrayList arrayList = new ArrayList(queryAutocompleteResult.options.size());
        int i = 0;
        for (String str : queryAutocompleteResult.options) {
            a a2 = hae.builder().a(this.a, HubsComponentCategory.ROW.mId);
            StringBuilder sb = new StringBuilder("query-suggestion-");
            sb.append(i);
            String str2 = "requestId";
            String str3 = "suggestionIndex";
            String str4 = "click";
            arrayList.add(a2.a(sb.toString()).a(had.builder().a((Enum<?>) SpotifyIconV2.SEARCH).a()).a(haf.builder().a(str).a()).c("query", sgg.a).c(str2, queryAutocompleteResult.requestid).c(str3, Integer.valueOf(i)).a(str4, a(str, queryAutocompleteResult.requestid, i)).a("rightAccessoryClick", a(str, queryAutocompleteResult.requestid, i)).a());
            i++;
        }
        return hai.builder().b((List<? extends gzt>) arrayList).a("isQuack", Boolean.TRUE).a();
    }
}
