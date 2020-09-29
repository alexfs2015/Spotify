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
import defpackage.fyb;

/* renamed from: fyj reason: default package */
public final class fyj<T extends fyb> extends fxq<T> {
    final fxc a;
    final uvx b;
    final TextView c;
    private boolean d;
    private final Button e;
    private T f;

    public final void a(fyt fyt, Context context) {
    }

    public final void h() {
    }

    public fyj(fxs fxs, Context context, Fragment fragment, fxh fxh) {
        LinearLayout linearLayout;
        this.b = new HeaderView(context);
        View view = (View) this.b;
        this.e = fxs.d;
        this.a = fxp.a(fxs, fragment, view, fxs.h, fxh);
        uvx uvx = this.b;
        int i = fxs.c;
        if (i == 0) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            a(fxs, context, linearLayout);
            this.f = new fxw() {
                public final void a(CharSequence charSequence) {
                    fyj.this.c.setText(charSequence);
                    fyj.this.b.a(charSequence);
                    fyj.this.a.a(String.valueOf(charSequence));
                }
            };
        } else if (i == 1) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            final TextView a2 = fzz.a(context);
            a2.setId(16908308);
            a2.setGravity(1);
            uuu.b(context, a2, R.attr.pasteTextAppearanceMetadata);
            linearLayout.addView(a2, new LayoutParams(-2, -2));
            a(fxs, context, linearLayout);
            this.f = new fxy() {
                public final TextView a() {
                    return a2;
                }

                public final void a(CharSequence charSequence) {
                    fyj.this.c.setText(charSequence);
                    fyj.this.b.a(charSequence);
                    fyj.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a2.setText(charSequence);
                }
            };
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        uvx.b(linearLayout);
        this.c = ((HeaderView) this.b).c;
        if (fxs.g != null) {
            View view2 = fxs.g;
            if (!this.d) {
                this.b.a((sa) new fyd(view2));
                this.d = true;
            }
            this.d = true;
        }
    }

    private void a(fxs fxs, Context context, LinearLayout linearLayout) {
        if (this.e != null) {
            int i = 0;
            boolean z = fxs.e == 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = uts.a(8.0f, context.getResources());
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

    public final View b() {
        return this.a.d();
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

    public final void a(boolean z) {
        this.a.b(z);
    }

    public final void b(boolean z) {
        this.a.c(z);
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

    public final void b(View view) {
        this.a.a(view);
    }

    public final void b(int i) {
        this.a.b().a(i);
    }
}
