package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rre reason: default package */
public final class rre implements rnx<GlueHeaderViewV2> {
    private final wzi<fyh> a;

    public rre(wzi<fyh> wzi) {
        this.a = (wzi) fbp.a(wzi);
    }

    private static Drawable a(Context context, hcj hcj) {
        int i;
        try {
            i = Color.parseColor(hcj.string("color", "#535353"));
        } catch (IllegalArgumentException e) {
            int b = gb.b(context.getResources(), R.color.gray_30, null);
            Logger.e(e, "Not supported color", new Object[0]);
            i = b;
        }
        return fwz.a(context, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f) {
        ((fyh) this.a.get()).b(1.0f - f);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context);
        glueHeaderViewV2.setLayoutParams(gas.b(context, viewGroup));
        glueHeaderViewV2.a(gau.a(context.getResources()) + (vgl.c(context, R.attr.actionBarSize) / 2) + context.getResources().getDimensionPixelSize(R.dimen.header_content_top_margin));
        glueHeaderViewV2.a((fvu) new $$Lambda$rre$0_TPWTD2vmQYWbedtQCQJShrDE(this));
        return glueHeaderViewV2;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(android.view.View r7, defpackage.hcm r8, defpackage.gwm r9, defpackage.gwi.b r10) {
        /*
            r6 = this;
            com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2 r7 = (com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2) r7
            java.util.List r0 = r8.children()
            int r1 = r0.size()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x002c
            java.lang.Object r0 = r0.get(r3)
            hcm r0 = (defpackage.hcm) r0
            gwl r1 = r9.h
            int r1 = r1.resolve(r0)
            gxh r9 = defpackage.gxh.a(r1, r7, r9)
            r9.a(r3, r0, r10)
            rrg r10 = new rrg
            V r9 = r9.b
            r10.<init>(r9)
            r7.a(r10)
            goto L_0x0033
        L_0x002c:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r10 = "Only one child is supported in freetier:solarHeader component."
            com.spotify.base.java.logging.Logger.e(r10, r9)
        L_0x0033:
            android.content.Context r9 = r7.getContext()
            hcj r8 = r8.custom()
            if (r8 == 0) goto L_0x0096
            java.lang.String r10 = "gradient"
            hcj r8 = r8.bundle(r10)
            if (r8 == 0) goto L_0x0096
            java.lang.String r10 = "aquatic"
            java.lang.String r0 = "style"
            java.lang.String r0 = r8.string(r0, r10)
            r1 = -1
            int r4 = r0.hashCode()
            r5 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r4 == r5) goto L_0x0074
            r3 = -932786325(0xffffffffc866cf6b, float:-236349.67)
            if (r4 == r3) goto L_0x006a
            r3 = -760305582(0xffffffffd2aea852, float:-3.75074128E11)
            if (r4 == r3) goto L_0x0062
            goto L_0x007e
        L_0x0062:
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x007e
            r10 = 2
            goto L_0x007f
        L_0x006a:
            java.lang.String r10 = "purpleLake"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x007e
            r10 = 1
            goto L_0x007f
        L_0x0074:
            java.lang.String r10 = "linear"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x007e
            r10 = 0
            goto L_0x007f
        L_0x007e:
            r10 = -1
        L_0x007f:
            if (r10 == 0) goto L_0x0091
            if (r10 == r2) goto L_0x008a
            com.spotify.android.glue.gradients.GlueGradients$Style r8 = com.spotify.android.glue.gradients.GlueGradients.Style.AQUATIC
            fxa r8 = defpackage.fwz.a(r9, r8)
            goto L_0x009c
        L_0x008a:
            com.spotify.android.glue.gradients.GlueGradients$Style r8 = com.spotify.android.glue.gradients.GlueGradients.Style.PURPLE_LAKE
            fxa r8 = defpackage.fwz.a(r9, r8)
            goto L_0x009c
        L_0x0091:
            android.graphics.drawable.Drawable r8 = a(r9, r8)
            goto L_0x009c
        L_0x0096:
            com.spotify.android.glue.gradients.GlueGradients$Style r8 = com.spotify.android.glue.gradients.GlueGradients.Style.AQUATIC
            fxa r8 = defpackage.fwz.a(r9, r8)
        L_0x009c:
            defpackage.ip.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rre.a(android.view.View, hcm, gwm, gwi$b):void");
    }

    public final int b() {
        return R.id.free_tier_solar_header;
    }
}
