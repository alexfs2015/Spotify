package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ogc reason: default package */
public final class ogc {
    private final RxResolver a;

    ogc(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public static Single<Boolean> a(Response response) {
        if (!b(response)) {
            return Single.b(Boolean.FALSE);
        }
        try {
            return Single.b(Boolean.valueOf(new JSONObject(new String(response.getBody(), Charset.defaultCharset())).getJSONObject("partners").has("samsung")));
        } catch (JSONException e) {
            return Single.a((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public static boolean b(Response response) {
        return response.getStatus() == 200;
    }

    public final Single<Boolean> a() {
        return this.a.resolve(RequestBuilder.get("hm://external-user-accounts/v1/status").build()).h().a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$ogc$sdkGDCC3NCkeX4aAAA1T70ln2Ug.INSTANCE);
    }

    public final Single<Boolean> a(SamsungLinkingRequest samsungLinkingRequest) {
        try {
            return this.a.resolve(RequestBuilder.post("hm://external-user-accounts/v1/link/samsung", samsungLinkingRequest).build()).h().f($$Lambda$ogc$dUOdqLdQBdl5R92b1Re6L4bLlQ.INSTANCE);
        } catch (ParserException e) {
            return Single.a((Throwable) e);
        }
    }
}
