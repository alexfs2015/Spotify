package defpackage;

import com.spotify.music.navigation.NavigationManager;

/* renamed from: rva reason: default package */
public final class rva extends ruk {
    private final NavigationManager a;

    public rva(NavigationManager navigationManager) {
        this.a = navigationManager;
    }

    public final void a(aio aio, boolean z) {
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
                sb.append(((jlm) fbp.a(hoVar.a)).a.toString());
                sb.append(10);
            }
            String sb2 = sb.toString();
            aio.a("fragment-stack", sb2.substring(Math.max(sb2.length() - 512, 0)));
        }
    }
}
