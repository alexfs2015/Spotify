package defpackage;

import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import com.spotify.base.java.logging.Logger;

/* renamed from: fou reason: default package */
public final class fou {
    private final jjf a;
    private final fow b;

    private static String a(boolean z) {
        return z ? "yes" : "no";
    }

    private static String b(boolean z) {
        return z ? "yes" : "";
    }

    fou(jjf jjf, fow fow) {
        this.a = jjf;
        this.b = fow;
    }

    public final void a() {
        a aVar;
        jjf jjf = this.a;
        boolean z = true;
        if (this.b.b != null) {
            fow fow = this.b;
            boolean z2 = VERSION.SDK_INT >= 19 && fow.c != null && fow.c.isEnabled();
            fow fow2 = this.b;
            boolean z3 = fow2.b != null && fow2.b.isTouchExplorationEnabled();
            boolean z4 = Secure.getInt(this.b.a.getContentResolver(), "accessibility_display_inversion_enabled", 0) == 1;
            boolean z5 = !this.b.a(5).isEmpty();
            boolean a2 = this.b.a("com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService");
            boolean a3 = this.b.a("com.google.android.marvin.talkback/com.google.android.accessibility.accessibilitymenu.AccessibilityMenuService");
            Logger.b("Accessibility settings: isCaptioningEnabled=%s isTouchExplorationEnabled=%s hasAudioCues=%s isDisplayModified=%s hasSwitchControl=%s hasMenu=%s", Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z5), Boolean.valueOf(z4), Boolean.valueOf(a2), Boolean.valueOf(a3));
            String b2 = b(a2 || z5 || z3 || z2 || z4 || a3);
            if (!z3 && !a2) {
                z = false;
            }
            aVar = new a(b2, a(z), b(z4), a(z5));
        } else {
            String str = "";
            aVar = new a(str, str, str, str);
        }
        jjf.a(aVar);
    }
}
