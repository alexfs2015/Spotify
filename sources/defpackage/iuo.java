package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: iuo reason: default package */
public interface iuo {

    /* renamed from: iuo$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Player a(PlayerFactory playerFactory) {
            return playerFactory.create(ViewUris.W.toString(), udt.ar, rju.p);
        }

        public static ivf a() {
            return new ivf(ViewUris.W.toString());
        }

        public static ivg a(vol vol, ivf ivf) {
            return new ivb(vol, ivf);
        }
    }
}
