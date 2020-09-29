package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: smo reason: default package */
public abstract class smo implements Parcelable {
    public static final smo d = new a().a((SessionState) null).a((fpt) null).a(false).a();

    /* renamed from: smo$a */
    public interface a {
        a a(SessionState sessionState);

        a a(fpt fpt);

        a a(boolean z);

        smo a();
    }

    public abstract SessionState a();

    public abstract fpt b();

    public abstract boolean c();

    public abstract a d();

    public final smo a(boolean z) {
        return d().a(z).a();
    }

    public final boolean e() {
        SessionState a2 = a();
        return a2 != null && a2.loggedIn() && !a2.loggingIn() && !a2.loggingOut();
    }
}
