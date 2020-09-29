package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import java.util.Arrays;
import java.util.List;

/* renamed from: qpr reason: default package */
public final class qpr {
    final Player a;

    /* renamed from: qpr$a */
    static final class a implements ActionCallback {
        public final void onActionSuccess() {
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onActionForbidden(List<String> list) {
            Logger.e("Action forbidden, reasons: %s", Arrays.toString(list.toArray()));
        }
    }

    public qpr(Player player) {
        this.a = player;
    }

    public final void a() {
        this.a.setShufflingContext(true);
    }
}
