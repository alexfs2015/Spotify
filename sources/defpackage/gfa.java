package defpackage;

import java.util.UUID;

/* renamed from: gfa reason: default package */
public final class gfa {
    private volatile String a;
    private final gei b;

    public gfa(gei gei) {
        this.b = gei;
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
