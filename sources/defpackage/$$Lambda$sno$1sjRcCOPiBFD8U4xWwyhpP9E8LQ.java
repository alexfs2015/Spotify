package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;

/* renamed from: -$$Lambda$sno$1sjRcCOPiBFD8U4xWwyhpP9E8LQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sno$1sjRcCOPiBFD8U4xWwyhpP9E8LQ implements wun {
    private final /* synthetic */ VoiceInteractionViewState f$0;

    public /* synthetic */ $$Lambda$sno$1sjRcCOPiBFD8U4xWwyhpP9E8LQ(VoiceInteractionViewState voiceInteractionViewState) {
        this.f$0 = voiceInteractionViewState;
    }

    public final void call(Object obj) {
        Logger.e((Throwable) obj, "Unable to transition to state %s", this.f$0);
    }
}
