package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.Observable;

/* renamed from: idw reason: default package */
public final class idw {
    private final RxResolver a;

    public idw(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final Observable<Response> a(AdSlot adSlot) {
        try {
            return this.a.resolve(RequestBuilder.put(adSlot.getCosmosEndpoint(), adSlot).build());
        } catch (ParserException e) {
            return Observable.a((Throwable) e);
        }
    }
}
