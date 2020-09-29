package defpackage;

import com.spotify.rcs.model.Fetch.Type;

/* renamed from: vhu reason: default package */
public final class vhu {
    public static se a(Type type) {
        return new a().a("FETCH_TYPE", type.value).a();
    }

    public static si a() {
        xal.b("Unscheduling delayed background work", new Object[0]);
        if (b() == null) {
            return null;
        }
        return sl.a().a("remote-config-fetch-delayed");
    }

    public static sl b() {
        try {
            return sl.a();
        } catch (IllegalStateException e) {
            xal.a(e, "An error occurred while getting an instance of WorkManager.", new Object[0]);
            return null;
        }
    }
}
