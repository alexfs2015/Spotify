package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.Collections;
import java.util.List;

/* renamed from: fow reason: default package */
public final class fow {
    final Context a;
    final AccessibilityManager b;
    final CaptioningManager c;

    public fow(Context context) {
        Object obj;
        this.a = context.getApplicationContext();
        Class<AccessibilityManager> cls = AccessibilityManager.class;
        Object systemService = this.a.getSystemService("accessibility");
        CaptioningManager captioningManager = null;
        if (systemService == null || !cls.isInstance(systemService)) {
            obj = null;
        } else {
            obj = cls.cast(systemService);
        }
        this.b = (AccessibilityManager) obj;
        if (VERSION.SDK_INT >= 19) {
            captioningManager = (CaptioningManager) this.a.getSystemService("captioning");
        }
        this.c = captioningManager;
    }

    /* access modifiers changed from: 0000 */
    public List<AccessibilityServiceInfo> a(int i) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            return Collections.emptyList();
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(i);
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = Collections.emptyList();
        }
        return enabledAccessibilityServiceList;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        for (AccessibilityServiceInfo id : a(-1)) {
            if (id.getId().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
