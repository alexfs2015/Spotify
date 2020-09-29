package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: ehe reason: default package */
public final class ehe implements b {
    public final Context a;
    public final bon b;
    public final eji c;
    public final ejk d;
    public final ejk e;
    public bpf f;
    public CastDevice g;
    public MediaSessionCompat h;
    public a i;
    public boolean j;
    private final ComponentName k;
    private final Handler l;
    private final Runnable m;

    public ehe(Context context, bon bon, eji eji) {
        this.a = context;
        this.b = bon;
        this.c = eji;
        if (this.b.d == null || TextUtils.isEmpty(this.b.d.b)) {
            this.k = null;
        } else {
            this.k = new ComponentName(this.a, this.b.d.b);
        }
        this.d = new ejk(this.a);
        this.d.a = new ehg(this);
        this.e = new ejk(this.a);
        this.e.a = new ehj(this);
        this.l = new eix(Looper.getMainLooper());
        this.m = new ehh(this);
    }

    private final Uri a(boc boc, int i2) {
        bwu bwu;
        if (this.b.d.a() != null) {
            this.b.d.a();
            bwu = bpa.a(boc);
        } else {
            bwu = boc.a() ? (bwu) boc.a.get(0) : null;
        }
        if (bwu == null) {
            return null;
        }
        return bwu.a;
    }

    private final MediaMetadataCompat.a h() {
        MediaMetadataCompat c2 = this.h.b.c();
        return c2 == null ? new MediaMetadataCompat.a() : new MediaMetadataCompat.a(c2);
    }

    public final void a() {
        a(false);
    }

    public final void a(int i2, MediaInfo mediaInfo) {
        PendingIntent pendingIntent;
        if (i2 == 0) {
            this.h.a(new PlaybackStateCompat.a().a(0, 0, 1.0f).a());
            this.h.a(new MediaMetadataCompat.a().a());
            return;
        }
        long j2 = mediaInfo.a == 2 ? 5 : 512;
        MediaSessionCompat mediaSessionCompat = this.h;
        PlaybackStateCompat.a a2 = new PlaybackStateCompat.a().a(i2, 0, 1.0f);
        a2.b = j2;
        mediaSessionCompat.a(a2.a());
        MediaSessionCompat mediaSessionCompat2 = this.h;
        if (this.k == null) {
            pendingIntent = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.k);
            pendingIntent = PendingIntent.getActivity(this.a, 0, intent, 134217728);
        }
        mediaSessionCompat2.a(pendingIntent);
        boc boc = mediaInfo.b;
        String str = "com.google.android.gms.cast.metadata.TITLE";
        String str2 = "android.media.metadata.DISPLAY_SUBTITLE";
        this.h.a(h().a("android.media.metadata.TITLE", boc.a(str)).a("android.media.metadata.DISPLAY_TITLE", boc.a(str)).a(str2, boc.a("com.google.android.gms.cast.metadata.SUBTITLE")).a("android.media.metadata.DURATION", mediaInfo.c).a());
        Uri a3 = a(boc, 0);
        if (a3 != null) {
            this.d.a(a3);
        } else {
            a((Bitmap) null, 0);
        }
        Uri a4 = a(boc, 3);
        if (a4 != null) {
            this.e.a(a4);
        } else {
            a((Bitmap) null, 3);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bitmap bitmap, int i2) {
        if (i2 == 0) {
            String str = "android.media.metadata.DISPLAY_ICON";
            if (bitmap != null) {
                this.h.a(h().a(str, bitmap).a());
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
            createBitmap.eraseColor(0);
            this.h.a(h().a(str, createBitmap).a());
            return;
        }
        if (i2 == 3) {
            this.h.a(h().a("android.media.metadata.ALBUM_ART", bitmap).a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fd, code lost:
        if (r1.intValue() < (r0.j.size() - 1)) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r10) {
        /*
            r9 = this;
            bpf r10 = r9.f
            if (r10 != 0) goto L_0x0005
            return
        L_0x0005:
            boh r10 = r10.f()
            r0 = 0
            if (r10 != 0) goto L_0x000e
            r1 = r0
            goto L_0x0010
        L_0x000e:
            com.google.android.gms.cast.MediaInfo r1 = r10.a
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r2 = r0
            goto L_0x0016
        L_0x0014:
            boc r2 = r1.b
        L_0x0016:
            r3 = 6
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r10 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x0070
            if (r2 != 0) goto L_0x0022
            goto L_0x0070
        L_0x0022:
            bpf r2 = r9.f
            int r2 = r2.i()
            if (r2 == r7) goto L_0x003a
            if (r2 == r5) goto L_0x0037
            if (r2 == r4) goto L_0x0034
            r10 = 4
            if (r2 == r10) goto L_0x0032
            goto L_0x0070
        L_0x0032:
            r2 = 0
            goto L_0x0072
        L_0x0034:
            r2 = 0
        L_0x0035:
            r3 = 2
            goto L_0x0072
        L_0x0037:
            r2 = 0
            r3 = 3
            goto L_0x0072
        L_0x003a:
            int r2 = r10.f
            bpf r8 = r9.f
            boolean r8 = r8.j()
            if (r8 == 0) goto L_0x0048
            if (r2 != r5) goto L_0x0048
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            int r10 = r10.h
            if (r10 == 0) goto L_0x0053
            if (r2 == r7) goto L_0x0051
            if (r2 != r4) goto L_0x0053
        L_0x0051:
            r2 = 1
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            if (r8 == 0) goto L_0x0057
            goto L_0x0035
        L_0x0057:
            bpf r8 = r9.f
            bpb r8 = r8.g()
            int r10 = r8.a(r10)
            bpf r8 = r9.f
            bpb r8 = r8.g()
            bof r10 = r8.a(r10, r7)
            if (r10 == 0) goto L_0x0071
            com.google.android.gms.cast.MediaInfo r1 = r10.a
            goto L_0x0072
        L_0x0070:
            r2 = 0
        L_0x0071:
            r3 = 0
        L_0x0072:
            r9.a(r3, r1)
            if (r3 != 0) goto L_0x007e
            r9.f()
            r9.g()
            return
        L_0x007e:
            bon r10 = r9.b
            boy r10 = r10.d
            bpe r10 = r10.c
            if (r10 == 0) goto L_0x012b
            bpf r10 = r9.f
            if (r10 == 0) goto L_0x012b
            android.content.Intent r10 = new android.content.Intent
            android.content.Context r1 = r9.a
            java.lang.Class<com.google.android.gms.cast.framework.media.MediaNotificationService> r3 = com.google.android.gms.cast.framework.media.MediaNotificationService.class
            r10.<init>(r1, r3)
            java.lang.String r1 = "extra_media_notification_force_update"
            r10.putExtra(r1, r6)
            android.content.Context r1 = r9.a
            java.lang.String r1 = r1.getPackageName()
            r10.setPackage(r1)
            java.lang.String r1 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"
            r10.setAction(r1)
            bpf r1 = r9.f
            com.google.android.gms.cast.MediaInfo r1 = r1.h()
            java.lang.String r3 = "extra_media_info"
            r10.putExtra(r3, r1)
            bpf r1 = r9.f
            int r1 = r1.i()
            java.lang.String r3 = "extra_remote_media_client_player_state"
            r10.putExtra(r3, r1)
            com.google.android.gms.cast.CastDevice r1 = r9.g
            java.lang.String r3 = "extra_cast_device"
            r10.putExtra(r3, r1)
            android.support.v4.media.session.MediaSessionCompat r1 = r9.h
            if (r1 != 0) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.c()
        L_0x00cc:
            java.lang.String r1 = "extra_media_session_token"
            r10.putExtra(r1, r0)
            bpf r0 = r9.f
            boh r0 = r0.f()
            if (r0 == 0) goto L_0x010e
            int r1 = r0.i
            if (r1 == r7) goto L_0x0102
            if (r1 == r5) goto L_0x0102
            if (r1 == r4) goto L_0x0102
            int r1 = r0.c
            java.lang.Integer r1 = r0.b(r1)
            if (r1 == 0) goto L_0x0100
            int r3 = r1.intValue()
            if (r3 <= 0) goto L_0x00f1
            r3 = 1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            int r1 = r1.intValue()
            java.util.ArrayList<bof> r0 = r0.j
            int r0 = r0.size()
            int r0 = r0 - r7
            if (r1 >= r0) goto L_0x0104
            goto L_0x0103
        L_0x0100:
            r3 = 0
            goto L_0x0104
        L_0x0102:
            r3 = 1
        L_0x0103:
            r6 = 1
        L_0x0104:
            java.lang.String r0 = "extra_can_skip_next"
            r10.putExtra(r0, r6)
            java.lang.String r0 = "extra_can_skip_prev"
            r10.putExtra(r0, r3)
        L_0x010e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0126
            android.content.Context r0 = r9.a
            bom r0 = defpackage.bom.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0126
            android.content.Context r0 = r9.a
            r0.startForegroundService(r10)
            goto L_0x012b
        L_0x0126:
            android.content.Context r0 = r9.a
            r0.startService(r10)
        L_0x012b:
            if (r2 != 0) goto L_0x0130
            r9.b(r7)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehe.a(boolean):void");
    }

    public final void b() {
        a(false);
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z) {
        if (this.b.e) {
            this.l.removeCallbacks(this.m);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            try {
                this.a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.l.postDelayed(this.m, 1000);
                }
            }
        }
    }

    public final void c() {
        a(false);
    }

    public final void d() {
        a(false);
    }

    public final void e() {
        a(false);
    }

    public final void f() {
        if (this.b.d.c != null) {
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.a.stopService(intent);
        }
    }

    public final void g() {
        if (this.b.e) {
            this.l.removeCallbacks(this.m);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }
}
