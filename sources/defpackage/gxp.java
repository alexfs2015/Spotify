package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.frs;
import java.util.EnumSet;

@Deprecated
/* renamed from: gxp reason: default package */
public abstract class gxp<H extends frs> extends gxg<H> {

    /* renamed from: gxp$a */
    public static final class a extends gxp<frs> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxp.super.a((frs) fqe, gzt, gum, bVar);
        }

        public a() {
            super(frs.class);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            fqb.e();
            return defpackage.fsc.a.d(context, viewGroup);
        }
    }

    /* renamed from: gxp$b */
    public static final class b extends gxp<frs> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxp.super.a((frs) fqe, gzt, gum, bVar);
        }

        public b() {
            super(frs.class);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            fqb.e();
            return defpackage.fsc.a.e(context, viewGroup);
        }
    }

    /* renamed from: gxp$c */
    public static final class c extends gxp<frs> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxp.super.a((frs) fqe, gzt, gum, bVar);
        }

        public c() {
            super(frs.class);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            fqb.e();
            return defpackage.fsc.a.a(context, viewGroup);
        }
    }

    /* renamed from: gxp$d */
    public static final class d extends gxp<fsa> {
        public d() {
            super(fsa.class);
        }

        /* access modifiers changed from: private */
        public void a(fsa fsa, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxp.super.a(fsa, gzt, gum, bVar);
            fsa.b(gzt.text().description());
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            fqb.e();
            return defpackage.fsc.a.b(context, viewGroup);
        }
    }

    /* renamed from: gxp$e */
    public static final class e extends gxp<fry> {
        public e() {
            super(fry.class);
        }

        /* access modifiers changed from: private */
        public void a(fry fry, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gxp.super.a(fry, gzt, gum, bVar);
            fry.b(gzt.text().subtitle());
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            fqb.e();
            return defpackage.fsc.a.c(context, viewGroup);
        }
    }

    gxp(Class<H> cls) {
        super(EnumSet.of(Trait.HEADER), cls);
    }

    /* access modifiers changed from: protected */
    public void a(H h, gzt gzt, gum gum, defpackage.gui.b bVar) {
        h.a((CharSequence) gzt.text().title());
    }
}
