package defpackage;

import com.google.common.base.Optional;

/* renamed from: hlh reason: default package */
public final class hlh implements b {
    private final Optional<blq> a;

    public final String c() {
        return "Smartlock";
    }

    public hlh(Optional<blq> optional) {
        this.a = optional;
    }

    public final void X_() {
        if (this.a.b()) {
            ((blq) this.a.c()).a();
        }
    }
}
