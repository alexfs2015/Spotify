package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.ImageButton;
import com.google.common.collect.Sets;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.ItemType;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: fyp reason: default package */
final class fyp implements fza {
    private static final Set<Integer> f = Sets.a((E[]) new Integer[]{Integer.valueOf(R.id.actionbar_item_profile), Integer.valueOf(R.id.toolbar_up_button)});
    private final fse a;
    private final a b;
    private final Window c;
    /* access modifiers changed from: private */
    public boolean d;
    private boolean e;
    private final OnClickListener g;
    private ImageButton h;

    /* renamed from: fyp$a */
    class a extends aq {
        private final Callback b;

        a(Callback callback) {
            super(callback);
            this.b = callback;
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !fyp.this.d) {
                fyp.this.d = true;
            }
            return onPreparePanel;
        }
    }

    public fyp(fse fse, Window window, OnClickListener onClickListener) {
        a aVar;
        this.a = fse;
        Callback callback = window.getCallback();
        if (callback instanceof a) {
            aVar = (a) callback;
        } else {
            aVar = new a(callback);
        }
        this.b = aVar;
        this.c = window;
        window.setCallback(this.b);
        this.g = onClickListener;
        Context context = this.a.getView().getContext();
        this.h = new StateListAnimatorImageButton(context);
        this.h.setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) context.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size)));
        ip.a((View) this.h, (Drawable) null);
        this.h.setLayoutParams(new LayoutParams(-2, -2));
        this.h.setOnClickListener(this.g);
        this.h.setContentDescription(context.getResources().getText(R.string.content_description_toolbar_back_button));
        gjd.a(this.a.getView(), "toolbar");
    }

    public final void a() {
        Context context = this.a.getView().getContext();
        ax axVar = new ax(context);
        axVar.e();
        try {
            axVar.clear();
            if (!this.b.onCreatePanelMenu(0, axVar) || !this.b.onPreparePanel(0, null, axVar)) {
                axVar.clear();
            }
        } finally {
            axVar.f();
            a(context, axVar);
        }
    }

    private void a(Context context, ax axVar) {
        hu fyr = new fyr(context, axVar);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        az azVar = null;
        for (int i = 0; i < axVar.size(); i++) {
            MenuItem item = axVar.getItem(i);
            if (item.isVisible()) {
                az azVar2 = (az) item;
                if (!azVar2.h()) {
                    arrayList.add(azVar2);
                } else if (azVar2.getItemId() == R.id.actionbar_item_shuffle_play) {
                    azVar = azVar2;
                } else {
                    arrayList2.add(azVar2);
                }
            }
        }
        this.a.a(ToolbarSide.END);
        this.a.a(ToolbarSide.START);
        if (!arrayList.isEmpty()) {
            for (MenuItem a2 : arrayList) {
                this.a.a(a2);
            }
        }
        if (this.e) {
            this.a.a(ToolbarSide.START, this.h, R.id.toolbar_up_button);
            gjd.a((View) this.h, gje.b().a().a(ItemType.BUTTON).a("back"), InteractionIntent.NAVIGATE);
        }
        View a3 = this.a.a((int) R.id.legacy_overflow);
        if (a3 != null) {
            a(a3);
        }
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            MenuItem menuItem = (MenuItem) arrayList2.get(size);
            View actionView = menuItem.getActionView();
            ToolbarSide toolbarSide = f.contains(Integer.valueOf(menuItem.getItemId())) ? ToolbarSide.START : ToolbarSide.END;
            if (actionView != null) {
                this.a.a(toolbarSide, actionView, menuItem.getItemId());
                if (actionView.getId() == R.id.glue_overflow) {
                    a(actionView);
                }
            } else {
                this.a.a(toolbarSide, (ib.a(menuItem) != null ? ib.a(menuItem) : fyr).a(menuItem), menuItem.getItemId());
            }
        }
        if (azVar != null) {
            this.a.a(f.contains(Integer.valueOf(azVar.getItemId())) ? ToolbarSide.START : ToolbarSide.END, azVar.getActionView(), azVar.getItemId());
        }
    }

    private static void a(View view) {
        gjd.a(view, gje.b().a().a(ItemType.BUTTON).a("menu"), InteractionIntent.SHOW_OPTIONS);
    }

    public final void a(boolean z) {
        this.e = z;
    }
}
