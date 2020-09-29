package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class MediaNotificationService extends Service {
    /* access modifiers changed from: private */
    public static final ein a = new ein("MediaNotificationService", 0);
    private bpe b;
    private bpa c;
    private ComponentName d;
    private ComponentName e;
    private List<String> f = new ArrayList();
    private int[] g;
    private bpu h;
    private long i;
    private ejk j;
    private boz k;
    private Resources l;
    private bol m;
    private b n;
    /* access modifiers changed from: private */
    public a o;
    /* access modifiers changed from: private */
    public Notification p;
    /* access modifiers changed from: private */
    public bom q;
    private final BroadcastReceiver r = new bpy(this);

    public static class a {
        public final Uri a;
        public Bitmap b;

        public a(bwu bwu) {
            this.a = bwu == null ? null : bwu.a;
        }
    }

    static class b {
        public final Token a;
        public final boolean b;
        public final int c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public b(boolean z, int i, String str, String str2, Token token, boolean z2, boolean z3) {
            this.b = z;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.a = token;
            this.f = z2;
            this.g = z3;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.fi.c r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int r3 = r20.hashCode()
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r8 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r9 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            java.lang.String r10 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            java.lang.String r11 = "com.google.android.gms.cast.framework.action.REWIND"
            r12 = 0
            switch(r3) {
                case -1699820260: goto L_0x004d;
                case -945151566: goto L_0x0045;
                case -945080078: goto L_0x003d;
                case -668151673: goto L_0x0035;
                case -124479363: goto L_0x002b;
                case 235550565: goto L_0x0023;
                case 1362116196: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0055
        L_0x001b:
            boolean r3 = r2.equals(r6)
            if (r3 == 0) goto L_0x0055
            r3 = 3
            goto L_0x0056
        L_0x0023:
            boolean r3 = r2.equals(r7)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            goto L_0x0056
        L_0x002b:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0055
            r3 = 6
            goto L_0x0056
        L_0x0035:
            boolean r3 = r2.equals(r8)
            if (r3 == 0) goto L_0x0055
            r3 = 5
            goto L_0x0056
        L_0x003d:
            boolean r3 = r2.equals(r9)
            if (r3 == 0) goto L_0x0055
            r3 = 2
            goto L_0x0056
        L_0x0045:
            boolean r3 = r2.equals(r10)
            if (r3 == 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x004d:
            boolean r3 = r2.equals(r11)
            if (r3 == 0) goto L_0x0055
            r3 = 4
            goto L_0x0056
        L_0x0055:
            r3 = -1
        L_0x0056:
            r13 = 30000(0x7530, double:1.4822E-319)
            r15 = 10000(0x2710, double:4.9407E-320)
            r5 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r4 = "googlecast-extra_skip_step_ms"
            r17 = 0
            switch(r3) {
                case 0: goto L_0x0189;
                case 1: goto L_0x0158;
                case 2: goto L_0x0127;
                case 3: goto L_0x00e0;
                case 4: goto L_0x0099;
                case 5: goto L_0x0070;
                case 6: goto L_0x0070;
                default: goto L_0x0063;
            }
        L_0x0063:
            ein r1 = a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r12] = r2
            java.lang.String r2 = "Action: %s is not a pre-defined action."
            r1.b(r2, r3)
            return
        L_0x0070:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r8)
            android.content.ComponentName r3 = r0.d
            r2.setComponent(r3)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12)
            fi$a$a r3 = new fi$a$a
            bpe r4 = r0.b
            int r4 = r4.p
            android.content.res.Resources r5 = r0.l
            bpe r6 = r0.b
            int r6 = r6.D
            java.lang.String r5 = r5.getString(r6)
            r3.<init>(r4, r5, r2)
            fi$a r2 = r3.a()
            r1.a(r2)
            return
        L_0x0099:
            long r2 = r0.i
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r11)
            android.content.ComponentName r7 = r0.d
            r6.setComponent(r7)
            r6.putExtra(r4, r2)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r0, r12, r6, r5)
            bpe r5 = r0.b
            int r5 = r5.m
            bpe r6 = r0.b
            int r6 = r6.A
            int r7 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x00c1
            bpe r2 = r0.b
            int r5 = r2.n
            bpe r2 = r0.b
            int r6 = r2.B
            goto L_0x00cd
        L_0x00c1:
            int r7 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x00cd
            bpe r2 = r0.b
            int r5 = r2.o
            bpe r2 = r0.b
            int r6 = r2.C
        L_0x00cd:
            fi$a$a r2 = new fi$a$a
            android.content.res.Resources r3 = r0.l
            java.lang.String r3 = r3.getString(r6)
            r2.<init>(r5, r3, r4)
            fi$a r2 = r2.a()
            r1.a(r2)
            return
        L_0x00e0:
            long r2 = r0.i
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r6)
            android.content.ComponentName r6 = r0.d
            r7.setComponent(r6)
            r7.putExtra(r4, r2)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r0, r12, r7, r5)
            bpe r5 = r0.b
            int r5 = r5.j
            bpe r6 = r0.b
            int r6 = r6.x
            int r7 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x0108
            bpe r2 = r0.b
            int r5 = r2.k
            bpe r2 = r0.b
            int r6 = r2.y
            goto L_0x0114
        L_0x0108:
            int r7 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0114
            bpe r2 = r0.b
            int r5 = r2.l
            bpe r2 = r0.b
            int r6 = r2.z
        L_0x0114:
            fi$a$a r2 = new fi$a$a
            android.content.res.Resources r3 = r0.l
            java.lang.String r3 = r3.getString(r6)
            r2.<init>(r5, r3, r4)
            fi$a r2 = r2.a()
            r1.a(r2)
            return
        L_0x0127:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r2 = r0.n
            boolean r2 = r2.g
            if (r2 == 0) goto L_0x013b
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r9)
            android.content.ComponentName r3 = r0.d
            r2.setComponent(r3)
            android.app.PendingIntent r17 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12)
        L_0x013b:
            r2 = r17
            fi$a$a r3 = new fi$a$a
            bpe r4 = r0.b
            int r4 = r4.i
            android.content.res.Resources r5 = r0.l
            bpe r6 = r0.b
            int r6 = r6.w
            java.lang.String r5 = r5.getString(r6)
            r3.<init>(r4, r5, r2)
            fi$a r2 = r3.a()
            r1.a(r2)
            return
        L_0x0158:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r2 = r0.n
            boolean r2 = r2.f
            if (r2 == 0) goto L_0x016c
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r10)
            android.content.ComponentName r3 = r0.d
            r2.setComponent(r3)
            android.app.PendingIntent r17 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12)
        L_0x016c:
            r2 = r17
            fi$a$a r3 = new fi$a$a
            bpe r4 = r0.b
            int r4 = r4.h
            android.content.res.Resources r5 = r0.l
            bpe r6 = r0.b
            int r6 = r6.v
            java.lang.String r5 = r5.getString(r6)
            r3.<init>(r4, r5, r2)
            fi$a r2 = r3.a()
            r1.a(r2)
            return
        L_0x0189:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r2 = r0.n
            int r2 = r2.c
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r3 = r0.n
            boolean r3 = r3.b
            r4 = 2
            if (r2 != r4) goto L_0x019d
            bpe r2 = r0.b
            int r2 = r2.e
            bpe r4 = r0.b
            int r4 = r4.s
            goto L_0x01a5
        L_0x019d:
            bpe r2 = r0.b
            int r2 = r2.f
            bpe r4 = r0.b
            int r4 = r4.t
        L_0x01a5:
            if (r3 == 0) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            bpe r2 = r0.b
            int r2 = r2.g
        L_0x01ac:
            if (r3 == 0) goto L_0x01af
            goto L_0x01b3
        L_0x01af:
            bpe r3 = r0.b
            int r4 = r3.u
        L_0x01b3:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r7)
            android.content.ComponentName r5 = r0.d
            r3.setComponent(r5)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r12, r3, r12)
            fi$a$a r5 = new fi$a$a
            android.content.res.Resources r6 = r0.l
            java.lang.String r4 = r6.getString(r4)
            r5.<init>(r2, r4, r3)
            fi$a r2 = r5.a()
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.a(fi$c, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r0 = r9.n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.google.android.gms.cast.framework.media.MediaNotificationService$a r0 = r9.o
            r1 = 0
            if (r0 != 0) goto L_0x000c
            r0 = r1
            goto L_0x000e
        L_0x000c:
            android.graphics.Bitmap r0 = r0.b
        L_0x000e:
            fi$c r2 = new fi$c
            java.lang.String r3 = "cast_media_notification"
            r2.<init>(r9, r3)
            fi$c r0 = r2.a(r0)
            bpe r2 = r9.b
            int r2 = r2.d
            fi$c r0 = r0.a(r2)
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r2 = r9.n
            java.lang.String r2 = r2.d
            fi$c r0 = r0.a(r2)
            android.content.res.Resources r2 = r9.l
            bpe r3 = r9.b
            int r3 = r3.r
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r6 = r9.n
            java.lang.String r6 = r6.e
            r7 = 0
            r5[r7] = r6
            java.lang.String r2 = r2.getString(r3, r5)
            fi$c r0 = r0.b(r2)
            r2 = 2
            r0.a(r2, r4)
            r0.i = r7
            r0.s = r4
            android.content.ComponentName r3 = r9.e
            if (r3 != 0) goto L_0x004e
            goto L_0x0069
        L_0x004e:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r3 = r9.e
            java.lang.String r5 = "targetActivity"
            r1.putExtra(r5, r3)
            android.content.ComponentName r3 = r9.e
            java.lang.String r3 = r3.flattenToString()
            r1.setAction(r3)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r9, r4, r1, r3)
        L_0x0069:
            if (r1 == 0) goto L_0x006d
            r0.f = r1
        L_0x006d:
            bpu r1 = r9.h
            if (r1 == 0) goto L_0x01af
            ein r1 = a
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r5 = "mActionsProvider != null"
            r1.c(r5, r3)
            bpu r1 = r9.h     // Catch:{ RemoteException -> 0x0198 }
            java.util.List r1 = r1.a()     // Catch:{ RemoteException -> 0x0198 }
            bpu r3 = r9.h     // Catch:{ RemoteException -> 0x0198 }
            int[] r2 = r3.b()     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x00b0
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x008f
            goto L_0x00b0
        L_0x008f:
            int r3 = r1.size()
            r5 = 5
            if (r3 <= r5) goto L_0x00ae
            ein r3 = a
            java.lang.Class<bpd> r5 = defpackage.bpd.class
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = " provides more than 5 actions."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r3.b(r5, r6)
            goto L_0x00c7
        L_0x00ae:
            r3 = 1
            goto L_0x00c8
        L_0x00b0:
            ein r3 = a
            java.lang.Class<bpd> r5 = defpackage.bpd.class
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = " doesn't provide any action."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r3.b(r5, r6)
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            if (r3 == 0) goto L_0x0197
            int r3 = r1.size()
            if (r2 == 0) goto L_0x00fc
            int r5 = r2.length
            if (r5 != 0) goto L_0x00d4
            goto L_0x00fc
        L_0x00d4:
            int r5 = r2.length
            r6 = 0
        L_0x00d6:
            if (r6 >= r5) goto L_0x00fa
            r8 = r2[r6]
            if (r8 < 0) goto L_0x00e2
            if (r8 < r3) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            int r6 = r6 + 1
            goto L_0x00d6
        L_0x00e2:
            ein r3 = a
            java.lang.Class<bpd> r5 = defpackage.bpd.class
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "provides a compact view action whose index is out of bounds."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r3.b(r5, r6)
            goto L_0x0113
        L_0x00fa:
            r3 = 1
            goto L_0x0114
        L_0x00fc:
            ein r3 = a
            java.lang.Class<bpd> r5 = defpackage.bpd.class
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = " doesn't provide any actions for compact view."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r3.b(r5, r6)
        L_0x0113:
            r3 = 0
        L_0x0114:
            if (r3 != 0) goto L_0x0118
            goto L_0x0197
        L_0x0118:
            java.lang.Object r2 = r2.clone()
            int[] r2 = (int[]) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0122:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01c7
            java.lang.Object r3 = r1.next()
            bpc r3 = (defpackage.bpc) r3
            bpc$a r5 = new bpc$a
            r5.<init>()
            java.lang.String r6 = r3.a
            r5.a(r6)
            java.lang.String r5 = r3.a
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x016d
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x016d
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x016d
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x016d
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x016d
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r5 = 0
            goto L_0x016e
        L_0x016d:
            r5 = 1
        L_0x016e:
            if (r5 == 0) goto L_0x0176
            java.lang.String r3 = r3.a
            r9.a(r0, r3)
            goto L_0x0122
        L_0x0176:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = r3.a
            r5.<init>(r6)
            android.content.ComponentName r6 = r9.d
            r5.setComponent(r6)
            android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r9, r7, r5, r7)
            fi$a$a r6 = new fi$a$a
            int r8 = r3.b
            java.lang.String r3 = r3.c
            r6.<init>(r8, r3, r5)
            fi$a r3 = r6.a()
            r0.a(r3)
            goto L_0x0122
        L_0x0197:
            return
        L_0x0198:
            r0 = move-exception
            ein r1 = a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getNotificationActions"
            r2[r7] = r3
            java.lang.Class<bpu> r3 = defpackage.bpu.class
            java.lang.String r3 = r3.getSimpleName()
            r2[r4] = r3
            java.lang.String r3 = "Unable to call %s on %s."
            r1.b(r0, r3, r2)
            return
        L_0x01af:
            java.util.List<java.lang.String> r1 = r9.f
            java.util.Iterator r1 = r1.iterator()
        L_0x01b5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01c5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r9.a(r0, r2)
            goto L_0x01b5
        L_0x01c5:
            int[] r2 = r9.g
        L_0x01c7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x01dd
            mq$a r1 = new mq$a
            r1.<init>()
            r1.c = r2
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r2 = r9.n
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.a
            r1.d = r2
            r0.a(r1)
        L_0x01dd:
            android.app.Notification r0 = r0.b()
            r9.p = r0
            bom r0 = r9.q
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x01f1
            android.app.Notification r0 = r9.p
            r9.startForeground(r4, r0)
            return
        L_0x01f1:
            r9.stopForeground(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.b():void");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        this.q = bom.a(this);
        bom bom = this.q;
        String str = "Must be called from the main thread.";
        bxo.b(str);
        boy boy = bom.e.d;
        this.b = boy.c;
        this.c = boy.a();
        this.l = getResources();
        this.d = new ComponentName(getApplicationContext(), boy.a);
        if (!TextUtils.isEmpty(this.b.c)) {
            this.e = new ComponentName(getApplicationContext(), this.b.c);
        } else {
            this.e = null;
        }
        this.h = this.b.E;
        if (this.h == null) {
            this.f.addAll(this.b.a);
            this.g = (int[]) this.b.a().clone();
        } else {
            this.g = null;
        }
        this.i = this.b.b;
        int dimensionPixelSize = this.l.getDimensionPixelSize(this.b.q);
        this.k = new boz(1, dimensionPixelSize, dimensionPixelSize);
        this.j = new ejk(getApplicationContext(), this.k);
        this.m = new bqa(this);
        bom bom2 = this.q;
        bol bol = this.m;
        bxo.b(str);
        bxo.a(bol);
        try {
            bom2.b.a(new bqh(bol));
        } catch (RemoteException e2) {
            bom.a.a(e2, "Unable to call %s on %s.", "addVisibilityChangeListener", bqt.class.getSimpleName());
        }
        ComponentName componentName = this.e;
        if (componentName != null) {
            registerReceiver(this.r, new IntentFilter(componentName.flattenToString()));
        }
        if (caf.i()) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void onDestroy() {
        ejk ejk = this.j;
        if (ejk != null) {
            ejk.a();
        }
        if (this.e != null) {
            try {
                unregisterReceiver(this.r);
            } catch (IllegalArgumentException e2) {
                a.b(e2, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        ((NotificationManager) getSystemService("notification")).cancel(1);
        bom bom = this.q;
        bol bol = this.m;
        bxo.b("Must be called from the main thread.");
        if (bol != null) {
            try {
                bom.b.b(new bqh(bol));
            } catch (RemoteException e3) {
                bom.a.a(e3, "Unable to call %s on %s.", "addVisibilityChangeListener", bqt.class.getSimpleName());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if ((r1 != null && r7.b == r1.b && r7.c == r1.c && defpackage.eic.a(r7.d, r1.d) && defpackage.eic.a(r7.e, r1.e) && r7.f == r1.f && r7.g == r1.g) == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 2
            if (r1 == 0) goto L_0x00f2
            java.lang.String r3 = r18.getAction()
            java.lang.String r4 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00f2
            java.lang.String r3 = "extra_media_info"
            android.os.Parcelable r3 = r1.getParcelableExtra(r3)
            com.google.android.gms.cast.MediaInfo r3 = (com.google.android.gms.cast.MediaInfo) r3
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0021
            goto L_0x00ed
        L_0x0021:
            boc r6 = r3.b
            if (r6 != 0) goto L_0x0027
            goto L_0x00ed
        L_0x0027:
            java.lang.String r7 = "extra_remote_media_client_player_state"
            int r7 = r1.getIntExtra(r7, r5)
            if (r7 != 0) goto L_0x0031
            goto L_0x00ed
        L_0x0031:
            java.lang.String r8 = "extra_cast_device"
            android.os.Parcelable r8 = r1.getParcelableExtra(r8)
            com.google.android.gms.cast.CastDevice r8 = (com.google.android.gms.cast.CastDevice) r8
            if (r8 != 0) goto L_0x003d
            goto L_0x00ed
        L_0x003d:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r15 = new com.google.android.gms.cast.framework.media.MediaNotificationService$b
            if (r7 != r2) goto L_0x0043
            r10 = 1
            goto L_0x0044
        L_0x0043:
            r10 = 0
        L_0x0044:
            int r11 = r3.a
            java.lang.String r3 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r12 = r6.a(r3)
            java.lang.String r13 = r8.c
            java.lang.String r3 = "extra_media_session_token"
            android.os.Parcelable r3 = r1.getParcelableExtra(r3)
            r14 = r3
            android.support.v4.media.session.MediaSessionCompat$Token r14 = (android.support.v4.media.session.MediaSessionCompat.Token) r14
            java.lang.String r3 = "extra_can_skip_next"
            boolean r3 = r1.getBooleanExtra(r3, r5)
            java.lang.String r7 = "extra_can_skip_prev"
            boolean r16 = r1.getBooleanExtra(r7, r5)
            r9 = r15
            r7 = r15
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r3 = "extra_media_notification_force_update"
            boolean r1 = r1.getBooleanExtra(r3, r5)
            if (r1 != 0) goto L_0x00a6
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r1 = r0.n
            if (r1 == 0) goto L_0x00a3
            boolean r3 = r7.b
            boolean r8 = r1.b
            if (r3 != r8) goto L_0x00a3
            int r3 = r7.c
            int r8 = r1.c
            if (r3 != r8) goto L_0x00a3
            java.lang.String r3 = r7.d
            java.lang.String r8 = r1.d
            boolean r3 = defpackage.eic.a(r3, r8)
            if (r3 == 0) goto L_0x00a3
            java.lang.String r3 = r7.e
            java.lang.String r8 = r1.e
            boolean r3 = defpackage.eic.a(r3, r8)
            if (r3 == 0) goto L_0x00a3
            boolean r3 = r7.f
            boolean r8 = r1.f
            if (r3 != r8) goto L_0x00a3
            boolean r3 = r7.g
            boolean r1 = r1.g
            if (r3 != r1) goto L_0x00a3
            r1 = 1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            if (r1 != 0) goto L_0x00ab
        L_0x00a6:
            r0.n = r7
            r17.b()
        L_0x00ab:
            com.google.android.gms.cast.framework.media.MediaNotificationService$a r1 = new com.google.android.gms.cast.framework.media.MediaNotificationService$a
            bpa r3 = r0.c
            if (r3 == 0) goto L_0x00b8
            boz r3 = r0.k
            bwu r3 = defpackage.bpa.a(r6)
            goto L_0x00c8
        L_0x00b8:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x00c7
            java.util.List<bwu> r3 = r6.a
            java.lang.Object r3 = r3.get(r5)
            bwu r3 = (defpackage.bwu) r3
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r1.<init>(r3)
            com.google.android.gms.cast.framework.media.MediaNotificationService$a r3 = r0.o
            if (r3 == 0) goto L_0x00da
            android.net.Uri r6 = r1.a
            android.net.Uri r3 = r3.a
            boolean r3 = defpackage.eic.a(r6, r3)
            if (r3 == 0) goto L_0x00da
            r5 = 1
        L_0x00da:
            if (r5 != 0) goto L_0x00ec
            ejk r3 = r0.j
            bpz r5 = new bpz
            r5.<init>(r0, r1)
            r3.a = r5
            ejk r3 = r0.j
            android.net.Uri r1 = r1.a
            r3.a(r1)
        L_0x00ec:
            r5 = 1
        L_0x00ed:
            if (r5 != 0) goto L_0x00f2
            r0.stopForeground(r4)
        L_0x00f2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
