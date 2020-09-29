package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import rx.Emitter;

/* renamed from: -$$Lambda$k-ryOWEYceCssupt_cd2Sr9Hi0Y reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kryOWEYceCssupt_cd2Sr9Hi0Y implements a {
    private final /* synthetic */ Emitter f$0;

    public /* synthetic */ $$Lambda$kryOWEYceCssupt_cd2Sr9Hi0Y(Emitter emitter) {
        this.f$0 = emitter;
    }

    public final void connectionStateChanged(BluetoothConnectionState bluetoothConnectionState) {
        this.f$0.onNext(bluetoothConnectionState);
    }
}
