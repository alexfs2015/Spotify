package defpackage;

import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper;

/* renamed from: ozd reason: default package */
public final class ozd implements vua<CETopicsRolloutHelper> {
    private final wlc<gdz<fko>> a;

    private ozd(wlc<gdz<fko>> wlc) {
        this.a = wlc;
    }

    public static ozd a(wlc<gdz<fko>> wlc) {
        return new ozd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new CETopicsRolloutHelper((gdz) this.a.get());
    }
}
