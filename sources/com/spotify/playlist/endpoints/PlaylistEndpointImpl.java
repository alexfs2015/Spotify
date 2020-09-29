package com.spotify.playlist.endpoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistResponse;
import com.spotify.playlist.endpoints.exceptions.NotFoundException;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.endpoints.proto.PlaylistContainsRequest.ContainsRequest;
import com.spotify.playlist.endpoints.proto.PlaylistContainsRequest.ContainsResponse;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PlaylistEndpointImpl implements uxc {
    private final uxd a;

    public static abstract class PlayPayload implements JacksonModel {

        public interface a {
            a a(PlayOptions playOptions);

            a a(PlayOrigin playOrigin);

            a a(LoggingParameters loggingParameters);

            a a(Map<String, String> map);

            PlayPayload a();
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

        PlayPayload() {
        }

        public static a builder() {
            return new a();
        }
    }

    public PlaylistEndpointImpl(uxd uxd) {
        this.a = uxd;
    }

    public final Single<uza> a(String str) {
        return a(str, a.t().a());
    }

    public final Single<uza> a(String str, a aVar) {
        Single single;
        Optional a2 = aVar.a();
        if (a2.b()) {
            single = this.a.a(str, aVar.u(), (Policy) a2.c());
        } else {
            single = this.a.a(str, aVar.u());
        }
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new Function(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return PlaylistEndpointImpl.b(this.f$0, (Response) obj);
            }
        }).f($$Lambda$6Bj_LYjitZaeeL6J3JQ_fioyG8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource b(String str, Response response) {
        if (response.getStatus() == 404) {
            return Single.a((Throwable) new NotFoundException(str, response));
        }
        return Single.b(ProtoPlaylistResponse.a(response.getBody()));
    }

    public final Observable<uza> b(String str, a aVar) {
        Observable observable;
        Optional a2 = aVar.a();
        if (a2.b()) {
            observable = this.a.b(str, aVar.u(), (Policy) a2.c());
        } else {
            observable = this.a.b(str, aVar.u());
        }
        return observable.h(new Function(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return PlaylistEndpointImpl.a(this.f$0, (Response) obj);
            }
        }).c((Function<? super T, ? extends R>) $$Lambda$6Bj_LYjitZaeeL6J3JQ_fioyG8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(String str, Response response) {
        if (response.getStatus() == 404) {
            return Observable.a((Throwable) new NotFoundException(str, response));
        }
        return Observable.b(ProtoPlaylistResponse.a(response.getBody()));
    }

    public final Completable a(String str, a aVar, PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        return this.a.a(str, aVar.u(), PlayPayload.builder().a(playOptions).a(playOrigin).a(map).a(LoggingParameters.createWithCurrentTimestamp()).a());
    }

    public final Single<b> a(String str, List<String> list) {
        return this.a.a(str, (ContainsRequest) ContainsRequest.k().a(list).g()).f(new Function(list) {
            private final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return PlaylistEndpointImpl.a(this.f$0, (ContainsResponse) obj);
            }
        });
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
}
