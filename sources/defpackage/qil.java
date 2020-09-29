package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: qil reason: default package */
public final class qil implements gxk {
    private final squ b;
    private final qiu c;
    private final sqb d;

    public qil(squ squ, qiu qiu, sqb sqb) {
        this.b = (squ) fbp.a(squ);
        this.c = qiu;
        this.d = sqb;
    }

    public static hci a(String str, int i, String str2) {
        fbp.a(str);
        return hct.builder().a("resultItemClicked").a("uri", str).a("position", Integer.valueOf(i)).a("sectionId", str2).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.b.a();
        String string = hci.data().string("uri");
        int intValue = hci.data().intValue("position").intValue();
        String string2 = hci.data().string("sectionId");
        SearchHistoryItem a = this.d.a(string, gwy.b);
        if (!fbo.a(string)) {
            this.c.a(string, intValue, string2, a);
        }
    }
}
