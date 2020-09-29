package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: snh reason: default package */
public final class snh {
    private final Context a;
    private final sne b;
    private final NavigationManager c;
    private final slp d;
    private final smh e;
    private final soy f;

    public snh(Context context, sne sne, NavigationManager navigationManager, slp slp, smh smh, soy soy) {
        this.a = context;
        this.b = sne;
        this.c = navigationManager;
        this.d = slp;
        this.e = smh;
        this.f = soy;
    }

    public final void a(Intent intent, fpt fpt, SessionState sessionState, boolean z) {
        String action = intent.getAction();
        if ("android.intent.action.VIEW".equals(action)) {
            this.b.a(intent, fpt, sessionState, z);
        } else if ("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI".equals(action)) {
            this.d.a(intent);
        } else if ("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK".equals(action)) {
            this.c.d();
        } else if ("android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            this.b.a(intent, fpt, sessionState, z);
        } else if ("com.spotify.mobile.android.ui.action.player.SHOW".equals(action)) {
            if (this.f.a() == null) {
                this.b.a(kmf.a(this.a).a, fpt, sessionState, z);
            }
            this.e.a();
        } else if (a(action)) {
            a();
        } else if ("com.spotify.mobile.android.ui.action.view.ACTION_SHOW_OVERLAY".equals(action)) {
            if (this.f.a() == null) {
                this.b.a(kmf.a(this.a).a, fpt, sessionState, z);
            }
            this.b.a(intent, fpt, sessionState, z);
        } else {
            if (!z) {
                this.b.a(kmf.a(this.a).a, fpt, sessionState, z);
            }
        }
    }

    private void a() {
        Context context = this.a;
        context.startActivity(kmf.a(context, "spotify:internal:preferences").a);
    }

    private static boolean a(String str) {
        return VERSION.SDK_INT >= 24 && "android.intent.action.APPLICATION_PREFERENCES".equals(str);
    }
}
