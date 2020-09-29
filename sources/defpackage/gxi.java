package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fun;
import java.util.EnumSet;

/* renamed from: gxi reason: default package */
public abstract class gxi<C extends fun> extends gxg<C> {

    /* renamed from: gxi$a */
    public static final class a extends gxi<fuo> {
        public a() {
            super(fuo.class);
        }

        /* access modifiers changed from: private */
        public void a(fuo fuo, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxi.super.a(fuo, gzt, gum, bVar);
            fuo.c((CharSequence) gzt.custom().string("buttonTitle"));
            guj.a(gum, (View) fuo.V_(), gzt);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fus.b(context, viewGroup);
        }
    }

    /* renamed from: gxi$b */
    public static final class b extends gxi<fuq> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxi.super.a((fuq) fqe, gzt, gum, bVar);
        }

        public b() {
            super(fuq.class);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fus.a(context, viewGroup);
        }
    }

    gxi(Class<C> cls) {
        super(EnumSet.noneOf(Trait.class), cls);
    }

    /* access modifiers changed from: protected */
    public void a(C c, gzt gzt, gum gum, defpackage.gui.b bVar) {
        c.a((CharSequence) gzt.text().title());
        c.b((CharSequence) gzt.text().subtitle());
    }
}
