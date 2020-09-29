package defpackage;

import com.spotify.mobile.android.playlist.playbuttonflags.AbRoundPlayButton;

/* renamed from: heg reason: default package */
public final class heg {
    private final fqn a;

    public heg(fqn fqn) {
        this.a = fqn;
    }

    private static boolean a(AbRoundPlayButton abRoundPlayButton) {
        return abRoundPlayButton == AbRoundPlayButton.ENABLED || abRoundPlayButton == AbRoundPlayButton.ENABLED_HIDE_SHUFFLE;
    }

    private AbRoundPlayButton c() {
        return (AbRoundPlayButton) this.a.a(hef.a);
    }

    private AbRoundPlayButton d() {
        return (AbRoundPlayButton) this.a.a(hef.b);
    }

    private AbRoundPlayButton e() {
        return (AbRoundPlayButton) this.a.a(hef.c);
    }

    public final boolean a() {
        return a(c()) || a(d()) || a(e());
    }

    public final boolean b() {
        return c() == AbRoundPlayButton.ENABLED_HIDE_SHUFFLE || d() == AbRoundPlayButton.ENABLED_HIDE_SHUFFLE || e() == AbRoundPlayButton.ENABLED_HIDE_SHUFFLE;
    }
}
