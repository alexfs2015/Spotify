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

public class MarqueeOptOutMenuFragment extends vtu implements iax, jol, udv {
    public hzr T;
    public iaz U;
    public jsz V;
    private AnimatorSet W;
    private Context X;
    private View Z;
    private LinearLayout aa;
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

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public MarqueeOptOutMenuFragment() {
        String str = "";
        this.ad = str;
        this.ae = str;
    }

    public final Dialog a(Bundle bundle) {
        float f;
        float f2;
        this.X = p();
        if (this.i != null) {
            this.ad = this.i.getString("artist_uri");
            this.ae = this.i.getString("lineitem_id");
        }
        if (bundle != null) {
            this.ac = bundle.getBoolean("opt_out_animation_completed", false);
            f2 = bundle.getFloat("opt_out_content_alpha");
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
        this.Z = frameLayout.findViewById(R.id.opt_out_background_view);
        this.aa = (LinearLayout) frameLayout.findViewById(R.id.panel);
        this.ab = (TextView) frameLayout.findViewById(R.id.optout_title);
        this.aa.setAlpha(f2);
        this.aa.setTranslationY(f);
        int c = fr.c(p(), R.color.white);
        new iby();
        Spannable a = iby.a(this.T.d(), this.T.e(), c, new a() {
            public final void onLinkClicked() {
                MarqueeOptOutMenuFragment.this.ak();
            }
        });
        this.ab.setHighlightColor(0);
        this.ab.setMovementMethod(LinkMovementMethod.getInstance());
        this.ab.setText(a);
        r2.setContentView(frameLayout);
        RecyclerView recyclerView = (RecyclerView) r2.findViewById(R.id.optout_menu_options);
        iaz iaz = this.U;
        iay iay = new iay((ias) iaz.a(iaz.a.get(), 1), (hzr) iaz.a(iaz.b.get(), 2), (iax) iaz.a(iaz.c.get(), 3), (String) iaz.a(this.ad, 4), (String) iaz.a(this.ae, 5), (ka) iaz.a(p(), 6));
        iau iau = new iau(LayoutInflater.from(p()), iay);
        recyclerView.a((i) new LinearLayoutManager(p()));
        recyclerView.a((a) iau);
        return r2;
    }

    public static MarqueeOptOutMenuFragment a(ka kaVar, String str, String str2) {
        MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = new MarqueeOptOutMenuFragment();
        Bundle bundle = new Bundle();
        bundle.putString("artist_uri", str);
        bundle.putString("lineitem_id", str2);
        marqueeOptOutMenuFragment.g(bundle);
        marqueeOptOutMenuFragment.a(kaVar.i(), "MarqueeOptOut");
        return marqueeOptOutMenuFragment;
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

    public final void A() {
        super.A();
        al();
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("opt_out_animation_completed", this.ac);
        bundle.putFloat("opt_out_content_alpha", this.aa.getAlpha());
        bundle.putFloat("opt_out_content_translation_y", this.aa.getTranslationY());
        super.e(bundle);
    }

    public final void a(int i, int i2, Intent intent) {
        if (i2 == 1) {
            a(MenuTransition.SURVEY_TO_OPT_OUT, (AnimatorListener) null);
        }
    }

    public final void d(int i) {
        this.V.a(SpotifyIconV2.BAN, i, 1);
    }

    public final void ah() {
        b(MenuTransition.OPT_OUT_TO_SURVEY, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kf i = ((ka) fay.a(MarqueeOptOutMenuFragment.this.p())).i();
                MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = MarqueeOptOutMenuFragment.this;
                iam.a(i, marqueeOptOutMenuFragment, 0, marqueeOptOutMenuFragment.ad, MarqueeOptOutMenuFragment.this.ae);
            }
        });
    }

    public final void ai() {
        if (p() != null) {
            p().finish();
            p().overridePendingTransition(0, R.anim.marquee_overlay_exit);
        }
    }

    /* access modifiers changed from: private */
    public void ak() {
        Intent a = LearnMoreWebActivity.a((Context) p());
        if (p() != null) {
            p().startActivity(a);
        }
    }

    private void a(MenuTransition menuTransition, AnimatorListener animatorListener) {
        Animator a = ibu.a(this.Z);
        Animator a2 = ibu.a(this.aa);
        Animator a3 = ibu.a(this.aa, 50.0f);
        List emptyList = Collections.emptyList();
        if (menuTransition == MenuTransition.OVERLAY_TO_OPT_OUT) {
            emptyList = Arrays.asList(new Animator[]{a, a2, a3});
        } else if (menuTransition == MenuTransition.SURVEY_TO_OPT_OUT) {
            emptyList = Arrays.asList(new Animator[]{a2, a3});
        }
        a(emptyList, Optional.c(animatorListener));
    }

    /* access modifiers changed from: private */
    public void b(MenuTransition menuTransition, AnimatorListener animatorListener) {
        Animator b = ibu.b(this.Z);
        Animator b2 = ibu.b(this.aa);
        Animator b3 = ibu.b(this.aa, 50.0f);
        List emptyList = Collections.emptyList();
        if (menuTransition == MenuTransition.OPT_OUT_TO_SURVEY) {
            emptyList = Arrays.asList(new Animator[]{b2, b3});
        } else if (menuTransition == MenuTransition.OPT_OUT_BACK) {
            emptyList = Arrays.asList(new Animator[]{b, b2, b3});
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

    private void al() {
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.W.cancel();
        }
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
