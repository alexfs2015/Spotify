package defpackage;

import android.database.ContentObserver;

/* renamed from: eli reason: default package */
final class eli extends ContentObserver {
    eli() {
        super(null);
    }

    public final void onChange(boolean z) {
        elh.e.set(true);
    }
}
