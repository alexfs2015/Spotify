package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.MainLayout.b;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;

/* renamed from: klw reason: default package */
public final class klw implements b, spj {
    public final fys a;
    private final MainLayout b;
    private final soy c;

    public klw(Activity activity, MainLayout mainLayout, soy soy, spg spg, fbd<Boolean> fbd) {
        this.b = mainLayout;
        ViewGroup viewGroup = this.b.d;
        fse a2 = fsi.a(this.b.getContext(), viewGroup);
        gab.a(a2.getView(), activity);
        this.a = new fys(activity, a2, new $$Lambda$klw$AcCSOOmZZNYqxH9n9eTAUGON_o(fbd, spg));
        this.c = soy;
        this.b.b();
        viewGroup.addView(this.a.b.getView());
    }

    public final void c() {
        this.b.b();
        this.b.requestLayout();
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final boolean a() {
        return ToolbarConfig.a(this.b.getContext(), this.c.a());
    }

    public final Visibility b() {
        return ToolbarConfig.a(this.c.a());
    }

    public final void a(boolean z, Visibility visibility) {
        this.a.c(z);
        if (visibility != Visibility.ONLY_MAKE_ROOM) {
            this.a.a(visibility == Visibility.HIDE);
        }
    }

    public final void d() {
        this.a.a(1.0f);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(fbd fbd, spg spg, View view) {
        if (!((Boolean) fbd.get()).booleanValue()) {
            spg.a(BackNavigationInteractionType.UP_BUTTON_PRESSED);
        }
    }
}
