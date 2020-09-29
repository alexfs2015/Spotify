package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: ivb reason: default package */
public final class ivb implements ivg {
    private final vol a;
    private final ivf b;

    public ivb(vol vol, ivf ivf) {
        this.a = vol;
        this.b = ivf;
    }

    public final void a(iuh iuh) {
        if (iuh != null) {
            PlayerTrack a2 = iuh.a();
            if (a2 != null) {
                String str = "hit";
                if (iuh.g()) {
                    vol vol = this.a;
                    a b2 = this.b.b();
                    String uri = a2.uri();
                    a a3 = b2.a();
                    a3.e = str;
                    a3.f = "resume";
                    vol.a(a3.a("item_to_be_resumed", uri).a());
                    return;
                }
                vol vol2 = this.a;
                a b3 = this.b.b();
                String uri2 = a2.uri();
                a a4 = b3.a();
                a4.e = str;
                a4.f = "pause";
                vol2.a(a4.a("item_to_be_paused", uri2).a());
            }
        }
    }

    public final void b(iuh iuh) {
        if (iuh != null) {
            PlayerTrack a2 = iuh.a();
            if (a2 != null) {
                vol vol = this.a;
                ivf ivf = this.b;
                String uri = a2.uri();
                a a3 = ivf.a();
                a3.e = "hit";
                a3.f = "skip_to_previous";
                vol.a(a3.a("item_to_be_skipped", uri).a());
            }
        }
    }

    public final void c(iuh iuh) {
        if (iuh != null) {
            PlayerTrack a2 = iuh.a();
            if (a2 != null) {
                vol vol = this.a;
                ivf ivf = this.b;
                String uri = a2.uri();
                a a3 = ivf.a();
                a3.e = "hit";
                a3.f = "skip_to_next";
                vol.a(a3.a("item_to_be_skipped", uri).a());
            }
        }
    }

    public final void a() {
        vol vol = this.a;
        a a2 = this.b.a();
        a2.e = "hit";
        a2.f = "ui_reveal";
        vol.a(a2.a());
    }
}
