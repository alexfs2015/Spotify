package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.album.model.Album;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: gum reason: default package */
public final class gum implements gus {
    private final String a;
    private final String b;
    private final RxResolver c;
    private final Scheduler d;

    public gum(jva jva, RxResolver rxResolver, Scheduler scheduler) {
        this.a = jva.f();
        this.b = jva.h();
        this.c = rxResolver;
        this.d = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(List list) {
        return PlayerContext.create(this.b, (PlayerTrack[]) list.toArray(new PlayerTrack[0]));
    }

    public final xii<PlayerContext> resolve() {
        return xim.a(new gun(new gmp(Album.class, (rwl) gih.a(rwl.class), this.c, this.d), this.a).a()).e((xiy<? super T, ? extends R>) new $$Lambda$gum$oMaUsbbmkSr4sVCBu4ddlDteSQk<Object,Object>(this));
    }
}
