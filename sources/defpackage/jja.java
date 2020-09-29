package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SensorRecorder;
import io.reactivex.Flowable;

/* renamed from: jja reason: default package */
public final class jja implements wig<jiy> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<hqy> b;
    private final wzi<SensorRecorder> c;
    private final wzi<hqu> d;

    private jja(wzi<Flowable<PlayerState>> wzi, wzi<hqy> wzi2, wzi<SensorRecorder> wzi3, wzi<hqu> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jja a(wzi<Flowable<PlayerState>> wzi, wzi<hqy> wzi2, wzi<SensorRecorder> wzi3, wzi<hqu> wzi4) {
        return new jja(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new jiy((Flowable) this.a.get(), (hqy) this.b.get(), (SensorRecorder) this.c.get(), (hqu) this.d.get());
    }
}
