package defpackage;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pi reason: default package */
public abstract class pi {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final RoomDatabase b;
    private volatile px c;

    public pi(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }

    private px c() {
        return this.b.a(a());
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final void a(px pxVar) {
        if (pxVar == this.c) {
            this.a.set(false);
        }
    }

    public final px b() {
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
