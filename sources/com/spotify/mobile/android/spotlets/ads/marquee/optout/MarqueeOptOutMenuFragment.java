package com.spotify.mobile.android.spotlets.ads.marquee.optout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.ads.marquee.learnmore.LearnMoreWebActivity;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarqueeOptOutMenuFragment extends wia implements idj, jqx, uqq {
    public icd T;
    public idl U;
    public jvf V;
    private AnimatorSet W;
    private Context X;
    private View Y;
    private LinearLayout Z;
    private TextView ab;
    /* access modifiers changed from: private */
    public boolean ac;
    /* access modifiers changed from: private */
    public String ad;
    /* access modifiers changed from: private */
    public String ae;

    enum MenuTransition {
        OVERLAY_TO_OPT_OUT,
        OPT_OUT_BACK,
        OPT_OUT_TO_SURVEY,
        SURVEY_TO_OPT_OUT
    }

    public MarqueeOptOutMenuFragment() {
        String str = "";
        this.ad = str;
        this.ae = str;
    }

    public static MarqueeOptOutMenuFragment a(kf kfVar, String str, String str2) {
        MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = new MarqueeOptOutMenuFragment();
        Bundle bundle = new Bundle();
        String str3 = "_asttisrru";
        bundle.putString("artist_uri", str);
        String str4 = "neimtmd_iel";
        bundle.putString("lineitem_id", str2);
        marqueeOptOutMenuFragment.g(bundle);
        marqueeOptOutMenuFragment.a(kfVar.i(), "MarqueeOptOut");
        return marqueeOptOutMenuFragment;
    }

    private void a(MenuTransition menuTransition, AnimatorListener animatorListener) {
        Animator a = ieg.a(this.Y);
        Animator a2 = ieg.a(this.Z);
        Animator a3 = ieg.a(this.Z, 50.0f);
        List emptyList = Collections.emptyList();
        if (menuTransition == MenuTransition.OVERLAY_TO_OPT_OUT) {
            emptyList = Arrays.asList(new Animator[]{a, a2, a3});
        } else if (menuTransition == MenuTransition.SURVEY_TO_OPT_OUT) {
            emptyList = Arrays.asList(new Animator[]{a2, a3});
        }
        a(emptyList, Optional.c(animatorListener));
    }

    private void a(List<Animator> list, Optional<AnimatorListener> optional) {
        al();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setDuration(200);
        if (optional.b()) {
            animatorSet.addListener((AnimatorListener) optional.c());
        }
        animatorSet.start();
        this.W = animatorSet;
    }

    /* access modifiers changed from: private */
    public void ak() {
        Intent a = LearnMoreWebActivity.a((Context) p());
        if (p() != null) {
            p().startActivity(a);
        }
    }

    private void al() {
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.W.cancel();
        }
    }

    /* access modifiers changed from: private */
    public void b(MenuTransition menuTransition, AnimatorListener animatorListener) {
        Animator b = ieg.b(this.Y);
        Animator b2 = ieg.b(this.Z);
        Animator b3 = ieg.b(this.Z, 50.0f);
        List emptyList = Collections.emptyList();
        boolean z = !true;
        int i = 0 << 2;
        if (menuTransition == MenuTransition.OPT_OUT_TO_SURVEY) {
            emptyList = Arrays.asList(new Animator[]{b2, b3});
        } else if (menuTransition == MenuTransition.OPT_OUT_BACK) {
            emptyList = Arrays.asList(new Animator[]{b, b2, b3});
        }
        a(emptyList, Optional.c(animatorListener));
    }

    public final void A() {
        super.A();
        al();
    }

    public final Dialog a(Bundle bundle) {
        float f;
        float f2;
        this.X = p();
        if (this.i != null) {
            String str = "us_roariti";
            this.ad = this.i.getString("artist_uri");
            String str2 = "de_lebinmit";
            this.ae = this.i.getString("lineitem_id");
        }
        if (bundle != null) {
            String str3 = "tunmoobd_e_citlepaoantm_pot";
            this.ac = bundle.getBoolean("opt_out_animation_completed", false);
            String str4 = "honp_cotttptt_oaae_un";
            f2 = bundle.getFloat("opt_out_content_alpha");
            String str5 = "totsnntppntnaoueoct_a__rtiol_";
            f = bundle.getFloat("opt_out_content_translation_y");
        } else {
            f2 = 1.0f;
            f = 0.0f;
        }
        AnonymousClass1 r2 = new Dialog(this.X, 16973840) {
            public final void onBackPressed() {
                MarqueeOptOutMenuFragment.this.b(MenuTransition.OPT_OUT_BACK, new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        AnonymousClass1.this.dismiss();
                    }
                });
            }
        };
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.X).inflate(R.layout.optout_context_menu, null);
        this.Y = frameLayout.findViewById(R.id.opt_out_background_view);
        this.Z = (LinearLayout) frameLayout.findViewById(R.id.panel);
        this.ab = (TextView) frameLayout.findViewById(R.id.optout_title);
        this.Z.setAlpha(f2);
        this.Z.setTranslationY(f);
        int c = fr.c(p(), R.color.white);
        new iek();
        Spannable a = iek.a(this.T.d(), this.T.e(), c, new a() {
            public final void onLinkClicked() {
                MarqueeOptOutMenuFragment.this.ak();
            }
        });
        this.ab.setHighlightColor(0);
        this.ab.setMovementMethod(LinkMovementMethod.getInstance());
        this.ab.setText(a);
        r2.setContentView(frameLayout);
        RecyclerView recyclerView = (RecyclerView) r2.findViewById(R.id.optout_menu_options);
        idl idl = this.U;
        String str6 = this.ad;
        String str7 = this.ae;
        kf p = p();
        Object a2 = idl.a(idl.a.get(), 1);
        Object obj = a2;
        ide ide = (ide) a2;
        icd icd = (icd) idl.a(idl.b.get(), 2);
        Object a3 = idl.a(idl.c.get(), 3);
        Object obj2 = a3;
        idj idj = (idj) a3;
        String str8 = (String) idl.a(str6, 4);
        Object a4 = idl.a(str7, 5);
        Object obj3 = a4;
        String str9 = (String) a4;
        Object a5 = idl.a(p, 6);
        Object obj4 = a5;
        idk idk = r5;
        idk idk2 = new idk(ide, icd, idj, str8, str9, (kf) a5);
        idg idg = new idg(LayoutInflater.from(p()), idk2);
        recyclerView.a((i) new LinearLayoutManager(p()));
        recyclerView.a((a) idg);
        return r2;
    }

    public final void a(int i, int i2, Intent intent) {
        if (i2 == 1) {
            a(MenuTransition.SURVEY_TO_OPT_OUT, (AnimatorListener) null);
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

    public final void ah() {
        b(MenuTransition.OPT_OUT_TO_SURVEY, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kk i = ((kf) fbp.a(MarqueeOptOutMenuFragment.this.p())).i();
                MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = MarqueeOptOutMenuFragment.this;
                icy.a(i, marqueeOptOutMenuFragment, 0, marqueeOptOutMenuFragment.ad, MarqueeOptOutMenuFragment.this.ae);
            }
        });
    }

    public final void ai() {
        if (p() != null) {
            p().finish();
            p().overridePendingTransition(0, R.anim.marquee_overlay_exit);
        }
    }

    public final gkq aj() {
        return PageIdentifiers.ADS;
    }

    public final String b(Context context) {
        return "";
    }

    public final void d(int i) {
        this.V.a(SpotifyIconV2.BAN, i, 1);
    }

    public final String e() {
        return ViewUris.aT.toString();
    }

    public final void e(Bundle bundle) {
        String str = "aptoelitntomdeoitt_mn_c_puo";
        bundle.putBoolean("opt_out_animation_completed", this.ac);
        String str2 = "u_scolpttoh_patao_ten";
        bundle.putFloat("opt_out_content_alpha", this.Z.getAlpha());
        bundle.putFloat("opt_out_content_translation_y", this.Z.getTranslationY());
        super.e(bundle);
    }

    public final void z() {
        super.z();
        if (!this.ac) {
            a(MenuTransition.OVERLAY_TO_OPT_OUT, (AnimatorListener) new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    MarqueeOptOutMenuFragment.this.ac = true;
                }
            });
        }
    }
}
