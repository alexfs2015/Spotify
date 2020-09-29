package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.service.feature.FeatureService.c;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: hjd reason: default package */
public final class hjd extends hgc<hjh> {
    private final Collection<c> f = new CopyOnWriteArraySet();

    hjd(Context context, String str) {
        super(context, FeatureService.class, new $$Lambda$hjd$5Qo_YFj20u8z32LCcT1f8dEipY(context), str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hjh a(Context context, IBinder iBinder) {
        try {
            return FeatureService.this;
        } catch (ClassCastException e) {
            throw hjc.a(e, context, iBinder);
        }
    }

    public final void a(c cVar) {
        this.f.add(cVar);
        if (d()) {
            ((hjh) i()).a(cVar);
        }
    }

    public final void b(c cVar) {
        if (d()) {
            ((hjh) i()).b(cVar);
        }
        this.f.remove(cVar);
    }

    public final void g() {
        super.g();
        hjh hjh = (hjh) i();
        for (c a : this.f) {
            hjh.a(a);
        }
    }

    public final void b() {
        if (d()) {
            hjh hjh = (hjh) i();
            for (c b : this.f) {
                hjh.b(b);
            }
        }
        super.b();
    }
}
