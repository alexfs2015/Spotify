package defpackage;

import com.spotify.voiceassistant.models.v1.CosmosSearchRequest;
import com.spotify.voiceassistant.models.v1.CosmosSearchResponse;
import io.reactivex.Single;

/* renamed from: wet reason: default package */
public final class wet implements wes<CosmosSearchRequest, CosmosSearchResponse> {
    private final a a;

    /* renamed from: wet$a */
    public interface a {
        @xhw(a = "speakeasy/v1/context")
        Single<CosmosSearchResponse> a(@xhi CosmosSearchRequest cosmosSearchRequest);
    }

    public final /* bridge */ /* synthetic */ Single a(Object obj) {
        return this.a.a((CosmosSearchRequest) obj);
    }
}
