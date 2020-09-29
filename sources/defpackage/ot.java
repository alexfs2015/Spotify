package defpackage;

import androidx.room.RoomDatabase;

/* renamed from: ot reason: default package */
public abstract class ot<T> extends pd {
    /* access modifiers changed from: protected */
    public abstract void a(ps psVar, T t);

    public ot(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final void a(T t) {
        ps b = b();
        try {
            a(b, t);
            b.b();
        } finally {
            a(b);
        }
    }

    public final long b(T t) {
        ps b = b();
        try {
            a(b, t);
            return b.b();
        } finally {
            a(b);
        }
    }
}
