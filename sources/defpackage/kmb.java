package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.wrapped2019.stories.views.IsometricImageStack;
import com.spotify.music.R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kmb reason: default package */
public class kmb extends kif {
    public kgr U;
    private TextView V;
    private IsometricImageStack X;
    private TextView Y;
    private TextView Z;
    private CompositeDisposable aa = new CompositeDisposable();
    private List<kmg> ab = Collections.emptyList();

    public static kmb a(o oVar) {
        kmb kmb = new kmb();
        Bundle a = a((kfp) oVar);
        a.putString("title", oVar.a);
        a.putParcelableArrayList("tracks", new ArrayList(oVar.b));
        kmb.g(a);
        return kmb;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Float f) {
        float abs = Math.abs(f.floatValue());
        this.Y.setAlpha(abs);
        this.Z.setAlpha(abs);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.X.a(list);
        AnimatorSet animatorSet = new AnimatorSet();
        IsometricImageStack isometricImageStack = this.X;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(kmi.b(isometricImageStack, 10));
        animatorSet2.addListener(new AnimatorListenerAdapter(10, isometricImageStack) {
            private /* synthetic */ int a;
            private /* synthetic */ IsometricImageStack b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final void onAnimationStart(Animator animator) {
                for (int i = 0; i < this.a; i++) {
                    this.b.a(i, 0.0f);
                }
            }
        });
        animatorSet.playTogether(new Animator[]{animatorSet2, ObjectAnimator.ofFloat(this.V, "alpha", new float[]{1.0f, 0.0f}).setDuration(300)});
        animatorSet.setStartDelay(600);
        AnimatorSet animatorSet3 = new AnimatorSet();
        IsometricImageStack isometricImageStack2 = this.X;
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(kmi.a(isometricImageStack2, 10));
        animatorSet4.addListener(new AnimatorListenerAdapter(10, isometricImageStack2) {
            private /* synthetic */ int a;
            private /* synthetic */ IsometricImageStack b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final void onAnimationStart(Animator animator) {
                for (int i = 0; i < this.a; i++) {
                    this.b.a(i, 1.0f);
                }
            }
        });
        animatorSet3.playSequentially(new Animator[]{animatorSet4, d(7), d(6), d(5), d(4), d(3), animatorSet});
        b((Animator) animatorSet3);
    }

    private Animator d(int i) {
        return kmi.a(this.X, i, (Runnable) new $$Lambda$kmb$udgXKybqjQf7P_OK29H_c_WpYtw(this, i), (gcp<Float>) new $$Lambda$kmb$IXATeaiwAxfhgRB1TCHmXQIu_DA<Float>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i) {
        kmg kmg = (kmg) this.ab.get(i);
        this.Y.setText(kmg.c());
        this.Z.setText(kmg.d());
        b(kmg.a());
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_songs_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.V = (TextView) ip.d(view, (int) R.id.title);
        this.X = (IsometricImageStack) ip.d(view, (int) R.id.image_stack);
        this.Y = (TextView) ip.d(view, (int) R.id.track);
        this.Z = (TextView) ip.d(view, (int) R.id.artist);
        Bundle l = l();
        this.V.setText(l.getString("title"));
        this.ab = (List) fbp.a(l.getParcelableArrayList("tracks"));
    }

    public final void aP_() {
        super.aP_();
        this.aa = new CompositeDisposable();
        this.aa.a(this.U.a("TopSongsStory", Lists.a(this.ab, $$Lambda$DAIXfVEmrxRZcKK1jFwZfaAsoQ.INSTANCE)).a((Consumer<? super T>) new $$Lambda$kmb$Ezf6KCYp9t6Wtp4ANbVNCg82QiA<Object>(this), (Consumer<? super Throwable>) $$Lambda$kmb$4iAikhedYm3JR_UoFw3WVLlYAl8.INSTANCE));
    }

    public final void h() {
        this.aa.bd_();
        super.h();
    }
}
