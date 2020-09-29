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

/* renamed from: hwr reason: default package */
public abstract class hwr {
    private final Callback a = new $$Lambda$hwr$WgYk2GPrv9XfHGfmZr72l1R9FqI(this);
    private final hws b;
    private final seb c;
    private final tvn d;
    protected final Context e;
    final vwy f;
    protected final Handler g;
    protected final fqn h;
    protected final Handler i = new Handler(Looper.getMainLooper(), this.a);
    hwq j;
    Notification k;
    jxm l;
    public boolean m;
    private final Picasso n;
    private final wgx o = new wgx() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            int i = AnonymousClass2.a[loadedFrom.ordinal()];
            if (i == 1) {
                fbp.a(!bitmap.isRecycled());
            } else if (i == 2) {
                fbp.a(!bitmap.isRecycled());
            } else if (i == 3) {
                fbp.a(!bitmap.isRecycled());
            }
            if (hwr.this.k != null && hwr.this.j != null) {
                hwr hwr = hwr.this;
                fbp.b(hwr.l != null);
                hwr.l.a(bitmap);
                hwr.k = hwr.l.a();
                vwy vwy = hwr.this.f;
                Notification notification = hwr.this.k;
                hwr hwr2 = hwr.this;
                vwy.a(R.id.notification_playback, notification, hwr2.a(hwr2.j));
                fbp.a(!bitmap.isRecycled());
            }
        }

        public final void a(Drawable drawable) {
            if (hwr.this.k != null) {
                fbp.b(hwr.this.l != null);
                hwr.this.f.a(R.id.notification_playback, hwr.this.k);
            }
        }

        public final void b(Drawable drawable) {
        }
    };
    private Bitmap p;

    /* renamed from: hwr$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hwr.AnonymousClass2.<clinit>():void");
        }
    }

    public hwr(Context context, vwy vwy, hws hws, Handler handler, fqn fqn, seb seb, tvn tvn, Picasso picasso) {
        this.e = (Context) fbp.a(context);
        this.f = (vwy) fbp.a(vwy);
        this.b = (hws) fbp.a(hws);
        this.g = (Handler) fbp.a(handler);
        this.h = fqn;
        this.c = (seb) fbp.a(seb);
        this.d = tvn;
        this.n = picasso;
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) this.e.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel("playback_channel", this.e.getString(R.string.notification_channel_playback_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Message message) {
        if (message.what != 10) {
            StringBuilder sb = new StringBuilder("Unexpected message ");
            sb.append(message.what);
            Assertion.a(sb.toString());
        } else if (!(message.obj instanceof hwq)) {
            Assertion.a("Received non-notification state msg.");
            return true;
        } else {
            hwq hwq = (hwq) message.obj;
            if (this.m || !hwq.equals(this.j)) {
                this.j = hwq;
                if (this.p == null) {
                    Drawable a2 = fr.a(this.e, (int) R.drawable.cat_placeholder_album);
                    if (a2 instanceof BitmapDrawable) {
                        this.p = ((BitmapDrawable) a2).getBitmap();
                    }
                }
                jxh jxh = new jxh(this.e, this.j, this.p, this.h, "playback_channel", this.d);
                this.l = jxh;
                jxm jxm = this.l;
                seb seb = this.c;
                jxm.a(seb != null ? seb.d() : null);
                this.k = this.l.a();
                this.n.a(hwq.e()).a(this.o);
                boolean a3 = this.f.a(R.id.notification_playback, this.k, a(this.j));
                if (this.m && a3) {
                    this.m = false;
                }
            }
        }
        return true;
    }

    public void a() {
        this.f.a((int) R.id.notification_playback);
        this.j = null;
    }

    public abstract void a(ForceInCollection forceInCollection, Player player);

    /* access modifiers changed from: 0000 */
    public boolean a(hwq hwq) {
        return this.j.r() && !hwq.g();
    }
}
