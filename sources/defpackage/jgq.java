package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer;
import io.reactivex.Flowable;

/* renamed from: jgq reason: default package */
public final class jgq implements vua<jgo> {
    private final wlc<jhz> a;
    private final wlc<igh> b;
    private final wlc<igj> c;
    private final wlc<jjf> d;
    private final wlc<SensorRecorder> e;
    private final wlc<gtx> f;
    private final wlc<BluetoothCategorizer> g;
    private final wlc<wug> h;
    private final wlc<kda> i;
    private final wlc<kdl> j;
    private final wlc<nvw> k;
    private final wlc<Flowable<PlayerState>> l;

    private jgq(wlc<jhz> wlc, wlc<igh> wlc2, wlc<igj> wlc3, wlc<jjf> wlc4, wlc<SensorRecorder> wlc5, wlc<gtx> wlc6, wlc<BluetoothCategorizer> wlc7, wlc<wug> wlc8, wlc<kda> wlc9, wlc<kdl> wlc10, wlc<nvw> wlc11, wlc<Flowable<PlayerState>> wlc12) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
    }

    public static jgq a(wlc<jhz> wlc, wlc<igh> wlc2, wlc<igj> wlc3, wlc<jjf> wlc4, wlc<SensorRecorder> wlc5, wlc<gtx> wlc6, wlc<BluetoothCategorizer> wlc7, wlc<wug> wlc8, wlc<kda> wlc9, wlc<kdl> wlc10, wlc<nvw> wlc11, wlc<Flowable<PlayerState>> wlc12) {
        jgq jgq = new jgq(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12);
        return jgq;
    }

    public final /* synthetic */ Object get() {
        jgo jgo = new jgo((jhz) this.a.get(), (igh) this.b.get(), (igj) this.c.get(), (jjf) this.d.get(), (SensorRecorder) this.e.get(), (gtx) this.f.get(), (BluetoothCategorizer) this.g.get(), (wug) this.h.get(), (kda) this.i.get(), (kdl) this.j.get(), (nvw) this.k.get(), (Flowable) this.l.get());
        return jgo;
    }
}
