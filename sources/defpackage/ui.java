package defpackage;

import androidx.room.RoomDatabase;

/* renamed from: ui reason: default package */
public final class ui implements uh {
    private final RoomDatabase a;
    private final ot b;

    public ui(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<ug>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                ug ugVar = (ug) obj;
                if (ugVar.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, ugVar.a);
                }
                if (ugVar.b == null) {
                    psVar.a(2);
                } else {
                    psVar.a(2, ugVar.b);
                }
            }
        };
    }

    public final void a(ug ugVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(ugVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }
}
