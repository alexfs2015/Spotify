package defpackage;

import com.spotify.messages.ConfigurationApplied;
import com.spotify.messages.DefaultConfigurationApplied;
import com.spotify.messages.ResolveConfigurationError;
import com.spotify.messages.ResolveConfigurationError.a;
import com.spotify.rcs.model.Platform;

/* renamed from: vut reason: default package */
public final class vut implements vus {
    private final gfj a;

    public vut(gfj gfj) {
        this.a = gfj;
    }

    public final void a(vua vua, int i, String str) {
        a c = ResolveConfigurationError.k().b(vua.a).c(vua.b);
        if (str == null) {
            str = "";
        }
        ResolveConfigurationError resolveConfigurationError = (ResolveConfigurationError) c.a(str).a((long) i).g();
        this.a.a("ResolveConfigurationError", resolveConfigurationError.b());
    }

    public final void a(vua vua, vup vup) {
        if (vup.c()) {
            this.a.a("DefaultConfigurationApplied", ((DefaultConfigurationApplied) DefaultConfigurationApplied.k().a(vua.c).c(vua.a).d(vua.b).e(Platform.ANDROID.toString()).b(vup.b()).g()).b());
            return;
        }
        this.a.a("ConfigurationApplied", ((ConfigurationApplied) ConfigurationApplied.k().a(vua.c).c(vua.a).d(vua.b).e(Platform.ANDROID.toString()).a((Iterable<? extends Integer>) vup.a()).a(vup.c() ? -1 : vup.a.e).b(vup.b()).g()).b());
    }
}
