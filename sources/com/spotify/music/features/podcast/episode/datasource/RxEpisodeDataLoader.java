package com.spotify.music.features.podcast.episode.datasource;

import android.net.Uri.Builder;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateResponse;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class RxEpisodeDataLoader {
    private final RxResolver a;
    private final ObjectMapper b;

    static abstract class EpisodeRequestModel implements JacksonModel {
        /* access modifiers changed from: 0000 */
        @JsonProperty("items")
        public abstract List<String> getItems();

        EpisodeRequestModel() {
        }

        public static EpisodeRequestModel create(List<String> list) {
            return new AutoValue_RxEpisodeDataLoader_EpisodeRequestModel(list);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static abstract class ErrorResponse implements JacksonModel {
        /* access modifiers changed from: 0000 */
        public abstract String getError();

        ErrorResponse() {
        }

        @JsonCreator
        public static ErrorResponse create(@JsonProperty("error") String str) {
            return new AutoValue_RxEpisodeDataLoader_ErrorResponse(str);
        }
    }

    public RxEpisodeDataLoader(RxResolver rxResolver, rnf rnf) {
        this.a = rxResolver;
        this.b = rnf.a().a(Include.NON_NULL).a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public paq b(String str, Response response) {
        try {
            if (response.getStatus() != 200) {
                ErrorResponse errorResponse = (ErrorResponse) this.b.readValue(response.getBody(), ErrorResponse.class);
                StringBuilder sb = new StringBuilder("Failed Request: ");
                sb.append(errorResponse.getError());
                return paq.a(sb.toString());
            }
            Map a2 = uzz.a(ProtoDecorateResponse.a(response.getBody()));
            if (a2 != null && !a2.isEmpty()) {
                uys uys = (uys) a2.get(str);
                if (uys != null) {
                    return paq.a(uys, Optional.e(), Optional.e());
                }
            }
            return paq.a(String.format("Episode not found [%s]", new Object[]{str}));
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                StringBuilder sb2 = new StringBuilder("Error while parsing response for episode URI: ");
                sb2.append(str);
                message = sb2.toString();
            }
            return paq.a(message);
        }
    }

    public final wud<paq> a(String str) {
        Request build = RequestBuilder.subscribe(new Builder().scheme("sp").authority("core-show").appendEncodedPath("unstable/decorate").appendQueryParameter("responseFormat", "protobuf").appendQueryParameter("preferCached", "true").appendQueryParameter("updateThrottling", "300").build().toString()).build();
        try {
            build.setBody(this.b.writeValueAsBytes(EpisodeRequestModel.create(new ArrayList(Collections.singletonList(str)))));
            return vun.a((ObservableSource<T>) this.a.resolve(build), BackpressureStrategy.BUFFER).f(new wut(str) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final Object call(Object obj) {
                    return RxEpisodeDataLoader.this.b(this.f$1, (Response) obj);
                }
            });
        } catch (JsonProcessingException e) {
            return wud.a((Throwable) e);
        }
    }
}
