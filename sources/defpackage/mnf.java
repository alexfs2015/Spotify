package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: mnf reason: default package */
public final class mnf implements a {
    private final ConnectManager a;
    private final gmk b;
    private final Activity c;

    public mnf(ConnectManager connectManager, gmk gmk, Activity activity) {
        this.a = connectManager;
        this.b = gmk;
        this.c = activity;
    }

    public final boolean a(KeyEvent keyEvent) {
        return mmq.a(this.a, this.b, keyEvent, this.c, 3);
    }
}
