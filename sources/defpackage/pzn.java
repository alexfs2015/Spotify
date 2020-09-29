package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: pzn reason: default package */
public final class pzn implements gvk {
    private final sgn b;
    private final pzw c;
    private final sfu d;

    public pzn(sgn sgn, pzw pzw, sfu sfu) {
        this.b = (sgn) fay.a(sgn);
        this.c = pzw;
        this.d = sfu;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.b.a();
        String string = gzp.data().string("uri");
        int intValue = gzp.data().intValue("position").intValue();
        String string2 = gzp.data().string("sectionId");
        SearchHistoryItem a = this.d.a(string, guy.b);
        if (!fax.a(string)) {
            this.c.a(string, intValue, string2, a);
        }
    }

    public static gzp a(String str, int i, String str2) {
        fay.a(str);
        return haa.builder().a("resultItemClicked").a("uri", str).a("position", Integer.valueOf(i)).a("sectionId", str2).a();
    }
}
