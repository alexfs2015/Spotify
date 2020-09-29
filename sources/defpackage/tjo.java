package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.nowplaying.core.repeat.RepeatState;
import com.spotify.nowplaying.core.shuffle.ShuffleState;

/* renamed from: tjo reason: default package */
public final class tjo {
    private final Context a;
    private final sso b;
    private final jpc c;
    private final who<tjs> d;
    private final who<tjq> e;

    public tjo(Context context, sso sso, jpc jpc, who<tjs> who, who<tjq> who2) {
        this.a = context;
        this.b = sso;
        this.c = jpc;
        this.d = who;
        this.e = who2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(String str, boolean z, tjl tjl, PlayerTrack playerTrack) {
        String str2 = (String) playerTrack.metadata().get("title");
        boolean z2 = false;
        if (jva.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE) {
            b b2 = tjl.b();
            k h = this.c.b(playerTrack.uri(), str2, str, z, playerTrack.metadata()).a(a(playerTrack)).a(this.b).b(b2.d()).d(b2.c()).e(true).f(b2.b()).g(a(playerTrack)).h(false);
            if (!a(playerTrack) && b2.g()) {
                z2 = true;
            }
            return h.i(z2).k(!b2.a()).j(b2.e()).m(b2.f()).a(uqo.aw).a();
        }
        c a2 = tjl.a();
        f n = this.c.a(playerTrack.uri(), str2, str, z, playerTrack.metadata()).a(this.b).a((fbo.a((String) playerTrack.metadata().get("album_uri")) ^ true) && a2.d()).b(!fbo.a((String) playerTrack.metadata().get("artist_uri"))).c(a2.a()).d(false).g(a2.f()).m(a2.g()).j(a2.c()).i(!a2.h()).h(!a2.b()).a(uqo.aw).l(a2.i()).n(a2.l());
        if (a2.j()) {
            tjs tjs = (tjs) this.d.get();
            boolean a3 = tjs.a((PlayerState) fbp.a(tjs.b.getLastPlayerState()));
            PlayerState playerState = (PlayerState) fbp.a(tjs.b.getLastPlayerState());
            boolean shufflingContext = playerState.options().shufflingContext();
            n.a(new jqm(a3, tjs.a(playerState) ? ImmutableList.a(ves.a(vdb.a(shufflingContext, true), tjs.a), ves.a(vdb.a(!shufflingContext, true), tjs.a)) : ImmutableList.a(ves.a(ShuffleState.DISABLED, tjs.a)), tjs.a()));
        }
        if (a2.k()) {
            tjq tjq = (tjq) this.e.get();
            if (vda.a((PlayerState) fbp.a(tjq.b.getLastPlayerState())) != RepeatState.DISABLED) {
                z2 = true;
            }
            PlayerState playerState2 = (PlayerState) fbp.a(tjq.b.getLastPlayerState());
            RepeatState a4 = vda.a(playerState2);
            n.b(new jqm(z2, a4 == RepeatState.DISABLED ? ImmutableList.a(ven.a(RepeatState.DISABLED, tjq.a)) : tjq.a(a4, playerState2.restrictions()), tjq.a()));
        }
        return n.a();
    }

    private static boolean a(PlayerTrack playerTrack) {
        return "video".equals(playerTrack.metadata().get("media.type"));
    }

    public final void a(PlayerTrack playerTrack, String str, boolean z, tjl tjl) {
        jok.a(this.a, new $$Lambda$tjo$RO5gwqRzm6UZ1ZRBIGeMOtXPykc(this, str, z, tjl), playerTrack, this.b);
    }
}
