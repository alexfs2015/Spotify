package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update;
import io.reactivex.Observable;

/* renamed from: gts reason: default package */
public interface gts {
    void a(boolean z);

    boolean a();

    void b(boolean z);

    boolean b();

    Observable<Update<Boolean>> c();

    Observable<Update<Boolean>> d();
}
