package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: rew reason: default package */
public final class rew implements vua<rey> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<heg> b;
    private final wlc<Boolean> c;

    private rew(wlc<Flowable<PlayerState>> wlc, wlc<heg> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rew a(wlc<Flowable<PlayerState>> wlc, wlc<heg> wlc2, wlc<Boolean> wlc3) {
        return new rew(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        Flowable flowable = (Flowable) this.a.get();
        heg heg = (heg) this.b.get();
        if (((Boolean) this.c.get()).booleanValue()) {
            obj = new rez(flowable, heg);
        } else {
            obj = new rfa();
        }
        return (rey) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
