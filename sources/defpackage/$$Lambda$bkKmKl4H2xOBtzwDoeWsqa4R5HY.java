package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import rx.Emitter;

/* renamed from: -$$Lambda$bkKmKl4H2xOBtzwDoeWsqa4R5HY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$bkKmKl4H2xOBtzwDoeWsqa4R5HY implements a {
    private final /* synthetic */ Emitter f$0;

    public /* synthetic */ $$Lambda$bkKmKl4H2xOBtzwDoeWsqa4R5HY(Emitter emitter) {
        this.f$0 = emitter;
    }

    public final void connectionStateChanged(BluetoothConnectionState bluetoothConnectionState) {
        this.f$0.onNext(bluetoothConnectionState);
    }
}
