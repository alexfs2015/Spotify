package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Arrays;
import java.util.List;

/* renamed from: icy reason: default package */
public class icy extends wia implements jqx, uqq {
    public icz T;
    public icw U;
    public ide V;
    private AnimatorSet W;
    private LinearLayout X;
    /* access modifiers changed from: private */
    public String Y;
    /* access modifiers changed from: private */
    public String Z;
    /* access modifiers changed from: private */
    public boolean ab;

    public icy() {
        String str = "";
        this.Y = str;
        this.Z = str;
    }

    /* access modifiers changed from: private */
    public void a(List<Animator> list, Optional<AnimatorListener> optional) {
        ah();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setDuration(200);
        if (optional.b()) {
            animatorSet.addListener((AnimatorListener) optional.c());
        }
        animatorSet.start();
        this.W = animatorSet;
    }

    public static void a(kk kkVar, Fragment fragment, int i, String str, String str2) {
        icy icy = new icy();
        Bundle bundle = new Bundle();
        bundle.putString("artist_uri", str);
        bundle.putString("lineitem_id", str2);
        icy.g(bundle);
        icy.a(fragment, 0);
        icy.a(kkVar, "marquee_feedback_menu");
    }

    private void ah() {
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.W.cancel();
        }
    }

    public final void A() {
        super.A();
        ah();
    }

    public final Dialog a(Bundle bundle) {
        if (this.i != null) {
            String str = "";
            this.Y = this.i.getString("artist_uri", str);
            this.Z = this.i.getString("lineitem_id", str);
        }
        if (bundle != null) {
            this.ab = bundle.getBoolean("feedback_animation_enter_completed", false);
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(p()).inflate(R.layout.marquee_feedback_menu, null);
        this.X = (LinearLayout) frameLayout.findViewById(R.id.feedback_menu_content);
        AnonymousClass1 r0 = new Dialog(p(), 16973840) {
            public final void onBackPressed() {
                icy.this.a(Arrays.asList(new Animator[]{ieg.b(icy.this.X), ieg.b(icy.this.X, 20.0f)}), Optional.c(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (icy.this.m() != null) {
                            icy.this.m().a(icy.this.l, 1, (Intent) null);
                        }
                        icy.this.V.a("optout_cancel", "", icy.this.Y, icy.this.Z);
                        AnonymousClass1.this.dismiss();
                    }
                }));
            }
        };
        r0.setContentView(frameLayout);
        RecyclerView recyclerView = (RecyclerView) r0.findViewById(R.id.feedback_menu_options);
        icw icw = this.U;
        icv icv = new icv((ide) icw.a(icw.a.get(), 1), (jvf) icw.a(icw.b.get(), 2), (String) icw.a(this.Y, 3), (String) icw.a(this.Z, 4), (kf) icw.a(p(), 5));
        icx icx = new icx(this.T.a(), LayoutInflater.from(p()), icv);
        recyclerView.a((i) new LinearLayoutManager(p()));
        recyclerView.a((a) icx);
        return r0;
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

    public final String e() {
        return ViewUris.aT.toString();
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("feedback_animation_enter_completed", this.ab);
        super.e(bundle);
    }

    public final void z() {
        super.z();
        if (!this.ab) {
            AnonymousClass2 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    icy.this.ab = true;
                }
            };
            a(Arrays.asList(new Animator[]{ieg.a(this.X), ieg.a(this.X, 20.0f)}), Optional.c(r0));
        }
    }
}
