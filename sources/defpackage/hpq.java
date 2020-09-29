package defpackage;

import com.spotify.core.orbit.OrbitSessionInterface;

/* renamed from: hpq reason: default package */
public final class hpq implements hpo {
    private final OrbitSessionInterface a;

    /* renamed from: hpq$a */
    public static class a implements hpp {
        public final hpo a(OrbitSessionInterface orbitSessionInterface) {
            return new hpq(orbitSessionInterface);
        }
    }

    hpq(OrbitSessionInterface orbitSessionInterface) {
        this.a = (OrbitSessionInterface) fbp.a(orbitSessionInterface);
    }

    public final void a(String str) {
        this.a.log(str);
    }

    public final void a(String str, String str2) {
        this.a.login(str, str2);
    }

    public final void a(boolean z) {
        this.a.logout(true);
    }

    public final void b(String str) {
        this.a.setLanguage(str);
    }
}
