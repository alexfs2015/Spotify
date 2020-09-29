package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.SensorRecorder;

/* renamed from: jsp reason: default package */
public final class jsp implements vua<SensorRecorder> {
    private final wlc<Context> a;
    private final wlc<jjf> b;

    private jsp(wlc<Context> wlc, wlc<jjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jsp a(wlc<Context> wlc, wlc<jjf> wlc2) {
        return new jsp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new SensorRecorder((Context) this.a.get(), (jjf) this.b.get());
    }
}
