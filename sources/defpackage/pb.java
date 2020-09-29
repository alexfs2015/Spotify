package defpackage;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: pb reason: default package */
final class pb {
    private Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    private final RoomDatabase b;

    pb(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }
}
