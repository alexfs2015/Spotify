package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.cosmos.router.Response;
import com.spotify.music.R;

/* renamed from: jzo reason: default package */
public final class jzo {
    public final kal a;
    private final jvf b;
    private final uiu c;

    public jzo(jvf jvf, uiu uiu, kal kal) {
        this.b = jvf;
        this.c = uiu;
        this.a = kal;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x000a
            r2 = 2131954056(0x7f130988, float:1.95446E38)
            return r2
        L_0x000a:
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case 3184: goto L_0x00dc;
                case 3201: goto L_0x00d2;
                case 3239: goto L_0x00c8;
                case 3241: goto L_0x00be;
                case 3246: goto L_0x00b3;
                case 3267: goto L_0x00a9;
                case 3276: goto L_0x009f;
                case 3341: goto L_0x0094;
                case 3355: goto L_0x0089;
                case 3371: goto L_0x007e;
                case 3383: goto L_0x0072;
                case 3494: goto L_0x0066;
                case 3518: goto L_0x005b;
                case 3580: goto L_0x004f;
                case 3588: goto L_0x0043;
                case 3683: goto L_0x0037;
                case 3710: goto L_0x002b;
                case 3763: goto L_0x001f;
                case 3886: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x00e6
        L_0x0014:
            java.lang.String r0 = "zh"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 0
            goto L_0x00e7
        L_0x001f:
            java.lang.String r0 = "vi"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 18
            goto L_0x00e7
        L_0x002b:
            java.lang.String r0 = "tr"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 17
            goto L_0x00e7
        L_0x0037:
            java.lang.String r0 = "sv"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 16
            goto L_0x00e7
        L_0x0043:
            java.lang.String r0 = "pt"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 14
            goto L_0x00e7
        L_0x004f:
            java.lang.String r0 = "pl"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 13
            goto L_0x00e7
        L_0x005b:
            java.lang.String r0 = "nl"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 2
            goto L_0x00e7
        L_0x0066:
            java.lang.String r0 = "ms"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 12
            goto L_0x00e7
        L_0x0072:
            java.lang.String r0 = "ja"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 11
            goto L_0x00e7
        L_0x007e:
            java.lang.String r0 = "it"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 10
            goto L_0x00e7
        L_0x0089:
            java.lang.String r0 = "id"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 9
            goto L_0x00e7
        L_0x0094:
            java.lang.String r0 = "hu"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 8
            goto L_0x00e7
        L_0x009f:
            java.lang.String r0 = "fr"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 5
            goto L_0x00e7
        L_0x00a9:
            java.lang.String r0 = "fi"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 4
            goto L_0x00e7
        L_0x00b3:
            java.lang.String r0 = "es"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 15
            goto L_0x00e7
        L_0x00be:
            java.lang.String r0 = "en"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 3
            goto L_0x00e7
        L_0x00c8:
            java.lang.String r0 = "el"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 7
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r0 = "de"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 6
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r0 = "cs"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e6
            r2 = 1
            goto L_0x00e7
        L_0x00e6:
            r2 = -1
        L_0x00e7:
            switch(r2) {
                case 0: goto L_0x0133;
                case 1: goto L_0x012f;
                case 2: goto L_0x012b;
                case 3: goto L_0x0127;
                case 4: goto L_0x0123;
                case 5: goto L_0x011f;
                case 6: goto L_0x011b;
                case 7: goto L_0x0117;
                case 8: goto L_0x0113;
                case 9: goto L_0x010f;
                case 10: goto L_0x010b;
                case 11: goto L_0x0107;
                case 12: goto L_0x0103;
                case 13: goto L_0x00ff;
                case 14: goto L_0x00fb;
                case 15: goto L_0x00f7;
                case 16: goto L_0x00f3;
                case 17: goto L_0x00ef;
                case 18: goto L_0x00eb;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            return r1
        L_0x00eb:
            r2 = 2131954054(0x7f130986, float:1.9544596E38)
            return r2
        L_0x00ef:
            r2 = 2131954053(0x7f130985, float:1.9544594E38)
            return r2
        L_0x00f3:
            r2 = 2131954052(0x7f130984, float:1.9544592E38)
            return r2
        L_0x00f7:
            r2 = 2131954051(0x7f130983, float:1.954459E38)
            return r2
        L_0x00fb:
            r2 = 2131954050(0x7f130982, float:1.9544588E38)
            return r2
        L_0x00ff:
            r2 = 2131954049(0x7f130981, float:1.9544586E38)
            return r2
        L_0x0103:
            r2 = 2131954048(0x7f130980, float:1.9544584E38)
            return r2
        L_0x0107:
            r2 = 2131954047(0x7f13097f, float:1.9544582E38)
            return r2
        L_0x010b:
            r2 = 2131954046(0x7f13097e, float:1.954458E38)
            return r2
        L_0x010f:
            r2 = 2131954045(0x7f13097d, float:1.9544578E38)
            return r2
        L_0x0113:
            r2 = 2131954044(0x7f13097c, float:1.9544576E38)
            return r2
        L_0x0117:
            r2 = 2131954043(0x7f13097b, float:1.9544574E38)
            return r2
        L_0x011b:
            r2 = 2131954042(0x7f13097a, float:1.9544572E38)
            return r2
        L_0x011f:
            r2 = 2131954041(0x7f130979, float:1.954457E38)
            return r2
        L_0x0123:
            r2 = 2131954040(0x7f130978, float:1.9544568E38)
            return r2
        L_0x0127:
            r2 = 2131954039(0x7f130977, float:1.9544566E38)
            return r2
        L_0x012b:
            r2 = 2131954038(0x7f130976, float:1.9544564E38)
            return r2
        L_0x012f:
            r2 = 2131954037(0x7f130975, float:1.9544562E38)
            return r2
        L_0x0133:
            r2 = 2131954036(0x7f130974, float:1.954456E38)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzo.a(java.lang.String):int");
    }

    public static String a(Context context, kai kai) {
        int a2 = a(kai.b());
        if (a2 == -1) {
            return kai.b;
        }
        if (!kai.c) {
            return context.getString(a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(a2));
        sb.append(" [CC]");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, kai kai, Response response) {
        if (response.getStatus() == 200) {
            this.b.a(SpotifyIconV2.CHECK, a(context, kai), R.id.video_subtitle_confirmation_popup, 0);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }
}
