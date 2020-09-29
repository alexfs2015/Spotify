package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Single;

/* renamed from: sap reason: default package */
public interface sap {
    @wtn(a = {"Accept: application/json"})
    @wti(a = "search-qac-api/v1/suggest")
    Single<QueryAutocompleteResult> a(@wtw(a = "q") String str, @wtw(a = "sessionid") String str2);
}
