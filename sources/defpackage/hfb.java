package defpackage;

import android.content.Context;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverVolumeController;

/* renamed from: hfb reason: default package */
public final class hfb implements vua<hfa> {
    private final wlc<Context> a;
    private final wlc<SoundDriverVolumeController> b;

    private hfb(wlc<Context> wlc, wlc<SoundDriverVolumeController> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hfb a(wlc<Context> wlc, wlc<SoundDriverVolumeController> wlc2) {
        return new hfb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hfa((Context) this.a.get(), (SoundDriverVolumeController) this.b.get());
    }
}
