package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: tex reason: default package */
public final class tex {
    public static wud<BluetoothConnectionState> a(tev tev) {
        fay.a(tev);
        return wud.a((wun<Emitter<T>>) new $$Lambda$tex$ESUcXTTdePsxSNAq_bDxHtc_y1s<Emitter<T>>(tev), BackpressureMode.BUFFER);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(tev tev, Emitter emitter) {
        emitter.getClass();
        $$Lambda$kryOWEYceCssupt_cd2Sr9Hi0Y r0 = new $$Lambda$kryOWEYceCssupt_cd2Sr9Hi0Y(emitter);
        emitter.a((wur) new $$Lambda$tex$TOqrt5NdgkzKUeiI8qFJOKiBDnE(tev, r0));
        tev.a((a) r0);
    }
}
