package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: jtq reason: default package */
public abstract class jtq {

    /* renamed from: jtq$a */
    public interface a {
        a a(ConnectionType connectionType);

        a a(boolean z);

        jtq a();

        a b(boolean z);
    }

    public abstract ConnectionType a();

    public abstract boolean b();

    public abstract boolean c();

    public static a d() {
        return new a().a(ConnectionType.CONNECTION_TYPE_UNKNOWN).a(false).b(false);
    }
}
