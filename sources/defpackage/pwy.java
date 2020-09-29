package defpackage;

import android.os.Parcelable;

/* renamed from: pwy reason: default package */
public abstract class pwy implements Parcelable {
    public static final pwy c = d().a();

    /* renamed from: pwy$a */
    public interface a {
        a a(pwz pwz);

        a a(boolean z);

        pwy a();
    }

    public static a d() {
        return new a().a(false).a((pwz) null);
    }

    public final pwy a(pwz pwz) {
        return c().a(pwz).a();
    }

    public final pwy a(boolean z) {
        return c().a(z).a();
    }

    public abstract boolean a();

    public abstract pwz b();

    public abstract a c();
}
