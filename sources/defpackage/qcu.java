package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners.Event;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;

/* renamed from: qcu reason: default package */
public abstract class qcu extends kr implements a {
    private final Listeners b = new Listeners();

    public void b(Bundle bundle) {
        super.b(bundle);
        this.b.a(bundle);
    }

    public void g() {
        super.g();
        this.b.a((gbr<b>) Event.ON_START);
    }

    public void h() {
        super.h();
        this.b.a((gbr<b>) Event.ON_STOP);
    }

    public final void A() {
        super.A();
        this.b.a((gbr<b>) Event.ON_PAUSE);
    }

    public void z() {
        super.z();
        this.b.a((gbr<b>) Event.ON_RESUME);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        this.b.a(menu);
    }

    public final void B() {
        super.B();
        this.b.a((gbr<b>) Event.ON_DESTROY);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.b.b(bundle);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.b.c(bundle);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.a((gbr<b>) Event.ON_LOW_MEMORY);
    }

    public void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    public final boolean a(b bVar) {
        return this.b.a((b) fay.a(bVar));
    }

    public final boolean b(b bVar) {
        return this.b.b((b) fay.a(bVar));
    }
}
