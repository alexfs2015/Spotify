package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.internal.PlayerInternalError;
import io.reactivex.ObservableSource;
import io.reactivex.Single;

/* renamed from: vip reason: default package */
public final class vip {
    private final RxRouter a;
    private final ObjectMapper b;

    vip(RxRouter rxRouter, rwl rwl) {
        this.a = rxRouter;
        this.b = vim.a(rwl);
    }

    /* access modifiers changed from: 0000 */
    public <T> Single<Response> a(String str, String str2, T t) {
        try {
            return Single.a((ObservableSource<? extends T>) this.a.resolve(new Request(str, str2, ImmutableMap.f(), this.b.writeValueAsString(t).getBytes(fbi.c))));
        } catch (Exception e) {
            return Single.a((Throwable) new PlayerInternalError(e));
        }
    }
}
