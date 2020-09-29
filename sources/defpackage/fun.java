package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.LinearLayout;
import com.spotify.android.glue.patterns.contextmenu.glue.GlueContextMenuLayout;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: fun reason: default package */
public final class fun implements fuj {
    private final ful a;
    private final fum b;
    private final fuq c;
    private final Context d;

    public fun(Context context, fui fui, Picasso picasso) {
        this.d = context;
        this.c = new fuq(context, fui);
        fuo fuo = new fuo(context, picasso, context.getString(R.string.context_menu_show_more));
        this.a = new ful(context, fui);
        this.b = new fum(context, fui, fuo);
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.d, 16973840);
        dialog.setContentView(this.c.b);
        if (VERSION.SDK_INT < 21) {
            if (VERSION.SDK_INT >= 19 && dialog.getWindow() != null) {
                dialog.getWindow().addFlags(67108864);
            }
        } else if (dialog.getWindow() != null) {
            Window window = dialog.getWindow();
            if (this.a.a() == 0) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(fr.c(this.d, 17170445));
            }
            window.getDecorView().setSystemUiVisibility(1280);
        }
        return dialog;
    }

    public final void a(ContextMenuViewModel contextMenuViewModel) {
        if (contextMenuViewModel.f) {
            fuq fuq = this.c;
            if (!fuq.k && !fuq.j) {
                fuq.d();
                fuq.b();
            }
            return;
        }
        this.a.a = contextMenuViewModel.a;
        this.b.a(contextMenuViewModel);
        fuq fuq2 = this.c;
        ful ful = this.a;
        fum fum = this.b;
        if (!fuq2.k) {
            for (View removeView : fuq2.i) {
                fuq2.c.removeView(removeView);
            }
            fuq2.i.clear();
            int i = 8;
            fuq2.c.setVisibility(8);
            fuq2.d.setVisibility(8);
            if (ful != null && ful.a() > 0) {
                fuq2.c.setVisibility(0);
                fuq2.d.setVisibility(0);
                fuq2.c();
                for (int i2 = 0; i2 < ful.a(); i2++) {
                    View a2 = ful.a(i2, fuq2.c);
                    fuq2.i.add(a2);
                    fuq2.c.addView(a2);
                }
            }
            fup b2 = fum.b();
            fbp.a(b2);
            View a3 = b2.a();
            LayoutParams layoutParams = a3.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams != null ? new LinearLayout.LayoutParams(layoutParams) : new LinearLayout.LayoutParams(-1, -2);
            if (fuq2.c.getVisibility() == 0) {
                fuq2.e.c = (int) (fuq2.c.getContext().getResources().getDimension(R.dimen.context_menu_top_bar_height) + ((float) fuq2.c.getPaddingTop()));
            }
            a3.setLayoutParams(layoutParams2);
            if (!fuq2.j) {
                i = 0;
            }
            a3.setVisibility(i);
            fuq2.f = a3;
            GlueContextMenuLayout glueContextMenuLayout = fuq2.e;
            if (glueContextMenuLayout.b != null) {
                glueContextMenuLayout.removeView(glueContextMenuLayout.b.a());
            }
            glueContextMenuLayout.addView(b2.a(), 0);
            glueContextMenuLayout.b = b2;
            fuq2.f.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    fuq fuq = fuq.this;
                    fuq.g = fuq.f.getTop();
                    fuq.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            fuq2.d();
            fuq2.a((fuk) fum);
            fuq2.e.d = fum.c();
            if (fuq2.j) {
                fuq2.b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        fuq fuq = fuq.this;
                        fuq.p = vfq.a(fuq.l);
                        fuq.this.p.start();
                        fuq.this.q.start();
                        fuq.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                });
            }
            if (fuq2.f != null) {
                fuq2.f.setVisibility(0);
            }
            AnonymousClass5 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    fuq.this.e.a(8);
                }
            };
            if (fuq2.n.isRunning()) {
                fuq2.n.cancel();
            }
            fuq2.o.start();
            fuq2.o.addListener(r0);
            fuq2.j = false;
        }
    }

    public final void b() {
        this.c.a();
    }
}
