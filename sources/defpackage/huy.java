package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.spotify.base.java.logging.Logger;
import java.util.Locale;

/* renamed from: huy reason: default package */
public final class huy implements c {
    private final vcv a;

    public final String c() {
        return "PushNotificationManager";
    }

    huy(vcv vcv) {
        this.a = vcv;
    }

    public final void ai_() {
        vcv vcv = this.a;
        boolean z = false;
        Logger.a("start", new Object[0]);
        boolean a2 = fl.a(vcv.a).a();
        AccessibilityManager accessibilityManager = (AccessibilityManager) vcv.a.getSystemService("accessibility");
        if (accessibilityManager != null) {
            z = accessibilityManager.isTouchExplorationEnabled();
        }
        vcv.b.a(gnd.a(Locale.getDefault()), z, a2);
        vcv.c.a();
    }

    public final void aj_() {
        vcv vcv = this.a;
        vcv.c.b();
        if (!vcv.d.b()) {
            vcv.d.bf_();
        }
    }
}
