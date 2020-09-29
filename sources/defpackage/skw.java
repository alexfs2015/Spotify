package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Single;

/* renamed from: skw reason: default package */
public interface skw {
    @xhs(a = {"Accept: application/json"})
    @xhn(a = "search-qac-api/v1/suggest")
    Single<QueryAutocompleteResult> a(@xib(a = "q") String str, @xib(a = "sessionid") String str2);
}
