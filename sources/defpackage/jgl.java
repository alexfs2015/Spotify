package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SensorRecorder;
import io.reactivex.Flowable;

/* renamed from: jgl reason: default package */
public final class jgl implements vua<jgj> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<hou> b;
    private final wlc<SensorRecorder> c;

    private jgl(wlc<Flowable<PlayerState>> wlc, wlc<hou> wlc2, wlc<SensorRecorder> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static jgl a(wlc<Flowable<PlayerState>> wlc, wlc<hou> wlc2, wlc<SensorRecorder> wlc3) {
        return new jgl(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new jgj((Flowable) this.a.get(), (hou) this.b.get(), (SensorRecorder) this.c.get());
    }
}
