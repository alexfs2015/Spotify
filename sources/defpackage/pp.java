package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map.Entry;

/* renamed from: pp reason: default package */
public final class pp {
    public Bundle a;
    public boolean b;
    public boolean c = true;
    private db<String, b> d = new db<>();

    /* renamed from: pp$a */
    public interface a {
    }

    /* renamed from: pp$b */
    public interface b {
        Bundle a();
    }

    pp() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        d a2 = this.d.a();
        while (a2.hasNext()) {
            Entry entry = (Entry) a2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Lifecycle lifecycle, Bundle bundle) {
        if (!this.b) {
            if (bundle != null) {
                this.a = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.a(new SavedStateRegistry$1(this));
            this.b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
