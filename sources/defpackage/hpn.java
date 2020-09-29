package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import java.util.List;

@Deprecated
/* renamed from: hpn reason: default package */
public interface hpn {
    public static final ActionCallback a = new ActionCallback() {
        public final void onActionForbidden(List<String> list) {
        }

        public final void onActionSuccess() {
        }
    };

    boolean a();

    boolean a(int i);

    boolean a(ActionCallback actionCallback);

    boolean a(boolean z);

    boolean a(boolean z, ActionCallback actionCallback);

    boolean b();

    boolean c();
}
