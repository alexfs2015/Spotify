package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: tkt reason: default package */
public final class tkt {
    private final Flowable<PlayerTrack> a;
    private final kxp b;

    public tkt(Flowable<PlayerTrack> flowable, kxp kxp) {
        this.a = flowable;
        this.b = kxp;
    }

    /* access modifiers changed from: private */
    public boolean a(PlayerTrack playerTrack) {
        return PlayerTrackUtil.isVideo(playerTrack) || this.b.a(playerTrack);
    }

    public final Flowable<Boolean> a() {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$tkt$FCwF4T_Hxw8ADdIdQ8DUy5fp9ek<Object,Object>(this)).a(Functions.a());
    }
}
