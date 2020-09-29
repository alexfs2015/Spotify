package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.Assertion;
import java.util.EnumSet;

/* renamed from: hab reason: default package */
public final class hab extends gzu<frv> {
    public hab() {
        super(EnumSet.of(Trait.STACKABLE), frv.class);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        fqv.b();
        return fsk.a(context, viewGroup, Integer.MAX_VALUE);
    }

    public final /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        super.a(view, hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, b bVar) {
        frv frv = (frv) fqy;
        String description = hcm.text().description();
        Assertion.a(description != null, "description not set");
        frv.a(hcm.custom().intValue("maxLines", Integer.MAX_VALUE));
        frv.a(description);
    }
}
