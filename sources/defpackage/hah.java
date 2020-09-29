package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import defpackage.fsm;
import java.util.EnumSet;

@Deprecated
/* renamed from: hah reason: default package */
public abstract class hah<H extends fsm> extends gzu<H> {

    /* renamed from: hah$a */
    public static final class a extends hah<fsm> {
        public a() {
            super(fsm.class);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            fqv.e();
            return defpackage.fsw.a.d(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            hah.super.a((fsm) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: hah$b */
    public static final class b extends hah<fsm> {
        public b() {
            super(fsm.class);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            fqv.e();
            return defpackage.fsw.a.e(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            hah.super.a((fsm) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: hah$c */
    public static final class c extends hah<fsm> {
        public c() {
            super(fsm.class);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            fqv.e();
            return defpackage.fsw.a.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            hah.super.a((fsm) fqy, hcm, gwm, bVar);
        }
    }

    /* renamed from: hah$d */
    public static final class d extends hah<fsu> {
        public d() {
            super(fsu.class);
        }

        /* access modifiers changed from: private */
        public void a(fsu fsu, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            hah.super.a(fsu, hcm, gwm, bVar);
            fsu.b(hcm.text().description());
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            fqv.e();
            return defpackage.fsw.a.b(context, viewGroup);
        }
    }

    /* renamed from: hah$e */
    public static final class e extends hah<fss> {
        public e() {
            super(fss.class);
        }

        /* access modifiers changed from: private */
        public void a(fss fss, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            hah.super.a(fss, hcm, gwm, bVar);
            fss.b(hcm.text().subtitle());
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            fqv.e();
            return defpackage.fsw.a.c(context, viewGroup);
        }
    }

    hah(Class<H> cls) {
        super(EnumSet.of(Trait.HEADER), cls);
    }

    /* access modifiers changed from: protected */
    public void a(H h, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        h.a((CharSequence) hcm.text().title());
    }
}
