package defpackage;

import android.view.KeyEvent;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;

/* renamed from: hgf reason: default package */
public interface hgf {

    /* renamed from: hgf$a */
    public interface a extends ActionCallback {

        /* renamed from: hgf$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onActionSuccess(a aVar) {
            }
        }

        void onActionSuccess();
    }

    void a(KeyEvent keyEvent, a aVar);
}
