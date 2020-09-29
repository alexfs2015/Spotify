package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: iy reason: default package */
public final class iy {
    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
