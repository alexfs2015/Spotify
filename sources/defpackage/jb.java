package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: jb reason: default package */
public class jb {
    public final Object a;

    /* renamed from: jb$a */
    static class a extends AccessibilityNodeProvider {
        final jb a;

        a(jb jbVar) {
            this.a = jbVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            ja a2 = this.a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.a(i, i2, bundle);
        }
    }

    /* renamed from: jb$b */
    static class b extends a {
        b(jb jbVar) {
            super(jbVar);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            ja b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.a;
        }
    }

    public jb() {
        if (VERSION.SDK_INT >= 19) {
            this.a = new b(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.a = new a(this);
        } else {
            this.a = null;
        }
    }

    public jb(Object obj) {
        this.a = obj;
    }

    public ja a(int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public ja b(int i) {
        return null;
    }
}
