package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverVolumeController;

/* renamed from: rpw reason: default package */
public final class rpw implements SoundDriverVolumeController {
    private final AudioManager a;
    private final int b = this.a.getStreamMaxVolume(3);
    private boolean c;

    public rpw(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
    }

    public final void onSetVolume(int i) {
        if (this.c) {
            this.a.setStreamVolume(3, Math.round(((float) (i * this.b)) / 65535.0f), 1);
            return;
        }
        this.c = true;
    }

    public final int onGetVolume() {
        return Math.round(((float) (this.a.getStreamVolume(3) * AudioDriver.SPOTIFY_MAX_VOLUME)) / ((float) this.b));
    }
}
