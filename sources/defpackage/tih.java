package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tih reason: default package */
public final class tih extends ith<PlayerTrack> implements tio {
    private final kxz a;
    /* access modifiers changed from: private */
    public final kye b;
    /* access modifiers changed from: private */
    public final kyg c;
    private final ImageView d = ((ImageView) this.o.findViewById(R.id.image));
    private final Picasso e;
    private final View f = this.o.findViewById(R.id.peek_placeholder);

    public tih(LayoutInflater layoutInflater, int i, kxz kxz, Picasso picasso, kye kye, kyg kyg, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.a = kxz;
        this.e = picasso;
        this.b = kye;
        this.c = kyg;
    }

    public final void A() {
        if (this.d.getVisibility() == 0) {
            this.f.setVisibility(8);
        } else {
            gaw.a(this.f, (View) this.d);
        }
    }

    public final /* synthetic */ void a(Object obj, int i) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        final kxy a2 = kxz.a(playerTrack);
        String str = (String) playerTrack.metadata().get("canvas.url");
        Uri parse = str != null ? Uri.parse(str) : iyd.b(playerTrack);
        if (Uri.EMPTY.equals(parse)) {
            this.d.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            wgr a3 = ((Picasso) fbp.a(this.e)).a(parse).a((int) R.drawable.bg_placeholder_album);
            this.b.a(a2);
            this.c.a(a2.a());
            a3.a(this.d, (wfz) new wfz() {
                public final void a() {
                    tih.this.b.b(a2);
                    tih.this.c.b(a2.a());
                }

                public final void b() {
                    tih.this.b.a(a2, "CANVAS_IMAGE_LOAD_ERROR", "Loading canvas image failed");
                }
            });
        }
        A();
    }

    public final void aQ_() {
        this.d.setVisibility(4);
        this.f.setVisibility(0);
    }
}
