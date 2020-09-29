package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.appcompat.widget.Toolbar;

/* renamed from: jmb reason: default package */
public abstract class jmb extends q {
    private boolean g;

    /* renamed from: jmb$a */
    static class a extends jze {
        public a(Callback callback) {
            super(callback);
        }

        public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
            CharSequence titleCondensed = menuItem.getTitleCondensed();
            if (titleCondensed != null) {
                menuItem.setTitleCondensed(titleCondensed.toString());
            } else if (menuItem.getTitle() != null) {
                menuItem.setTitleCondensed(menuItem.getTitle().toString());
            }
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            menuItem.setTitleCondensed(titleCondensed);
            return onMenuItemSelected;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void a(Toolbar toolbar) {
        if (VERSION.SDK_INT < 18) {
            CharSequence charSequence = toolbar.n;
            if (charSequence != null) {
                toolbar.a((CharSequence) charSequence.toString());
            }
            super.a(toolbar);
            if (charSequence != null) {
                toolbar.a(charSequence);
            }
            return;
        }
        super.a(toolbar);
    }

    public void onCreate(Bundle bundle) {
        this.g = false;
        gbz.a(new $$Lambda$jmb$dzTR_FNnX1rb06QIF7tUvhkcnnU(this, bundle));
        if (VERSION.SDK_INT < 18) {
            getWindow().setCallback(new a(getWindow().getCallback()));
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (this.g) {
            return false;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.g = true;
    }
}
