package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.features.queue.logging.QueueLogConstants.SectionId;
import com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: pmg reason: default package */
public final class pmg {
    private final InteractionLogger a;
    private final wlc<PlayerState> b;

    public pmg(InteractionLogger interactionLogger, wlc<PlayerState> wlc) {
        this.a = (InteractionLogger) fay.a(interactionLogger);
        this.b = (wlc) fay.a(wlc);
    }

    public void a(String str, SectionId sectionId, UserIntent userIntent, InteractionType interactionType) {
        this.a.a(b(), str, sectionId.toString(), 0, interactionType, userIntent.toString());
    }

    public PlayerState a() {
        return (PlayerState) this.b.get();
    }

    private String b() {
        PlayerState a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.playbackId();
    }
}
