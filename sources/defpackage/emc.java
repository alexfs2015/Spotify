package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Iterator;

/* renamed from: emc reason: default package */
final /* synthetic */ class emc implements OnSharedPreferenceChangeListener {
    private final emb a;

    emc(emb emb) {
        this.a = emb;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        emb emb = this.a;
        synchronized (emb.b) {
            emb.c = null;
            elu.a();
        }
        synchronized (emb) {
            Iterator it = emb.d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
