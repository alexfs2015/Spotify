package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: gys reason: default package */
public final class gys implements gvk {
    private final gyo b;
    private final gxz c;
    private gyj d;

    public gys(gyo gyo, gxz gxz, gyj gyj) {
        this.b = (gyo) fay.a(gyo);
        this.c = (gxz) fay.a(gxz);
        this.d = (gyj) fay.a(gyj);
    }

    public final boolean a(guy guy) {
        return this.d.a(lla.a(guy.b));
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String[] stringArray = gzp.data().stringArray("trackList");
        String string = gzp.data().string("uri");
        if (!(stringArray == null || string == null)) {
            this.c.logInteraction(string, guy.b, "play", null);
            if (a(guy)) {
                this.d.a(string, null);
                return;
            }
            gyo gyo = this.b;
            ImmutableList a = ImmutableList.a((E[]) stringArray);
            fay.a(jst.a(string, LinkType.TRACK));
            gyo.a((Iterable<? extends String>) a, string);
        }
    }
}
