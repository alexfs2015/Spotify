package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;

/* renamed from: -$$Lambda$sxv$w-Ss46CETC_TVe1FPpRMti8Ky3Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$sxv$wSs46CETC_TVe1FPpRMti8Ky3Q implements xis {
    private final /* synthetic */ VoiceInteractionViewState f$0;

    public /* synthetic */ $$Lambda$sxv$wSs46CETC_TVe1FPpRMti8Ky3Q(VoiceInteractionViewState voiceInteractionViewState) {
        this.f$0 = voiceInteractionViewState;
    }

    public final void call(Object obj) {
        Logger.e((Throwable) obj, "Unable to transition to state %s", this.f$0);
    }
}
