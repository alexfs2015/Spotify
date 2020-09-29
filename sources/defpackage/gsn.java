package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.album.model.Album;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: gsn reason: default package */
public final class gsn implements gst {
    private final String a;
    private final String b;
    private final RxResolver c;
    private final Scheduler d;

    public gsn(jst jst, RxResolver rxResolver, Scheduler scheduler) {
        this.a = jst.f();
        this.b = jst.h();
        this.c = rxResolver;
        this.d = scheduler;
    }

    public final wud<PlayerContext> resolve() {
        return wuh.a(new gso(new glb(Album.class, (rnf) ggw.a(rnf.class), this.c, this.d), this.a).a()).f(new $$Lambda$gsn$o1x8pqcaftEVwrKbfCMtzARIaE0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(List list) {
        return PlayerContext.create(this.b, (PlayerTrack[]) list.toArray(new PlayerTrack[0]));
    }
}
