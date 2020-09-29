package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.frs;
import java.util.EnumSet;

/* renamed from: gwx reason: default package */
public abstract class gwx<H extends frs> extends gwm<H> {

    /* renamed from: gwx$a */
    public static final class a extends gwx<frs> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwx.super.a((frs) fqe, gzt, gum, bVar);
        }

        public a() {
            super(frs.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.e().a(context, viewGroup);
        }
    }

    /* renamed from: gwx$b */
    public static final class b extends e {
        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.e().b(context, viewGroup);
        }
    }

    /* renamed from: gwx$c */
    public static final class c extends gwx<frs> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwx.super.a((frs) fqe, gzt, gum, bVar);
        }

        public c() {
            super(frs.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.e().c(context, viewGroup);
        }
    }

    /* renamed from: gwx$d */
    public static final class d extends e {
        /* access modifiers changed from: protected */
        public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return fqb.e().d(context, viewGroup);
        }
    }

    /* renamed from: gwx$e */
    static abstract class e extends gwx<fsa> {
        public e() {
            super(fsa.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(fsa fsa, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwx.super.a(fsa, gzt, gum, bVar);
            fsa.b(gzt.text().description());
        }
    }

    /* synthetic */ gwx(Class cls, byte b2) {
        this(cls);
    }

    private gwx(Class<H> cls) {
        super(EnumSet.of(Trait.HEADER), cls);
    }

    /* access modifiers changed from: protected */
    public void a(H h, gzt gzt, gum gum, defpackage.gui.b bVar) {
        h.a((CharSequence) gzt.text().title());
        View b2 = h.b();
        boolean z = false;
        if (b2 != null) {
            if (gzt.target() != null) {
                z = true;
            }
            h.a(z);
            guj.a(gum, b2, gzt);
        } else {
            h.a(false);
        }
        gzt.text().accessory();
    }
}
