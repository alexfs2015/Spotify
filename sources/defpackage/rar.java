package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import com.google.common.base.Optional;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.ItemType;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.container.view.GroupedTabLayout;

/* renamed from: rar reason: default package */
public final class rar {
    final Callback a;
    final GroupedTabLayout b;
    private final Runnable c = new Runnable() {
        public final void run() {
            rar rar = rar.this;
            ax axVar = new ax(rar.b.getContext());
            axVar.e();
            try {
                axVar.clear();
                if (!rar.a.onCreatePanelMenu(0, axVar) || !rar.a.onPreparePanel(0, null, axVar)) {
                    axVar.clear();
                }
            } finally {
                axVar.f();
                rar.a(axVar);
            }
        }
    };

    public rar(Activity activity, GroupedTabLayout groupedTabLayout) {
        Window window = activity.getWindow();
        this.b = groupedTabLayout;
        this.a = window.getCallback();
    }

    private static void a(View view) {
        gko.a(view, gkp.b().a().a(ItemType.BUTTON).a("menu"), InteractionIntent.SHOW_OPTIONS);
    }

    public final void a() {
        this.b.removeCallbacks(this.c);
        ip.a((View) this.b, this.c);
    }

    /* access modifiers changed from: 0000 */
    public void a(ax axVar) {
        View view;
        int i = 0;
        while (true) {
            if (i >= axVar.size()) {
                view = null;
                break;
            }
            MenuItem item = axVar.getItem(i);
            if (item.isVisible()) {
                view = item.getActionView();
                if (view != null && view.getId() == R.id.glue_overflow) {
                    a(view);
                    break;
                }
            }
            i++;
        }
        this.b.a(Optional.c(view));
    }
}
