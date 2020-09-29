package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: hbl reason: default package */
public final class hbl implements gxk {
    private final hbh b;
    private final has c;
    private hbc d;

    public hbl(hbh hbh, has has, hbc hbc) {
        this.b = (hbh) fbp.a(hbh);
        this.c = (has) fbp.a(has);
        this.d = (hbc) fbp.a(hbc);
    }

    public final boolean a(gwy gwy) {
        return this.d.a(lpa.a(gwy.b));
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String[] stringArray = hci.data().stringArray("trackList");
        String string = hci.data().string("uri");
        if (!(stringArray == null || string == null)) {
            this.c.logInteraction(string, gwy.b, "play", null);
            if (a(gwy)) {
                this.d.a(string, null);
                return;
            }
            hbh hbh = this.b;
            ImmutableList a = ImmutableList.a((E[]) stringArray);
            fbp.a(jva.a(string, LinkType.TRACK));
            hbh.a((Iterable<? extends String>) a, string);
        }
    }
}
