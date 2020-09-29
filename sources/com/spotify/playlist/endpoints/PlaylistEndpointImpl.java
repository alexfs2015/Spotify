package com.spotify.playlist.endpoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistResponse;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.endpoints.proto.PlaylistContainsRequest.ContainsRequest;
import com.spotify.playlist.endpoints.proto.PlaylistContainsRequest.ContainsResponse;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PlaylistEndpointImpl implements vje {
    private final vjf a;

    public static abstract class PlayPayload implements JacksonModel {

        public interface a {
            a a(PlayOptions playOptions);

            a a(PlayOrigin playOrigin);

            a a(LoggingParameters loggingParameters);

            a a(Map<String, String> map);

            PlayPayload a();
        }

        PlayPayload() {
        }

        public static a builder() {
            return new a();
        }

        @JsonProperty("context_metadata")
        public abstract Map<String, String> contextMetadata();

        @JsonProperty("logging_params")
        public abstract LoggingParameters loggingParameters();

        @JsonProperty("prepare_play_options")
        public abstract PlayOptions playOptions();

        @JsonProperty("play_origin")
        public abstract PlayOrigin playOrigin();

        public abstract a toBuilder();
    }

    public PlaylistEndpointImpl(vjf vjf) {
        this.a = vjf;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ContainsResponse a(fli fli) {
        return (ContainsResponse) fli;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(List list, ContainsResponse containsResponse) {
        a b = new a().b(list);
        if (containsResponse.d.size() == 0) {
            return b.a(Collections.emptyList()).a();
        }
        a aVar = containsResponse.d;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        while (i < list.size() && i < aVar.size()) {
            if (!((Boolean) aVar.get(i)).booleanValue()) {
                arrayList.add(list.get(i));
            }
            i++;
        }
        return b.a(arrayList).a();
    }

    public final Completable a(String str, a aVar, PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        return this.a.a(str, aVar.u(), PlayPayload.builder().a(playOptions).a(playOrigin).a(map).a(LoggingParameters.createWithCurrentTimestamp()).a()).e(vkd.a());
    }

    public final Single<vld> a(String str) {
        return a(str, a.t().a());
    }

    public final Single<b> a(String str, List<String> list) {
        return this.a.a(str, (ContainsRequest) ContainsRequest.k().a(list).g()).a(vkd.a(ContainsResponse.k())).f($$Lambda$PlaylistEndpointImpl$hdQm2eIWkx7zYcvxecX5Pu0a_ao.INSTANCE).f(new Function(list) {
            private final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return PlaylistEndpointImpl.a(this.f$0, (ContainsResponse) obj);
            }
        });
    }

    public final Single<vld> a(String str, a aVar) {
        Optional a2 = aVar.a();
        return (a2.b() ? this.a.a(str, aVar.u(), (Policy) a2.c()) : this.a.a(str, aVar.u())).a(vkd.a(ProtoPlaylistResponse.m())).f($$Lambda$PlaylistEndpointImpl$2vcgUK3TV6u9Tbx8_haE1NStnQ.INSTANCE);
    }

    public final Observable<vld> b(String str, a aVar) {
        Optional a2 = aVar.a();
        return (a2.b() ? this.a.b(str, aVar.u(), (Policy) a2.c()) : this.a.b(str, aVar.u())).a(vkd.b(ProtoPlaylistResponse.m())).c((Function<? super T, ? extends R>) $$Lambda$PlaylistEndpointImpl$E7IcGD4CnX9GAemvxLxbUQ2LUE.INSTANCE);
    }
}
