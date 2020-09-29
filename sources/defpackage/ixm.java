package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: ixm reason: default package */
public final class ixm implements ixr {
    private final wbt a;
    private final ixq b;

    public ixm(wbt wbt, ixq ixq) {
        this.a = wbt;
        this.b = ixq;
    }

    public final void a() {
        wbt wbt = this.a;
        a a2 = this.b.a();
        a2.e = "hit";
        a2.f = "ui_reveal";
        wbt.a(a2.a());
    }

    public final void a(iws iws) {
        if (iws != null) {
            PlayerTrack a2 = iws.a();
            if (a2 != null) {
                String str = "hit";
                if (iws.g()) {
                    wbt wbt = this.a;
                    a b2 = this.b.b();
                    String uri = a2.uri();
                    a a3 = b2.a();
                    a3.e = str;
                    a3.f = "resume";
                    wbt.a(a3.a("item_to_be_resumed", uri).a());
                    return;
                }
                wbt wbt2 = this.a;
                a b3 = this.b.b();
                String uri2 = a2.uri();
                a a4 = b3.a();
                a4.e = str;
                a4.f = "pause";
                wbt2.a(a4.a("item_to_be_paused", uri2).a());
            }
        }
    }

    public final void b(iws iws) {
        if (iws != null) {
            PlayerTrack a2 = iws.a();
            if (a2 != null) {
                wbt wbt = this.a;
                ixq ixq = this.b;
                String uri = a2.uri();
                a a3 = ixq.a();
                a3.e = "hit";
                a3.f = "skip_to_previous";
                wbt.a(a3.a("item_to_be_skipped", uri).a());
            }
        }
    }

    public final void c(iws iws) {
        if (iws != null) {
            PlayerTrack a2 = iws.a();
            if (a2 != null) {
                wbt wbt = this.a;
                ixq ixq = this.b;
                String uri = a2.uri();
                a a3 = ixq.a();
                a3.e = "hit";
                a3.f = "skip_to_next";
                wbt.a(a3.a("item_to_be_skipped", uri).a());
            }
        }
    }
}
