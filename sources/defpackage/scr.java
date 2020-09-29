package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: scr reason: default package */
public final class scr implements Consumer<i> {
    private final Context a;
    private final a b;
    private final Player c;
    private final boolean d;

    public scr(Context context, a aVar, Player player, sbk sbk) {
        this.a = context;
        this.b = aVar;
        this.c = player;
        this.d = sbk.b();
    }

    /* renamed from: a */
    public final void accept(i iVar) {
        if (this.d) {
            a(iVar.a);
        } else {
            a();
        }
    }

    private void a(String str) {
        b(str);
        String sih = ((sih) fay.a(this.b.ae_())).toString();
        this.c.playWithViewUri(a(str, sih), null, sih);
    }

    private static PlayerContext a(String str, String str2) {
        return PlayerContext.create(str2, new PlayerTrack[]{PlayerTrack.create(str)});
    }

    private void a() {
        mc.a(this.a).a(new Intent("on-demand-restricted"));
    }

    private static void b(String str) {
        if (fax.a(str)) {
            Assertion.b("URI cannot be empty to play it!");
        }
    }
}
