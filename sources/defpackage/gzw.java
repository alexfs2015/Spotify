package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fvh;
import java.util.EnumSet;

/* renamed from: gzw reason: default package */
public abstract class gzw<C extends fvh> extends gzu<C> {

    /* renamed from: gzw$a */
    public static final class a extends gzw<fvi> {
        public a() {
            super(fvi.class);
        }

        /* access modifiers changed from: private */
        public void a(fvi fvi, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzw.super.a(fvi, hcm, gwm, bVar);
            fvi.c((CharSequence) hcm.custom().string("buttonTitle"));
            gwj.a(gwm, (View) fvi.V_(), hcm);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fvm.b(context, viewGroup);
        }
    }

    /* renamed from: gzw$b */
    public static final class b extends gzw<fvk> {
        public b() {
            super(fvk.class);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fvm.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzw.super.a((fvk) fqy, hcm, gwm, bVar);
        }
    }

    gzw(Class<C> cls) {
        super(EnumSet.noneOf(Trait.class), cls);
    }

    /* access modifiers changed from: protected */
    public void a(C c, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        c.a((CharSequence) hcm.text().title());
        c.b((CharSequence) hcm.text().subtitle());
    }
}
