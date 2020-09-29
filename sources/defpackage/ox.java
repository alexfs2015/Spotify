package defpackage;

import androidx.room.RoomDatabase;

/* renamed from: ox reason: default package */
public abstract class ox<T> extends pi {
    public ox(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int a(T t) {
        px b = b();
        try {
            a(b, t);
            return b.a();
        } finally {
            a(b);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(px pxVar, T t);
}
