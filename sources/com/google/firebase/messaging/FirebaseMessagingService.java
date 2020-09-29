package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class FirebaseMessagingService extends fgt {
    private static final Queue<String> b = new ArrayDeque(10);

    public void a(fhx fhx) {
    }

    public void a(String str) {
    }

    public final Intent a(Intent intent) {
        return (Intent) fgo.a().b.poll();
    }

    public final boolean c(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        String str = "FirebaseMessaging";
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
                Log.e(str, "Notification pending intent canceled");
            }
        }
        if (fhw.a(intent)) {
            if (intent != null) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    fes fes = (fes) FirebaseApp.getInstance().a(fes.class);
                    Log.isLoggable(str, 3);
                    if (fes != null) {
                        String stringExtra = intent.getStringExtra("google.c.a.c_id");
                        String str2 = "fcm";
                        fes.a(str2, "_ln", (Object) stringExtra);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "Firebase");
                        bundle.putString("medium", "notification");
                        bundle.putString("campaign", stringExtra);
                        fes.a(str2, "_cmp", bundle);
                    }
                } else {
                    Log.isLoggable(str, 3);
                }
            }
            fhw.a("_no", intent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        if (r1.equals(r3) != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x0055
        L_0x0015:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0029
            boolean r0 = defpackage.fhw.a(r11)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "_nd"
            defpackage.fhw.a(r0, r11)
            return
        L_0x0029:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "token"
            java.lang.String r11 = r11.getStringExtra(r0)
            r10.a(r11)
            return
        L_0x003b:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r11 = r11.getAction()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r1 = r11.length()
            if (r1 == 0) goto L_0x004f
            r0.concat(r11)
            return
        L_0x004f:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
        L_0x0054:
            return
        L_0x0055:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r11.getStringExtra(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0067
            r2 = 0
            exi r2 = defpackage.exl.a(r2)
            goto L_0x0080
        L_0x0067:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putString(r0, r1)
            ffw r3 = defpackage.ffw.a(r10)
            fgd r4 = new fgd
            int r5 = r3.a()
            r4.<init>(r5, r2)
            exi r2 = r3.a(r4)
        L_0x0080:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L_0x008b
        L_0x0089:
            r1 = 0
            goto L_0x00c7
        L_0x008b:
            java.util.Queue<java.lang.String> r3 = b
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x00b2
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = "Received duplicate message: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r7 = r1.length()
            if (r7 == 0) goto L_0x00ab
            r3.concat(r1)
            goto L_0x00b0
        L_0x00ab:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x00b0:
            r1 = 1
            goto L_0x00c7
        L_0x00b2:
            java.util.Queue<java.lang.String> r3 = b
            int r3 = r3.size()
            r7 = 10
            if (r3 < r7) goto L_0x00c1
            java.util.Queue<java.lang.String> r3 = b
            r3.remove()
        L_0x00c1:
            java.util.Queue<java.lang.String> r3 = b
            r3.add(r1)
            goto L_0x0089
        L_0x00c7:
            if (r1 != 0) goto L_0x017c
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r11.getStringExtra(r1)
            java.lang.String r3 = "gcm"
            if (r1 != 0) goto L_0x00d4
            r1 = r3
        L_0x00d4:
            r7 = -1
            int r8 = r1.hashCode()
            r9 = 2
            switch(r8) {
                case -2062414158: goto L_0x00f9;
                case 102161: goto L_0x00f2;
                case 814694033: goto L_0x00e8;
                case 814800675: goto L_0x00de;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            goto L_0x0103
        L_0x00de:
            java.lang.String r3 = "send_event"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0103
            r6 = 2
            goto L_0x0104
        L_0x00e8:
            java.lang.String r3 = "send_error"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0103
            r6 = 3
            goto L_0x0104
        L_0x00f2:
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0103
            goto L_0x0104
        L_0x00f9:
            java.lang.String r3 = "deleted_messages"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0103
            r6 = 1
            goto L_0x0104
        L_0x0103:
            r6 = -1
        L_0x0104:
            if (r6 == 0) goto L_0x013d
            if (r6 == r4) goto L_0x017c
            if (r6 == r9) goto L_0x0139
            if (r6 == r5) goto L_0x0122
            java.lang.String r11 = "Received message with unknown type: "
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x011c
            r11.concat(r0)
            goto L_0x017c
        L_0x011c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
            goto L_0x017c
        L_0x0122:
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "message_id"
            r11.getStringExtra(r0)
        L_0x012d:
            com.google.firebase.messaging.SendException r0 = new com.google.firebase.messaging.SendException
            java.lang.String r1 = "error"
            java.lang.String r11 = r11.getStringExtra(r1)
            r0.<init>(r11)
            goto L_0x017c
        L_0x0139:
            r11.getStringExtra(r0)
            goto L_0x017c
        L_0x013d:
            boolean r0 = defpackage.fhw.a(r11)
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = "_nr"
            defpackage.fhw.a(r0, r11)
        L_0x0148:
            android.os.Bundle r0 = r11.getExtras()
            if (r0 != 0) goto L_0x0153
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0153:
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r0.remove(r1)
            boolean r1 = defpackage.fhy.a(r0)
            if (r1 == 0) goto L_0x0174
            fhy r1 = new fhy
            r1.<init>(r10)
            boolean r1 = r1.b(r0)
            if (r1 != 0) goto L_0x017c
            boolean r1 = defpackage.fhw.a(r11)
            if (r1 == 0) goto L_0x0174
            java.lang.String r1 = "_nf"
            defpackage.fhw.a(r1, r11)
        L_0x0174:
            fhx r11 = new fhx
            r11.<init>(r0)
            r10.a(r11)
        L_0x017c:
            r0 = 1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0188, InterruptedException -> 0x0186, TimeoutException -> 0x0184 }
            defpackage.exl.a(r2, r0, r11)     // Catch:{ ExecutionException -> 0x0188, InterruptedException -> 0x0186, TimeoutException -> 0x0184 }
            return
        L_0x0184:
            r11 = move-exception
            goto L_0x0189
        L_0x0186:
            r11 = move-exception
            goto L_0x0189
        L_0x0188:
            r11 = move-exception
        L_0x0189:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r0 = r0.length()
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Message ack failed: "
            r1.append(r0)
            r1.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public static void a(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}
