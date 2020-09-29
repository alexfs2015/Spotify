package defpackage;

import android.database.ContentObserver;

/* renamed from: ekr reason: default package */
final class ekr extends ContentObserver {
    ekr() {
        super(null);
    }

    public final void onChange(boolean z) {
        ekq.e.set(true);
    }
}
