package defpackage;

import android.view.KeyEvent;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;

/* renamed from: hjb reason: default package */
public interface hjb {

    /* renamed from: hjb$a */
    public interface a extends ActionCallback {

        /* renamed from: hjb$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onActionSuccess(a aVar) {
            }
        }

        void onActionSuccess();
    }

    void a(KeyEvent keyEvent, a aVar);
}
