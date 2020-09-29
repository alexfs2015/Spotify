package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* renamed from: elm reason: default package */
final class elm extends ContentObserver {
    private final /* synthetic */ elk a;

    elm(elk elk) {
        this.a = elk;
        super(null);
    }

    public final void onChange(boolean z) {
        elk elk = this.a;
        synchronized (elk.b) {
            elk.c = null;
            elu.a();
        }
        synchronized (elk) {
            Iterator it = elk.d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
