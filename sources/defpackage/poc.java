package defpackage;

import android.os.Parcelable;

/* renamed from: poc reason: default package */
public abstract class poc implements Parcelable {
    public static final poc c = d().a();

    /* renamed from: poc$a */
    public interface a {
        a a(pod pod);

        a a(boolean z);

        poc a();
    }

    public abstract boolean a();

    public abstract pod b();

    public abstract a c();

    public static a d() {
        return new a().a(false).a((pod) null);
    }

    public final poc a(boolean z) {
        return c().a(z).a();
    }

    public final poc a(pod pod) {
        return c().a(pod).a();
    }
}
