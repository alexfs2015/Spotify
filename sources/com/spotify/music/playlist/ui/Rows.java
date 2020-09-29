package com.spotify.music.playlist.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.TransitionSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

public final class Rows {

    public static class RoundedLinearLayout extends LinearLayout {
        public int a;
        public int b;
        public int c;
        public int d;
        public final float[] e = new float[8];
        private final RectF f = new RectF();
        private final Path g = new Path();

        public RoundedLinearLayout(Context context) {
            super(context, null);
        }

        public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int save = canvas.save();
            if (!this.g.isEmpty()) {
                try {
                    canvas.clipPath(this.g);
                } catch (UnsupportedOperationException e2) {
                    Logger.b(e2, "Failed clipping, moving on.", new Object[0]);
                }
            }
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.g.reset();
            this.f.set((float) this.a, (float) this.b, (float) ((i3 - i) - this.c), (float) ((i4 - i2) - this.d));
            this.g.addRoundRect(this.f, this.e, Direction.CW);
        }
    }

    public interface a extends fqy {
        void a(List<View> list);
    }

    public interface b extends fry {
    }

    public interface c extends fsc {
    }

    public interface d extends fsc {
    }

    public interface e extends h, fsc {
    }

    public interface f extends fsc {
        void a(OnClickListener onClickListener);

        void a(String str);

        void b(String str);

        void c(String str);

        TextView e();

        void f();

        void g();

        void h();

        void i();
    }

    public interface g extends a, f {
    }

    public interface h extends a, fsb {
    }

    public static e a(Context context, ViewGroup viewGroup) {
        fqv.b();
        final fsc b2 = fsk.b(context, viewGroup, false);
        final tvx tvx = new tvx((ViewGroup) b2.getView().findViewById(R.id.accessory));
        AnonymousClass6 r2 = new e() {
            public final View a() {
                return tvx.b();
            }

            public final void a(View view) {
                tvx.a(view);
            }

            public final void a(CharSequence charSequence) {
                b2.a(charSequence);
            }

            public final void a(List<View> list) {
                tvx.a(list);
                tvx.a();
            }

            public final void a(boolean z) {
                b2.a(z);
            }

            public final TextView b() {
                return b2.b();
            }

            public final void b(CharSequence charSequence) {
                b2.b(charSequence);
            }

            public final void b(boolean z) {
                tvx.a(z);
            }

            public final ImageView c() {
                return b2.c();
            }

            public final void c(CharSequence charSequence) {
                b2.c(charSequence);
            }

            public final void c(boolean z) {
                b2.c(z);
            }

            public final TextView d() {
                return b2.d();
            }

            public final View getView() {
                return b2.getView();
            }
        };
        fqz.a(r2);
        return r2;
    }

    public static void a(View view, int i) {
        int i2;
        while (i > 0 && view != null) {
            int paddingLeft = view.getPaddingLeft();
            if (paddingLeft > 0) {
                int i3 = 0;
                if (paddingLeft > i) {
                    i2 = paddingLeft - i;
                } else {
                    i3 = i - paddingLeft;
                    i2 = 0;
                }
                view.setPadding(i2, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                i = i3;
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
    }

    private static void a(TextView textView) {
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = vfj.b(6.0f, textView.getResources());
        textView.setLayoutParams(marginLayoutParams);
        vgl.a(textView.getContext(), textView, 2132017677);
        textView.setTextColor(fr.c(textView.getContext(), R.color.gray_70));
        textView.setMaxLines(1);
        textView.setEllipsize(TruncateAt.END);
        textView.setVisibility(8);
    }

    public static g b(Context context, ViewGroup viewGroup) {
        final f c2 = c(context, viewGroup);
        final tvx tvx = new tvx((ViewGroup) c2.getView().findViewById(R.id.accessory));
        AnonymousClass8 r2 = new g() {
            public final View a() {
                return tvx.b();
            }

            public final void a(OnClickListener onClickListener) {
                c2.a(onClickListener);
            }

            public final void a(View view) {
                tvx.a(view);
            }

            public final void a(CharSequence charSequence) {
                c2.a(charSequence);
            }

            public final void a(String str) {
                c2.a(str);
            }

            public final void a(List<View> list) {
                tvx.a(list);
                tvx.a();
            }

            public final void a(boolean z) {
                c2.a(z);
            }

            public final TextView b() {
                return c2.b();
            }

            public final void b(CharSequence charSequence) {
                c2.b(charSequence);
            }

            public final void b(String str) {
                c2.b(str);
            }

            public final void b(boolean z) {
                tvx.a(z);
            }

            public final ImageView c() {
                return c2.c();
            }

            public final void c(CharSequence charSequence) {
                c2.c(charSequence);
            }

            public final void c(String str) {
                c2.c(str);
            }

            public final void c(boolean z) {
                c2.c(z);
            }

            public final TextView d() {
                return c2.d();
            }

            public final TextView e() {
                return c2.e();
            }

            public final void f() {
                c2.f();
            }

            public final void g() {
                c2.g();
            }

            public final View getView() {
                return c2.getView();
            }

            public final void h() {
                c2.h();
            }

            public final void i() {
                c2.i();
            }
        };
        fqz.a(r2);
        return r2;
    }

    private static f c(Context context, ViewGroup viewGroup) {
        Context context2 = context;
        Resources resources = context.getResources();
        fqv.b();
        final fsc b2 = fsk.b(context2, viewGroup, false);
        int b3 = vfj.b(86.0f, resources);
        int b4 = vfj.b(64.0f, resources);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setId(R.id.row_preview_rounded_layout);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        linearLayout.setMinimumHeight(b3);
        linearLayout.setBackgroundResource(R.drawable.bg_large_row_rounded2);
        ImageView c2 = b2.c();
        ViewGroup.LayoutParams layoutParams = b2.c().getLayoutParams();
        layoutParams.height = b4;
        layoutParams.width = b4;
        c2.setLayoutParams(layoutParams);
        c2.setMinimumHeight(b4);
        c2.setMinimumWidth(b4);
        a((View) c2, vfj.b(4.0f, resources));
        vgl.a(context2, b2.b(), 2132017669);
        linearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        final ViewGroup viewGroup2 = (ViewGroup) b2.getView().findViewById(R.id.labels);
        TextView textView = new TextView(context2);
        textView.setLayoutParams(b2.d().getLayoutParams());
        vgl.a(context2, textView, 2132017677);
        textView.setTextColor(fr.c(context2, R.color.gray_70));
        textView.setVisibility(8);
        viewGroup2.addView(textView);
        TextView textView2 = new TextView(context2);
        TextView textView3 = new TextView(context2);
        a(textView2);
        a(textView3);
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.addView(textView2);
        frameLayout.addView(textView3);
        viewGroup2.addView(frameLayout);
        vfz.b(b2.getView().findViewById(R.id.row_view)).a(b2.b(), b2.d(), textView2, textView, textView3).b(c2).a();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        relativeLayout.setGravity(80);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        int b5 = vfj.b(16.0f, resources);
        int b6 = vfj.b(8.0f, resources);
        ia.a(layoutParams2, b5);
        ia.b(layoutParams2, b5);
        layoutParams2.topMargin = b6;
        layoutParams2.bottomMargin = b6;
        relativeLayout.setLayoutParams(layoutParams2);
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout2.setPadding(vfj.b(12.0f, resources), vfj.b(8.0f, resources), vfj.b(16.0f, resources), vfj.b(8.0f, resources));
        relativeLayout2.setLayoutParams(layoutParams3);
        TextView textView4 = new TextView(context2);
        vgl.a(context2, textView4, 2132017677);
        textView4.setTextColor(fr.c(context2, R.color.gray_70));
        ImageView imageView = new ImageView(context2);
        imageView.setId(R.id.row_preview_footer_icon_view);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context2, SpotifyIconV2.HELPCIRCLE, (float) vfj.b(24.0f, resources));
        spotifyIconDrawable.a(fr.c(context2, R.color.gray_70));
        imageView.setImageDrawable(spotifyIconDrawable);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(0, imageView.getId());
        layoutParams4.addRule(15);
        relativeLayout2.addView(textView4, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        relativeLayout2.addView(imageView, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, linearLayout.getId());
        relativeLayout.addView(relativeLayout2, layoutParams6);
        relativeLayout.addView(linearLayout);
        final TextView textView5 = textView2;
        final TextView textView6 = textView;
        final TextView textView7 = textView3;
        final FrameLayout frameLayout2 = frameLayout;
        TextView textView8 = textView4;
        final RelativeLayout relativeLayout3 = relativeLayout2;
        final RelativeLayout relativeLayout4 = relativeLayout;
        final TextView textView9 = textView8;
        AnonymousClass4 r3 = new f() {
            public final View a() {
                return b2.a();
            }

            public final void a(OnClickListener onClickListener) {
                relativeLayout3.setOnClickListener(onClickListener);
            }

            public final void a(View view) {
                b2.a(view);
            }

            public final void a(CharSequence charSequence) {
                b2.a(charSequence);
            }

            public final void a(String str) {
                textView6.setText(str);
            }

            public final void a(boolean z) {
                b2.a(z);
            }

            public final TextView b() {
                return b2.b();
            }

            public final void b(CharSequence charSequence) {
                b2.b(charSequence);
            }

            public final void b(String str) {
                textView7.setText(str);
            }

            public final void b(boolean z) {
                b2.b(z);
            }

            public final ImageView c() {
                return b2.c();
            }

            public final void c(CharSequence charSequence) {
                b2.c(charSequence);
            }

            public final void c(String str) {
                textView9.setText(str);
            }

            public final void c(boolean z) {
                b2.c(z);
            }

            public final TextView d() {
                return b2.d();
            }

            public final TextView e() {
                return textView5;
            }

            public final void f() {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.b(1);
                transitionSet.a(200);
                transitionSet.a(new Fade(2).c((View) textView6).a(100));
                transitionSet.a(new Fade(1).c((View) b2.d()).a(100));
                qw.a(viewGroup2, transitionSet);
                b2.d().setVisibility(0);
                textView6.setVisibility(8);
                TransitionSet transitionSet2 = new TransitionSet();
                transitionSet2.b(1);
                transitionSet2.a(200);
                transitionSet2.a(new Fade(2).c((View) textView7).a(100));
                transitionSet2.a(new Fade(1).c((View) textView5).a(100));
                qw.a(frameLayout2, transitionSet2);
                textView5.setVisibility(0);
                textView7.setVisibility(8);
            }

            public final void g() {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.b(1);
                transitionSet.a(200);
                transitionSet.a(new Fade(2).c((View) b2.d()).a(100));
                transitionSet.a(new Fade(1).c((View) textView6).a(100));
                qw.a(viewGroup2, transitionSet);
                b2.d().setVisibility(8);
                textView6.setVisibility(0);
                TransitionSet transitionSet2 = new TransitionSet();
                transitionSet2.b(1);
                transitionSet2.a(200);
                transitionSet2.a(new Fade(2).c((View) textView5).a(100));
                transitionSet2.a(new Fade(1).c((View) textView7).a(100));
                qw.a(frameLayout2, transitionSet2);
                textView5.setVisibility(8);
                textView7.setVisibility(0);
            }

            public final View getView() {
                return relativeLayout4;
            }

            public final void h() {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.a(400);
                transitionSet.a(new Slide(48).c((View) relativeLayout3));
                transitionSet.a(new Fade(1).c((View) relativeLayout3));
                qw.a(relativeLayout4, transitionSet);
                relativeLayout3.setVisibility(0);
            }

            public final void i() {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.a(400);
                transitionSet.a(new Slide(48).c((View) relativeLayout3));
                transitionSet.a(new Fade(2).c((View) relativeLayout3));
                qw.a(relativeLayout4, transitionSet);
                relativeLayout3.setVisibility(8);
            }
        };
        fqz.a(r3);
        return r3;
    }
}
