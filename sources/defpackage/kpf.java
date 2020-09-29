package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.MainLayout.b;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;

/* renamed from: kpf reason: default package */
public final class kpf implements b, szq {
    public final fzm a;
    private final MainLayout b;
    private final szf c;

    public kpf(Activity activity, MainLayout mainLayout, szf szf, szn szn, fbu<Boolean> fbu) {
        this.b = mainLayout;
        ViewGroup viewGroup = this.b.d;
        fsy a2 = ftc.a(this.b.getContext(), viewGroup);
        gav.a(a2.getView(), activity);
        this.a = new fzm(activity, a2, new $$Lambda$kpf$7tgSgBNly0LM4qLU8MDdNqohsXY(fbu, szn));
        this.c = szf;
        this.b.b();
        viewGroup.addView(this.a.b.getView());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(fbu fbu, szn szn, View view) {
        if (!((Boolean) fbu.get()).booleanValue()) {
            szn.a(BackNavigationInteractionType.UP_BUTTON_PRESSED);
        }
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(boolean z, Visibility visibility) {
        this.a.c(z);
        if (visibility != Visibility.ONLY_MAKE_ROOM) {
            this.a.a(visibility == Visibility.HIDE);
        }
    }

    public final boolean a() {
        return ToolbarConfig.a(this.b.getContext(), this.c.a());
    }

    public final Visibility b() {
        return ToolbarConfig.a(this.c.a());
    }

    public final void c() {
        this.b.b();
        this.b.requestLayout();
    }

    public final void d() {
        this.a.a(1.0f);
    }
}
