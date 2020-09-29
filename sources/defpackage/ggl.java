package defpackage;

import java.util.UUID;

/* renamed from: ggl reason: default package */
public final class ggl {
    private volatile String a;
    private final gft b;

    public ggl(gft gft) {
        this.b = gft;
    }

    public final synchronized String a() {
        if (this.a == null) {
            String a2 = this.b.a("installation_id");
            if (a2 == null) {
                a2 = UUID.randomUUID().toString();
                this.b.b("installation_id", a2);
            }
            this.a = a2;
        }
        return this.a;
    }
}
