package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.ads.marquee.optout.MarqueeOptOutMenuFragment;
import com.spotify.mobile.android.spotlets.ads.ui.OverlayBackgroundView;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: ibf reason: default package */
public class ibf extends jor implements ibg, jol, kyf, udv {
    /* access modifiers changed from: private */
    public View T;
    private OverlayBackgroundView U;
    private TextView V;
    /* access modifiers changed from: private */
    public ImageView W;
    private TextView X;
    private TextView Y;
    /* access modifiers changed from: private */
    public View Z;
    public Picasso a;
    /* access modifiers changed from: private */
    public View aa;
    private ibe ab;
    /* access modifiers changed from: private */
    public boolean ac;
    private final a ad = new b() {
        public final void c() {
            ibf.this.Z.animate().alpha(0.0f).setDuration(100).start();
            ibf.this.aa.animate().alpha(0.0f).setDuration(100).start();
        }

        public final void ah() {
            ibf.this.Z.animate().alpha(1.0f).setDuration(100).start();
            ibf.this.aa.animate().alpha(1.0f).setDuration(100).start();
        }

        public final void ai() {
            ibf.this.b.e();
        }

        public final void a(int[] iArr) {
            int left = ibf.this.W.getLeft();
            int top = ibf.this.W.getTop();
            int width = ibf.this.W.getWidth();
            int height = ibf.this.W.getHeight();
            if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
                ibf.this.b.c();
            }
        }
    };
    private final OnLayoutChangeListener ae = new OnLayoutChangeListener() {
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int a2 = uts.a(24.0f, ibf.this.o().getResources());
            int top = ibf.this.Z.getTop();
            int bottom = i4 - ibf.this.aa.getBottom();
            int i9 = 0;
            int abs = top < a2 ? Math.abs(a2 - top) : 0;
            if (bottom < a2) {
                i9 = Math.abs(a2 - bottom);
            }
            int max = Math.max(abs, i9);
            LayoutParams layoutParams = (LayoutParams) ibf.this.W.getLayoutParams();
            int b = ia.b(layoutParams) + max;
            ia.a(layoutParams, ia.a(layoutParams) + max);
            ia.b(layoutParams, b);
            ibf.this.W.setLayoutParams(layoutParams);
            ibf.this.T.removeOnLayoutChangeListener(this);
        }
    };
    public ibd b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static ibf a(fpt fpt, ibc ibc) {
        ibf ibf = new ibf();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_marquee", ibc);
        ibf.g(bundle);
        fpu.a((Fragment) ibf, fpt);
        return ibf;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.ac = bundle.getBoolean("animation_completed", false);
        }
        View inflate = layoutInflater.inflate(R.layout.marquee, viewGroup, false);
        this.T = inflate.findViewById(R.id.marquee_overlay_view);
        View findViewById = inflate.findViewById(R.id.marquee_overlay_background);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.marquee_overlay_content);
        float b2 = (float) uts.b(8.0f, o().getResources());
        this.Z = inflate.findViewById(R.id.marquee_overlay_header);
        this.U = (OverlayBackgroundView) inflate.findViewById(R.id.marquee_modal_background_view);
        this.U.a(b2);
        this.U.a(fr.c(p(), R.color.marquee_background_default_color));
        this.U.setOnTouchListener(new ift(this.T, this.ad));
        this.V = (TextView) inflate.findViewById(R.id.marquee_artist_name);
        this.W = (ImageView) inflate.findViewById(R.id.marquee_new_release_cover_art);
        this.X = (TextView) inflate.findViewById(R.id.marquee_new_release_title);
        ((Button) inflate.findViewById(R.id.marquee_cta)).setOnClickListener(new $$Lambda$ibf$z7ATBdO1Twn2Hev9JM07SsD3AGU(this));
        this.Y = (TextView) inflate.findViewById(R.id.marquee_overlay_legal_text);
        this.aa = inflate.findViewById(R.id.marquee_overlay_footer_text);
        this.aa.setOnClickListener(new $$Lambda$ibf$AXKsU4okh9SlwGegNCT6q5f4w(this));
        this.ab = new ibe(this.Z, this.aa, findViewById, constraintLayout);
        this.T.addOnLayoutChangeListener(this.ae);
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.e();
    }

    public final void g() {
        super.g();
        ibd ibd = this.b;
        boolean z = !ibd.b.b(hwb.a);
        ibd.f = this;
        ibd.f.a(ibd.d);
        ibd.f.b(ibd.a.c());
        ibd.f.c(ibd.a.e());
        ibd.f.d(ibd.a.f());
        if (z) {
            ibd.f.a(ibd.e.c(), ibd.e.a());
        } else {
            ibd.f.e(ibd.e.b());
        }
    }

    public final void z() {
        super.z();
        if (!this.ac) {
            ibe ibe = this.ab;
            Animator[] animatorArr = {ibe.a, ibe.c, ibe.g, ibe.e, ibe.i};
            ibe.a(Arrays.asList(animatorArr), Optional.c(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    ibf.this.ac = true;
                }
            }), ftn.b, 350);
        }
    }

    public final void A() {
        super.A();
        this.ab.a();
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("animation_completed", this.ac);
        super.e(bundle);
    }

    public final void b(String str) {
        this.V.setText(str);
    }

    public final void c(String str) {
        this.a.a(str).a(this.W, (vrt) new vrt() {
            public final void a() {
                ibd ibd = ibf.this.b;
                if (!ibd.g) {
                    ibd.c.a("viewed", ibd.a.a());
                    ibd.g = true;
                }
            }

            public final void b() {
                ibf.this.b.a();
            }
        });
    }

    public final void d(String str) {
        this.X.setText(str);
    }

    public final void e(String str) {
        this.Y.setText(str);
    }

    public final void a(String str, String str2) {
        int c = fr.c(p(), R.color.white_70);
        new iby();
        Spannable a2 = iby.a(str, str2, c, new $$Lambda$ibf$5gHcAtxBcbGBLA_1wUDbo1wdVGc(this));
        this.Y.setHighlightColor(0);
        this.Y.setMovementMethod(LinkMovementMethod.getInstance());
        this.Y.setText(a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        ibd ibd = this.b;
        MarqueeOptOutMenuFragment.a(p(), ibd.a.b(), ibd.a.h());
    }

    public final void a(ifv ifv) {
        ifv.a(this.U);
    }

    public final void a(final ifs ifs) {
        ibe ibe = this.ab;
        AnonymousClass5 r1 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ifs.onExitTransitionCompleted();
                if (ibf.this.p() != null) {
                    ibf.this.p().overridePendingTransition(0, 0);
                }
            }
        };
        ibe.a(Arrays.asList(new Animator[]{ibe.b, ibe.d, ibe.h, ibe.f, ibe.j}), Optional.c(r1), ftn.a, 300);
    }

    public final void c() {
        if (p() != null) {
            p().finish();
        }
    }

    public boolean onBackPressed() {
        this.b.d();
        return true;
    }

    public final String e() {
        return ViewUris.aU.toString();
    }

    public final udr ag() {
        return udt.a;
    }

    public final gjf aj() {
        return PageIdentifiers.ADS;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ADS, null);
    }
}
