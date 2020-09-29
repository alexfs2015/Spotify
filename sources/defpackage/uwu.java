package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: uwu reason: default package */
public final class uwu implements uww {
    private final RxRouter a;
    private final ObjectMapper b;
    private final Map<ho<Integer, Integer>, Flowable<PlayerState>> c = new ConcurrentHashMap();

    public uwu(RxRouter rxRouter, rnf rnf) {
        this.a = rxRouter;
        this.b = uwp.a(rnf);
    }

    public final Observable<PlayerError> a() {
        return this.a.resolve(new Request(Request.SUB, "sp://player/v2/main/error")).c((Function<? super T, ? extends R>) new $$Lambda$uwu$7Rnm7Jq_nLUVAkT0ZTjOkbzZhrA<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$WaC46rDa1BUiX9XVCD_8tLfIBE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(Response response) {
        return a(response, PlayerError.class);
    }

    private <T> Optional<T> a(Response response, Class<T> cls) {
        try {
            return Optional.b(this.b.readValue(response.getBody(), cls));
        } catch (IOException e) {
            Logger.e(e.getMessage(), e);
            return Optional.e();
        }
    }
}
