package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hlp reason: default package */
final class hlp implements SpotifyServiceIntentProcessor {
    private final hfa a;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    hlp(hfa hfa) {
        this.a = hfa;
    }

    public final Result a(boolean z, Intent intent) {
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("callback");
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("audio_session_id", this.a.c);
            resultReceiver.send(0, bundle);
        }
        return Result.IGNORABLE;
    }
}
