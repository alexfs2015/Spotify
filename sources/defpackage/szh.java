package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.nowplaying.core.repeat.RepeatState;
import com.spotify.nowplaying.core.shuffle.ShuffleState;

/* renamed from: szh reason: default package */
public final class szh {
    private final Context a;
    private final sih b;
    private final jmq c;
    private final vti<szl> d;
    private final vti<szj> e;

    public szh(Context context, sih sih, jmq jmq, vti<szl> vti, vti<szj> vti2) {
        this.a = context;
        this.b = sih;
        this.c = jmq;
        this.d = vti;
        this.e = vti2;
    }

    public final void a(PlayerTrack playerTrack, String str, boolean z, sze sze) {
        jly.a(this.a, new $$Lambda$szh$K64DrNNZ8IwOrBAkTtltsjrWPOI(this, str, z, sze), playerTrack, this.b);
    }

    private static boolean a(PlayerTrack playerTrack) {
        return "video".equals(playerTrack.metadata().get("media.type"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(String str, boolean z, sze sze, PlayerTrack playerTrack) {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        String str2 = (String) playerTrack.metadata().get("title");
        boolean z2 = false;
        if (jst.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE) {
            b b2 = sze.b();
            k h = this.c.b(playerTrack.uri(), str2, str, z, playerTrack.metadata()).a(a(playerTrack)).a(this.b).b(b2.d()).d(b2.c()).e(true).f(b2.b()).g(a(playerTrack)).h(false);
            if (!a(playerTrack) && b2.g()) {
                z2 = true;
            }
            return h.i(z2).k(!b2.a()).j(b2.e()).m(b2.f()).a(udt.aw).a();
        }
        c a2 = sze.a();
        f n = this.c.a(playerTrack.uri(), str2, str, z, playerTrack.metadata()).a(this.b).a((fax.a((String) playerTrack.metadata().get("album_uri")) ^ true) && a2.d()).b(!fax.a((String) playerTrack.metadata().get("artist_uri"))).c(a2.a()).d(false).g(a2.f()).m(a2.g()).j(a2.c()).i(!a2.h()).h(!a2.b()).a(udt.aw).l(a2.i()).n(a2.l());
        if (a2.j()) {
            szl szl = (szl) this.d.get();
            boolean a3 = szl.a((PlayerState) fay.a(szl.b.getLastPlayerState()));
            PlayerState playerState = (PlayerState) fay.a(szl.b.getLastPlayerState());
            boolean shufflingContext = playerState.options().shufflingContext();
            if (szl.a(playerState)) {
                immutableList2 = ImmutableList.a(utn.a(urw.a(shufflingContext, true), szl.a), utn.a(urw.a(!shufflingContext, true), szl.a));
            } else {
                immutableList2 = ImmutableList.a(utn.a(ShuffleState.DISABLED, szl.a));
            }
            n.a(new joa(a3, immutableList2, szl.a()));
        }
        if (a2.k()) {
            szj szj = (szj) this.e.get();
            if (urv.a((PlayerState) fay.a(szj.b.getLastPlayerState())) != RepeatState.DISABLED) {
                z2 = true;
            }
            PlayerState playerState2 = (PlayerState) fay.a(szj.b.getLastPlayerState());
            RepeatState a4 = urv.a(playerState2);
            if (a4 == RepeatState.DISABLED) {
                immutableList = ImmutableList.a(uti.a(RepeatState.DISABLED, szj.a));
            } else {
                immutableList = szj.a(a4, playerState2.restrictions());
            }
            n.b(new joa(z2, immutableList, szj.a()));
        }
        return n.a();
    }
}
