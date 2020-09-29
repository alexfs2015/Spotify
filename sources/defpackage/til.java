package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;

/* renamed from: til reason: default package */
public class til extends ith<PlayerTrack> implements tio {
    final ImageView a = ((ImageView) this.o.findViewById(R.id.image));
    private final View b = this.o.findViewById(R.id.peek_placeholder);
    private final vgw c;

    public til(LayoutInflater layoutInflater, int i, vgw vgw, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.c = vgw;
    }

    public final void A() {
        if (B().getVisibility() == 0) {
            this.b.setVisibility(8);
        } else {
            gaw.a(this.b, B());
        }
    }

    /* access modifiers changed from: protected */
    public View B() {
        return this.a;
    }

    public void a(PlayerTrack playerTrack, int i) {
        Uri b2 = iyd.b(playerTrack);
        if (Uri.EMPTY.equals(b2)) {
            this.a.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            ((vgw) fbp.a(this.c)).a(b2).a((int) R.drawable.bg_placeholder_album).a(this.a);
        }
        A();
    }

    public final void aQ_() {
        B().setVisibility(4);
        this.b.setVisibility(0);
    }
}
