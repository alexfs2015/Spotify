package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: tph reason: default package */
public final class tph {
    public static xii<BluetoothConnectionState> a(tpf tpf) {
        fbp.a(tpf);
        return xii.a((xis<Emitter<T>>) new $$Lambda$tph$1J3dXew1EvtBgRHkdv8fBQGKpx4<Emitter<T>>(tpf), BackpressureMode.BUFFER);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(tpf tpf, Emitter emitter) {
        emitter.getClass();
        $$Lambda$bkKmKl4H2xOBtzwDoeWsqa4R5HY r0 = new $$Lambda$bkKmKl4H2xOBtzwDoeWsqa4R5HY(emitter);
        emitter.a((xiw) new $$Lambda$tph$iZfRpKROfsJ_Tqwj94qf9FtwQ(tpf, r0));
        tpf.a((a) r0);
    }
}
