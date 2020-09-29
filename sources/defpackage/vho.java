package defpackage;

import com.spotify.messages.ConfigurationApplied;
import com.spotify.messages.DefaultConfigurationApplied;
import com.spotify.messages.ResolveConfigurationError;
import com.spotify.messages.ResolveConfigurationError.a;
import com.spotify.rcs.model.Platform;

/* renamed from: vho reason: default package */
public final class vho implements vhn {
    private final gdy a;

    public vho(gdy gdy) {
        this.a = gdy;
    }

    public final void a(vgv vgv, vhk vhk) {
        if (vhk.c()) {
            this.a.a("DefaultConfigurationApplied", ((DefaultConfigurationApplied) DefaultConfigurationApplied.k().a(vgv.c).c(vgv.a).d(vgv.b).e(Platform.ANDROID.toString()).b(vhk.b()).g()).b());
            return;
        }
        this.a.a("ConfigurationApplied", ((ConfigurationApplied) ConfigurationApplied.k().a(vgv.c).c(vgv.a).d(vgv.b).e(Platform.ANDROID.toString()).a((Iterable<? extends Integer>) vhk.a()).a(vhk.c() ? -1 : vhk.a.e).b(vhk.b()).g()).b());
    }

    public final void a(vgv vgv, int i, String str) {
        a c = ResolveConfigurationError.k().b(vgv.a).c(vgv.b);
        if (str == null) {
            str = "";
        }
        ResolveConfigurationError resolveConfigurationError = (ResolveConfigurationError) c.a(str).a((long) i).g();
        this.a.a("ResolveConfigurationError", resolveConfigurationError.b());
    }
}
