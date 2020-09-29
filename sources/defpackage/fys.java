package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import com.spotify.android.glue.components.toolbar.ToolbarSide;

/* renamed from: fys reason: default package */
public final class fys implements fxn {
    public final fse b;
    private boolean c;
    /* access modifiers changed from: private */
    public final fza d;
    private final Drawable e;
    private final Runnable f = new Runnable() {
        public final void run() {
            fys.this.d.a();
        }
    };

    public final void b(boolean z) {
        this.d.a(z);
    }

    public fys(Activity activity, fse fse, OnClickListener onClickListener) {
        this.b = fse;
        this.d = new fyp(this.b, activity.getWindow(), onClickListener);
        this.d.a(false);
        this.e = gab.c(activity);
        ip.a(this.b.getView(), this.e);
        a();
        a(false);
    }

    public final void a() {
        this.b.getView().removeCallbacks(this.f);
        ip.a(this.b.getView(), this.f);
    }

    public final void a(boolean z) {
        this.b.getView().setVisibility(z ? 8 : 0);
    }

    public final void c(boolean z) {
        this.c = z;
        this.e.setAlpha(z ? 0 : 255);
    }

    public final void a(String str) {
        this.e.setAlpha(this.c ? 0 : 255);
        fse fse = this.b;
        if (str == null) {
            str = "";
        }
        fse.a((CharSequence) str);
    }

    public final void a(float f2) {
        this.b.a(f2);
    }

    public final void b(float f2) {
        this.b.a(ToolbarSide.START, f2);
        this.b.a(ToolbarSide.END, f2);
    }
}
