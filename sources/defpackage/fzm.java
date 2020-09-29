package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import com.spotify.android.glue.components.toolbar.ToolbarSide;

/* renamed from: fzm reason: default package */
public final class fzm implements fyh {
    public final fsy b;
    private boolean c;
    /* access modifiers changed from: private */
    public final fzu d;
    private final Drawable e;
    private final Runnable f = new Runnable() {
        public final void run() {
            fzm.this.d.a();
        }
    };

    public fzm(Activity activity, fsy fsy, OnClickListener onClickListener) {
        this.b = fsy;
        this.d = new fzj(this.b, activity.getWindow(), onClickListener);
        this.d.a(false);
        this.e = gav.c(activity);
        ip.a(this.b.getView(), this.e);
        a();
        a(false);
    }

    public final void a() {
        this.b.getView().removeCallbacks(this.f);
        ip.a(this.b.getView(), this.f);
    }

    public final void a(float f2) {
        this.b.a(f2);
    }

    public final void a(String str) {
        this.e.setAlpha(this.c ? 0 : 255);
        fsy fsy = this.b;
        if (str == null) {
            str = "";
        }
        fsy.a((CharSequence) str);
    }

    public final void a(boolean z) {
        this.b.getView().setVisibility(z ? 8 : 0);
    }

    public final void b(float f2) {
        this.b.a(ToolbarSide.START, f2);
        this.b.a(ToolbarSide.END, f2);
    }

    public final void b(boolean z) {
        this.d.a(z);
    }

    public final void c(boolean z) {
        this.c = z;
        this.e.setAlpha(z ? 0 : 255);
    }
}
