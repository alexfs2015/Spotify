package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import com.spotify.paste.widgets.HeaderView;
import defpackage.fyv;

/* renamed from: fzd reason: default package */
public final class fzd<T extends fyv> extends fyk<T> {
    final fxw a;
    final vhn b;
    final TextView c;
    private boolean d;
    private final Button e;
    private T f;

    public fzd(fym fym, Context context, Fragment fragment, fyb fyb) {
        LinearLayout linearLayout;
        this.b = new HeaderView(context);
        View view = (View) this.b;
        this.e = fym.d;
        this.a = fyj.a(fym, fragment, view, fym.h, fyb);
        vhn vhn = this.b;
        int i = fym.c;
        if (i == 0) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            a(fym, context, linearLayout);
            this.f = new fyq() {
                public final void a(CharSequence charSequence) {
                    fzd.this.c.setText(charSequence);
                    fzd.this.b.a(charSequence);
                    fzd.this.a.a(String.valueOf(charSequence));
                }
            };
        } else if (i == 1) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            final TextView a2 = gat.a(context);
            a2.setId(16908308);
            a2.setGravity(1);
            vgl.b(context, a2, R.attr.pasteTextAppearanceMetadata);
            linearLayout.addView(a2, new LayoutParams(-2, -2));
            a(fym, context, linearLayout);
            this.f = new fys() {
                public final TextView a() {
                    return a2;
                }

                public final void a(CharSequence charSequence) {
                    fzd.this.c.setText(charSequence);
                    fzd.this.b.a(charSequence);
                    fzd.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a2.setText(charSequence);
                }
            };
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        vhn.b(linearLayout);
        this.c = ((HeaderView) this.b).c;
        if (fym.g != null) {
            View view2 = fym.g;
            if (!this.d) {
                this.b.a((sf) new fyx(view2));
                this.d = true;
            }
            this.d = true;
        }
    }

    private void a(fym fym, Context context, LinearLayout linearLayout) {
        if (this.e != null) {
            int i = 0;
            boolean z = fym.e == 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = vfj.a(8.0f, context.getResources());
            if (z) {
                layoutParams.bottomMargin = a2;
            } else {
                layoutParams.topMargin = a2;
            }
            Button button = this.e;
            if (!z) {
                i = -1;
            }
            linearLayout.addView(button, i, layoutParams);
        }
    }

    public final T a() {
        return this.f;
    }

    public final void a(int i) {
        this.a.a(0);
    }

    public final void a(View view) {
        this.b.a(view);
    }

    public final void a(e eVar) {
        this.b.a(eVar);
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
