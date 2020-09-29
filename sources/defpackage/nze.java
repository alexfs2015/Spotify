package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.features.partneraccountlinking.clientprovider.PartnerAccountLinkingRequest;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nze reason: default package */
public final class nze {
    private final RxResolver a;

    nze(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: 0000 */
    public final wuh<Boolean> a(PartnerAccountLinkingRequest partnerAccountLinkingRequest) {
        try {
            return vun.a((ObservableSource<T>) this.a.resolve(RequestBuilder.post(partnerAccountLinkingRequest.backendUrl(), partnerAccountLinkingRequest).build()), BackpressureStrategy.BUFFER).a().a((wut<? super T, ? extends wuh<? extends R>>) $$Lambda$nze$GEzkNzEW7yFfYBICVktrhOdXyQY.INSTANCE);
        } catch (ParserException e) {
            return wuh.a((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public static wuh<Boolean> a(Response response) {
        if (b(response)) {
            return wxt.a(Boolean.TRUE);
        }
        StringBuilder sb = new StringBuilder("Got response code ");
        sb.append(response.getStatus());
        return wuh.a((Throwable) new RuntimeException(sb.toString()));
    }

    public final wuh<Boolean> a(nzr nzr) {
        return vun.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(nzr.a()).build()), BackpressureStrategy.BUFFER).a().a((wut<? super T, ? extends wuh<? extends R>>) new $$Lambda$nze$a6A_zuXrSlgpNqWvkOMvqtmjvQ<Object,Object>(nzr));
    }

    /* access modifiers changed from: private */
    public static wuh<Boolean> a(String str, Response response) {
        if (!b(response)) {
            return wxt.a(Boolean.FALSE);
        }
        try {
            return wxt.a(Boolean.valueOf(new JSONObject(new String(response.getBody(), Charset.defaultCharset())).getJSONObject("partners").has(str)));
        } catch (JSONException e) {
            return wuh.a((Throwable) e);
        }
    }

    private static boolean b(Response response) {
        return response.getStatus() == 200;
    }
}
