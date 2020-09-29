package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: sya reason: default package */
public final class sya extends iqu<PlayerTrack> implements syh {
    private final kuq a;
    /* access modifiers changed from: private */
    public final kuv b;
    /* access modifiers changed from: private */
    public final kux c;
    private final ImageView d = ((ImageView) this.o.findViewById(R.id.image));
    private final Picasso e;
    private final View f = this.o.findViewById(R.id.peek_placeholder);

    public final /* synthetic */ void a(Object obj, int i) {
        Uri uri;
        PlayerTrack playerTrack = (PlayerTrack) obj;
        final kup a2 = kuq.a(playerTrack);
        String str = (String) playerTrack.metadata().get("canvas.url");
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = ivs.b(playerTrack);
        }
        if (Uri.EMPTY.equals(uri)) {
            this.d.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            vsl a3 = ((Picasso) fay.a(this.e)).a(uri).a((int) R.drawable.bg_placeholder_album);
            this.b.a(a2);
            this.c.a(a2.a());
            a3.a(this.d, (vrt) new vrt() {
                public final void a() {
                    sya.this.b.b(a2);
                    sya.this.c.b(a2.a());
                }

                public final void b() {
                    sya.this.b.a(a2, "CANVAS_IMAGE_LOAD_ERROR", "Loading canvas image failed");
                }
            });
        }
        z();
    }

    public sya(LayoutInflater layoutInflater, int i, kuq kuq, Picasso picasso, kuv kuv, kux kux, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.a = kuq;
        this.e = picasso;
        this.b = kuv;
        this.c = kux;
    }

    public final void aS_() {
        this.d.setVisibility(4);
        this.f.setVisibility(0);
    }

    public final void z() {
        if (this.d.getVisibility() == 0) {
            this.f.setVisibility(8);
        } else {
            gac.a(this.f, (View) this.d);
        }
    }
}
