package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.web.RxWebToken;
import java.util.regex.Pattern;

/* renamed from: sxl reason: default package */
public final class sxl {
    private static final Pattern a = Pattern.compile("https://spotify.com/.*/wrapped");
    private static final Pattern b = Pattern.compile("https://www.spotify.com/.*/wrapped");
    private final kf c;
    private final jlj d;
    private final szg e;
    private final jln f;
    private final jlh g;
    private final mfo h;
    private final szc i;
    private final szf j;
    private final RxWebToken k;

    /* renamed from: sxl$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        static {
            try {
                a[LinkType.DUMMY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public sxl(kf kfVar, jlj jlj, jln jln, jlh jlh, szf szf, szg szg, szc szc, RxWebToken rxWebToken, mfo mfo) {
        this.c = kfVar;
        this.d = jlj;
        this.f = jln;
        this.g = jlh;
        this.j = szf;
        this.e = szg;
        this.i = szc;
        this.k = rxWebToken;
        this.h = mfo;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r23, defpackage.fqn r24, com.spotify.mobile.android.service.session.SessionState r25, boolean r26) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            r9 = r24
            r10 = r26
            java.lang.String r1 = r23.getDataString()
            jva r11 = defpackage.jva.a(r1)
            java.lang.String r1 = "title"
            java.lang.String r4 = r8.getStringExtra(r1)
            szf r1 = r0.j
            androidx.fragment.app.Fragment r1 = r1.a()
            uqm r12 = defpackage.uqo.a(r1)
            jlj r1 = r0.d
            r2 = r11
            r3 = r23
            r5 = r24
            r6 = r25
            r7 = r12
            jqx r1 = r1.a(r2, r3, r4, r5, r6, r7)
            jqx r2 = defpackage.jqx.c
            boolean r2 = defpackage.jvi.b(r1, r2)
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            jqx r2 = defpackage.jqx.d
            boolean r2 = defpackage.jvi.b(r1, r2)
            if (r2 != 0) goto L_0x0057
            szc r2 = r0.i
            szb r2 = r2.a(r8, r1)
            sza r3 = defpackage.sze.a(r23)
            syx r4 = defpackage.sze.b(r23)
            szg r5 = r0.e
            androidx.fragment.app.Fragment r1 = r1.ae()
            r5.a(r3, r1, r2, r4)
            return
        L_0x0057:
            jln r1 = r0.f
            int[] r2 = defpackage.jln.AnonymousClass1.a
            com.spotify.mobile.android.util.LinkType r3 = r11.b
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r2) {
                case 1: goto L_0x00a4;
                case 2: goto L_0x007f;
                case 3: goto L_0x0078;
                case 4: goto L_0x0071;
                case 5: goto L_0x006a;
                case 6: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x00cc
        L_0x006a:
            android.app.Activity r1 = r1.a
            android.content.Intent r1 = com.spotify.music.features.connect.picker.ui.DevicePickerActivity.a(r1, r9)
            goto L_0x00cd
        L_0x0071:
            android.app.Activity r1 = r1.a
            android.content.Intent r1 = com.spotify.music.features.tasteonboarding.TasteOnboardingActivity.a(r1, r9, r4)
            goto L_0x00cd
        L_0x0078:
            android.app.Activity r1 = r1.a
            android.content.Intent r1 = com.spotify.music.features.tasteonboarding.TasteOnboardingActivity.a(r1, r9, r5)
            goto L_0x00cd
        L_0x007f:
            fqk r2 = defpackage.plp.a
            boolean r2 = r9.b(r2)
            if (r2 == 0) goto L_0x008e
            android.app.Activity r1 = r1.a
            android.content.Intent r1 = com.spotify.podcastonboarding.PodcastOnboardingActivity.a(r1, r5)
            goto L_0x00cd
        L_0x008e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This user shouldn't get podcast onboarding. Check flag: "
            r1.<init>(r2)
            fqk r2 = defpackage.plp.a
            java.lang.String r2 = r2.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.spotify.mobile.android.util.Assertion.b(r1)
            goto L_0x00cc
        L_0x00a4:
            fqk r2 = defpackage.lcl.a
            boolean r2 = r9.b(r2)
            if (r2 == 0) goto L_0x00c7
            android.app.Activity r1 = r1.a
            com.spotify.mobile.android.util.LinkType r2 = com.spotify.mobile.android.util.LinkType.TASTE_ONBOARDING
            jwk r2 = defpackage.jwl.a(r2)
            java.lang.Object r2 = defpackage.fbp.a(r2)
            jwk r2 = (defpackage.jwk) r2
            java.util.List<java.lang.String> r2 = r2.a
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            android.content.Intent r1 = com.spotify.music.features.languagepicker.LanguageOnboardingActivity.a(r1, r2)
            goto L_0x00cd
        L_0x00c7:
            java.lang.String r1 = "This user shouldn't get language-aware onboarding"
            com.spotify.mobile.android.util.Assertion.b(r1)
        L_0x00cc:
            r1 = r3
        L_0x00cd:
            if (r1 == 0) goto L_0x00d5
            kf r2 = r0.c
            r2.startActivity(r1)
            return
        L_0x00d5:
            jlh r1 = r0.g
            gkm r20 = defpackage.gkm.a(r12)
            int[] r2 = defpackage.jlh.AnonymousClass1.a
            com.spotify.mobile.android.util.LinkType r6 = r11.b
            int r6 = r6.ordinal()
            r2 = r2[r6]
            switch(r2) {
                case 1: goto L_0x0160;
                case 2: goto L_0x013e;
                case 3: goto L_0x013e;
                case 4: goto L_0x013e;
                case 5: goto L_0x013e;
                case 6: goto L_0x013e;
                case 7: goto L_0x013e;
                case 8: goto L_0x0136;
                case 9: goto L_0x012b;
                case 10: goto L_0x0120;
                case 11: goto L_0x0115;
                case 12: goto L_0x0160;
                case 13: goto L_0x0160;
                case 14: goto L_0x0109;
                case 15: goto L_0x00eb;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r1 = 0
            goto L_0x0161
        L_0x00eb:
            iil r2 = r1.f
            kf r1 = r1.a
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r3 < r6) goto L_0x0160
            jxz r3 = r2.a
            java.lang.String r6 = "android.permission.RECORD_AUDIO"
            boolean r3 = r3.a(r1, r6)
            if (r3 != 0) goto L_0x0160
            jxz r2 = r2.a
            java.lang.String[] r3 = new java.lang.String[r4]
            r3[r5] = r6
            r2.a(r1, r3)
            goto L_0x0160
        L_0x0109:
            kf r1 = r1.a
            com.spotify.music.spotlets.voice.VoiceInteractionReferral r2 = com.spotify.music.spotlets.voice.VoiceInteractionReferral.SHOWCASE
            java.lang.String r2 = r2.name()
            defpackage.uxb.a(r1, r9, r2, r3)
            goto L_0x0160
        L_0x0115:
            jvf r1 = r1.c
            r2 = 2131954012(0x7f13095c, float:1.9544511E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r1.a(r2, r4, r3)
            goto L_0x0160
        L_0x0120:
            com.spotify.cosmos.android.RxResolver r1 = r1.b
            hzz r2 = new hzz
            r2.<init>(r1)
            r2.a(r11)
            goto L_0x0160
        L_0x012b:
            jvf r1 = r1.c
            r2 = 2131953931(0x7f13090b, float:1.9544347E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r1.a(r2, r4, r3)
            goto L_0x0160
        L_0x0136:
            mfo r2 = r1.e
            kf r1 = r1.a
            r2.a(r1)
            goto L_0x0160
        L_0x013e:
            java.lang.String r2 = r11.h()
            java.lang.String r2 = defpackage.ute.h(r2)
            ure r13 = r1.g
            java.lang.String[] r14 = new java.lang.String[r4]
            r14[r5] = r2
            sso r15 = com.spotify.music.libs.viewuri.ViewUris.c
            r16 = 0
            r17 = 1
            r18 = -1
            uqm r19 = defpackage.uqo.aI
            r21 = 0
            r13.a(r14, r15, r16, r17, r18, r19, r20, r21)
            tmu r1 = r1.d
            r1.a()
        L_0x0160:
            r1 = 1
        L_0x0161:
            if (r1 == 0) goto L_0x0164
            return
        L_0x0164:
            int[] r1 = defpackage.sxl.AnonymousClass1.a
            com.spotify.mobile.android.util.LinkType r2 = r11.b
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r4) goto L_0x0184
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r23.getDataString()
            r1[r5] = r2
            java.lang.String r2 = "B0rken url is '%s'"
            com.spotify.base.java.logging.Logger.e(r2, r1)
            java.lang.String r1 = "If you end up here, SpotifyLink is b0rken."
            com.spotify.mobile.android.util.Assertion.b(r1)
            goto L_0x021e
        L_0x0184:
            android.net.Uri r1 = r23.getData()
            if (r1 == 0) goto L_0x01e7
            java.lang.String r2 = r1.toString()
            java.lang.String r3 = "https://www.spotify.com/redirect/get-premium/"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x019f
            mfo r2 = r0.h
            kf r3 = r0.c
            r2.a(r3, r1)
            goto L_0x020f
        L_0x019f:
            java.lang.String r1 = "https://www.spotify.com/pair"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x01b1
            kf r1 = r0.c
            android.content.Intent r2 = com.spotify.music.features.pinpairing.PinPairingActivity.a(r1, r2)
            r1.startActivity(r2)
            goto L_0x020f
        L_0x01b1:
            java.lang.String r1 = "https://spotify.com/wrapped"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x01d9
            java.lang.String r1 = "https://www.spotify.com/wrapped"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x01d9
            java.util.regex.Pattern r1 = a
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x01d9
            java.util.regex.Pattern r1 = b
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x020f
        L_0x01d9:
            kf r1 = r0.c
            java.lang.String r2 = "spotify:genre:2019"
            kpo$a r2 = defpackage.kpo.a(r1, r2)
            android.content.Intent r2 = r2.a
            r1.startActivity(r2)
            goto L_0x020f
        L_0x01e7:
            kf r1 = r0.c
            android.content.res.Resources r1 = r1.getResources()
            android.net.Uri r2 = r23.getData()
            if (r2 == 0) goto L_0x0205
            java.lang.String r2 = r2.toString()
            r3 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r1 = r1.getString(r3)
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0205
            goto L_0x0206
        L_0x0205:
            r4 = 0
        L_0x0206:
            if (r4 == 0) goto L_0x020f
            kf r1 = r0.c
            com.spotify.music.libs.web.RxWebToken r2 = r0.k
            defpackage.iip.a(r1, r2)
        L_0x020f:
            if (r10 != 0) goto L_0x021e
            kf r1 = r0.c
            kpo$a r1 = defpackage.kpo.a(r1)
            android.content.Intent r1 = r1.a
            r2 = r25
            r0.a(r1, r9, r2, r10)
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxl.a(android.content.Intent, fqn, com.spotify.mobile.android.service.session.SessionState, boolean):void");
    }
}
