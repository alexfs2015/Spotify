package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: iwz reason: default package */
public interface iwz {

    /* renamed from: iwz$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Player a(PlayerFactory playerFactory) {
            return playerFactory.create(ViewUris.V.toString(), uqo.ar, rta.p);
        }

        public static ixq a() {
            return new ixq(ViewUris.V.toString());
        }

        public static ixr a(wbt wbt, ixq ixq) {
            return new ixm(wbt, ixq);
        }
    }
}
