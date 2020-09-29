package defpackage;

import java.util.UUID;

/* renamed from: gfj reason: default package */
public final class gfj {
    private volatile String a;
    private gfm b;
    private final gei c;

    public gfj(gfm gfm, gei gei) {
        this.b = gfm;
        this.c = gei;
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

    private String b() {
        String uuid = UUID.randomUUID().toString();
        this.c.b("database_id", uuid);
        return uuid;
    }
}
