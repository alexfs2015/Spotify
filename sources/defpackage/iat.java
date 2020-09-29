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

/* renamed from: iat reason: default package */
public class iat extends jrd implements iap, a, jqx, uqq {
    public static final String a = iat.class.getCanonicalName();
    public iao T;
    private View U;
    private View V;
    private View W;
    private View X;
    private OverlayBackgroundView Y;
    private ImageView Z;
    private TextView aa;
    private Button ab;
    private iau ac;
    private a ad;
    public Picasso b;

    public static iat a(ial ial) {
        iat iat = new iat();
        Bundle bundle = new Bundle();
        bundle.putParcelable(PlayerProviders.ADS, ial);
        iat.g(bundle);
        return iat;
    }

    private void a(final iif iif) {
        AnonymousClass2 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                iif.onExitTransitionCompleted();
            }
        };
        iau iau = this.ac;
        View view = this.W;
        View view2 = this.X;
        View view3 = this.U;
        View view4 = this.V;
        iau.a(Arrays.asList(new Animator[]{iau.a(view, 1.0f, 0.0f), iau.a(view2, 1.0f, 0.0f), iau.a(view3, 1.0f, 0.0f), iau.a(view4, 1.0f, 0.0f), iau.b(view2, 0.0f, 50.0f)}), fuh.a, 300, Optional.c(r0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(iif iif, View view) {
        a(iif);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ak() {
        this.T.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void al() {
        this.T.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void am() {
        this.T.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(iif iif, View view) {
        a(iif);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.leave_behind_companion, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.companion_overlay_view);
        float b2 = (float) vfj.b(8.0f, o().getResources());
        this.W = inflate.findViewById(R.id.companion_overlay_background);
        this.U = inflate.findViewById(R.id.companion_header);
        this.V = inflate.findViewById(R.id.companion_footer);
        this.X = inflate.findViewById(R.id.companion_overlay_body);
        this.Z = (ImageView) inflate.findViewById(R.id.companion_ad_image);
        this.aa = (TextView) inflate.findViewById(R.id.companion_advertiser_name);
        this.Y = (OverlayBackgroundView) inflate.findViewById(R.id.companion_background_view);
        this.Y.a(fr.c(p(), R.color.leave_behind_ad_background_default_color));
        this.Y.a(b2);
        this.Y.setOnTouchListener(new iig(findViewById, this));
        this.ab = (Button) inflate.findViewById(R.id.companion_ad_cta);
        this.ab.setOnClickListener(new $$Lambda$iat$Qp9xLtrUHgj3S4gwai_iRL66M0w(this, new $$Lambda$iat$fAqoq1tFqRl5tfnMf2kYEJDADdU(this)));
        this.V.setOnClickListener(new $$Lambda$iat$3xiqIJ_Rp_j7RPaUCnhz8YaZbFM(this, new $$Lambda$iat$_Sk2QqlYZWPvmD64WfWuXPHwPyc(this)));
        this.ac = new iau();
        return inflate;
    }

    public final void a() {
        a aVar = this.ad;
        if (aVar != null && aVar.ap_() != null) {
            this.ad.ap_().b();
        }
    }

    public final void a(Context context) {
        super.a(context);
        this.ad = (a) context;
    }

    public final void a(iii iii) {
        iii.a(this.Y);
    }

    public final void a(int[] iArr) {
        int left = this.Z.getLeft();
        int top = this.Z.getTop();
        int width = this.Z.getWidth();
        int height = this.Z.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            a((iif) new $$Lambda$iat$dcBJioMDs9v06Htt_zvTlucWdH4(this));
        }
    }

    public final void aP_() {
        super.aP_();
        this.T.a(this);
    }

    public final void a_(String str) {
        this.aa.setText(str);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ADS, ViewUris.aU.toString());
    }

    public final uqm ag() {
        return uqo.a;
    }

    public final void ah() {
        this.U.animate().alpha(1.0f).setDuration(100).start();
        this.V.animate().alpha(1.0f).setDuration(100).start();
    }

    public final void ai() {
        this.T.b();
    }

    public final gkq aj() {
        return PageIdentifiers.ADS;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(String str) {
        this.b.a(str).a(this.Z, (wfz) new wfz() {
            public final void a() {
                iat.this.T.c();
            }

            public final void b() {
                iat.this.T.d();
            }
        });
    }

    public final void c() {
        this.U.animate().alpha(0.0f).setDuration(100).start();
        this.V.animate().alpha(0.0f).setDuration(100).start();
    }

    public final void c(String str) {
        this.ab.setText(str);
    }

    public final String e() {
        return ViewUris.aU.toString();
    }

    public final void z() {
        super.z();
        iau iau = this.ac;
        View view = this.W;
        View view2 = this.X;
        View view3 = this.U;
        View view4 = this.V;
        iau.a(Arrays.asList(new Animator[]{iau.a(view, 0.0f, 1.0f), iau.a(view2, 0.0f, 1.0f), iau.a(view3, 0.0f, 1.0f), iau.a(view4, 0.0f, 1.0f), iau.b(view2, 50.0f, 0.0f)}), fuh.b, 350, Optional.e());
    }
}
