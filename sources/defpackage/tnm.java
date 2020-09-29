package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingVoiceInteractionLoggerImpl;

/* renamed from: tnm reason: default package */
public interface tnm {

    /* renamed from: tnm$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static tnr a(InteractionLogger interactionLogger, String str) {
            return new DrivingVoiceInteractionLoggerImpl(interactionLogger, str);
        }
    }
}
