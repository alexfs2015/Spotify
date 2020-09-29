package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: jqi reason: default package */
public final class jqi implements jqh {
    private final jpc a;
    private final jos b;
    private final jpq c;

    public jqi(jpc jpc, jos jos, jpq jpq) {
        this.a = jpc;
        this.b = jos;
        this.c = jpq;
    }

    public final jpe a(sso sso, String str, String str2) {
        sso sso2 = (sso) fbp.a(sso);
        String str3 = (String) fbp.a(str);
        String str4 = (String) fbp.a(str2);
        jva a2 = jva.a((String) fbp.a(str3));
        LinkType linkType = jva.a(sso2.toString()).b;
        boolean z = false;
        if (a2.b == LinkType.COLLECTION_ALBUM || a2.b == LinkType.COLLECTION_ARTIST) {
            str3 = a2.a(0, 2);
        }
        switch (jva.a(str3).b) {
            case ALBUM:
                c a3 = this.b.a(str3, str4).a(sso2);
                if (linkType != LinkType.ARTIST) {
                    z = true;
                }
                return a3.a(z).b(true).c(true).a();
            case ARTIST:
                return this.a.a(str3, str4).a(sso2).a(false).a();
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
                return this.c.a(str3, str4).a(sso2).a(true).b(true).a();
            case SHOW_EPISODE:
                return this.a.b(str3, str4).a(true).a(sso2).b(false).d(linkType != LinkType.SHOW_SHOW).e(false).f(true).g(false).h(false).i(false).a();
            case SHOW_SHOW:
                return this.a.c(str3, str4).a(sso2).a();
            case TRACK:
                c a4 = this.a.a(str3, str4, sso2.toString()).a(sso2).a(linkType != LinkType.ALBUM);
                if (linkType != LinkType.ARTIST) {
                    z = true;
                }
                return a4.b(z).c(true).d(sso2.b(ViewUris.ba.toString())).a();
            default:
                return jpe.a;
        }
    }
}
