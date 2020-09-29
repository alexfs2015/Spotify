package com.spotify.music.features.placebobanner;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.placebobanner.models.BannerConfiguration;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Locale;

public final class BannerConfigurationRequester {
    private final RxResolver a;
    private final ObjectMapper b;
    private final Context c;
    private final jtz d;

    static abstract class RequestPayload implements JacksonModel {
        RequestPayload() {
        }

        @JsonCreator
        static RequestPayload create(@JsonProperty("userLocale") String str) {
            return new AutoValue_BannerConfigurationRequester_RequestPayload(str);
        }

        /* access modifiers changed from: 0000 */
        @JsonProperty("userLocale")
        public abstract String userLocale();
    }

    public BannerConfigurationRequester(Context context, ObjectMapper objectMapper, RxResolver rxResolver, jtz jtz) {
        this.c = context;
        this.b = objectMapper;
        this.a = rxResolver;
        this.d = jtz;
    }

    private BannerConfiguration a(Response response) {
        try {
            return (BannerConfiguration) this.b.readValue(response.getBody(), BannerConfiguration.class);
        } catch (IOException unused) {
            throw new AssertionError(String.format(Locale.US, "Error parsing response %s for class %s", new Object[]{new String(response.getBody(), fbi.c), BannerConfiguration.class.getSimpleName()}));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ BannerConfiguration b(Response response) {
        Logger.b("response status: %s, responseBody: %s", Integer.valueOf(response.getStatus()), new String(response.getBody(), fbi.c));
        if (response.getStatus() == 200) {
            return a(response).toBuilder().a(this.d.a()).a();
        }
        Logger.d("Unexpected status %s", Integer.valueOf(response.getStatus()));
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final Observable<BannerConfiguration> a() {
        Logger.b("requestBannerConfiguration", new Object[0]);
        try {
            Request request = new Request(Request.GET, "hm://bundling-placebo/v2/banner");
            request.setBody(this.b.writeValueAsBytes(RequestPayload.create(SpotifyLocale.a(this.c))));
            return this.a.resolve(request).c((Function<? super T, ? extends R>) new Function() {
                public final Object apply(Object obj) {
                    return BannerConfigurationRequester.this.b((Response) obj);
                }
            });
        } catch (JsonProcessingException e) {
            Logger.d(e, "Error requesting banner configuration", new Object[0]);
            return Observable.c();
        }
    }
}
