package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.spotlets.ads.ui.OverlayBackgroundView;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: hyh reason: default package */
public class hyh extends jor implements hyd, a, jol, udv {
    public static final String a = hyh.class.getCanonicalName();
    public hyc T;
    private View U;
    private View V;
    private View W;
    private View X;
    private OverlayBackgroundView Y;
    private ImageView Z;
    private TextView aa;
    private Button ab;
    private hyi ac;
    private a ad;
    public Picasso b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static hyh a(hxz hxz) {
        hyh hyh = new hyh();
        Bundle bundle = new Bundle();
        bundle.putParcelable(PlayerProviders.ADS, hxz);
        hyh.g(bundle);
        return hyh;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.leave_behind_companion, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.companion_overlay_view);
        float b2 = (float) uts.b(8.0f, o().getResources());
        this.W = inflate.findViewById(R.id.companion_overlay_background);
        this.U = inflate.findViewById(R.id.companion_header);
        this.V = inflate.findViewById(R.id.companion_footer);
        this.X = inflate.findViewById(R.id.companion_overlay_body);
        this.Z = (ImageView) inflate.findViewById(R.id.companion_ad_image);
        this.aa = (TextView) inflate.findViewById(R.id.companion_advertiser_name);
        this.Y = (OverlayBackgroundView) inflate.findViewById(R.id.companion_background_view);
        this.Y.a(fr.c(p(), R.color.leave_behind_ad_background_default_color));
        this.Y.a(b2);
        this.Y.setOnTouchListener(new ift(findViewById, this));
        this.ab = (Button) inflate.findViewById(R.id.companion_ad_cta);
        this.ab.setOnClickListener(new $$Lambda$hyh$AJxO7g7QowcdCglZhr5R_a0r4Pg(this, new $$Lambda$hyh$X51lPAhUR96oTUwsNjYCN_24na4(this)));
        this.V.setOnClickListener(new $$Lambda$hyh$igsCa2q_9JIN1IFziEYotX37cKI(this, new $$Lambda$hyh$qCuHMgjGO6TrzaEEo3FKPFyjLo(this)));
        this.ac = new hyi();
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void am() {
        this.T.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ifs ifs, View view) {
        a(ifs);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void al() {
        this.T.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ifs ifs, View view) {
        a(ifs);
    }

    public final void a(Context context) {
        super.a(context);
        this.ad = (a) context;
    }

    public final void g() {
        super.g();
        this.T.a(this);
    }

    public final void z() {
        super.z();
        hyi hyi = this.ac;
        View view = this.W;
        View view2 = this.X;
        View view3 = this.U;
        View view4 = this.V;
        hyi.a(Arrays.asList(new Animator[]{hyi.a(view, 0.0f, 1.0f), hyi.a(view2, 0.0f, 1.0f), hyi.a(view3, 0.0f, 1.0f), hyi.a(view4, 0.0f, 1.0f), hyi.b(view2, 50.0f, 0.0f)}), ftn.b, 350, Optional.e());
    }

    public final void b(String str) {
        this.b.a(str).a(this.Z, (vrt) new vrt() {
            public final void a() {
                hyh.this.T.c();
            }

            public final void b() {
                hyh.this.T.d();
            }
        });
    }

    public final void a(ifv ifv) {
        ifv.a(this.Y);
    }

    public final void c(String str) {
        this.ab.setText(str);
    }

    public final void a() {
        a aVar = this.ad;
        if (aVar != null && aVar.aq_() != null) {
            this.ad.aq_().b();
        }
    }

    private void a(final ifs ifs) {
        AnonymousClass2 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ifs.onExitTransitionCompleted();
            }
        };
        hyi hyi = this.ac;
        View view = this.W;
        View view2 = this.X;
        View view3 = this.U;
        View view4 = this.V;
        hyi.a(Arrays.asList(new Animator[]{hyi.a(view, 1.0f, 0.0f), hyi.a(view2, 1.0f, 0.0f), hyi.a(view3, 1.0f, 0.0f), hyi.a(view4, 1.0f, 0.0f), hyi.b(view2, 0.0f, 50.0f)}), ftn.a, 300, Optional.c(r0));
    }

    public final void c() {
        this.U.animate().alpha(0.0f).setDuration(100).start();
        this.V.animate().alpha(0.0f).setDuration(100).start();
    }

    public final void ah() {
        this.U.animate().alpha(1.0f).setDuration(100).start();
        this.V.animate().alpha(1.0f).setDuration(100).start();
    }

    public final void ai() {
        this.T.b();
    }

    public final void a(int[] iArr) {
        int left = this.Z.getLeft();
        int top = this.Z.getTop();
        int width = this.Z.getWidth();
        int height = this.Z.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            a((ifs) new $$Lambda$hyh$OHe16vXaNWiGi1paYJrM_Dv6o8(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ak() {
        this.T.a();
    }

    public final String e() {
        return ViewUris.aV.toString();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ADS, ViewUris.aV.toString());
    }

    public final udr ag() {
        return udt.a;
    }

    public final gjf aj() {
        return PageIdentifiers.ADS;
    }

    public final void a_(String str) {
        this.aa.setText(str);
    }
}
