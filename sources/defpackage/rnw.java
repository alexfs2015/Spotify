package defpackage;

import android.content.Context;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer;
import io.reactivex.Scheduler;

/* renamed from: rnw reason: default package */
public final class rnw implements vua<BluetoothCategorizer> {
    private final wlc<Context> a;
    private final wlc<rnz> b;
    private final wlc<jvy> c;
    private final wlc<Scheduler> d;

    private rnw(wlc<Context> wlc, wlc<rnz> wlc2, wlc<jvy> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rnw a(wlc<Context> wlc, wlc<rnz> wlc2, wlc<jvy> wlc3, wlc<Scheduler> wlc4) {
        return new rnw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new BluetoothCategorizer((Context) this.a.get(), (rnz) this.b.get(), (jvy) this.c.get(), (Scheduler) this.d.get());
    }
}
