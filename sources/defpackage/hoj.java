package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hoj reason: default package */
public final class hoj implements SpotifyServiceIntentProcessor {
    private final hhw a;

    public hoj(hhw hhw) {
        this.a = hhw;
    }

    public final Result a(boolean z, Intent intent) {
        fbp.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.audiosession.DUCKING_CANCEL"));
        int intExtra = intent.getIntExtra("delay_ms", -1);
        if (intExtra >= 0) {
            AudioDriver.cancelDuckingAudioSession(this.a.c, intExtra);
        } else {
            AudioDriver.cancelDuckingAudioSession(this.a.c);
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
