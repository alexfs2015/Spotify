package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: otu reason: default package */
public final class otu implements ott {
    private final InteractionLogger a;

    public otu(opb opb) {
        this.a = opb.a(PageIdentifiers.PLAYLIST_STORY);
    }

    public final void b(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "play");
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "pause");
    }

    public final void a(String str, boolean z) {
        this.a.a(str, "header", 0, InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
    }
}