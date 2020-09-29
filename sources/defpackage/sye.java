package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;

/* renamed from: sye reason: default package */
public class sye extends iqu<PlayerTrack> implements syh {
    final ImageView a = ((ImageView) this.o.findViewById(R.id.image));
    private final View b = this.o.findViewById(R.id.peek_placeholder);
    private final uvf c;

    public sye(LayoutInflater layoutInflater, int i, uvf uvf, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.c = uvf;
    }

    public final void aS_() {
        A().setVisibility(4);
        this.b.setVisibility(0);
    }

    public final void z() {
        if (A().getVisibility() == 0) {
            this.b.setVisibility(8);
        } else {
            gac.a(this.b, A());
        }
    }

    /* access modifiers changed from: protected */
    public View A() {
        return this.a;
    }

    public void a(PlayerTrack playerTrack, int i) {
        Uri b2 = ivs.b(playerTrack);
        if (Uri.EMPTY.equals(b2)) {
            this.a.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            ((uvf) fay.a(this.c)).a(b2).a((int) R.drawable.bg_placeholder_album).a(this.a);
        }
        z();
    }
}
