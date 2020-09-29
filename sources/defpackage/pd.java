package defpackage;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pd reason: default package */
public abstract class pd {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final RoomDatabase b;
    private volatile ps c;

    /* access modifiers changed from: protected */
    public abstract String a();

    public pd(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }

    private ps c() {
        return this.b.a(a());
    }

    public final void a(ps psVar) {
        if (psVar == this.c) {
            this.a.set(false);
        }
    }

    public final ps b() {
        this.b.c();
        if (!this.a.compareAndSet(false, true)) {
            return c();
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }
}
