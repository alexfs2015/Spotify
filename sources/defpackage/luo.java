package defpackage;

import android.app.Activity;
import com.spotify.music.spotlets.voice.VoiceInteractionReferral;

/* renamed from: luo reason: default package */
public final class luo implements gvk {
    private final ukj b;
    private final Activity c;
    private final fpt d;
    private final umf e;

    public luo(Activity activity, ukj ukj, umf umf, fpt fpt) {
        this.c = activity;
        this.b = ukj;
        this.e = umf;
        this.d = fpt;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.e.a();
        this.b.a(this.c, this.d, VoiceInteractionReferral.BROWSE_MIC_BUTTON.name(), null);
    }
}
