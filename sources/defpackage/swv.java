package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: swv reason: default package */
public abstract class swv implements Parcelable {
    public static final swv d = new a().a((SessionState) null).a((fqn) null).a(false).a();

    /* renamed from: swv$a */
    public interface a {
        a a(SessionState sessionState);

        a a(fqn fqn);

        a a(boolean z);

        swv a();
    }

    public abstract SessionState a();

    public final swv a(boolean z) {
        return d().a(z).a();
    }

    public abstract fqn b();

    public abstract boolean c();

    public abstract a d();

    public final boolean e() {
        SessionState a2 = a();
        return a2 != null && a2.loggedIn() && !a2.loggingIn() && !a2.loggingOut();
    }
}
