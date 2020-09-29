package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import defpackage.fyv;

/* renamed from: fzc reason: default package */
public final class fzc<T extends fyv> extends fyk<T> {
    final fxw a;
    final vhn b;
    private final Button c;
    private T d;

    public fzc(fym fym, Context context, Fragment fragment, vhn vhn, fyb fyb) {
        this.b = (vhn) fbp.a(vhn);
        this.c = fym.d;
        this.a = fyj.a(fym, fragment, this.b.b(), fym.h, fyb);
        int i = fym.c;
        if (i == 0) {
            LinearLayout d2 = d(context);
            a(d2, fym, context);
            this.b.b(d2);
            this.d = new fyq() {
                public final void a(CharSequence charSequence) {
                    fzc.this.b.a(charSequence);
                    fzc.this.a.a(String.valueOf(charSequence));
                }
            };
        } else if (i == 1) {
            LinearLayout d3 = d(context);
            final TextView a2 = gat.a(context);
            a2.setId(16908308);
            vgl.b(context, a2, R.attr.pasteTextAppearanceMetadata);
            d3.addView(a2, new LayoutParams(-2, -2));
            a(d3, fym, context);
            this.d = new fys() {
                public final TextView a() {
                    return a2;
                }

                public final void a(CharSequence charSequence) {
                    fzc.this.b.a(charSequence);
                    fzc.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a2.setText(charSequence);
                }
            };
            this.b.b(d3);
        } else if (i == 2) {
            LinearLayout d4 = d(context);
            final TextView a3 = gat.a(context);
            a3.setId(R.id.metadata);
            vgl.b(context, a3, R.attr.pasteTextAppearance);
            final TextView a4 = gat.a(context);
            a4.setId(16908308);
            vgl.b(context, a4, R.attr.pasteTextAppearanceMetadata);
            if (fym.p) {
                a4.setPadding(0, vfj.a(10.0f, context.getResources()), 0, vfj.a(10.0f, context.getResources()));
                d4.addView(a3, new LayoutParams(-2, -2));
                d4.addView(a4, new LayoutParams(-2, -2));
            } else {
                d4.addView(a4, new LayoutParams(-2, -2));
                d4.addView(a3, new LayoutParams(-2, -2));
            }
            a(d4, fym, context);
            this.d = new fyu() {
                public final TextView a() {
                    return a4;
                }

                public final void a(CharSequence charSequence) {
                    fzc.this.b.a(charSequence);
                    fzc.this.a.a(String.valueOf(charSequence));
                }

                public final TextView b() {
                    return a3;
                }

                public final void b(CharSequence charSequence) {
                    a4.setText(charSequence);
                }

                public final void c(CharSequence charSequence) {
                    a3.setText(charSequence);
                }
            };
            this.b.b(d4);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        if (fym.g != null) {
            this.b.a((sf) new fyx(fym.g));
        }
    }

    private void a(ViewGroup viewGroup, fym fym, Context context) {
        if (this.c != null) {
            int i = 0;
            boolean z = fym.e == 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = vfj.a((float) fym.f, context.getResources());
            if (z) {
                layoutParams.bottomMargin = a2;
            } else {
                layoutParams.topMargin = a2;
            }
            Button button = this.c;
            if (!z) {
                i = viewGroup.getChildCount();
            }
            viewGroup.addView(button, i, layoutParams);
        }
    }

    private static LinearLayout d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    public final T a() {
        return this.d;
    }

    public final void a(int i) {
        this.a.a(0);
    }

    public final void a(View view) {
        this.b.a(view);
    }

    public final void a(e eVar) {
    }

    public final void a(fzn fzn, Context context) {
    }

    public final void a(boolean z) {
        this.a.b(z);
    }

    public final View b() {
        return this.a.d();
    }

    public final void b(int i) {
        this.a.b().a(i);
    }

    public final void b(View view) {
        this.a.a(view);
    }

    public final void b(boolean z) {
        this.a.c(z);
    }

    public final ImageView c() {
        return this.b.a();
    }

    public final ImageView d() {
        return this.a.b().c();
    }

    public final StickyListView e() {
        return this.a.a();
    }

    public final void h() {
    }
}
