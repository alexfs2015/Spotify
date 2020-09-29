package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: jvy reason: default package */
public abstract class jvy {

    /* renamed from: jvy$a */
    public interface a {
        a a(ConnectionType connectionType);

        a a(boolean z);

        jvy a();

        a b(boolean z);
    }

    public static a d() {
        return new a().a(ConnectionType.CONNECTION_TYPE_UNKNOWN).a(false).b(false);
    }

    public abstract ConnectionType a();

    public abstract boolean b();

    public abstract boolean c();
}
