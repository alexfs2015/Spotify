package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.common.base.Function;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hbh reason: default package */
public final class hbh {
    private static final Function<String, PlayerTrack> a = new Function<String, PlayerTrack>() {
        public final /* synthetic */ Object apply(Object obj) {
            return PlayerTrack.create((String) obj);
        }
    };
    private final Player b;
    private final a c;
    private final Context d;
    private final fqn e;

    public hbh(Context context, fqn fqn, Player player, a aVar) {
        this.d = (Context) fbp.a(context);
        this.e = (fqn) fbp.a(fqn);
        this.b = (Player) fbp.a(player);
        this.c = (a) fbp.a(aVar);
    }

    private static fcp<PlayerTrack> a(Iterable<? extends String> iterable) {
        return fcp.a(iterable).a(hbg.a).a(a);
    }

    private void a(PlayerTrack[] playerTrackArr, int i) {
        String sso = ((sso) fbp.a(this.c.ae_())).toString();
        PlayerContext create = PlayerContext.create(sso, playerTrackArr);
        if (jus.c(this.e)) {
            this.b.playWithViewUri(create, i < 0 ? null : new Builder().skipToIndex(0, i).build(), sso);
        } else if (!jus.c(this.e)) {
            mh.a(this.d).a(new Intent("on-demand-restricted"));
        } else {
            Assertion.b("Can't play selected track");
        }
    }

    public void a(Iterable<? extends String> iterable, String str) {
        ArrayList arrayList = new ArrayList(16);
        Iterator it = a(iterable).iterator();
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            PlayerTrack playerTrack = (PlayerTrack) it.next();
            i2++;
            if (TextUtils.equals(str, playerTrack.uri())) {
                i = i2;
            }
            arrayList.add(playerTrack);
        }
        if (i < 0 && str != null) {
            Logger.d("Track not found in items, playing it as a single track context", new Object[0]);
            a(new PlayerTrack[]{PlayerTrack.create(str)}, 0);
        } else if (i < 0) {
            a((PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]), 0);
        } else {
            a((PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]), i);
        }
    }
}
