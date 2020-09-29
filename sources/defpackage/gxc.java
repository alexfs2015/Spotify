package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.Assertion;
import defpackage.frp;
import java.util.EnumSet;

/* renamed from: gxc reason: default package */
public abstract class gxc<T extends frp> extends gxg<T> {
    private final jrp a;

    /* renamed from: gxc$a */
    public static class a extends gxc<fre> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return gxc.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxc.super.a((fre) fqe, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(frp frp, gzt gzt) {
            gxm.a((frd) (fre) frp, gzt);
        }

        public a() {
            super(fre.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ frp b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.b(context, viewGroup);
        }
    }

    /* renamed from: gxc$b */
    public static class b extends gxc<fri> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return gxc.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxc.super.a((fri) fqe, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(frp frp, gzt gzt) {
            gxm.a((frh) (fri) frp, gzt);
        }

        public b() {
            super(fri.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ frp b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.b(context, viewGroup, false);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, gzt gzt);

    /* access modifiers changed from: protected */
    public abstract T b(Context context, ViewGroup viewGroup);

    /* synthetic */ gxc(Class cls, byte b2) {
        this(cls);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
        a((T) (frp) fqe, gzt, gum);
    }

    private gxc(Class<T> cls) {
        super(EnumSet.of(Trait.STACKABLE), cls);
        this.a = jrf.a;
    }

    /* access modifiers changed from: protected */
    public final void a(T t, gzt gzt, gum gum) {
        has.a(t.getView());
        a(t, gzt);
        guj.a(gum, t.getView(), gzt);
        String str = "longClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum.c).a(str).a(gzt).a(t.getView()).b();
        }
        jrp jrp = this.a;
        String str2 = "calendar";
        Assertion.a(gzt.custom().bundle(str2) != null, "calendar data is missing!");
        joj a2 = joj.a(t.c(), jrp);
        gzq bundle = gzt.custom().bundle(str2);
        if (bundle != null) {
            a2.a(bundle.string("month", "APR"), bundle.intValue("dayOfMonth", 1));
        }
        gxm.a(t, gzt, gum);
        t.a(gzt.custom().boolValue("active", false));
    }

    /* access modifiers changed from: protected */
    public final T a(Context context, ViewGroup viewGroup) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        return b(context, viewGroup);
    }
}
