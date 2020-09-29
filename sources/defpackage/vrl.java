package defpackage;

import com.spotify.voiceassistant.models.v2.SearchRequest;
import com.spotify.voiceassistant.models.v2.SearchResponse;
import io.reactivex.Single;

/* renamed from: vrl reason: default package */
public final class vrl implements vrj<SearchRequest, SearchResponse> {
    private final a a;

    /* renamed from: vrl$a */
    interface a {
        @wtr(a = "speakeasy/v2/search")
        Single<SearchResponse> a(@wtd SearchRequest searchRequest);
    }

    public final /* bridge */ /* synthetic */ Single a(Object obj) {
        return this.a.a((SearchRequest) obj);
    }
}
