package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import java.util.Arrays;
import java.util.List;

/* renamed from: qyg reason: default package */
public final class qyg {
    final Player a;

    /* renamed from: qyg$a */
    static final class a implements ActionCallback {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onActionForbidden(List<String> list) {
            Logger.e("Action forbidden, reasons: %s", Arrays.toString(list.toArray()));
        }

        public final void onActionSuccess() {
        }
    }

    public qyg(Player player) {
        this.a = player;
    }

    public final void a() {
        this.a.setShufflingContext(true);
    }
}
