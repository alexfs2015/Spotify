package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: kiv reason: default package */
public class kiv extends kif {
    public Picasso U;
    private AnimatorSet V;

    public static long a(b bVar) {
        return (((long) (bVar.a.b().size() - 1)) * 4850) + 4700 + 800;
    }

    private Animator a(int i, View view, long j) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(o(), i);
        loadAnimator.setInterpolator(kfr.a);
        loadAnimator.setTarget(view);
        loadAnimator.setStartDelay(j);
        return loadAnimator;
    }

    /* access modifiers changed from: private */
    public void a(kiy kiy, StackImageView stackImageView) {
        this.U.a(kiy.d()).a(stackImageView.b(0));
        this.U.a(kiy.g()).a(stackImageView.b(1));
    }

    public static kiv b(b bVar) {
        Bundle a = a((kfp) bVar);
        a.putParcelable("decadeTopSongTopArtistData", bVar.a);
        kiv kiv = new kiv();
        kiv.g(a);
        return kiv;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_decade_top_artist_top_song, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        StackImageView stackImageView;
        StackImageView stackImageView2;
        View view2 = view;
        TextView textView = (TextView) ip.d(view2, (int) R.id.decade_top_title);
        final TextView textView2 = (TextView) ip.d(view2, (int) R.id.decade_top_year);
        TextView textView3 = (TextView) ip.d(view2, (int) R.id.decade_top_song_label);
        final TextView textView4 = (TextView) ip.d(view2, (int) R.id.decade_top_song);
        TextView textView5 = (TextView) ip.d(view2, (int) R.id.decade_top_artist_label);
        TextView textView6 = (TextView) ip.d(view2, (int) R.id.decade_top_artist);
        StackImageView stackImageView3 = (StackImageView) ip.d(view2, (int) R.id.decade_top_image_stack_1);
        final StackImageView stackImageView4 = (StackImageView) ip.d(view2, (int) R.id.decade_top_image_stack_2);
        kiu kiu = (kiu) l().getParcelable("decadeTopSongTopArtistData");
        List b = kiu.b();
        textView.setText(StoryParagraphDecorator.a(kiu.a().text(), kiu.a().valuesArray(), o().getResources().getColor(R.color.wrapped_citric)));
        this.V = new AnimatorSet();
        a g = ImmutableList.g();
        final kiy kiy = (kiy) b.get(0);
        textView2.setText(kiy.a());
        textView3.setText(kiy.b());
        textView4.setText(kiy.c());
        textView5.setText(kiy.e());
        textView6.setText(kiy.f());
        a(kiy, stackImageView3);
        a((kiy) b.get(1), stackImageView4);
        for (int i = 0; i < 2; i++) {
            stackImageView3.b(i).setAlpha(0.0f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        TextView textView7 = textView;
        a aVar = g;
        TextView textView8 = textView5;
        TextView textView9 = textView6;
        animatorSet.playTogether(new Animator[]{a((int) R.animator.slide_up_80sp_800, (View) textView2, 0), a((int) R.animator.fade_in_600_animator, (View) textView3, 1100), a((int) R.animator.fade_in_600_animator, (View) textView5, 1100), a((int) R.animator.slide_up_24sp_600, (View) textView4, 1100), a((int) R.animator.slide_up_24sp_600, (View) textView6, 1100), a((int) R.animator.scale_600_fade_200_in_animator, (View) stackImageView3.b(0), 0), a((int) R.animator.scale_600_fade_200_in_animator, (View) stackImageView3.b(1), 200)});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                stackImageView4.setVisibility(0);
            }

            public final void onAnimationStart(Animator animator) {
                kiv.this.b(kiy.h());
            }
        });
        a aVar2 = aVar;
        aVar2.c(animatorSet);
        int i2 = 1;
        while (i2 < b.size()) {
            final kiy kiy2 = (kiy) b.get(i2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setStartDelay(3000);
            if (i2 % 2 == 0) {
                stackImageView2 = stackImageView3;
                stackImageView = stackImageView4;
            } else {
                stackImageView = stackImageView3;
                stackImageView2 = stackImageView4;
            }
            StackImageView stackImageView5 = stackImageView3;
            StackImageView stackImageView6 = stackImageView4;
            a aVar3 = aVar2;
            TextView textView10 = textView9;
            StackImageView stackImageView7 = stackImageView2;
            StackImageView stackImageView8 = stackImageView;
            animatorSet2.playTogether(new Animator[]{a((int) R.animator.fade_out_150_animator, (View) textView2, 0), a((int) R.animator.fade_out_150_animator, (View) textView4, 0), a((int) R.animator.fade_out_150_animator, (View) textView10, 0), a((int) R.animator.scale_600_fade_200_out_animator, (View) stackImageView.b(0), 150), a((int) R.animator.scale_600_fade_200_out_animator, (View) stackImageView.b(1), 350)});
            int i3 = i2 + 1;
            final StackImageView stackImageView9 = stackImageView7;
            final int i4 = i3;
            final TextView textView11 = textView10;
            int i5 = i3;
            a aVar4 = aVar3;
            final List list = b;
            List list2 = b;
            final StackImageView stackImageView10 = stackImageView8;
            AnonymousClass2 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    stackImageView9.bringToFront();
                    if (i4 < list.size()) {
                        stackImageView10.b(0).setScaleX(1.0f);
                        stackImageView10.b(1).setScaleX(1.0f);
                        stackImageView10.b(0).setScaleY(1.0f);
                        stackImageView10.b(1).setScaleY(1.0f);
                        stackImageView10.b(0).setAlpha(1.0f);
                        stackImageView10.b(1).setAlpha(1.0f);
                        kiv.this.a((kiy) list.get(i4), stackImageView10);
                    }
                }
            };
            animatorSet2.addListener(r0);
            Animator a = a((int) R.animator.slide_up_80sp_800, (View) textView2, 150);
            a.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    textView2.setAlpha(1.0f);
                    textView2.setText(kiy2.a());
                    kiv.this.b(kiy2.h());
                }
            });
            Animator a2 = a((int) R.animator.slide_up_24sp_600, (View) textView4, 1250);
            a2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    textView4.setAlpha(1.0f);
                    textView4.setText(kiy2.c());
                }
            });
            Animator a3 = a((int) R.animator.slide_up_24sp_600, (View) textView11, 1250);
            a3.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    textView11.setAlpha(1.0f);
                    textView11.setText(kiy2.f());
                }
            });
            animatorSet2.playTogether(new Animator[]{a, a2, a3});
            aVar4.c(animatorSet2);
            aVar2 = aVar4;
            stackImageView4 = stackImageView6;
            i2 = i5;
            b = list2;
            textView9 = textView11;
            stackImageView3 = stackImageView5;
        }
        a aVar5 = aVar2;
        StackImageView stackImageView11 = stackImageView3;
        StackImageView stackImageView12 = stackImageView4;
        TextView textView12 = textView9;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setStartDelay(3000);
        StackImageView stackImageView13 = (kiu.b().size() - 1) % 2 == 0 ? stackImageView11 : stackImageView12;
        animatorSet3.playTogether(new Animator[]{a((int) R.animator.fade_out_150_animator, (View) textView7, 0), a((int) R.animator.fade_out_150_animator, (View) textView2, 0), a((int) R.animator.fade_out_150_animator, (View) textView4, 0), a((int) R.animator.fade_out_150_animator, (View) textView3, 0), a((int) R.animator.fade_out_150_animator, (View) textView12, 0), a((int) R.animator.fade_out_150_animator, (View) textView8, 0), a((int) R.animator.scale_600_fade_200_out_animator, (View) stackImageView13.b(0), 0), a((int) R.animator.scale_600_fade_200_out_animator, (View) stackImageView13.b(1), 200)});
        aVar5.c(animatorSet3);
        this.V.playSequentially(aVar5.a());
    }

    public final void aP_() {
        super.aP_();
        b((Animator) this.V);
    }
}
