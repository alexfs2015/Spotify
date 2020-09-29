package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.internal.PlayerInternalError;
import io.reactivex.ObservableSource;
import io.reactivex.Single;

/* renamed from: uws reason: default package */
public final class uws {
    private final RxRouter a;
    private final ObjectMapper b;

    uws(RxRouter rxRouter, rnf rnf) {
        this.a = rxRouter;
        this.b = uwp.a(rnf);
    }

    /* access modifiers changed from: 0000 */
    public final <T> Single<Response> a(String str, T t) {
        try {
            byte[] bytes = this.b.writeValueAsString(t).getBytes(far.c);
            return Single.a((ObservableSource<? extends T>) this.a.resolve(new Request(Request.POST, str, ImmutableMap.f(), bytes)));
        } catch (Exception e) {
            return Single.a((Throwable) new PlayerInternalError(e));
        }
    }
}
