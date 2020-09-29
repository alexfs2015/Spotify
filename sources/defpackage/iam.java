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

/* renamed from: iam reason: default package */
public class iam extends vtu implements jol, udv {
    public ian T;
    public iak U;
    public ias V;
    private AnimatorSet W;
    private LinearLayout X;
    /* access modifiers changed from: private */
    public String Z;
    /* access modifiers changed from: private */
    public String aa;
    /* access modifiers changed from: private */
    public boolean ab;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public iam() {
        String str = "";
        this.Z = str;
        this.aa = str;
    }

    public final void z() {
        super.z();
        if (!this.ab) {
            AnonymousClass2 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    iam.this.ab = true;
                }
            };
            a(Arrays.asList(new Animator[]{ibu.a(this.X), ibu.a(this.X, 20.0f)}), Optional.c(r0));
        }
    }

    public final void A() {
        super.A();
        ah();
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("feedback_animation_enter_completed", this.ab);
        super.e(bundle);
    }

    public static void a(kf kfVar, Fragment fragment, int i, String str, String str2) {
        iam iam = new iam();
        Bundle bundle = new Bundle();
        bundle.putString("artist_uri", str);
        bundle.putString("lineitem_id", str2);
        iam.g(bundle);
        iam.a(fragment, 0);
        iam.a(kfVar, "marquee_feedback_menu");
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

    private void ah() {
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

    public final Dialog a(Bundle bundle) {
        if (this.i != null) {
            String str = "";
            this.Z = this.i.getString("artist_uri", str);
            this.aa = this.i.getString("lineitem_id", str);
        }
        if (bundle != null) {
            this.ab = bundle.getBoolean("feedback_animation_enter_completed", false);
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(p()).inflate(R.layout.marquee_feedback_menu, null);
        this.X = (LinearLayout) frameLayout.findViewById(R.id.feedback_menu_content);
        AnonymousClass1 r0 = new Dialog(p(), 16973840) {
            public final void onBackPressed() {
                iam.this.a(Arrays.asList(new Animator[]{ibu.b(iam.this.X), ibu.b(iam.this.X, 20.0f)}), Optional.c(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (iam.this.m() != null) {
                            iam.this.m().a(iam.this.l, 1, (Intent) null);
                        }
                        iam.this.V.a("optout_cancel", "", iam.this.Z, iam.this.aa);
                        AnonymousClass1.this.dismiss();
                    }
                }));
            }
        };
        r0.setContentView(frameLayout);
        RecyclerView recyclerView = (RecyclerView) r0.findViewById(R.id.feedback_menu_options);
        iak iak = this.U;
        iaj iaj = new iaj((ias) iak.a(iak.a.get(), 1), (jsz) iak.a(iak.b.get(), 2), (String) iak.a(this.Z, 3), (String) iak.a(this.aa, 4), (ka) iak.a(p(), 5));
        ial ial = new ial(this.T.a(), LayoutInflater.from(p()), iaj);
        recyclerView.a((i) new LinearLayoutManager(p()));
        recyclerView.a((a) ial);
        return r0;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ADS, null);
    }
}
