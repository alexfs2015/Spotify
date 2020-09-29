package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.ads.ui.OverlayBackgroundView;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;

/* renamed from: ibb reason: default package */
public class ibb extends jrd implements iap {
    private OverlayBackgroundView T;
    private ImageView U;
    private TextView V;
    private TextView W;
    private a X;
    public Picasso a;
    public iao b;

    public static ibb a(ial ial) {
        ibb ibb = new ibb();
        Bundle bundle = new Bundle();
        bundle.putParcelable("top_banner_ad", ial);
        ibb.g(bundle);
        return ibb;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, View view2) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getHitRect(rect);
        view2.getHitRect(rect2);
        rect2.bottom = rect.height();
        view.setTouchDelegate(new TouchDelegate(rect2, view2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_plus_top_banner, viewGroup, false);
        inflate.setOnClickListener(new $$Lambda$ibb$pmY4crL880jmjLod8P5IJIM9kx4(this));
        this.T = (OverlayBackgroundView) inflate.findViewById(R.id.top_banner_background);
        this.T.a(fr.c(p(), R.color.leave_behind_ad_background_default_color));
        this.U = (ImageView) inflate.findViewById(R.id.top_banner_image);
        this.V = (TextView) inflate.findViewById(R.id.top_banner_advertiser_name);
        this.W = (TextView) inflate.findViewById(R.id.top_banner_cta);
        SpotifyIconView spotifyIconView = (SpotifyIconView) inflate.findViewById(R.id.top_banner_close_button);
        spotifyIconView.setOnClickListener(new $$Lambda$ibb$MRNxs9fMKHqbApHqXbd3JIrgzG8(this));
        View view = (View) spotifyIconView.getParent();
        view.post(new $$Lambda$ibb$VlXXLd9wfVcRUE6XVPXfqOFgWA(view, spotifyIconView));
        return inflate;
    }

    public final void a() {
        a aVar = this.X;
        if (aVar != null && aVar.ap_() != null) {
            this.X.ap_().c();
        }
    }

    public final void a(Context context) {
        super.a(context);
        this.X = (a) context;
    }

    public final void a(iii iii) {
        iii.a(this.T);
    }

    public final void aP_() {
        super.aP_();
        this.b.a(this);
    }

    public final void a_(String str) {
        this.V.setText(str);
    }

    public final void b(String str) {
        this.a.a(str).a(this.U, (wfz) new wfz() {
            public final void a() {
                ibb.this.b.c();
            }

            public final void b() {
                ibb.this.b.d();
            }
        });
    }

    public final void c(String str) {
        this.W.setText(str);
    }
}
