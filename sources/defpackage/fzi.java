package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel.HeaderViewType;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fzi reason: default package */
final class fzi implements fzn {
    final b a;
    OnClickListener b = $$Lambda$fzi$Bb4cRhXXt_cPqeGd34yGHkIfzsE.INSTANCE;
    final Context c;
    final ContextMenuViewModel d;
    private final Map<Integer, Object> e = new HashMap();
    private final hu f;
    private final Menu g;
    private boolean h;
    private MenuItem i;

    /* renamed from: fzi$a */
    static class a implements fzs {
        private final fva a;

        public a(fva fva) {
            this.a = fva;
        }

        public final fzs a(final Runnable runnable) {
            this.a.a((fvc) new fvc() {
                public final void onMenuItemClick(fva fva) {
                    runnable.run();
                }
            });
            return this;
        }
    }

    /* renamed from: fzi$b */
    interface b {
        boolean onMenuItemClick(Context context, ContextMenuViewModel contextMenuViewModel);
    }

    fzi(Context context, Menu menu, b bVar) {
        this.c = context;
        this.g = menu;
        this.a = bVar;
        this.d = new ContextMenuViewModel();
        this.f = new fzl(context, this.g);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view) {
    }

    public final Context a() {
        return this.c;
    }

    public final fzo a(int i2, CharSequence charSequence) {
        Menu menu = this.g;
        hu huVar = this.f;
        MenuItem add = menu.add(0, i2, 0, charSequence);
        add.setShowAsAction(2);
        if (huVar != null) {
            ib.a(add, huVar);
        }
        fzp fzp = new fzp(add);
        this.e.put(Integer.valueOf(i2), fzp);
        return fzp;
    }

    public final fzs a(int i2, int i3, Drawable drawable) {
        return a(i2, (CharSequence) this.c.getString(i3), drawable);
    }

    public final fzs a(int i2, CharSequence charSequence, Drawable drawable) {
        if (!this.h) {
            this.i = this.g.add(0, 0, 255, R.string.content_description_show_context_menu);
            this.i.setIcon(new SpotifyIconDrawable(this.c, SpotifyIconV2.MORE_ANDROID, (float) this.c.getResources().getDimensionPixelSize(R.dimen.toolbar_context_menu_icon_size)));
            this.i.setOnMenuItemClickListener(new OnMenuItemClickListener() {
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    fzi.this.b.onClick(menuItem.getActionView());
                    return fzi.this.a.onMenuItemClick(fzi.this.c, fzi.this.d);
                }
            });
            this.i.setShowAsAction(2);
            ib.a(this.i, this.f);
            if (this.i.getActionView() != null) {
                this.i.getActionView().setId(R.id.glue_overflow);
            }
            this.h = true;
        }
        a aVar = new a(this.d.a(i2, charSequence, drawable));
        this.e.put(Integer.valueOf(i2), aVar);
        return aVar;
    }

    public final void a(OnClickListener onClickListener) {
        this.b = (OnClickListener) fbm.a(onClickListener, this.b);
    }

    public final void a(String str) {
        this.d.b(str);
    }

    public final void a(String str, SpotifyIconV2 spotifyIconV2, boolean z) {
        this.d.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        this.d.c.f = spotifyIconV2;
        this.d.a(z);
    }

    public final void a(String str, SpotifyIconV2 spotifyIconV2, boolean z, boolean z2) {
        a(str, spotifyIconV2, false);
        if (z2) {
            this.d.e = HeaderViewType.LARGE_IMAGE;
        }
    }

    public final void b() {
        MenuItem menuItem = this.i;
        if (menuItem != null) {
            menuItem.getActionView().performClick();
        }
    }

    public final void b(String str) {
        this.d.a(str);
    }

    public final void c(String str) {
        this.d.c.b = str;
    }
}
