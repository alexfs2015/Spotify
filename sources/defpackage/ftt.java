package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.glue.patterns.contextmenu.glue.GlueContextMenuLayout;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ftt reason: default package */
public final class ftt implements ftp {
    private final ftr a;
    private final fts b;
    private final ftw c;
    private final Context d;

    public ftt(Context context, fto fto, Picasso picasso) {
        this.d = context;
        this.c = new ftw(context, fto);
        ftu ftu = new ftu(context, picasso, context.getString(R.string.context_menu_show_more));
        this.a = new ftr(context, fto);
        this.b = new fts(context, fto, ftu);
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.d, 16973840);
        dialog.setContentView(this.c.b);
        return dialog;
    }

    public final void b() {
        this.c.a();
    }

    public final void a(ContextMenuViewModel contextMenuViewModel) {
        LayoutParams layoutParams;
        if (contextMenuViewModel.f) {
            ftw ftw = this.c;
            if (!ftw.k && !ftw.j) {
                ftw.d();
                ftw.b();
            }
            return;
        }
        this.a.a = contextMenuViewModel.a;
        this.b.a(contextMenuViewModel);
        ftw ftw2 = this.c;
        ftr ftr = this.a;
        fts fts = this.b;
        if (!ftw2.k) {
            for (View removeView : ftw2.i) {
                ftw2.c.removeView(removeView);
            }
            ftw2.i.clear();
            int i = 8;
            ftw2.c.setVisibility(8);
            ftw2.d.setVisibility(8);
            if (ftr != null && ftr.a() > 0) {
                ftw2.c.setVisibility(0);
                ftw2.d.setVisibility(0);
                ftw2.c();
                for (int i2 = 0; i2 < ftr.a(); i2++) {
                    View a2 = ftr.a(i2, ftw2.c);
                    ftw2.i.add(a2);
                    ftw2.c.addView(a2);
                }
            }
            ftv b2 = fts.b();
            fay.a(b2);
            View a3 = b2.a();
            ViewGroup.LayoutParams layoutParams2 = a3.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new LayoutParams(layoutParams2);
            } else {
                layoutParams = new LayoutParams(-1, -2);
            }
            if (ftw2.c.getVisibility() == 0) {
                ftw2.e.c = (int) ftw2.c.getContext().getResources().getDimension(R.dimen.context_menu_top_bar_height);
            }
            a3.setLayoutParams(layoutParams);
            if (!ftw2.j) {
                i = 0;
            }
            a3.setVisibility(i);
            ftw2.f = a3;
            GlueContextMenuLayout glueContextMenuLayout = ftw2.e;
            if (glueContextMenuLayout.b != null) {
                glueContextMenuLayout.removeView(glueContextMenuLayout.b.a());
            }
            glueContextMenuLayout.addView(b2.a(), 0);
            glueContextMenuLayout.b = b2;
            ftw2.f.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    ftw ftw = ftw.this;
                    ftw.g = ftw.f.getTop();
                    ftw.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            ftw2.d();
            ftw2.a((ftq) fts);
            ftw2.e.d = fts.c();
            if (ftw2.j) {
                ftw2.b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        ftw ftw = ftw.this;
                        ftw.p = utz.a(ftw.l);
                        ftw.this.p.start();
                        ftw.this.q.start();
                        ftw.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                });
            }
            if (ftw2.f != null) {
                ftw2.f.setVisibility(0);
            }
            AnonymousClass5 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ftw.this.e.a(8);
                }
            };
            if (ftw2.n.isRunning()) {
                ftw2.n.cancel();
            }
            ftw2.o.start();
            ftw2.o.addListener(r0);
            ftw2.j = false;
        }
    }
}
