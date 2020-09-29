package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.pushnotifications.model.PushkaMetadata;
import com.spotify.pushnotifications.model.QuickAction;
import com.spotify.pushnotifications.model.QuickActions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: vcl reason: default package */
public final class vcl implements vct {
    private final Context a;
    private final NotificationManager b;
    private final jro c;
    private final vcs d;
    private final vcu e;
    private final jrp f;
    private final ObjectMapper g;

    public vcl(Context context, NotificationManager notificationManager, jro jro, vcs vcs, vcu vcu, jrp jrp, ObjectMapper objectMapper) {
        this.a = context;
        this.b = notificationManager;
        this.c = jro;
        this.d = vcs;
        this.e = vcu;
        this.f = jrp;
        this.g = objectMapper;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            java.lang.String r1 = "sales"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            r9 = 0
            if (r1 == 0) goto L_0x0027
            jro r1 = r8.c
            boolean r1 = r1.g()
            if (r1 != 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = "Don't show notification since it's marked as sales and we're not allowed to show those on this device."
            com.spotify.base.java.logging.Logger.d(r1, r0)
            return
        L_0x0027:
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r9] = r0
            java.lang.String r2 = "Received Push Notification: %s"
            com.spotify.base.java.logging.Logger.b(r2, r1)
            java.lang.String r1 = "title"
            java.lang.Object r1 = r0.get(r1)
            java.lang.Object r1 = defpackage.fay.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "message"
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = defpackage.fay.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "uri"
            java.lang.Object r3 = r0.get(r3)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r3 = "metadata"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "quickActions"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = r8.c(r0)
            android.content.Context r4 = r8.a
            r12 = 2131952333(0x7f1302cd, float:1.9541106E38)
            java.lang.String r6 = r4.getString(r12)
            com.spotify.pushnotifications.model.PushkaMetadata r3 = r8.b(r3)
            if (r3 == 0) goto L_0x0080
            java.lang.String r5 = r3.getMessageId()
            java.lang.String r3 = r3.getCampaignId()
            r7 = r5
            r5 = r3
            goto L_0x0082
        L_0x0080:
            r5 = 0
            r7 = 0
        L_0x0082:
            int r3 = a(r7)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x008f:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0120
            java.lang.Object r13 = r0.next()
            r19 = r13
            com.spotify.pushnotifications.model.QuickAction r19 = (com.spotify.pushnotifications.model.QuickAction) r19
            java.lang.String r13 = r19.actionIdentifier()
            int r4 = r13.hashCode()
            r9 = -2077709277(0xffffffff8428ac23, float:-1.9827346E-36)
            r14 = 2
            if (r4 == r9) goto L_0x00ca
            r9 = 84303(0x1494f, float:1.18134E-40)
            if (r4 == r9) goto L_0x00c0
            r9 = 924509413(0x371ae4e5, float:9.232409E-6)
            if (r4 == r9) goto L_0x00b6
            goto L_0x00d4
        L_0x00b6:
            java.lang.String r4 = "SAVE_ENTITY"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00d4
            r4 = 0
            goto L_0x00d5
        L_0x00c0:
            java.lang.String r4 = "URL"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00d4
            r4 = 1
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r4 = "SETTINGS"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00d4
            r4 = 2
            goto L_0x00d5
        L_0x00d4:
            r4 = -1
        L_0x00d5:
            if (r4 == 0) goto L_0x00f9
            if (r4 == r10) goto L_0x00e6
            if (r4 == r14) goto L_0x00de
            r9 = r15
            r4 = 0
            goto L_0x0104
        L_0x00de:
            vcs r4 = r8.d
            android.app.PendingIntent r4 = r4.a(r3, r7, r5)
            r9 = r15
            goto L_0x0104
        L_0x00e6:
            vcs r13 = r8.d
            r4 = 1
            java.lang.String r16 = r19.actionData()
            r14 = r3
            r9 = r15
            r15 = r4
            r17 = r7
            r18 = r5
            android.app.PendingIntent r4 = r13.a(r14, r15, r16, r17, r18)
            goto L_0x0104
        L_0x00f9:
            r9 = r15
            vcs r4 = r8.d
            java.lang.String r13 = r19.actionData()
            android.app.PendingIntent r4 = r4.a(r3, r13, r7, r5)
        L_0x0104:
            if (r4 == 0) goto L_0x011c
            fi$a$a r13 = new fi$a$a
            vcs r14 = r8.d
            int r14 = r14.a()
            java.lang.String r15 = r19.actionTitle()
            r13.<init>(r14, r15, r4)
            fi$a r4 = r13.a()
            r9.add(r4)
        L_0x011c:
            r15 = r9
            r9 = 0
            goto L_0x008f
        L_0x0120:
            r9 = r15
            r0 = r21
            r3 = r11
            r4 = r7
            r13 = r5
            r14 = r7
            r7 = r9
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r0 = r8.a
            fl r0 = defpackage.fl.a(r0)
            boolean r9 = r0.a()
            boolean r0 = a()
            if (r0 == 0) goto L_0x015a
            android.app.NotificationManager r0 = r8.b
            android.content.Context r1 = r8.a
            java.lang.String r1 = r1.getString(r12)
            android.app.NotificationChannel r0 = r0.getNotificationChannel(r1)
            int r0 = r0.getImportance()
            if (r0 == 0) goto L_0x014f
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            if (r0 == 0) goto L_0x0157
            if (r9 == 0) goto L_0x0157
            r20 = 1
            goto L_0x015c
        L_0x0157:
            r20 = 0
            goto L_0x015c
        L_0x015a:
            r20 = r9
        L_0x015c:
            if (r20 == 0) goto L_0x016b
            vcu r0 = r8.e
            r0.a(r14, r13, r11)
            vcu r0 = r8.e
            java.lang.String r1 = "received"
            r0.a(r1, r14, r13, r11)
            return
        L_0x016b:
            vcu r0 = r8.e
            java.lang.String r1 = "rejected"
            r0.a(r1, r14, r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcl.a(java.util.Map):void");
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, List<a> list) {
        int a2 = a(str4);
        c b2 = new c(this.a, str6).a((CharSequence) str).b((CharSequence) str2).a((e) new b().a((CharSequence) str2)).a(this.d.a()).a(this.f.f().getTimeInMillis()).b(true);
        b2.f = this.d.a(a2, false, str3, str4, str5);
        for (a a3 : list) {
            b2.a(a3);
        }
        if (a()) {
            String string = this.a.getString(R.string.default_notification_channel_id);
            String string2 = this.a.getString(R.string.default_notification_channel_name);
            String string3 = this.a.getString(R.string.default_notification_channel_description);
            NotificationChannel notificationChannel = new NotificationChannel(string, string2, 3);
            notificationChannel.setDescription(string3);
            this.b.createNotificationChannel(notificationChannel);
            b2.t = string;
        }
        this.b.notify(a2, b2.b());
    }

    private static int a(String str) {
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1) {
            return hashCode;
        }
        return 0;
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 26;
    }

    private PushkaMetadata b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (PushkaMetadata) this.g.readValue(str, PushkaMetadata.class);
        } catch (IOException e2) {
            Logger.e(e2, "Unable to parse Pushka metadata", new Object[0]);
            return null;
        }
    }

    private List<QuickAction> c(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        try {
            return ((QuickActions) this.g.readValue(str, QuickActions.class)).actions();
        } catch (IOException e2) {
            Logger.e(e2, "Unable to parse quick actions", new Object[0]);
            return Collections.emptyList();
        }
    }
}
