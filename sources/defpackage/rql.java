package defpackage;

import android.media.AudioManager;
import com.spotify.base.java.logging.Logger;

/* renamed from: rql reason: default package */
public final class rql {
    private final vti<AudioManager> a;

    public rql(vti<AudioManager> vti) {
        this.a = vti;
    }

    public final int a(boolean z) {
        int streamMaxVolume = ((AudioManager) this.a.get()).getStreamMaxVolume(3) / 5;
        int streamVolume = ((AudioManager) this.a.get()).getStreamVolume(3);
        int i = z ? streamVolume + streamMaxVolume : streamVolume - streamMaxVolume;
        Logger.b("Adjusting volume with factor %s to %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(i));
        return i;
    }
}
