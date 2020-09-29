package defpackage;

import com.spotify.voiceassistant.models.v1.CosmosSearchRequest;
import com.spotify.voiceassistant.models.v1.CosmosSearchResponse;
import io.reactivex.Single;

/* renamed from: vrk reason: default package */
public final class vrk implements vrj<CosmosSearchRequest, CosmosSearchResponse> {
    private final a a;

    /* renamed from: vrk$a */
    public interface a {
        @wtr(a = "speakeasy/v1/context")
        Single<CosmosSearchResponse> a(@wtd CosmosSearchRequest cosmosSearchRequest);
    }

    public final /* bridge */ /* synthetic */ Single a(Object obj) {
        return this.a.a((CosmosSearchRequest) obj);
    }
}
