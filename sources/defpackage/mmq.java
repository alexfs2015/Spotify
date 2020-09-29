package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.ConnectDevice;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.music.features.connect.dialogs.VolumeWidgetActivity;

/* renamed from: mmq reason: default package */
public final class mmq {
    public static synchronized boolean a(ConnectManager connectManager, gmk gmk, KeyEvent keyEvent, Activity activity, int i) {
        boolean z;
        synchronized (mmq.class) {
            int volumeControlStream = activity.getVolumeControlStream();
            ConnectDevice q = connectManager.q();
            if (q != null) {
                Tech.of(q).isCast();
            }
            if (volumeControlStream != 3) {
                activity.setVolumeControlStream(3);
            }
            boolean z2 = false;
            if (keyEvent.getAction() != 0 || !connectManager.v() || connectManager.u()) {
                z = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                z = keyCode != 24 ? keyCode != 25 ? false : gmk.b() : gmk.a();
                if (z && q != null) {
                    if (connectManager.u() || connectManager.v()) {
                        z2 = true;
                    }
                    if (z2) {
                        activity.startActivity(VolumeWidgetActivity.a(q, gmk.c(), activity));
                    }
                }
            }
        }
        return z;
    }
}
