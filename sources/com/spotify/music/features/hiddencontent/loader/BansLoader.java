package com.spotify.music.features.hiddencontent.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.ArtistJacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.TrackJacksonModel;
import java.util.List;
import rx.internal.operators.OperatorReplay;

public final class BansLoader {
    private final gmm<BansResponse> a;
    private xii<BansResponse> b;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class BansResponse implements JacksonModel {
        @JsonCreator
        public static BansResponse create(@JsonProperty("tracks") List<TrackJacksonModel> list, @JsonProperty("artists") List<ArtistJacksonModel> list2) {
            return new AutoValue_BansLoader_BansResponse(list, list2);
        }

        public abstract List<ArtistJacksonModel> getArtists();

        public abstract List<TrackJacksonModel> getTracks();
    }

    public BansLoader(gmm<BansResponse> gmm) {
        this.a = gmm;
    }

    public final xii<BansResponse> a() {
        if (this.b == null) {
            this.b = OperatorReplay.a(this.a.resolve(new Request(Request.SUB, "sp://core-collection/unstable/bans?sort=addTime DESC")).g($$Lambda$BansLoader$DVBQXtmSjwzfGVmkrjiSPF9TTw.INSTANCE), 1).e();
        }
        return this.b;
    }
}
