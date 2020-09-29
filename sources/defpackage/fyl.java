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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import defpackage.fyb;

/* renamed from: fyl reason: default package */
public final class fyl<T extends fyb> extends fxq<T> {
    final fxe a;
    final uvx b;
    private final Button c;
    private final Context d;
    private final fxs e;
    private T f;

    public final void a(e eVar) {
    }

    public final void a(fyt fyt, Context context) {
    }

    public fyl(fxs fxs, Context context, Fragment fragment, uvx uvx, fxh fxh) {
        this.d = context;
        this.b = (uvx) fay.a(uvx);
        this.e = fxs;
        this.c = fxs.d;
        this.a = fxp.b(fxs, fragment, this.b.b(), fxs.h, fxh);
        this.a.a().c(fxs.q);
        int i = fxs.c;
        if (i == 0) {
            Context context2 = this.d;
            LinearLayout d2 = d(context2);
            a(d2, fxs, context2);
            this.b.b(d2);
            this.f = new fxw() {
                public final void a(CharSequence charSequence) {
                    fyl.this.b.a(charSequence);
                    fyl.this.a.a(String.valueOf(charSequence));
                }
            };
        } else if (i == 1) {
            Context context3 = this.d;
            LinearLayout d3 = d(context3);
            final TextView a2 = fzz.a(context3);
            a2.setId(16908308);
            uuu.b(context3, a2, R.attr.pasteTextAppearanceMetadata);
            d3.addView(a2, new LayoutParams(-2, -2));
            a(d3, fxs, context3);
            final ImageView imageView = new ImageView(context3);
            final ImageView imageView2 = new ImageView(context3);
            final ImageView imageView3 = new ImageView(context3);
            int dimensionPixelOffset = this.d.getResources().getDimensionPixelOffset(R.dimen.header_drawables_margin);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            if (this.e.k.booleanValue()) {
                d3.addView(imageView, layoutParams);
                d3.addView(imageView2, layoutParams2);
            } else {
                LinearLayout linearLayout = new LinearLayout(context3);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(1);
                linearLayout.addView(imageView, layoutParams);
                linearLayout.addView(imageView2, layoutParams2);
                d3.addView(linearLayout, new LayoutParams(-2, -2));
            }
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            layoutParams3.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            d3.addView(imageView3, layoutParams3);
            AnonymousClass2 r3 = new fxz() {
                public final TextView a() {
                    return a2;
                }

                public final void a(CharSequence charSequence) {
                    fyl.this.b.a(charSequence);
                    fyl.this.a.a(String.valueOf(charSequence));
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
            this.f = r3;
            ((fxz) this.f).a(false);
            this.b.b(d3);
        } else if (i == 2) {
            Context context4 = this.d;
            LinearLayout d4 = d(context4);
            final TextView a3 = fzz.a(context4);
            a3.setId(16908308);
            uuu.b(context4, a3, R.attr.pasteTextAppearanceMetadata);
            d4.addView(a3, new LayoutParams(-2, -2));
            final TextView a4 = fzz.a(context4);
            a4.setId(R.id.metadata);
            uuu.b(context4, a4, R.attr.pasteTextAppearanceHeadingSmall);
            d4.addView(a4, new LayoutParams(-2, -2));
            a(d4, fxs, context4);
            this.f = new fya() {
                public final TextView b() {
                    return a4;
                }

                public final void c(CharSequence charSequence) {
                    a4.setText(charSequence);
                }

                public final TextView a() {
                    return a3;
                }

                public final void a(CharSequence charSequence) {
                    fyl.this.b.a(charSequence);
                    fyl.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a3.setText(charSequence);
                }
            };
            this.b.b(d4);
        } else if (i == 3 || i == 4 || i == 5) {
            Context context5 = this.d;
            LinearLayout d5 = d(context5);
            TextView a5 = fzz.a(context5);
            a5.setId(16908308);
            uuu.b(context5, a5, R.attr.pasteTextAppearanceMetadata);
            d5.addView(a5, new LayoutParams(-2, -2));
            final LinearLayout linearLayout2 = new LinearLayout(context5);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            d5.addView(linearLayout2, new LayoutParams(-2, -2));
            a(d5, fxs, context5);
            this.f = new fxx() {
                public final LinearLayout a() {
                    return linearLayout2;
                }

                public final void a(CharSequence charSequence) {
                    fyl.this.b.a(charSequence);
                    fyl.this.a.a(String.valueOf(charSequence));
                }
            };
            this.b.b(d5);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        if (this.e.g != null) {
            this.b.a((sa) new fyd(this.e.g));
        }
    }

    private static LinearLayout d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private void a(ViewGroup viewGroup, fxs fxs, Context context) {
        if (this.c != null) {
            int i = 0;
            boolean z = fxs.e == 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = uts.a(8.0f, context.getResources());
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
        throw new UnsupportedOperationException("ListView not supported.");
    }

    public final RecyclerView f() {
        return this.a.e();
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

    public final void b(View view) {
        this.a.a(view);
    }

    public final void b(int i) {
        this.a.b().a(i);
    }

    public final void h() {
        this.a.a().b(false);
    }
}
