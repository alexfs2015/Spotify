package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hpe reason: default package */
public final class hpe implements SpotifyServiceIntentProcessor {
    private final hhw a;

    public hpe(hhw hhw) {
        this.a = hhw;
    }

    public final Result a(boolean z, Intent intent) {
        fbp.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.audiosession.DUCKING_START"));
        int intExtra = intent.getIntExtra("ramp_time_ms", -1);
        float floatExtra = intent.getFloatExtra("ducking_volume", -1.0f);
        if (intExtra < 0 || floatExtra < 0.0f) {
            AudioDriver.startDuckingAudioSession(this.a.c);
        } else {
            AudioDriver.startDuckingAudioSession(this.a.c, intExtra, floatExtra);
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
