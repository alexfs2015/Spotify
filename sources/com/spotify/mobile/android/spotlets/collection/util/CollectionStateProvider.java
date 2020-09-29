package com.spotify.mobile.android.spotlets.collection.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response;
import io.reactivex.Observable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CollectionStateProvider {
    private final gmm<Response> a;
    private final ObjectMapper b;

    public static abstract class ContainsRequest implements JacksonModel {
        public static ContainsRequest create(List<String> list, String str, String str2) {
            return new AutoValue_CollectionStateProvider_ContainsRequest(list, str, str2);
        }

        @JsonProperty("contextUri")
        public abstract String getContextUri();

        @JsonProperty("items")
        public abstract List<String> getItems();

        @JsonProperty("source")
        public abstract String getSource();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Response implements JacksonModel {
        @JsonCreator
        public static Response create(@JsonProperty("found") boolean[] zArr, @JsonProperty("ban_found") boolean[] zArr2) {
            return new AutoValue_CollectionStateProvider_Response(zArr, zArr2);
        }

        public abstract boolean[] isBanned();

        public abstract boolean[] isInCollection();
    }

    public static abstract class a {
        public abstract boolean a();

        public abstract boolean b();
    }

    public CollectionStateProvider(gmm<Response> gmm, rwl rwl) {
        this.a = gmm;
        this.b = rwl.a().a();
    }

    private Observable<Map<String, a>> a(String str, String str2, String str3, String str4, String... strArr) {
        try {
            return wit.b(this.a.resolve(new Request(str, str2, null, this.b.writeValueAsBytes(ContainsRequest.create(Lists.a((E[]) strArr), str3, str4))))).c((Function<? super T, ? extends R>) new Function(strArr) {
                private final /* synthetic */ String[] f$0;

                {
                    this.f$0 = r1;
                }

                public final Object apply(Object obj) {
                    return CollectionStateProvider.a(this.f$0, (Response) obj);
                }
            }).a(Functions.a());
        } catch (JsonProcessingException e) {
            return Observable.a((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map a(String[] strArr, Response response) {
        if (response.isInCollection().length == response.isBanned().length && response.isInCollection().length == strArr.length) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                hashMap.put(strArr[i], new isr(response.isInCollection()[i], response.isBanned()[i]));
            }
            return hashMap;
        }
        String str = "  soptmt hdhe ntipf irtt   m peen s eeunl e oa osietfoqnlinsl  e/flseinnteisrloostte ehssr uyo, daoq.Tges sso";
        throw Exceptions.a(new Exception("The list of items does not equal the list of items in response, and/or response types is not of equal length."));
    }

    public final Observable<Map<String, a>> a(String str, String str2, String... strArr) {
        String str3 = Request.SUB;
        String str4 = str2;
        return a(Request.SUB, "sp://core-collection/unstable/contains", str, str2, strArr);
    }

    public final Observable<Map<String, a>> b(String str, String str2, String... strArr) {
        String str3 = "SBU";
        String str4 = str;
        String str5 = str2;
        return a(Request.SUB, "sp://core-collection/unstable/contains?saved", str, str2, strArr);
    }
}
