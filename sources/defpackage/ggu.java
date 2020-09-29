package defpackage;

import java.util.UUID;

/* renamed from: ggu reason: default package */
public final class ggu {
    private volatile String a;
    private ggx b;
    private final gft c;

    public ggu(ggx ggx, gft gft) {
        this.b = ggx;
        this.c = gft;
    }

    private String b() {
        String uuid = UUID.randomUUID().toString();
        this.c.b("database_id", uuid);
        return uuid;
    }

    public final synchronized String a() {
        if (this.a == null) {
            if (this.b.a() == 0) {
                this.a = b();
            } else {
                String a2 = this.c.a("database_id");
                if (a2 == null) {
                    a2 = b();
                }
                this.a = a2;
            }
        }
        return this.a;
    }
}
