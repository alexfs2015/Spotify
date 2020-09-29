package com.spotify.music.libs.search.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ToolbarSearchFieldView extends FrameLayout {
    public static final c l = new c() {
        public final void a() {
        }
    };
    private static final d v = new d() {
        public final void a() {
        }

        public final void b() {
        }
    };
    private static final b w = new b() {
        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
        }
    };
    public final BackKeyEditText a;
    public final ImageButton b;
    public final ImageButton c;
    public final Button d;
    public DrawableState e;
    public TransitionDrawable f;
    public final SpotifyIconDrawable g;
    public final SpotifyIconDrawable h;
    public c i;
    public a j;
    public boolean k;
    private final shq m;
    /* access modifiers changed from: private */
    public int n;
    /* access modifiers changed from: private */
    public int o;
    /* access modifiers changed from: private */
    public int p;
    /* access modifiers changed from: private */
    public final View q;
    private final View r;
    private final SpotifyIconDrawable s;
    /* access modifiers changed from: private */
    public d t;
    /* access modifiers changed from: private */
    public b u;

    public enum DrawableState {
        CLEAR,
        SCANNABLES
    }

    public class a {
        public boolean a;
        private final Animator c;
        private final Animator d;
        private final Animator e;
        private final Animator f;

        a(shq shq, final View view, final View view2) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(shq, shq.a, new int[]{255});
            ofInt.setDuration(200);
            this.e = ofInt;
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(shq, shq.a, new int[]{0});
            ofInt2.setDuration(200);
            this.f = ofInt2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
            String str = "scaleX";
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.b, str, new float[]{1.0f});
            String str2 = "scaleY";
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.b, str2, new float[]{1.0f});
            ofFloat.setDuration(200);
            ofFloat2.setDuration(200);
            ofFloat3.setDuration(200);
            ofFloat4.setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat3).with(ofFloat4).before(ofFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    if (ToolbarSearchFieldView.this.n == 0) {
                        ToolbarSearchFieldView.this.n = ToolbarSearchFieldView.this.q.getWidth() - ToolbarSearchFieldView.this.p;
                        ToolbarSearchFieldView.this.o = ((int) ToolbarSearchFieldView.this.b.getX()) - ToolbarSearchFieldView.this.p;
                    }
                    view.setVisibility(0);
                    if (ToolbarSearchFieldView.this.k) {
                        String str = "x";
                        if (uur.a(ToolbarSearchFieldView.this.q)) {
                            a aVar = a.this;
                            float i = (float) ToolbarSearchFieldView.this.p;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.b, str, new float[]{i});
                            ofFloat.setDuration(200);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(ofFloat);
                            animatorSet.start();
                            return;
                        }
                        a aVar2 = a.this;
                        float k = (float) ToolbarSearchFieldView.this.o;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.b, str, new float[]{k});
                        ofFloat2.setDuration(200);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(ofFloat2);
                        animatorSet2.start();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    ToolbarSearchFieldView.this.q.setClickable(true);
                    ToolbarSearchFieldView.this.d.setClickable(true);
                    if (ToolbarSearchFieldView.this.k) {
                        LayoutParams layoutParams = (LayoutParams) ToolbarSearchFieldView.this.b.getLayoutParams();
                        layoutParams.rightMargin = ToolbarSearchFieldView.this.p;
                        ia.b(layoutParams, ToolbarSearchFieldView.this.p);
                        ToolbarSearchFieldView.this.b.setLayoutParams(layoutParams);
                        ToolbarSearchFieldView.this.b.setTranslationX(0.0f);
                    }
                    view2.setVisibility(4);
                    ((Editable) fay.a(ToolbarSearchFieldView.this.a.getText())).clear();
                }
            });
            this.c = animatorSet;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.b, str, new float[]{1.2f});
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.b, str2, new float[]{1.2f});
            ofFloat5.setDuration(200);
            ofFloat6.setDuration(200);
            ofFloat7.setDuration(200);
            ofFloat8.setDuration(200);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat5).with(ofFloat7).with(ofFloat8).before(ofFloat6);
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    if (ToolbarSearchFieldView.this.getWidth() != 0 && ToolbarSearchFieldView.this.n == 0) {
                        ToolbarSearchFieldView.this.n = ToolbarSearchFieldView.this.q.getWidth();
                        ToolbarSearchFieldView.this.o = (int) ToolbarSearchFieldView.this.b.getX();
                    }
                    ToolbarSearchFieldView.this.q.setClickable(false);
                    ToolbarSearchFieldView.this.d.setClickable(false);
                    view2.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(4);
                }
            });
            this.d = animatorSet2;
        }

        public final void a() {
            if (ToolbarSearchFieldView.this.d.getVisibility() == 0) {
                ((Editable) fay.a(ToolbarSearchFieldView.this.a.getText())).clear();
                return;
            }
            a(this.f, this.c);
        }

        public final void b() {
            a(this.e, this.d);
        }

        public final void c() {
            a(this.e);
        }

        public final void d() {
            a(this.f);
        }

        private void a(Animator... animatorArr) {
            Animator[] animatorArr2 = new Animator[animatorArr.length];
            for (int i = 0; i < animatorArr.length; i++) {
                animatorArr2[i] = animatorArr[i].clone();
                if (this.a) {
                    animatorArr2[i].setDuration(0);
                }
            }
            if (animatorArr2.length == 1) {
                animatorArr2[0].start();
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr2);
            animatorSet.start();
        }
    }

    public interface b {
        void a();

        void b();

        void c();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();

        void b();
    }

    public ToolbarSearchFieldView(Context context) {
        this(context, null, 0);
    }

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = DrawableState.SCANNABLES;
        this.t = v;
        this.i = l;
        this.u = w;
        LayoutInflater.from(context).inflate(R.layout.search_toolbar, this, true);
        this.q = ip.c((View) this, (int) R.id.search_background);
        this.a = (BackKeyEditText) ip.c((View) this, (int) R.id.query);
        this.b = (ImageButton) ip.c((View) this, (int) R.id.search_right_button);
        this.d = (Button) ip.c((View) this, (int) R.id.search_placeholder);
        this.r = ip.c((View) this, (int) R.id.search_field);
        this.g = new SpotifyIconDrawable(context, SpotifyIconV2.CAMERA, (float) context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        this.g.a(fr.c(context, R.color.white));
        this.h = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        this.h.a(fr.c(context, R.color.white));
        this.c = (ImageButton) ip.c((View) this, (int) R.id.cancel_button);
        uui.c(this.c).b(this.c).a();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        this.c.setImageDrawable(spotifyIconDrawable);
        this.m = a(context, attributeSet);
        ip.a(this.q, (Drawable) this.m);
        uui.c(this.d).a(this.d).a();
        this.s = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, (float) context.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        this.s.a(fr.c(context, R.color.white));
        this.p = ((LayoutParams) this.b.getLayoutParams()).rightMargin;
        this.f = null;
        this.e = DrawableState.CLEAR;
        this.b.setImageDrawable(this.h);
        this.b.setVisibility(8);
        jm.b(this.d, this.s, null, null, null);
        this.j = new a(this.m, this.d, this.r);
        this.b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (ToolbarSearchFieldView.this.e == DrawableState.CLEAR) {
                    ToolbarSearchFieldView.this.t.a();
                } else {
                    ToolbarSearchFieldView.this.t.b();
                }
            }
        });
        this.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ToolbarSearchFieldView.this.u.a();
            }
        });
        this.a.a = new com.spotify.music.libs.search.view.BackKeyEditText.a() {
            public final boolean a() {
                ToolbarSearchFieldView.this.u.b();
                return true;
            }
        };
        AnonymousClass4 r7 = new OnClickListener() {
            public final void onClick(View view) {
                ToolbarSearchFieldView.this.u.c();
            }
        };
        this.q.setOnClickListener(r7);
        this.d.setOnClickListener(r7);
    }

    public final void a(d dVar) {
        this.t = (d) fav.a(dVar, v);
    }

    public final void a(b bVar) {
        this.u = (b) fav.a(bVar, w);
    }

    public final boolean a() {
        return this.f != null;
    }

    public final void a(boolean z) {
        this.b.setVisibility(z ? 0 : 4);
    }

    private static shq a(Context context, AttributeSet attributeSet) {
        int b2 = uts.b(8.0f, context.getResources());
        int b3 = uts.b(4.0f, context.getResources());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.shp.a.a, 0, 0);
        try {
            int color = obtainStyledAttributes.getColor(defpackage.shp.a.c, fr.c(context, R.color.cat_grayscale_55_40));
            return new shq(obtainStyledAttributes.getDimensionPixelSize(defpackage.shp.a.d, b2), obtainStyledAttributes.getDimensionPixelSize(defpackage.shp.a.e, b2), obtainStyledAttributes.getDimensionPixelOffset(defpackage.shp.a.b, b3), color);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
