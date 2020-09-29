package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: tam reason: default package */
public final class tam {
    private final Flowable<PlayerTrack> a;
    private final kug b;

    public tam(Flowable<PlayerTrack> flowable, kug kug) {
        this.a = flowable;
        this.b = kug;
    }

    public final Flowable<Boolean> a() {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$tam$cdT4IqVDnG7semnyd0hKJYsLmOo<Object,Object>(this)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public boolean a(PlayerTrack playerTrack) {
        return PlayerTrackUtil.isVideo(playerTrack) || this.b.a(playerTrack);
    }
}
