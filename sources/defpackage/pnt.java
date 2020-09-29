package defpackage;

import com.spotify.mobile.android.ui.view.snackbar.SnackBar.c;
import io.reactivex.subjects.ReplaySubject;

/* renamed from: pnt reason: default package */
public final class pnt implements c {
    public final ReplaySubject<poa> a = ReplaySubject.d(1);

    public final void a() {
        this.a.onNext(new g());
    }

    public final void b() {
        this.a.onNext(new f());
    }
}
