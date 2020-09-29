package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: smy reason: default package */
public final class smy implements Consumer<i> {
    private final Context a;
    private final a b;
    private final Player c;
    private final boolean d;

    public smy(Context context, a aVar, Player player, slr slr) {
        this.a = context;
        this.b = aVar;
        this.c = player;
        this.d = slr.b();
    }

    private static PlayerContext a(String str, String str2) {
        return PlayerContext.create(str2, new PlayerTrack[]{PlayerTrack.create(str)});
    }

    private void a() {
        mh.a(this.a).a(new Intent("on-demand-restricted"));
    }

    private void a(String str) {
        b(str);
        String sso = ((sso) fbp.a(this.b.ae_())).toString();
        this.c.playWithViewUri(a(str, sso), null, sso);
    }

    private static void b(String str) {
        if (fbo.a(str)) {
            Assertion.b("URI cannot be empty to play it!");
        }
    }

    /* renamed from: a */
    public final void accept(i iVar) {
        if (this.d) {
            a(iVar.a);
        } else {
            a();
        }
    }
}
