package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners.Event;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;

/* renamed from: jjs reason: default package */
public abstract class jjs extends jjp implements a {
    private final Listeners g = new Listeners();

    public void onStart() {
        super.onStart();
        this.g.a((gbr<b>) Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        this.g.a((gbr<b>) Event.ON_STOP);
    }

    public void onPause() {
        super.onPause();
        this.g.a((gbr<b>) Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        this.g.a((gbr<b>) Event.ON_RESUME);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        this.g.a(menu);
        return onCreateOptionsMenu;
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.a((gbr<b>) Event.ON_DESTROY);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.g.b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.g.c(bundle);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.g.a((gbr<b>) Event.ON_LOW_MEMORY);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.g.a(i, i2, intent);
    }

    public final boolean a(b bVar) {
        return this.g.a((b) fay.a(bVar));
    }

    public final boolean b(b bVar) {
        return this.g.b((b) fay.a(bVar));
    }
}
