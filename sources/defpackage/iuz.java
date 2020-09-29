package defpackage;

import com.spotify.libs.connect.ConnectStates.State;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.miniplayer.logging.MiniPlayerLogConstants.SectionId;
import com.spotify.mobile.android.spotlets.miniplayer.logging.MiniPlayerLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: iuz reason: default package */
public final class iuz implements gqw, ive {
    private final InteractionLogger a;
    private final wlc<PlayerState> b;
    private final rpg c;
    private final gjf d;
    private final sih e;

    public iuz(InteractionLogger interactionLogger, wlc<PlayerState> wlc, rpg rpg, gjf gjf, sih sih) {
        this.a = (InteractionLogger) fay.a(interactionLogger);
        this.b = (wlc) fay.a(wlc);
        this.c = rpg;
        this.d = gjf;
        this.e = sih;
    }

    public final void logConnectButtonClicked(State state) {
        this.c.a(state, this.d.a(), this.e.toString());
    }

    public final void a() {
        a(null, SectionId.CHEVRON_BUTTON, UserIntent.OPEN_NPV, InteractionType.HIT);
    }

    public final void b() {
        a(null, SectionId.CONTENT, UserIntent.OPEN_NPV, InteractionType.HIT);
    }

    private void a(String str, SectionId sectionId, UserIntent userIntent, InteractionType interactionType) {
        this.a.a(d(), (String) null, sectionId.toString(), 0, interactionType, userIntent.toString());
    }

    private PlayerState c() {
        return (PlayerState) this.b.get();
    }

    private String d() {
        PlayerState c2 = c();
        if (c2 == null) {
            return null;
        }
        return c2.playbackId();
    }
}
