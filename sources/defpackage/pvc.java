package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.features.queue.logging.QueueLogConstants.SectionId;
import com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: pvc reason: default package */
public final class pvc {
    private final InteractionLogger a;
    private final wzi<PlayerState> b;

    public pvc(InteractionLogger interactionLogger, wzi<PlayerState> wzi) {
        this.a = (InteractionLogger) fbp.a(interactionLogger);
        this.b = (wzi) fbp.a(wzi);
    }

    private String b() {
        PlayerState a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.playbackId();
    }

    public PlayerState a() {
        return (PlayerState) this.b.get();
    }

    public void a(String str, SectionId sectionId, UserIntent userIntent, InteractionType interactionType) {
        this.a.a(b(), str, sectionId.toString(), 0, interactionType, userIntent.toString());
    }
}
