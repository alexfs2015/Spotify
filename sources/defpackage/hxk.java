package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.spotify.base.java.logging.Logger;
import java.util.Locale;

/* renamed from: hxk reason: default package */
public final class hxk implements c {
    private final vps a;

    hxk(vps vps) {
        this.a = vps;
    }

    public final void ai_() {
        vps vps = this.a;
        boolean z = false;
        Logger.a("start", new Object[0]);
        boolean a2 = fl.a(vps.a).a();
        AccessibilityManager accessibilityManager = (AccessibilityManager) vps.a.getSystemService("accessibility");
        if (accessibilityManager != null) {
            z = accessibilityManager.isTouchExplorationEnabled();
        }
        vps.b.a(gos.a(Locale.getDefault()), z, a2);
        vps.c.a(gos.a(Locale.getDefault()), z, a2);
        vps.d.a();
    }

    public final void aj_() {
        vps vps = this.a;
        vps.d.b();
        if (!vps.e.b()) {
            vps.e.bd_();
        }
    }

    public final String c() {
        return "PushNotificationManager";
    }
}
