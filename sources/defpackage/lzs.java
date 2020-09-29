package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import java.util.EnumSet;

/* renamed from: lzs reason: default package */
public final class lzs implements gxl<View> {

    /* renamed from: lzs$a */
    public static class a {
        public String a;
        public String b;

        public final hcm a() {
            return hcx.builder().a("find:inlineEmptyState", HubsComponentCategory.CARD.mId).a(hcy.builder().a(this.a).b(this.b)).a();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hcm hcm, gwz gwz, View view) {
        for (hci name : hcm.events().values()) {
            gwz.a(gwy.a(name.name(), hcm));
        }
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        lzr lzr = new lzr(viewGroup);
        fqz.a(lzr);
        return lzr.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r2, defpackage.hcm r3, defpackage.gwm r4, defpackage.gwi.b r5) {
        /*
            r1 = this;
            java.lang.Class<lzq> r5 = defpackage.lzq.class
            fqy r2 = defpackage.fqz.a(r2, r5)
            lzq r2 = (defpackage.lzq) r2
            hco r5 = r3.text()
            java.lang.String r5 = r5.title()
            r2.a(r5)
            hco r5 = r3.text()
            java.lang.String r5 = r5.subtitle()
            r2.b(r5)
            java.util.List r5 = r3.children()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0050
            java.util.List r3 = r3.children()
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            hcm r3 = (defpackage.hcm) r3
            hco r5 = r3.text()
            java.lang.String r5 = r5.title()
            java.util.Map r0 = r3.events()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0050
            boolean r5 = defpackage.fbo.a(r5)
            if (r5 != 0) goto L_0x0050
            com.google.common.base.Optional r3 = com.google.common.base.Optional.b(r3)
            goto L_0x0054
        L_0x0050:
            com.google.common.base.Optional r3 = com.google.common.base.Optional.e()
        L_0x0054:
            boolean r5 = r3.b()
            if (r5 == 0) goto L_0x007a
            gwz r4 = r4.c
            java.lang.Object r3 = r3.c()
            hcm r3 = (defpackage.hcm) r3
            hco r5 = r3.text()
            java.lang.String r5 = r5.title()
            r2.c(r5)
            android.view.View r2 = r2.b()
            -$$Lambda$lzs$Uy6uEdajPHh0yMHzpffNpRTawGk r5 = new -$$Lambda$lzs$Uy6uEdajPHh0yMHzpffNpRTawGk
            r5.<init>(r3, r4)
            r2.setOnClickListener(r5)
            return
        L_0x007a:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzs.a(android.view.View, hcm, gwm, gwi$b):void");
    }
}
