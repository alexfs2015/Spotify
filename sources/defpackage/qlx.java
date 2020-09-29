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

/* renamed from: qlx reason: default package */
public abstract class qlx extends kw implements a {
    private final Listeners b = new Listeners();

    public final void A() {
        super.A();
        this.b.a((gcp<b>) Event.ON_PAUSE);
    }

    public final void B() {
        super.B();
        this.b.a((gcp<b>) Event.ON_DESTROY);
    }

    public void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        this.b.a(menu);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.b.c(bundle);
    }

    public final boolean a(b bVar) {
        return this.b.a((b) fbp.a(bVar));
    }

    public void aP_() {
        super.aP_();
        this.b.a((gcp<b>) Event.ON_START);
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.b.a(bundle);
    }

    public final boolean b(b bVar) {
        return this.b.b((b) fbp.a(bVar));
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.b.b(bundle);
    }

    public void h() {
        super.h();
        this.b.a((gcp<b>) Event.ON_STOP);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.a((gcp<b>) Event.ON_LOW_MEMORY);
    }

    public void z() {
        super.z();
        this.b.a((gcp<b>) Event.ON_RESUME);
    }
}
