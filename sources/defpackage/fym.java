package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import com.spotify.paste.widgets.HeaderView;
import defpackage.fyb;

/* renamed from: fym reason: default package */
public final class fym<T extends fyb> extends fxq<T> {
    final fxe a;
    final uvx b;
    final TextView c;
    private boolean d;
    private final Button e;
    private final Context f;
    private T g;
    private final fxs h;
    private boolean i = true;

    public final void a(fyt fyt, Context context) {
    }

    public fym(fxs fxs, Context context, Fragment fragment, fxh fxh) {
        LinearLayout linearLayout;
        this.h = fxs;
        this.f = context;
        this.b = new HeaderView(this.f);
        View view = (View) this.b;
        this.e = fxs.d;
        this.a = fxp.b(fxs, fragment, view, fxs.h, fxh);
        this.a.a().a.setVerticalScrollBarEnabled(!fxs.q);
        this.a.a().c(fxs.q);
        uvx uvx = this.b;
        Context context2 = this.f;
        int i2 = fxs.c;
        if (i2 == 0) {
            linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            a(fxs, context2, linearLayout);
            this.g = new fxw() {
                public final void a(CharSequence charSequence) {
                    fym.this.c.setText(charSequence);
                    fym.this.b.a(charSequence);
                    fym.this.a.a(String.valueOf(charSequence));
                }
            };
        } else if (i2 == 1) {
            linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            final TextView a2 = fzz.a(context2);
            a2.setId(16908308);
            a2.setGravity(1);
            uuu.b(context2, a2, R.attr.pasteTextAppearanceMetadata);
            linearLayout.addView(a2, new LayoutParams(-2, -2));
            a(fxs, context2, linearLayout);
            final ImageView imageView = new ImageView(context2);
            final ImageView imageView2 = new ImageView(context2);
            final ImageView imageView3 = new ImageView(context2);
            int dimensionPixelOffset = this.f.getResources().getDimensionPixelOffset(R.dimen.header_drawables_margin);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            if (this.h.k.booleanValue()) {
                linearLayout.addView(imageView, layoutParams);
                linearLayout.addView(imageView2, layoutParams2);
            } else {
                LinearLayout linearLayout2 = new LinearLayout(context2);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(1);
                linearLayout2.addView(imageView, layoutParams);
                linearLayout2.addView(imageView2, layoutParams2);
                linearLayout.addView(linearLayout2, new LayoutParams(-2, -2));
            }
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            layoutParams3.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            linearLayout.addView(imageView3, layoutParams3);
            AnonymousClass2 r4 = new fxz() {
                public final TextView a() {
                    return a2;
                }

                public final void a(CharSequence charSequence) {
                    fym.this.c.setText(charSequence);
                    fym.this.b.a(charSequence);
                    fym.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a2.setText(charSequence);
                }

                public final void a(boolean z) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                    imageView3.setVisibility(8);
                }
            };
            this.g = r4;
            ((fxz) this.g).a(false);
        } else if (i2 == 2) {
            linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            final TextView a3 = fzz.a(context2);
            a3.setGravity(1);
            uuu.b(context2, a3, R.attr.pasteTextAppearanceArticle);
            LayoutParams layoutParams4 = new LayoutParams(-2, -2);
            float dimensionPixelOffset2 = (float) this.f.getResources().getDimensionPixelOffset(R.dimen.header_drawables_margin);
            layoutParams4.topMargin = uts.a(dimensionPixelOffset2, context2.getResources());
            layoutParams4.bottomMargin = uts.a(dimensionPixelOffset2, context2.getResources());
            linearLayout.addView(a3, layoutParams4);
            final TextView a4 = fzz.a(context2);
            a4.setGravity(1);
            uuu.b(context2, a4, R.attr.pasteTextAppearanceSecondary);
            linearLayout.addView(a4, new LayoutParams(-2, -2));
            a(fxs, context2, linearLayout);
            this.g = new fya() {
                public final TextView a() {
                    return a4;
                }

                public final TextView b() {
                    return a3;
                }

                public final void a(CharSequence charSequence) {
                    fym.this.c.setText(charSequence);
                    fym.this.b.a(charSequence);
                    fym.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a4.setText(charSequence);
                }

                public final void c(CharSequence charSequence) {
                    a3.setText(charSequence);
                }
            };
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        uvx.b(linearLayout);
        this.c = ((HeaderView) this.b).c;
        if (fxs.g != null) {
            View view2 = this.h.g;
            if (!this.d) {
                this.b.a((sa) new fyd(view2));
                this.d = true;
            }
            this.d = true;
        }
    }

    private void a(fxs fxs, Context context, LinearLayout linearLayout) {
        if (this.e != null) {
            int i2 = 0;
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
                i2 = -1;
            }
            linearLayout.addView(button, i2, layoutParams);
        }
    }

    public final T a() {
        return this.g;
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
        throw new UnsupportedOperationException("ListView not supported.");
    }

    public final void a(boolean z) {
        this.a.b(z);
    }

    public final void b(boolean z) {
        this.a.c(z);
    }

    public final void a(int i2) {
        this.a.a(0);
    }

    public final void a(View view) {
        this.b.a(view);
    }

    public final RecyclerView f() {
        return this.a.e();
    }

    public final void a(e eVar) {
        this.b.a(eVar);
    }

    public final void b(View view) {
        this.a.a(view);
    }

    public final void b(int i2) {
        this.a.b().a(i2);
    }

    public final void h() {
        this.a.a().b(false);
    }
}
