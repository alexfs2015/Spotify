package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.service.feature.FeatureService.c;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: hlv reason: default package */
public final class hlv extends hiy<hlz> {
    private final Collection<c> g = new CopyOnWriteArraySet();

    public hlv(Context context, String str, hjw hjw) {
        super(context, FeatureService.class, new $$Lambda$hlv$R29YC52o6EpQWLebVYgImF4KzRQ(context), str, hjw);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hlz a(Context context, IBinder iBinder) {
        try {
            return FeatureService.this;
        } catch (ClassCastException e) {
            throw hlu.a(e, context, iBinder);
        }
    }

    public final void a(c cVar) {
        this.g.add(cVar);
        if (c()) {
            ((hlz) h()).a(cVar);
        }
    }

    public final void b() {
        if (c()) {
            hlz hlz = (hlz) h();
            for (c b : this.g) {
                hlz.b(b);
            }
        }
        super.b();
    }

    public final void b(c cVar) {
        if (c()) {
            ((hlz) h()).b(cVar);
        }
        this.g.remove(cVar);
    }

    public final void f() {
        super.f();
        hlz hlz = (hlz) h();
        for (c a : this.g) {
            hlz.a(a);
        }
    }
}
