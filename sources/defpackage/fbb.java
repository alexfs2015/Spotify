package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.legacy.widget.Space;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fbb reason: default package */
public final class fbb {
    Animator a;
    public int b;
    public int c;
    public CharSequence d;
    public boolean e;
    public TextView f;
    public CharSequence g;
    public boolean h;
    public TextView i;
    private final Context j;
    private final TextInputLayout k;
    private LinearLayout l;
    private int m;
    private FrameLayout n;
    private int o;
    private final float p = ((float) this.j.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y));
    private int q;
    private int r;

    public fbb(TextInputLayout textInputLayout) {
        this.j = textInputLayout.getContext();
        this.k = textInputLayout;
    }

    private ObjectAnimator a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.p, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(eyu.d);
        return ofFloat;
    }

    private static ObjectAnimator a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(eyu.a);
        return ofFloat;
    }

    private void a(int i2, int i3) {
        if (i2 != i3) {
            if (i3 != 0) {
                TextView d2 = d(i3);
                if (d2 != null) {
                    d2.setVisibility(0);
                    d2.setAlpha(1.0f);
                }
            }
            if (i2 != 0) {
                TextView d3 = d(i2);
                if (d3 != null) {
                    d3.setVisibility(4);
                    if (i2 == 1) {
                        d3.setText(null);
                    }
                }
            }
            this.b = i3;
        }
    }

    private static void a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void a(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(a(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(a(textView));
                }
            }
        }
    }

    private static boolean c(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private TextView d(int i2) {
        if (i2 == 1) {
            return this.f;
        }
        if (i2 != 2) {
            return null;
        }
        return this.i;
    }

    public final void a() {
        this.d = null;
        b();
        if (this.b == 1) {
            if (!this.h || TextUtils.isEmpty(this.g)) {
                this.c = 0;
            } else {
                this.c = 2;
            }
        }
        a(this.b, this.c, a(this.f, (CharSequence) null));
    }

    public final void a(int i2) {
        this.q = i2;
        TextView textView = this.f;
        if (textView != null) {
            this.k.a(textView, i2);
        }
    }

    public void a(int i2, int i3, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.a = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            int i5 = i3;
            a(arrayList2, this.h, this.i, 2, i4, i5);
            a(arrayList2, this.e, this.f, 1, i4, i5);
            eyv.a(animatorSet, arrayList);
            final TextView d2 = d(i2);
            final TextView d3 = d(i3);
            final int i6 = i3;
            final int i7 = i2;
            AnonymousClass1 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    fbb fbb = fbb.this;
                    fbb.b = i6;
                    fbb.a = null;
                    TextView textView = d2;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i7 == 1 && fbb.this.f != null) {
                            fbb.this.f.setText(null);
                        }
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    TextView textView = d3;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                }
            };
            animatorSet.addListener(r0);
            animatorSet.start();
        } else {
            a(i2, i3);
        }
        this.k.b();
        this.k.a(z, false);
        this.k.d();
    }

    public final void a(TextView textView, int i2) {
        if (this.l == null && this.n == null) {
            this.l = new LinearLayout(this.j);
            this.l.setOrientation(0);
            this.k.addView(this.l, -1, -2);
            this.n = new FrameLayout(this.j);
            this.l.addView(this.n, -1, new LayoutParams(-2, -2));
            this.l.addView(new Space(this.j), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.k.a != null) {
                c();
            }
        }
        if (c(i2)) {
            this.n.setVisibility(0);
            this.n.addView(textView);
            this.o++;
        } else {
            this.l.addView(textView, i2);
        }
        this.l.setVisibility(0);
        this.m++;
    }

    public final void a(boolean z) {
        if (this.e != z) {
            b();
            if (z) {
                this.f = new AppCompatTextView(this.j);
                this.f.setId(R.id.textinput_error);
                a(this.q);
                this.f.setVisibility(4);
                ip.e((View) this.f, 1);
                a(this.f, 0);
            } else {
                a();
                b(this.f, 0);
                this.f = null;
                this.k.b();
                this.k.d();
            }
            this.e = z;
        }
    }

    public boolean a(TextView textView, CharSequence charSequence) {
        return ip.B(this.k) && this.k.isEnabled() && (this.c != this.b || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void b() {
        Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void b(int i2) {
        this.r = i2;
        TextView textView = this.i;
        if (textView != null) {
            jm.a(textView, i2);
        }
    }

    public final void b(TextView textView, int i2) {
        if (this.l != null) {
            if (c(i2)) {
                FrameLayout frameLayout = this.n;
                if (frameLayout != null) {
                    this.o--;
                    a((ViewGroup) frameLayout, this.o);
                    this.n.removeView(textView);
                    this.m--;
                    a((ViewGroup) this.l, this.m);
                }
            }
            this.l.removeView(textView);
            this.m--;
            a((ViewGroup) this.l, this.m);
        }
    }

    public final void b(boolean z) {
        if (this.h != z) {
            b();
            if (z) {
                this.i = new AppCompatTextView(this.j);
                this.i.setId(R.id.textinput_helper_text);
                this.i.setVisibility(4);
                ip.e((View) this.i, 1);
                b(this.r);
                a(this.i, 1);
            } else {
                b();
                if (this.b == 2) {
                    this.c = 0;
                }
                a(this.b, this.c, a(this.i, (CharSequence) null));
                b(this.i, 1);
                this.i = null;
                this.k.b();
                this.k.d();
            }
            this.h = z;
        }
    }

    public final void c() {
        if ((this.l == null || this.k.a == null) ? false : true) {
            ip.b(this.l, ip.i(this.k.a), 0, ip.j(this.k.a), 0);
        }
    }

    public final boolean d() {
        return this.c == 1 && this.f != null && !TextUtils.isEmpty(this.d);
    }

    public final int e() {
        TextView textView = this.f;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final ColorStateList f() {
        TextView textView = this.f;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }
}
