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

/* renamed from: qsc reason: default package */
public final class qsc {
    final Callback a;
    final GroupedTabLayout b;
    private final Runnable c = new Runnable() {
        public final void run() {
            qsc qsc = qsc.this;
            ax axVar = new ax(qsc.b.getContext());
            axVar.e();
            try {
                axVar.clear();
                if (!qsc.a.onCreatePanelMenu(0, axVar) || !qsc.a.onPreparePanel(0, null, axVar)) {
                    axVar.clear();
                }
            } finally {
                axVar.f();
                qsc.a(axVar);
            }
        }
    };

    public qsc(Activity activity, GroupedTabLayout groupedTabLayout) {
        Window window = activity.getWindow();
        this.b = groupedTabLayout;
        this.a = window.getCallback();
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

    private static void a(View view) {
        gjd.a(view, gje.b().a().a(ItemType.BUTTON).a("menu"), InteractionIntent.SHOW_OPTIONS);
    }
}
