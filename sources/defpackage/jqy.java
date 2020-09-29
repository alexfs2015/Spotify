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

/* renamed from: jqy reason: default package */
public abstract class jqy extends ke implements a {
    private final Listeners T = new Listeners();

    public void A() {
        super.A();
        this.T.a((gcp<b>) Event.ON_PAUSE);
    }

    public final void B() {
        super.B();
        this.T.a((gcp<b>) Event.ON_DESTROY);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.T.a(i, i2, intent);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        this.T.a(menu);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.T.c(bundle);
    }

    public final boolean a(b bVar) {
        return this.T.a((b) fbp.a(bVar));
    }

    public void aP_() {
        super.aP_();
        this.T.a((gcp<b>) Event.ON_START);
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.T.a(bundle);
    }

    public final boolean b(b bVar) {
        return this.T.b((b) fbp.a(bVar));
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.b(bundle);
    }

    public void h() {
        super.h();
        this.T.a((gcp<b>) Event.ON_STOP);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.T.a((gcp<b>) Event.ON_LOW_MEMORY);
    }

    public final void z() {
        super.z();
        this.T.a((gcp<b>) Event.ON_RESUME);
    }
}
