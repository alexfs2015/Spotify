package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners.Event;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;

/* renamed from: jon reason: default package */
public abstract class jon extends Fragment implements a {
    private final Listeners a = new Listeners();

    public void b(Bundle bundle) {
        super.b(bundle);
        this.a.a(bundle);
    }

    public void g() {
        super.g();
        this.a.a((gbr<b>) Event.ON_START);
    }

    public void h() {
        super.h();
        this.a.a((gbr<b>) Event.ON_STOP);
    }

    public void A() {
        super.A();
        this.a.a((gbr<b>) Event.ON_PAUSE);
    }

    public void z() {
        super.z();
        this.a.a((gbr<b>) Event.ON_RESUME);
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        this.a.a(menu);
    }

    public void B() {
        super.B();
        this.a.a((gbr<b>) Event.ON_DESTROY);
    }

    public void e(Bundle bundle) {
        super.e(bundle);
        this.a.b(bundle);
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.a.c(bundle);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.a.a((gbr<b>) Event.ON_LOW_MEMORY);
    }

    public void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.a.a(i, i2, intent);
    }

    public final boolean a(b bVar) {
        return this.a.a((b) fay.a(bVar));
    }

    public final boolean b(b bVar) {
        return this.a.b((b) fay.a(bVar));
    }
}
