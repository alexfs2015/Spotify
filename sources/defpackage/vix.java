package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.IOException;
import java.util.Locale;

/* renamed from: vix reason: default package */
public final class vix implements viy {
    private final RxRouter a;
    private final ObjectMapper b;

    public vix(RxRouter rxRouter, rwl rwl) {
        this.a = rxRouter;
        this.b = vim.a(rwl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(Response response) {
        return a(response, PlayerState.class);
    }

    private <T> Optional<T> a(Response response, Class<T> cls) {
        try {
            return Optional.b(this.b.readValue(response.getBody(), cls));
        } catch (IOException e) {
            Logger.e(e.getMessage(), e);
            return Optional.e();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b(Response response) {
        return a(response, PlayerError.class);
    }

    private Flowable<PlayerState> b(int i, int i2) {
        return this.a.resolve(new Request(Request.SUB, String.format(Locale.US, "sp://player/v2/main?reverse_cap=%d&future_cap=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}))).c((Function<? super T, ? extends R>) new $$Lambda$vix$273oDGbVioo0865b_tmrk6r2M<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$XqayuWREa4f67a7v0ei2RaiRb8c.INSTANCE).a(BackpressureStrategy.LATEST);
    }

    public final Flowable<PlayerState> a() {
        return a(2, 2);
    }

    public final Flowable<PlayerState> a(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            return b(i, i2);
        }
        throw new IllegalArgumentException("Cap under zero");
    }

    public final Observable<PlayerError> b() {
        return this.a.resolve(new Request(Request.SUB, "sp://player/v2/main/error")).c((Function<? super T, ? extends R>) new $$Lambda$vix$2Y8MxqWzAUJFF5C1UYThh0iJFSs<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$WaC46rDa1BUiX9XVCD_8tLfIBE.INSTANCE);
    }
}
