package defpackage;

import android.content.Intent;
import android.os.Process;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hly reason: default package */
final class hly implements SpotifyServiceIntentProcessor {
    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    hly() {
    }

    public final Result a(boolean z, Intent intent) {
        Process.killProcess(Process.myPid());
        return Result.IGNORABLE;
    }
}
