package defpackage;

import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: tip reason: default package */
public final class tip extends ith<PlayerTrack> implements tio {
    private final vgw a;
    private final ViewGroup b;
    private final ImageView c = ((ImageView) this.o.findViewById(R.id.image));
    private final View d = this.o.findViewById(R.id.peek_placeholder);
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public tip(LayoutInflater layoutInflater, int i2, vgw vgw, DisplayMetrics displayMetrics, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i2, viewGroup, false));
        this.a = vgw;
        this.b = (ViewGroup) viewGroup.getParent();
        this.e = displayMetrics.widthPixels;
        this.f = displayMetrics.heightPixels;
        this.g = viewGroup.getResources().getDimensionPixelSize(R.dimen.player_v2_square_cover_art_min_horizontal_margin);
        this.h = viewGroup.getResources().getDimensionPixelSize(R.dimen.player_v2_square_cover_art_min_top_vertical_margin);
        this.i = viewGroup.getResources().getDimensionPixelSize(R.dimen.player_v2_square_cover_art_min_bottom_vertical_margin);
    }

    private void B() {
        LayoutParams layoutParams;
        View findViewById = this.b.findViewById(R.id.player_overlay_header);
        View findViewById2 = this.b.findViewById(R.id.player_overlay_footer);
        if (findViewById == null || findViewById2 == null) {
            throw new NullPointerException("The Player Fragment layout is missing player_overlay_header and/or player_overlay_footer views, needed to position the square cover art in between.");
        }
        int top = (findViewById2.getTop() - findViewById.getBottom()) - (this.h + this.i);
        int i2 = this.e - (this.g << 1);
        int min = Math.min(top, i2);
        int bottom = findViewById.getBottom() + this.h + ((top - min) / 2);
        LayoutParams layoutParams2 = (LayoutParams) this.c.getLayoutParams();
        layoutParams2.height = min;
        layoutParams2.width = min;
        layoutParams2.setMargins(0, bottom, 0, 0);
        int i3 = this.f;
        int i4 = this.e;
        if (i3 > i4) {
            double d2 = (double) min;
            layoutParams = layoutParams2;
            double d3 = (double) i4;
            Double.isNaN(d3);
            if (d2 < d3 * 0.25d) {
                String format = String.format(Locale.ENGLISH, "[screenWidth = %d, screenHeight = %d, headerBottom = %d, footerTop = %d, verticalRealEstate = %d, horizontalRealEstate = %d, coverArtSize = %d]", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(findViewById.getBottom()), Integer.valueOf(findViewById2.getTop()), Integer.valueOf(top), Integer.valueOf(i2), Integer.valueOf(min)});
                StringBuilder sb = new StringBuilder("Amusingly tiny cover art \n");
                sb.append(format);
                Assertion.c(sb.toString());
                return;
            }
        } else {
            layoutParams = layoutParams2;
        }
        LayoutParams layoutParams3 = layoutParams;
        this.c.setLayoutParams(layoutParams3);
        this.d.setLayoutParams(layoutParams3);
    }

    private void a(PlayerTrack playerTrack) {
        B();
        Uri b2 = iyd.b(playerTrack);
        if (Uri.EMPTY.equals(b2)) {
            this.c.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            this.a.a(b2).a((int) R.drawable.bg_placeholder_album).a(this.c);
        }
        A();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, View view) {
        a(playerTrack);
    }

    public final void A() {
        if (this.c.getVisibility() == 0) {
            this.d.setVisibility(8);
        } else {
            gaw.a(this.d, (View) this.c);
        }
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (ip.B(this.b)) {
            a(playerTrack);
        } else {
            gaw.a(this.b, new $$Lambda$tip$h5keTwflkjpfxzSZx8MO5FnTLdY(this, playerTrack), false);
        }
    }

    public final void aQ_() {
        this.c.setVisibility(4);
        this.d.setVisibility(0);
    }
}
