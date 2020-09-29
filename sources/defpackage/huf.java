package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: huf reason: default package */
public abstract class huf {
    private final Callback a = new $$Lambda$huf$kdvvoO8RtuMyZ4F84LwIE_oJag(this);
    private final hug b;
    private final rur c;
    private final tjv d;
    protected final Context e;
    final vjs f;
    protected final Handler g;
    protected final fpt h;
    protected final Handler i = new Handler(Looper.getMainLooper(), this.a);
    hue j;
    Notification k;
    jve l;
    public boolean m;
    private final Picasso n;
    private final vsr o = new vsr() {
        public final void b(Drawable drawable) {
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            int i = AnonymousClass2.a[loadedFrom.ordinal()];
            if (i == 1) {
                fay.a(!bitmap.isRecycled());
            } else if (i == 2) {
                fay.a(!bitmap.isRecycled());
            } else if (i == 3) {
                fay.a(!bitmap.isRecycled());
            }
            if (huf.this.k != null && huf.this.j != null) {
                huf huf = huf.this;
                fay.b(huf.l != null);
                huf.l.a(bitmap);
                huf.k = huf.l.a();
                vjs vjs = huf.this.f;
                Notification notification = huf.this.k;
                huf huf2 = huf.this;
                vjs.a(R.id.notification_playback, notification, huf2.a(huf2.j));
                fay.a(!bitmap.isRecycled());
            }
        }

        public final void a(Drawable drawable) {
            if (huf.this.k != null) {
                fay.b(huf.this.l != null);
                huf.this.f.a(R.id.notification_playback, huf.this.k);
            }
        }
    };
    private Bitmap p;

    /* renamed from: huf$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[LoadedFrom.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.squareup.picasso.Picasso$LoadedFrom[] r0 = com.squareup.picasso.Picasso.LoadedFrom.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.DISK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.NETWORK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.huf.AnonymousClass2.<clinit>():void");
        }
    }

    public abstract void a(ForceInCollection forceInCollection, Player player);

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Message message) {
        if (message.what != 10) {
            StringBuilder sb = new StringBuilder("Unexpected message ");
            sb.append(message.what);
            Assertion.a(sb.toString());
        } else if (!(message.obj instanceof hue)) {
            Assertion.a("Received non-notification state msg.");
            return true;
        } else {
            hue hue = (hue) message.obj;
            if (this.m || !hue.equals(this.j)) {
                this.j = hue;
                if (this.p == null) {
                    Drawable a2 = fr.a(this.e, (int) R.drawable.cat_placeholder_album);
                    if (a2 instanceof BitmapDrawable) {
                        this.p = ((BitmapDrawable) a2).getBitmap();
                    }
                }
                juz juz = new juz(this.e, this.j, this.p, this.h, "playback_channel", this.d);
                this.l = juz;
                jve jve = this.l;
                rur rur = this.c;
                jve.a(rur != null ? rur.d() : null);
                this.k = this.l.a();
                this.n.a(hue.e()).a(this.o);
                boolean a3 = this.f.a(R.id.notification_playback, this.k, a(this.j));
                if (this.m && a3) {
                    this.m = false;
                }
            }
        }
        return true;
    }

    public huf(Context context, vjs vjs, hug hug, Handler handler, fpt fpt, rur rur, tjv tjv, Picasso picasso) {
        this.e = (Context) fay.a(context);
        this.f = (vjs) fay.a(vjs);
        this.b = (hug) fay.a(hug);
        this.g = (Handler) fay.a(handler);
        this.h = fpt;
        this.c = (rur) fay.a(rur);
        this.d = tjv;
        this.n = picasso;
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) this.e.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel("playback_channel", this.e.getString(R.string.notification_channel_playback_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(hue hue) {
        return this.j.r() && !hue.g();
    }

    public void a() {
        this.f.a((int) R.id.notification_playback);
        this.j = null;
    }
}
