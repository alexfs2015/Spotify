package defpackage;

import com.spotify.libs.connect.ConnectStates.State;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.miniplayer.logging.MiniPlayerLogConstants.SectionId;
import com.spotify.mobile.android.spotlets.miniplayer.logging.MiniPlayerLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: ixk reason: default package */
public final class ixk implements gsv, ixp {
    private final InteractionLogger a;
    private final wzi<PlayerState> b;
    private final rym c;
    private final gkq d;
    private final sso e;

    public ixk(InteractionLogger interactionLogger, wzi<PlayerState> wzi, rym rym, gkq gkq, sso sso) {
        this.a = (InteractionLogger) fbp.a(interactionLogger);
        this.b = (wzi) fbp.a(wzi);
        this.c = rym;
        this.d = gkq;
        this.e = sso;
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

    public final void a() {
        a(null, SectionId.CHEVRON_BUTTON, UserIntent.OPEN_NPV, InteractionType.HIT);
    }

    public final void b() {
        a(null, SectionId.CONTENT, UserIntent.OPEN_NPV, InteractionType.HIT);
    }

    public final void logConnectButtonClicked(State state) {
        this.c.a(state, this.d.a(), this.e.toString());
    }
}
