package defpackage;

import com.spotify.rcs.model.Fetch.Type;

/* renamed from: vuz reason: default package */
public final class vuz {
    public static ss a(Type type) {
        return new a().a("FETCH_TYPE", type.value).a();
    }

    public static sw a() {
        xop.b("Unscheduling delayed background work", new Object[0]);
        if (b() == null) {
            return null;
        }
        return sz.a().a("remote-config-fetch-delayed");
    }

    public static sz b() {
        try {
            return sz.a();
        } catch (IllegalStateException e) {
            xop.a(e, "An error occurred while getting an instance of WorkManager.", new Object[0]);
            return null;
        }
    }
}
