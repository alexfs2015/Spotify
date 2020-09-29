package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: jnw reason: default package */
public final class jnw implements jnv {
    private final jmq a;
    private final jmg b;
    private final jne c;

    public jnw(jmq jmq, jmg jmg, jne jne) {
        this.a = jmq;
        this.b = jmg;
        this.c = jne;
    }

    public final jms a(sih sih, String str, String str2) {
        sih sih2 = (sih) fay.a(sih);
        String str3 = (String) fay.a(str);
        String str4 = (String) fay.a(str2);
        jst a2 = jst.a((String) fay.a(str3));
        LinkType linkType = jst.a(sih2.toString()).b;
        boolean z = false;
        if (a2.b == LinkType.COLLECTION_ALBUM || a2.b == LinkType.COLLECTION_ARTIST) {
            str3 = a2.a(0, 2);
        }
        switch (jst.a(str3).b) {
            case ALBUM:
                c a3 = this.b.a(str3, str4).a(sih2);
                if (linkType != LinkType.ARTIST) {
                    z = true;
                }
                return a3.a(z).b(true).c(true).a();
            case ARTIST:
                return this.a.a(str3, str4).a(sih2).a(false).a();
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
                return this.c.a(str3, str4).a(sih2).a(true).b(true).a();
            case SHOW_EPISODE:
                return this.a.b(str3, str4).a(true).a(sih2).b(false).d(linkType != LinkType.SHOW_SHOW).e(false).f(true).g(false).h(false).i(false).a();
            case SHOW_SHOW:
                return this.a.c(str3, str4).a(sih2).a();
            case TRACK:
                c a4 = this.a.a(str3, str4, sih2.toString()).a(sih2).a(linkType != LinkType.ALBUM);
                if (linkType != LinkType.ARTIST) {
                    z = true;
                }
                return a4.b(z).c(true).d(sih2.b(ViewUris.bb.toString())).a();
            default:
                return jms.a;
        }
    }
}
