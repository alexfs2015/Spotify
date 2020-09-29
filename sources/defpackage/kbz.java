package defpackage;

import com.google.common.base.Optional;

/* renamed from: kbz reason: default package */
public final class kbz extends kbh {
    private final kby a;
    /* access modifiers changed from: private */
    public long b;

    public kbz(kby kby) {
        super(4);
        this.a = kby;
    }

    public final boolean r() {
        Optional a2 = this.a.a();
        if (a2.b()) {
            return ((kbx) a2.c()).b();
        }
        return true;
    }

    public final bdf c() {
        final Optional a2 = this.a.a();
        if (a2.b()) {
            return new bdf() {
                public final aql a(aql aql) {
                    return null;
                }

                public final long d() {
                    return ((kbx) a2.c()).a() + kbz.this.b;
                }

                public final aql e() {
                    return new aql(1.0f, 1.0f);
                }
            };
        }
        return null;
    }

    public final void a(aqq aqq, aqe[] aqeArr, axt axt, long j, boolean z, long j2) {
        super.a(aqq, aqeArr, axt, j, z, j2);
        this.b = j2;
    }

    public final int a(aqe aqe) {
        return "track-sync-renderer".equals(aqe.a) ? 4 : 0;
    }
}
