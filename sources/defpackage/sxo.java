package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: sxo reason: default package */
public final class sxo {
    private final Context a;
    private final sxl b;
    private final NavigationManager c;
    private final svw d;
    private final swo e;
    private final szf f;

    public sxo(Context context, sxl sxl, NavigationManager navigationManager, svw svw, swo swo, szf szf) {
        this.a = context;
        this.b = sxl;
        this.c = navigationManager;
        this.d = svw;
        this.e = swo;
        this.f = szf;
    }

    private void a() {
        Context context = this.a;
        context.startActivity(kpo.a(context, "spotify:internal:preferences").a);
    }

    private static boolean a(String str) {
        return VERSION.SDK_INT >= 24 && "android.intent.action.APPLICATION_PREFERENCES".equals(str);
    }

    public final void a(Intent intent, fqn fqn, SessionState sessionState, boolean z) {
        String action = intent.getAction();
        if ("android.intent.action.VIEW".equals(action)) {
            this.b.a(intent, fqn, sessionState, z);
        } else if ("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI".equals(action)) {
            this.d.a(intent);
        } else if ("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK".equals(action)) {
            this.c.d();
        } else if ("android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            this.b.a(intent, fqn, sessionState, z);
        } else if ("com.spotify.mobile.android.ui.action.player.SHOW".equals(action)) {
            if (this.f.a() == null) {
                this.b.a(kpo.a(this.a).a, fqn, sessionState, z);
            }
            this.e.a();
        } else if (a(action)) {
            a();
        } else if ("com.spotify.mobile.android.ui.action.view.ACTION_SHOW_OVERLAY".equals(action)) {
            if (this.f.a() == null) {
                this.b.a(kpo.a(this.a).a, fqn, sessionState, z);
            }
            this.b.a(intent, fqn, sessionState, z);
        } else {
            if (!z) {
                this.b.a(kpo.a(this.a).a, fqn, sessionState, z);
            }
        }
    }
}
