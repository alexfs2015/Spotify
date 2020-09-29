package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

/* renamed from: q reason: default package */
public class q extends kf implements a, r {
    private s g;
    private Resources h;

    private boolean k() {
        boolean z;
        Intent a = fg.a(this);
        if (a == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 16) {
            z = shouldUpRecreateTask(a);
        } else {
            String action = getIntent().getAction();
            z = action != null && !action.equals("android.intent.action.MAIN");
        }
        if (z) {
            fq a2 = fq.a((Context) this);
            Intent f = f();
            if (f == null) {
                f = fg.a(this);
            }
            if (f != null) {
                ComponentName component = f.getComponent();
                if (component == null) {
                    component = f.resolveActivity(a2.b.getPackageManager());
                }
                a2.a(component);
                a2.a(f);
            }
            if (!a2.a.isEmpty()) {
                Intent[] intentArr = (Intent[]) a2.a.toArray(new Intent[a2.a.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                fr.a(a2.b, intentArr, (Bundle) null);
                try {
                    ez.b(this);
                } catch (IllegalStateException unused) {
                    finish();
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else if (VERSION.SDK_INT >= 16) {
            navigateUpTo(a);
        } else {
            a.addFlags(67108864);
            startActivity(a);
            finish();
        }
        return true;
    }

    public void a(Toolbar toolbar) {
        g().a(toolbar);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        g().b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        g().h();
    }

    public void closeOptionsMenu() {
        ActionBar a = g().a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.d()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar a = g().a();
        if (keyCode != 82 || a == null || !a.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void e() {
        g().i();
    }

    public final Intent f() {
        return fg.a(this);
    }

    public <T extends View> T findViewById(int i) {
        return g().b(i);
    }

    public final s g() {
        if (this.g == null) {
            this.g = s.a((Activity) this, (r) this);
        }
        return this.g;
    }

    public MenuInflater getMenuInflater() {
        return g().b();
    }

    public Resources getResources() {
        if (this.h == null && cu.a()) {
            this.h = new cu(this, super.getResources());
        }
        Resources resources = this.h;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        g().i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.h != null) {
            this.h.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        g().a(configuration);
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        s g2 = g();
        g2.k();
        g2.c();
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        g().j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 26
            if (r0 >= r2) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r2 = r0.getDecorView()
            if (r2 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r1
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar a = g().a();
        if (menuItem.getItemId() != 16908332 || a == null || (a.a() & 4) == 0) {
            return false;
        }
        return k();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        g().d();
    }

    public void onPostResume() {
        super.onPostResume();
        g().g();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g().l();
    }

    public void onStart() {
        super.onStart();
        g().e();
    }

    public void onStop() {
        super.onStop();
        g().f();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        g().a(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar a = g().a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.c()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        g().c(i);
    }

    public void setContentView(View view) {
        g().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        g().a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        g().a(i);
    }
}
