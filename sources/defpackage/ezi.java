package defpackage;

import android.graphics.Outline;

/* renamed from: ezi reason: default package */
public final class ezi extends ezh {
    public final void getOutline(Outline outline) {
        copyBounds(this.a);
        outline.setOval(this.a);
    }
}
