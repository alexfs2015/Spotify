package defpackage;

import androidx.room.RoomDatabase;

/* renamed from: uw reason: default package */
public final class uw implements uv {
    private final RoomDatabase a;
    private final oy b;

    public uw(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<uu>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                uu uuVar = (uu) obj;
                if (uuVar.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, uuVar.a);
                }
                if (uuVar.b == null) {
                    pxVar.a(2);
                } else {
                    pxVar.a(2, uuVar.b);
                }
            }
        };
    }

    public final void a(uu uuVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(uuVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }
}
