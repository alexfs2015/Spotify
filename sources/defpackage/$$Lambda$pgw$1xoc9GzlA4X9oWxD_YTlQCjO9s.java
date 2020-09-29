package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pgw$1xoc9Gz-lA4X9oWxD_YTlQCjO9s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pgw$1xoc9GzlA4X9oWxD_YTlQCjO9s implements Function {
    private final /* synthetic */ PlayerTrack f$0;

    public /* synthetic */ $$Lambda$pgw$1xoc9GzlA4X9oWxD_YTlQCjO9s(PlayerTrack playerTrack) {
        this.f$0 = playerTrack;
    }

    public final Object apply(Object obj) {
        return pgw.a(this.f$0, (PlayerQueue) obj);
    }
}
