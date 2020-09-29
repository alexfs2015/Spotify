package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* renamed from: ekv reason: default package */
final class ekv extends ContentObserver {
    private final /* synthetic */ ekt a;

    ekv(ekt ekt) {
        this.a = ekt;
        super(null);
    }

    public final void onChange(boolean z) {
        ekt ekt = this.a;
        synchronized (ekt.b) {
            ekt.c = null;
            eld.a();
        }
        synchronized (ekt) {
            Iterator it = ekt.d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
