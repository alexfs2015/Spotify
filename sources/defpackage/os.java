package defpackage;

import androidx.room.RoomDatabase;

/* renamed from: os reason: default package */
public abstract class os<T> extends pd {
    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(ps psVar, T t);

    public os(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int a(T t) {
        ps b = b();
        try {
            a(b, t);
            return b.a();
        } finally {
            a(b);
        }
    }
}
