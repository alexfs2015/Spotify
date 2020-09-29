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

/* renamed from: idr reason: default package */
public class idr extends jrd implements ids, jqx, lbp, uqq {
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
    private idq ab;
    /* access modifiers changed from: private */
    public boolean ac;
    private final a ad = new b() {
        public final void a(int[] iArr) {
            int left = idr.this.W.getLeft();
            int top = idr.this.W.getTop();
            int width = idr.this.W.getWidth();
            int height = idr.this.W.getHeight();
            if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
                idr.this.b.c();
            }
        }

        public final void ah() {
            idr.this.Z.animate().alpha(1.0f).setDuration(100).start();
            idr.this.aa.animate().alpha(1.0f).setDuration(100).start();
        }

        public final void ai() {
            idr.this.b.e();
        }

        public final void c() {
            idr.this.Z.animate().alpha(0.0f).setDuration(100).start();
            idr.this.aa.animate().alpha(0.0f).setDuration(100).start();
        }
    };
    private final OnLayoutChangeListener ae = new OnLayoutChangeListener() {
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int a2 = vfj.a(24.0f, idr.this.o().getResources());
            int top = idr.this.Z.getTop();
            int bottom = i4 - idr.this.aa.getBottom();
            int i9 = 0;
            int abs = top < a2 ? Math.abs(a2 - top) : 0;
            if (bottom < a2) {
                i9 = Math.abs(a2 - bottom);
            }
            int max = Math.max(abs, i9);
            LayoutParams layoutParams = (LayoutParams) idr.this.W.getLayoutParams();
            int b = ia.b(layoutParams) + max;
            ia.a(layoutParams, ia.a(layoutParams) + max);
            ia.b(layoutParams, b);
            idr.this.W.setLayoutParams(layoutParams);
            idr.this.T.removeOnLayoutChangeListener(this);
        }
    };
    public idp b;

    public static idr a(fqn fqn, ido ido) {
        idr idr = new idr();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_marquee", ido);
        idr.g(bundle);
        fqo.a((Fragment) idr, fqn);
        return idr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        idp idp = this.b;
        MarqueeOptOutMenuFragment.a(p(), idp.a.b(), idp.a.h());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.b();
    }

    public final void A() {
        super.A();
        this.ab.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.ac = bundle.getBoolean("animation_completed", false);
        }
        View inflate = layoutInflater.inflate(R.layout.marquee, viewGroup, false);
        this.T = inflate.findViewById(R.id.marquee_overlay_view);
        View findViewById = inflate.findViewById(R.id.marquee_overlay_background);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.marquee_overlay_content);
        float b2 = (float) vfj.b(8.0f, o().getResources());
        this.Z = inflate.findViewById(R.id.marquee_overlay_header);
        this.U = (OverlayBackgroundView) inflate.findViewById(R.id.marquee_modal_background_view);
        this.U.a(b2);
        this.U.a(fr.c(p(), R.color.marquee_background_default_color));
        this.U.setOnTouchListener(new iig(this.T, this.ad));
        this.V = (TextView) inflate.findViewById(R.id.marquee_artist_name);
        this.W = (ImageView) inflate.findViewById(R.id.marquee_new_release_cover_art);
        this.X = (TextView) inflate.findViewById(R.id.marquee_new_release_title);
        ((Button) inflate.findViewById(R.id.marquee_cta)).setOnClickListener(new $$Lambda$idr$O3wuLWu6N_4Fnm49jfwFKmBHIc(this));
        this.Y = (TextView) inflate.findViewById(R.id.marquee_overlay_legal_text);
        this.aa = inflate.findViewById(R.id.marquee_overlay_footer_text);
        this.aa.setOnClickListener(new $$Lambda$idr$0_QOrXsMYFIbVGWB5I6s9cD9c_I(this));
        this.ab = new idq(this.Z, this.aa, findViewById, constraintLayout);
        this.T.addOnLayoutChangeListener(this.ae);
        return inflate;
    }

    public final void a(final iif iif) {
        idq idq = this.ab;
        AnonymousClass5 r1 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                iif.onExitTransitionCompleted();
                if (idr.this.p() != null) {
                    idr.this.p().overridePendingTransition(0, 0);
                }
            }
        };
        idq.a(Arrays.asList(new Animator[]{idq.b, idq.d, idq.h, idq.f, idq.j}), Optional.c(r1), fuh.a, 300);
    }

    public final void a(iii iii) {
        iii.a(this.U);
    }

    public final void a(String str, String str2) {
        int c = fr.c(p(), R.color.white_70);
        new iek();
        Spannable a2 = iek.a(str, str2, c, new $$Lambda$idr$kQJZL45qb6b4KeHv5oVfg3QXS94(this));
        this.Y.setHighlightColor(0);
        this.Y.setMovementMethod(LinkMovementMethod.getInstance());
        this.Y.setText(a2);
    }

    public final void aP_() {
        super.aP_();
        idp idp = this.b;
        boolean z = !idp.b.b(hyn.a);
        idp.f = this;
        idp.f.a(idp.d);
        idp.f.b(idp.a.c());
        idp.f.c(idp.a.e());
        idp.f.d(idp.a.f());
        if (z) {
            idp.f.a(idp.e.c(), idp.e.a());
        } else {
            idp.f.e(idp.e.b());
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ADS, null);
    }

    public final uqm ag() {
        return uqo.a;
    }

    public final gkq aj() {
        return PageIdentifiers.ADS;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(String str) {
        this.V.setText(str);
    }

    public final void c() {
        if (p() != null) {
            p().finish();
        }
    }

    public final void c(String str) {
        this.a.a(str).a(this.W, (wfz) new wfz() {
            public final void a() {
                idp idp = idr.this.b;
                if (!idp.g) {
                    idp.c.a("viewed", idp.a.a());
                    idp.g = true;
                }
            }

            public final void b() {
                idr.this.b.a();
            }
        });
    }

    public final void d(String str) {
        this.X.setText(str);
    }

    public final String e() {
        return ViewUris.aT.toString();
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("animation_completed", this.ac);
        super.e(bundle);
    }

    public final void e(String str) {
        this.Y.setText(str);
    }

    public boolean onBackPressed() {
        this.b.d();
        return true;
    }

    public final void z() {
        super.z();
        if (!this.ac) {
            idq idq = this.ab;
            Animator[] animatorArr = {idq.a, idq.c, idq.g, idq.e, idq.i};
            idq.a(Arrays.asList(animatorArr), Optional.c(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    idr.this.ac = true;
                }
            }), fuh.b, 350);
        }
    }
}
