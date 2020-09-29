package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fsm;
import java.util.EnumSet;

/* renamed from: gzh reason: default package */
public abstract class gzh<H extends fsm> extends gyo<H> {

    /* renamed from: gzh$a */
    public static final class a extends gzh<fsm> {
        public a() {
            super(fsm.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.e().a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzh.super.a((fsm) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: gzh$b */
    public static final class b extends e {
        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.e().b(context, viewGroup);
        }
    }

    /* renamed from: gzh$c */
    public static final class c extends gzh<fsm> {
        public c() {
            super(fsm.class, 0);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.e().c(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzh.super.a((fsm) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: gzh$d */
    public static final class d extends e {
        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return fqv.e().d(context, viewGroup);
        }
    }

    /* renamed from: gzh$e */
    static abstract class e extends gzh<fsu> {
        public e() {
            super(fsu.class, 0);
        }

        /* access modifiers changed from: private */
        public void a(fsu fsu, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzh.super.a(fsu, hcm, gwm, bVar);
            fsu.b(hcm.text().description());
        }
    }

    private gzh(Class<H> cls) {
        super(EnumSet.of(Trait.HEADER), cls);
    }

    /* synthetic */ gzh(Class cls, byte b2) {
        this(cls);
    }

    /* access modifiers changed from: protected */
    public void a(H h, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        h.a((CharSequence) hcm.text().title());
        View b2 = h.b();
        boolean z = false;
        if (b2 != null) {
            if (hcm.target() != null) {
                z = true;
            }
            h.a(z);
            gwj.a(gwm, b2, hcm);
        } else {
            h.a(false);
        }
        hcm.text().accessory();
    }
}
