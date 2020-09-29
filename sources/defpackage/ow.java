package defpackage;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: ow reason: default package */
final class ow {
    private Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    private final RoomDatabase b;

    ow(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }
}
