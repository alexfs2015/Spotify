package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;

/* renamed from: hfx reason: default package */
public final class hfx {
    public final AndroidMusicLibsPlaylistProperties a;

    public hfx(AndroidMusicLibsPlaylistProperties androidMusicLibsPlaylistProperties) {
        this.a = androidMusicLibsPlaylistProperties;
    }

    public static boolean a(fqn fqn) {
        return "Enabled".equalsIgnoreCase((String) fqn.a(hds.d));
    }

    public static boolean c(fqn fqn) {
        return "Enabled_Explicit_WithOnboarding".equalsIgnoreCase(f(fqn));
    }

    public static boolean e(fqn fqn) {
        return "Enabled_Subtle_WithOnboarding".equalsIgnoreCase(f(fqn));
    }

    private static String f(fqn fqn) {
        String str = (String) fqn.a(hds.e);
        return "Enabled_Explicit".equalsIgnoreCase(str) || "Enabled_Explicit_WithOnboarding".equalsIgnoreCase(str) || "Enabled_Subtle".equalsIgnoreCase(str) || "Enabled_Subtle_WithOnboarding".equalsIgnoreCase(str) ? str : (String) fqn.a(hds.f);
    }

    public final boolean b(fqn fqn) {
        return "Enabled_Explicit".equalsIgnoreCase(f(fqn)) || c(fqn);
    }

    public final boolean d(fqn fqn) {
        return "Enabled_Subtle".equalsIgnoreCase(f(fqn)) || e(fqn);
    }
}
