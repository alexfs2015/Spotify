package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: rl reason: default package */
final class rl implements rm {
    private final WindowId a;

    rl(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rl) && ((rl) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
