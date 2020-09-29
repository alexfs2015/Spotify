package com.spotify.music.features.payfail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.exceptions.Exceptions;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

public final class PaymentFailureRepository {
    private final RxResolver a;
    private final ObjectMapper b;

    @JsonIgnoreProperties(ignoreUnknown = true)
    static abstract class Resources implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        static abstract class Resource implements JacksonModel {
            Resource() {
            }

            @JsonCreator
            public static Resource create(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
                return new AutoValue_PaymentFailureRepository_Resources_Resource(str, str2);
            }

            @JsonProperty("offline_availability")
            public abstract String offlineAvailability();

            @JsonProperty("uri")
            public abstract String uri();
        }

        Resources() {
        }

        @JsonCreator
        public static Resources create(@JsonProperty("resources") List<Resource> list) {
            return new AutoValue_PaymentFailureRepository_Resources(list);
        }

        @JsonProperty("resources")
        public abstract List<Resource> offlineAvailabilities();
    }

    public PaymentFailureRepository(rwl rwl, RxResolver rxResolver) {
        this.b = rwl.a().a();
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public static int a(Resources resources) {
        int size = resources.offlineAvailabilities().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if ("yes".equals(((Resource) resources.offlineAvailabilities().get(i2)).offlineAvailability())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Resources a(Response response) {
        try {
            return (Resources) this.b.readValue(response.getBody(), Resources.class);
        } catch (IOException e) {
            throw Exceptions.a(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Request request) {
        return wit.a((ObservableSource<T>) this.a.resolve(request), BackpressureStrategy.BUFFER);
    }

    public final xii<Integer> a() {
        return xii.a((Callable<? extends T>) $$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos.INSTANCE).d((xiy<? super T, ? extends xii<? extends R>>) new xiy() {
            public final Object call(Object obj) {
                return PaymentFailureRepository.this.a((Request) obj);
            }
        }).e((xiy<? super T, ? extends R>) new xiy() {
            public final Object call(Object obj) {
                return PaymentFailureRepository.this.a((Response) obj);
            }
        }).e((xiy<? super T, ? extends R>) $$Lambda$PaymentFailureRepository$cc8Wnke4AQ8aSueU0PNyMF5DslE.INSTANCE);
    }
}
