package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hpf reason: default package */
public final class hpf implements SpotifyServiceIntentProcessor {
    private final hhw a;

    public hpf(hhw hhw) {
        this.a = hhw;
    }

    public final Result a(boolean z, Intent intent) {
        fbp.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.audiosession.DUCKING_STOP"));
        int intExtra = intent.getIntExtra("ramp_time_ms", -1);
        if (intExtra >= 0) {
            AudioDriver.stopDuckingAudioSession(this.a.c, intExtra);
        } else {
            AudioDriver.stopDuckingAudioSession(this.a.c);
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
