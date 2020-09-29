package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.web.RxWebToken;
import java.util.regex.Pattern;

/* renamed from: sne reason: default package */
public final class sne {
    private static final Pattern a = Pattern.compile("https://www.spotify.com/.*/wrapped");
    private final ka b;
    private final jix c;
    private final soz d;
    private final jjb e;
    private final jiv f;
    private final mbl g;
    private final sov h;
    private final soy i;
    private final RxWebToken j;

    /* renamed from: sne$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        static {
            try {
                a[LinkType.DUMMY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public sne(ka kaVar, jix jix, jjb jjb, jiv jiv, soy soy, soz soz, sov sov, RxWebToken rxWebToken, mbl mbl) {
        this.b = kaVar;
        this.c = jix;
        this.e = jjb;
        this.f = jiv;
        this.i = soy;
        this.d = soz;
        this.h = sov;
        this.j = rxWebToken;
        this.g = mbl;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r23, defpackage.fpt r24, com.spotify.mobile.android.service.session.SessionState r25, boolean r26) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            r9 = r24
            r10 = r26
            java.lang.String r1 = r23.getDataString()
            jst r11 = defpackage.jst.a(r1)
            java.lang.String r1 = "title"
            java.lang.String r4 = r8.getStringExtra(r1)
            soy r1 = r0.i
            androidx.fragment.app.Fragment r1 = r1.a()
            udr r12 = defpackage.udt.a(r1)
            jix r1 = r0.c
            r2 = r11
            r3 = r23
            r5 = r24
            r6 = r25
            r7 = r12
            jol r1 = r1.a(r2, r3, r4, r5, r6, r7)
            jol r2 = defpackage.jol.c
            boolean r2 = defpackage.jtc.b(r1, r2)
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            jol r2 = defpackage.jol.d
            boolean r2 = defpackage.jtc.b(r1, r2)
            if (r2 != 0) goto L_0x0057
            sov r2 = r0.h
            sou r2 = r2.a(r8, r1)
            sot r3 = defpackage.sox.a(r23)
            soq r4 = defpackage.sox.b(r23)
            soz r5 = r0.d
            androidx.fragment.app.Fragment r1 = r1.ae()
            r5.a(r3, r1, r2, r4)
            return
        L_0x0057:
            jjb r1 = r0.e
            int[] r2 = defpackage.jjb.AnonymousClass1.a
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
            fpq r2 = defpackage.ped.a
            boolean r2 = r9.b(r2)
            if (r2 == 0) goto L_0x008e
            android.app.Activity r1 = r1.a
            android.content.Intent r1 = com.spotify.podcastonboarding.PodcastOnboardingActivity.a(r1, r5)
            goto L_0x00cd
        L_0x008e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This user shouldn't get podcast onboarding. Check flag: "
            r1.<init>(r2)
            fpq r2 = defpackage.ped.a
            java.lang.String r2 = r2.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.spotify.mobile.android.util.Assertion.b(r1)
            goto L_0x00cc
        L_0x00a4:
            fpq r2 = defpackage.kzc.a
            boolean r2 = r9.b(r2)
            if (r2 == 0) goto L_0x00c7
            android.app.Activity r1 = r1.a
            com.spotify.mobile.android.util.LinkType r2 = com.spotify.mobile.android.util.LinkType.TASTE_ONBOARDING
            juc r2 = defpackage.jud.a(r2)
            java.lang.Object r2 = defpackage.fay.a(r2)
            juc r2 = (defpackage.juc) r2
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
            ka r2 = r0.b
            r2.startActivity(r1)
            return
        L_0x00d5:
            jiv r1 = r0.f
            gjb r20 = defpackage.gjb.a(r12)
            int[] r2 = defpackage.jiv.AnonymousClass1.a
            com.spotify.mobile.android.util.LinkType r6 = r11.b
            int r6 = r6.ordinal()
            r2 = r2[r6]
            switch(r2) {
                case 1: goto L_0x0167;
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
                case 12: goto L_0x0167;
                case 13: goto L_0x0167;
                case 14: goto L_0x0109;
                case 15: goto L_0x00eb;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r1 = 0
            goto L_0x0168
        L_0x00eb:
            ify r2 = r1.f
            ka r1 = r1.a
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r3 < r6) goto L_0x0167
            jvr r3 = r2.a
            java.lang.String r6 = "android.permission.RECORD_AUDIO"
            boolean r3 = r3.a(r1, r6)
            if (r3 != 0) goto L_0x0167
            jvr r2 = r2.a
            java.lang.String[] r3 = new java.lang.String[r4]
            r3[r5] = r6
            r2.a(r1, r3)
            goto L_0x0167
        L_0x0109:
            ka r1 = r1.a
            com.spotify.music.spotlets.voice.VoiceInteractionReferral r2 = com.spotify.music.spotlets.voice.VoiceInteractionReferral.SHOWCASE
            java.lang.String r2 = r2.name()
            defpackage.ulx.a(r1, r9, r2, r3)
            goto L_0x0167
        L_0x0115:
            jsz r1 = r1.c
            r2 = 2131954000(0x7f130950, float:1.9544487E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r1.a(r2, r4, r3)
            goto L_0x0167
        L_0x0120:
            com.spotify.cosmos.android.RxResolver r1 = r1.b
            hxn r2 = new hxn
            r2.<init>(r1)
            r2.a(r11)
            goto L_0x0167
        L_0x012b:
            jsz r1 = r1.c
            r2 = 2131953919(0x7f1308ff, float:1.9544323E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r1.a(r2, r4, r3)
            goto L_0x0167
        L_0x0136:
            mbl r2 = r1.e
            ka r1 = r1.a
            r2.a(r1)
            goto L_0x0167
        L_0x013e:
            java.lang.String r2 = r11.h()
            java.lang.String r2 = defpackage.uhq.i(r2)
            java.lang.Class<ufq> r3 = defpackage.ufq.class
            java.lang.Object r3 = defpackage.ggw.a(r3)
            r13 = r3
            ufq r13 = (defpackage.ufq) r13
            java.lang.String[] r14 = new java.lang.String[r4]
            r14[r5] = r2
            sih r15 = com.spotify.music.libs.viewuri.ViewUris.d
            r16 = 0
            r17 = 1
            r18 = -1
            udr r19 = defpackage.udt.aI
            r21 = 0
            r13.a(r14, r15, r16, r17, r18, r19, r20, r21)
            tcn r1 = r1.d
            r1.a()
        L_0x0167:
            r1 = 1
        L_0x0168:
            if (r1 == 0) goto L_0x016b
            return
        L_0x016b:
            int[] r1 = defpackage.sne.AnonymousClass1.a
            com.spotify.mobile.android.util.LinkType r2 = r11.b
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r4) goto L_0x018b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r23.getDataString()
            r1[r5] = r2
            java.lang.String r2 = "B0rken url is '%s'"
            com.spotify.base.java.logging.Logger.e(r2, r1)
            java.lang.String r1 = "If you end up here, SpotifyLink is b0rken."
            com.spotify.mobile.android.util.Assertion.b(r1)
            goto L_0x0214
        L_0x018b:
            android.net.Uri r1 = r23.getData()
            if (r1 == 0) goto L_0x01dd
            java.lang.String r2 = r1.toString()
            java.lang.String r3 = "https://www.spotify.com/redirect/get-premium/"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x01a5
            mbl r2 = r0.g
            ka r3 = r0.b
            r2.a(r3, r1)
            goto L_0x0205
        L_0x01a5:
            java.lang.String r1 = "https://www.spotify.com/pair"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x01b7
            ka r1 = r0.b
            android.content.Intent r2 = com.spotify.music.features.pinpairing.PinPairingActivity.a(r1, r2)
            r1.startActivity(r2)
            goto L_0x0205
        L_0x01b7:
            java.lang.String r1 = "https://www.spotify.com/wrapped"
            boolean r1 = r2.startsWith(r1)
            if (r1 != 0) goto L_0x01cb
            java.util.regex.Pattern r1 = a
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x0205
        L_0x01cb:
            ka r1 = r0.b
            sih r2 = com.spotify.music.libs.viewuri.ViewUris.a
            java.lang.String r2 = r2.toString()
            kmf$a r2 = defpackage.kmf.a(r1, r2)
            android.content.Intent r2 = r2.a
            r1.startActivity(r2)
            goto L_0x0205
        L_0x01dd:
            ka r1 = r0.b
            android.content.res.Resources r1 = r1.getResources()
            android.net.Uri r2 = r23.getData()
            if (r2 == 0) goto L_0x01fb
            java.lang.String r2 = r2.toString()
            r3 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r1 = r1.getString(r3)
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x01fb
            goto L_0x01fc
        L_0x01fb:
            r4 = 0
        L_0x01fc:
            if (r4 == 0) goto L_0x0205
            ka r1 = r0.b
            com.spotify.music.libs.web.RxWebToken r2 = r0.j
            defpackage.igc.a(r1, r2)
        L_0x0205:
            if (r10 != 0) goto L_0x0214
            ka r1 = r0.b
            kmf$a r1 = defpackage.kmf.a(r1)
            android.content.Intent r1 = r1.a
            r2 = r25
            r0.a(r1, r9, r2, r10)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sne.a(android.content.Intent, fpt, com.spotify.mobile.android.service.session.SessionState, boolean):void");
    }
}
