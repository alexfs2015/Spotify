package defpackage;

import com.spotify.voiceassistant.models.v2.SearchRequest;
import com.spotify.voiceassistant.models.v2.SearchResponse;
import io.reactivex.Single;

/* renamed from: weu reason: default package */
public final class weu implements wes<SearchRequest, SearchResponse> {
    private final a a;

    /* renamed from: weu$a */
    interface a {
        @xhw(a = "speakeasy/v2/search")
        Single<SearchResponse> a(@xhi SearchRequest searchRequest);
    }

    public final /* bridge */ /* synthetic */ Single a(Object obj) {
        return this.a.a((SearchRequest) obj);
    }
}
