package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: ulo reason: default package */
final class ulo {
    String a;

    ulo() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        Logger.b("Saving suggestion: %s", str);
        this.a = str;
    }
}
