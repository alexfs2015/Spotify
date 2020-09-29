package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Iterator;

/* renamed from: ell reason: default package */
final /* synthetic */ class ell implements OnSharedPreferenceChangeListener {
    private final elk a;

    ell(elk elk) {
        this.a = elk;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        elk elk = this.a;
        synchronized (elk.b) {
            elk.c = null;
            eld.a();
        }
        synchronized (elk) {
            Iterator it = elk.d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
