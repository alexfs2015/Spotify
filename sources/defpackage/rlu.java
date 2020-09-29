package defpackage;

import com.spotify.music.navigation.NavigationManager;

/* renamed from: rlu reason: default package */
public final class rlu extends rle {
    private final NavigationManager a;

    public rlu(NavigationManager navigationManager) {
        this.a = navigationManager;
    }

    public final void a(aia aia, boolean z) {
        if (!z) {
            NavigationManager navigationManager = this.a;
            StringBuilder sb = new StringBuilder();
            if (navigationManager.e != null) {
                sb.append("active: ");
                sb.append(navigationManager.e.getClass());
                sb.append(10);
            }
            for (ho hoVar : navigationManager.c) {
                sb.append("inactive: ");
                sb.append(((jja) fay.a(hoVar.a)).a.toString());
                sb.append(10);
            }
            String sb2 = sb.toString();
            aia.a("fragment-stack", sb2.substring(Math.max(sb2.length() - 512, 0)));
        }
    }
}
