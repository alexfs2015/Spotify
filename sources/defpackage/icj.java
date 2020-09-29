package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.Locale;

/* renamed from: icj reason: default package */
public final class icj implements ick {
    private final RxResolver a;
    private final iag b;

    public icj(RxResolver rxResolver, iag iag) {
        this.a = rxResolver;
        this.b = iag;
    }

    public final Observable<Response> a(Intent intent) {
        StringBuilder sb = new StringBuilder("sp://ads/v1/slots/marquee/");
        sb.append(intent.name().toLowerCase(Locale.ENGLISH));
        String sb2 = sb.toString();
        Request a2 = this.b.a(Request.POST, sb2, Collections.emptyMap());
        Logger.b("[Marquee] - get fetch intent response", new Object[0]);
        return this.a.resolve(a2);
    }
}
