package defpackage;

import com.spotify.core.orbit.OrbitSessionInterface;

/* renamed from: hmz reason: default package */
public final class hmz implements hmx {
    private final OrbitSessionInterface a;

    /* renamed from: hmz$a */
    public static class a implements hmy {
        public final hmx a(OrbitSessionInterface orbitSessionInterface) {
            return new hmz(orbitSessionInterface);
        }
    }

    hmz(OrbitSessionInterface orbitSessionInterface) {
        this.a = (OrbitSessionInterface) fay.a(orbitSessionInterface);
    }

    public final void a(String str, String str2) {
        this.a.login(str, str2);
    }

    public final void a(boolean z) {
        this.a.logout(true);
    }

    public final void a(String str) {
        this.a.log(str);
    }

    public final void b(String str) {
        this.a.setLanguage(str);
    }
}
