package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;

/* renamed from: hdb reason: default package */
public final class hdb {
    public final AndroidMusicLibsPlaylistProperties a;

    public hdb(AndroidMusicLibsPlaylistProperties androidMusicLibsPlaylistProperties) {
        this.a = androidMusicLibsPlaylistProperties;
    }

    public static boolean a(fpt fpt) {
        return "Enabled".equalsIgnoreCase((String) fpt.a(haz.d));
    }

    public static boolean b(fpt fpt) {
        String str = "RoundWithoutShuffle";
        return str.equalsIgnoreCase(j(fpt)) || str.equalsIgnoreCase(k(fpt));
    }

    public static boolean c(fpt fpt) {
        String str = "RoundWithShuffle";
        return str.equalsIgnoreCase(j(fpt)) || str.equalsIgnoreCase(k(fpt));
    }

    public static boolean d(fpt fpt) {
        String str = "ShuffleEverywhere";
        return str.equalsIgnoreCase(j(fpt)) || str.equalsIgnoreCase(k(fpt));
    }

    public static boolean e(fpt fpt) {
        return "PlayEverywhere".equalsIgnoreCase(k(fpt));
    }

    private static String j(fpt fpt) {
        String str = (String) fpt.a(haz.e);
        return a(str) ? str : (String) fpt.a(haz.f);
    }

    private static String k(fpt fpt) {
        String str = (String) fpt.a(haz.g);
        return a(str) ? str : (String) fpt.a(haz.h);
    }

    private static boolean a(String str) {
        return "RoundWithShuffle".equalsIgnoreCase(str) || "RoundWithoutShuffle".equalsIgnoreCase(str) || "ShuffleEverywhere".equalsIgnoreCase(str) || "PlayEverywhere".equalsIgnoreCase(str);
    }

    public final boolean f(fpt fpt) {
        return "Enabled_Explicit".equalsIgnoreCase(l(fpt)) || g(fpt);
    }

    public static boolean g(fpt fpt) {
        return "Enabled_Explicit_WithOnboarding".equalsIgnoreCase(l(fpt));
    }

    public final boolean h(fpt fpt) {
        return "Enabled_Subtle".equalsIgnoreCase(l(fpt)) || i(fpt);
    }

    public static boolean i(fpt fpt) {
        return "Enabled_Subtle_WithOnboarding".equalsIgnoreCase(l(fpt));
    }

    private static String l(fpt fpt) {
        String str = (String) fpt.a(haz.i);
        return "Enabled_Explicit".equalsIgnoreCase(str) || "Enabled_Explicit_WithOnboarding".equalsIgnoreCase(str) || "Enabled_Subtle".equalsIgnoreCase(str) || "Enabled_Subtle_WithOnboarding".equalsIgnoreCase(str) ? str : (String) fpt.a(haz.j);
    }
}
