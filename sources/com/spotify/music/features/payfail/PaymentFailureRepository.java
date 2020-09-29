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
            @JsonProperty("offline_availability")
            public abstract String offlineAvailability();

            @JsonProperty("uri")
            public abstract String uri();

            Resource() {
            }

            @JsonCreator
            public static Resource create(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
                return new AutoValue_PaymentFailureRepository_Resources_Resource(str, str2);
            }
        }

        @JsonProperty("resources")
        public abstract List<Resource> offlineAvailabilities();

        Resources() {
        }

        @JsonCreator
        public static Resources create(@JsonProperty("resources") List<Resource> list) {
            return new AutoValue_PaymentFailureRepository_Resources(list);
        }
    }

    public PaymentFailureRepository(rnf rnf, RxResolver rxResolver) {
        this.b = rnf.a().a();
        this.a = rxResolver;
    }

    public final wud<Integer> a() {
        return wud.a((Callable<? extends T>) $$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) new wut() {
            public final Object call(Object obj) {
                return PaymentFailureRepository.this.a((Request) obj);
            }
        }).f(new wut() {
            public final Object call(Object obj) {
                return PaymentFailureRepository.this.a((Response) obj);
            }
        }).f($$Lambda$PaymentFailureRepository$plpTrSVCSORHs10UShotvW16YOU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Request request) {
        return vun.a((ObservableSource<T>) this.a.resolve(request), BackpressureStrategy.BUFFER);
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
}
