package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingVoiceInteractionLoggerImpl;

/* renamed from: tdf reason: default package */
public interface tdf {

    /* renamed from: tdf$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static tdi a(InteractionLogger interactionLogger, String str) {
            return new DrivingVoiceInteractionLoggerImpl(interactionLogger, str);
        }
    }
}
