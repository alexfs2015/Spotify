package defpackage;

import com.google.common.base.Optional;

/* renamed from: kea reason: default package */
public final class kea extends kdh {
    private final kdz a;
    /* access modifiers changed from: private */
    public long b;

    public kea(kdz kdz) {
        super(4);
        this.a = kdz;
    }

    public final int a(aqv aqv) {
        return "track-sync-renderer".equals(aqv.a) ? 4 : 0;
    }

    public final void a(arh arh, aqv[] aqvArr, ayk ayk, long j, boolean z, long j2) {
        super.a(arh, aqvArr, ayk, j, z, j2);
        this.b = j2;
    }

    public final bdw c() {
        final Optional a2 = this.a.a();
        if (a2.b()) {
            return new bdw() {
                public final arc a(arc arc) {
                    return null;
                }

                public final long d() {
                    return ((kdy) a2.c()).a() + kea.this.b;
                }

                public final arc e() {
                    return new arc(1.0f, 1.0f);
                }
            };
        }
        return null;
    }

    public final boolean r() {
        Optional a2 = this.a.a();
        if (a2.b()) {
            return ((kdy) a2.c()).b();
        }
        return true;
    }
}
