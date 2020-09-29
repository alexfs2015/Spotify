package defpackage;

import com.spotify.music.MainActivity;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: swb reason: default package */
public final class swb implements wig<szg> {
    private final wzi<MainActivity> a;
    private final wzi<NavigationManager> b;

    private swb(wzi<MainActivity> wzi, wzi<NavigationManager> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static swb a(wzi<MainActivity> wzi, wzi<NavigationManager> wzi2) {
        return new swb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (szg) wil.a(CC.a((MainActivity) this.a.get(), (NavigationManager) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
