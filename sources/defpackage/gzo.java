package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.Assertion;
import defpackage.fsj;
import java.util.EnumSet;

/* renamed from: gzo reason: default package */
public abstract class gzo<T extends fsj> extends gzu<T> {
    private final jtz a;

    /* renamed from: gzo$a */
    public static class a extends gzo<fry> {
        public a(jtz jtz) {
            super(fry.class, jtz, 0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return gzo.super.a(context, viewGroup);
        }

        public final /* bridge */ /* synthetic */ EnumSet a() {
            return gzo.super.a();
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gzo.super.a(view, hcm, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzo.super.a((fry) fqy, hcm, gwm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fsj fsj, hcm hcm) {
            had.a((frx) (fry) fsj, hcm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fsj b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.b(context, viewGroup);
        }
    }

    /* renamed from: gzo$b */
    public static class b extends gzo<fsc> {
        public b(jtz jtz) {
            super(fsc.class, jtz, 0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return gzo.super.a(context, viewGroup);
        }

        public final /* bridge */ /* synthetic */ EnumSet a() {
            return gzo.super.a();
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gzo.super.a(view, hcm, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzo.super.a((fsc) fqy, hcm, gwm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fsj fsj, hcm hcm) {
            had.a((fsb) (fsc) fsj, hcm);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fsj b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.b(context, viewGroup, false);
        }
    }

    private gzo(Class<T> cls, jtz jtz) {
        super(EnumSet.of(Trait.STACKABLE), cls);
        this.a = jtz;
    }

    /* synthetic */ gzo(Class cls, jtz jtz, byte b2) {
        this(cls, jtz);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public final T a(Context context, ViewGroup viewGroup) {
        return b(context, viewGroup);
    }

    public /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
        super.a(view, hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        a((T) (fsj) fqy, hcm, gwm);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, hcm hcm);

    /* access modifiers changed from: protected */
    public final void a(T t, hcm hcm, gwm gwm) {
        hdl.a(t.getView());
        a(t, hcm);
        gwj.a(gwm, t.getView(), hcm);
        String str = "longClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm.c).a(str).a(hcm).a(t.getView()).b();
        }
        jtz jtz = this.a;
        String str2 = "calendar";
        Assertion.a(hcm.custom().bundle(str2) != null, "calendar data is missing!");
        jqv a2 = jqv.a(t.c(), jtz);
        hcj bundle = hcm.custom().bundle(str2);
        if (bundle != null) {
            a2.a(bundle.string("month", "APR"), bundle.intValue("dayOfMonth", 1));
        }
        had.a(t, hcm, gwm);
        t.a(hcm.custom().boolValue("active", false));
    }

    /* access modifiers changed from: protected */
    public abstract T b(Context context, ViewGroup viewGroup);
}
