package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer;
import io.reactivex.Flowable;

/* renamed from: jjf reason: default package */
public final class jjf implements wig<jjd> {
    private final wzi<jkp> a;
    private final wzi<iiu> b;
    private final wzi<iiw> c;
    private final wzi<jlr> d;
    private final wzi<SensorRecorder> e;
    private final wzi<gvx> f;
    private final wzi<BluetoothCategorizer> g;
    private final wzi<xil> h;
    private final wzi<kfb> i;
    private final wzi<kfm> j;
    private final wzi<hqu> k;
    private final wzi<ocj> l;
    private final wzi<Flowable<PlayerState>> m;

    private jjf(wzi<jkp> wzi, wzi<iiu> wzi2, wzi<iiw> wzi3, wzi<jlr> wzi4, wzi<SensorRecorder> wzi5, wzi<gvx> wzi6, wzi<BluetoothCategorizer> wzi7, wzi<xil> wzi8, wzi<kfb> wzi9, wzi<kfm> wzi10, wzi<hqu> wzi11, wzi<ocj> wzi12, wzi<Flowable<PlayerState>> wzi13) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
        this.l = wzi12;
        this.m = wzi13;
    }

    public static jjf a(wzi<jkp> wzi, wzi<iiu> wzi2, wzi<iiw> wzi3, wzi<jlr> wzi4, wzi<SensorRecorder> wzi5, wzi<gvx> wzi6, wzi<BluetoothCategorizer> wzi7, wzi<xil> wzi8, wzi<kfb> wzi9, wzi<kfm> wzi10, wzi<hqu> wzi11, wzi<ocj> wzi12, wzi<Flowable<PlayerState>> wzi13) {
        jjf jjf = new jjf(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12, wzi13);
        return jjf;
    }

    public final /* synthetic */ Object get() {
        jjd jjd = new jjd((jkp) this.a.get(), (iiu) this.b.get(), (iiw) this.c.get(), (jlr) this.d.get(), (SensorRecorder) this.e.get(), (gvx) this.f.get(), (BluetoothCategorizer) this.g.get(), (xil) this.h.get(), (kfb) this.i.get(), (kfm) this.j.get(), (hqu) this.k.get(), (ocj) this.l.get(), (Flowable) this.m.get());
        return jjd;
    }
}
