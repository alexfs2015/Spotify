package defpackage;

import android.content.Context;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverVolumeController;

/* renamed from: hhx reason: default package */
public final class hhx implements wig<hhw> {
    private final wzi<Context> a;
    private final wzi<SoundDriverVolumeController> b;

    private hhx(wzi<Context> wzi, wzi<SoundDriverVolumeController> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hhx a(wzi<Context> wzi, wzi<SoundDriverVolumeController> wzi2) {
        return new hhx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hhw((Context) this.a.get(), (SoundDriverVolumeController) this.b.get());
    }
}
