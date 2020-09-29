package defpackage;

import android.app.Activity;
import com.spotify.music.spotlets.voice.VoiceInteractionReferral;

/* renamed from: lyn reason: default package */
public final class lyn implements gxk {
    private final uvu b;
    private final Activity c;
    private final fqn d;
    private final uxj e;

    public lyn(Activity activity, uvu uvu, uxj uxj, fqn fqn) {
        this.c = activity;
        this.b = uvu;
        this.e = uxj;
        this.d = fqn;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.e.a();
        this.b.a(this.c, this.d, VoiceInteractionReferral.BROWSE_MIC_BUTTON.name(), null);
    }
}
