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

/* renamed from: hyp reason: default package */
public class hyp extends jor implements hyd {
    private OverlayBackgroundView T;
    private ImageView U;
    private TextView V;
    private TextView W;
    private a X;
    public Picasso a;
    public hyc b;

    public static hyp a(hxz hxz) {
        hyp hyp = new hyp();
        Bundle bundle = new Bundle();
        bundle.putParcelable("top_banner_ad", hxz);
        hyp.g(bundle);
        return hyp;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_plus_top_banner, viewGroup, false);
        inflate.setOnClickListener(new $$Lambda$hyp$9b1Yk7StyFyJ8i29DKoiSkpojgg(this));
        this.T = (OverlayBackgroundView) inflate.findViewById(R.id.top_banner_background);
        this.T.a(fr.c(p(), R.color.leave_behind_ad_background_default_color));
        this.U = (ImageView) inflate.findViewById(R.id.top_banner_image);
        this.V = (TextView) inflate.findViewById(R.id.top_banner_advertiser_name);
        this.W = (TextView) inflate.findViewById(R.id.top_banner_cta);
        SpotifyIconView spotifyIconView = (SpotifyIconView) inflate.findViewById(R.id.top_banner_close_button);
        spotifyIconView.setOnClickListener(new $$Lambda$hyp$E_gxJSSJIE3Y8JdBDuZcCPK4pLE(this));
        View view = (View) spotifyIconView.getParent();
        view.post(new $$Lambda$hyp$nTypISdClhQZyqmJoBXaGrysALw(view, spotifyIconView));
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.b();
    }

    public final void a(Context context) {
        super.a(context);
        this.X = (a) context;
    }

    public final void g() {
        super.g();
        this.b.a(this);
    }

    public final void a_(String str) {
        this.V.setText(str);
    }

    public final void b(String str) {
        this.a.a(str).a(this.U, (vrt) new vrt() {
            public final void a() {
                hyp.this.b.c();
            }

            public final void b() {
                hyp.this.b.d();
            }
        });
    }

    public final void a(ifv ifv) {
        ifv.a(this.T);
    }

    public final void c(String str) {
        this.W.setText(str);
    }

    public final void a() {
        a aVar = this.X;
        if (aVar != null && aVar.aq_() != null) {
            this.X.aq_().c();
        }
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
}
