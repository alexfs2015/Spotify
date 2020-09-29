package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.Assertion;
import java.util.EnumSet;

/* renamed from: gxl reason: default package */
public final class gxl extends gxg<frb> {
    public final /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
        super.a(view, gzt, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, b bVar) {
        frb frb = (frb) fqe;
        String description = gzt.text().description();
        Assertion.a(description != null, "description not set");
        frb.a(gzt.custom().intValue("maxLines", Integer.MAX_VALUE));
        frb.a(description);
    }

    public gxl() {
        super(EnumSet.of(Trait.STACKABLE), frb.class);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        fqb.b();
        return frq.a(context, viewGroup, Integer.MAX_VALUE);
    }
}
