package com.spotify.music.follow.resolver;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.music.follow.resolver.RxFollowersCountResolver.Counts;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.List;

public final class RxFollowersCountResolver {
    private final RxResolver a;
    private final ObjectMapper b;
    private final Scheduler c;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Count implements JacksonModel {
        private final int mFollowersCount;
        private final int mFollowingCount;

        @JsonCreator
        public Count(@JsonProperty("followers_count") int i, @JsonProperty("following_count") int i2) {
            this.mFollowersCount = Math.max(0, i);
            this.mFollowingCount = Math.max(0, i2);
        }

        public int getFollowersCount() {
            return this.mFollowersCount;
        }

        public int getFollowingCount() {
            return this.mFollowingCount;
        }
    }

    @JsonDeserialize(using = RxFollowersCountResolver_Counts_Deserializer.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Counts implements JacksonModel {
        public final Count[] counts;

        @JsonCreator
        public Counts(Count[] countArr) {
            this.counts = countArr;
        }
    }

    public RxFollowersCountResolver(RxResolver rxResolver, ObjectMapper objectMapper, Scheduler scheduler) {
        this.a = (RxResolver) fbp.a(rxResolver);
        this.b = objectMapper;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Count a(Counts counts) {
        return counts.counts[0];
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(int i, Counts counts) {
        if (counts.counts != null && counts.counts.length == i) {
            return Observable.b(counts);
        }
        StringBuilder sb = new StringBuilder("Unexpected count data, expected ");
        sb.append(i);
        return Observable.a((Throwable) new Exception(sb.toString()));
    }

    public final Observable<Count> a(String str) {
        return a((List<String>) ImmutableList.a(str)).c((Function<? super T, ? extends R>) $$Lambda$RxFollowersCountResolver$B37W6EWNZA4hnZawRCiEbc4fR9o.INSTANCE);
    }

    public final Observable<Counts> a(List<String> list) {
        fbp.a(list);
        fbp.a(!list.isEmpty());
        int size = list.size();
        return this.a.resolve(new Request(Request.GET, "hm://socialgraph/v2/counts?format=json", null, String.format("{\"target_uris\": [%s]}", new Object[]{TextUtils.join(",", fdd.a((Iterable<F>) list, (com.google.common.base.Function<? super F, ? extends T>) $$Lambda$RxFollowersCountResolver$WsGNs2wONC11MOHLI9m4YDSTdfI.INSTANCE))}).getBytes(fbi.c))).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(Counts.class, this.b, this.c)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function(size) {
            private final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return RxFollowersCountResolver.a(this.f$0, (Counts) obj);
            }
        }, false);
    }
}
