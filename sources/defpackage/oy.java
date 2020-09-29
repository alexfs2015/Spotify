package defpackage;

import androidx.room.RoomDatabase;

/* renamed from: oy reason: default package */
public abstract class oy<T> extends pi {
    public oy(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final void a(T t) {
        px b = b();
        try {
            a(b, t);
            b.b();
        } finally {
            a(b);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(px pxVar, T t);

    public final long b(T t) {
        px b = b();
        try {
            a(b, t);
            return b.b();
        } finally {
            a(b);
        }
    }
}
