package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.ConnectionResult;
import com.spotify.music.R;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bnx reason: default package */
public class bnx extends bod {
    /* access modifiers changed from: private */
    public static final ehw c = new ehw("CastSession", 0);
    public final defpackage.bnh.b a;
    public bsh b;
    private final Context d;
    /* access modifiers changed from: private */
    public final Set<defpackage.bnh.d> e = new HashSet();
    /* access modifiers changed from: private */
    public final bqd f;
    private final bnw g;
    private final eii h;
    /* access modifiers changed from: private */
    public final egn i;
    /* access modifiers changed from: private */
    public boo j;
    private CastDevice k;
    /* access modifiers changed from: private */
    public defpackage.bnh.a l;

    /* renamed from: bnx$a */
    class a extends bqa {
        private a() {
        }

        public final void a(String str, String str2) {
            if (bnx.this.b != null) {
                bnx.this.a.b(bnx.this.b, str, str2).a((bsm<? super R>) new b<Object>("joinApplication"));
            }
        }

        public final void a(String str, bnj bnj) {
            if (bnx.this.b != null) {
                bnx.this.a.a(bnx.this.b, str, bnj).a((bsm<? super R>) new b<Object>("launchApplication"));
            }
        }

        public final void a(String str) {
            if (bnx.this.b != null) {
                bnx.this.a.a(bnx.this.b, str);
            }
        }

        public final void a(int i) {
            bnx.a(bnx.this, i);
        }

        /* synthetic */ a(bnx bnx, byte b) {
            this();
        }
    }

    /* renamed from: bnx$b */
    class b implements bsm<defpackage.bnh.a> {
        private String a;

        b(String str) {
            this.a = str;
        }

        public final /* synthetic */ void onResult(bsl bsl) {
            defpackage.bnh.a aVar = (defpackage.bnh.a) bsl;
            bnx.this.l = aVar;
            try {
                if (aVar.B_().c()) {
                    bnx.c.a("%s() -> success result", this.a);
                    bnx.this.j = new boo(new ehv(), bnx.this.a);
                    try {
                        bnx.this.j.a(bnx.this.b);
                        bnx.this.j.a();
                        bnx.this.j.c();
                        egn f = bnx.this.i;
                        boo a2 = bnx.this.j;
                        CastDevice b2 = bnx.this.b();
                        if (!(f.j || f.b == null || f.b.d == null || a2 == null)) {
                            if (b2 != null) {
                                f.f = a2;
                                boo boo = f.f;
                                bwx.b("Must be called from the main thread.");
                                boo.b.add(f);
                                f.g = b2;
                                if (!bzo.g()) {
                                    ((AudioManager) f.a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
                                }
                                ComponentName componentName = new ComponentName(f.a, f.b.d.a);
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.setComponent(componentName);
                                f.h = new MediaSessionCompat(f.a, "CastMediaSession", componentName, PendingIntent.getBroadcast(f.a, 0, intent, 0));
                                f.h.a.a(3);
                                f.a(0, (MediaInfo) null);
                                if (f.g != null && !TextUtils.isEmpty(f.g.c)) {
                                    f.h.a(new android.support.v4.media.MediaMetadataCompat.a().a("android.media.metadata.ALBUM_ARTIST", f.a.getResources().getString(R.string.cast_casting_to_device, new Object[]{f.g.c})).a());
                                }
                                f.i = new egr(f);
                                f.h.a(f.i, (Handler) null);
                                f.h.a(true);
                                eir eir = f.c;
                                nd.a(f.h);
                                f.j = true;
                                f.a(false);
                            }
                        }
                    } catch (IOException e) {
                        bnx.c.b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        bnx.this.j = null;
                    }
                    bnx.this.f.a(aVar.a(), aVar.b(), aVar.c(), aVar.d());
                    return;
                }
                bnx.c.a("%s() -> failure result", this.a);
                bnx.this.f.b(aVar.B_().f);
            } catch (RemoteException e2) {
                bnx.c.a(e2, "Unable to call %s on %s.", "methods", bqd.class.getSimpleName());
            }
        }
    }

    /* renamed from: bnx$c */
    class c implements defpackage.bsh.b, defpackage.bsh.c {
        private c() {
        }

        public final void a(Bundle bundle) {
            try {
                if (bnx.this.j != null) {
                    try {
                        bnx.this.j.a();
                        bnx.this.j.c();
                    } catch (IOException e) {
                        bnx.c.b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        bnx.this.j = null;
                    }
                }
                bnx.this.f.a(bundle);
            } catch (RemoteException e2) {
                bnx.c.a(e2, "Unable to call %s on %s.", "onConnected", bqd.class.getSimpleName());
            }
        }

        public final void a(int i) {
            try {
                bnx.this.f.a(i);
            } catch (RemoteException e) {
                bnx.c.a(e, "Unable to call %s on %s.", "onConnectionSuspended", bqd.class.getSimpleName());
            }
        }

        public final void a(ConnectionResult connectionResult) {
            try {
                bnx.this.f.a(connectionResult);
            } catch (RemoteException e) {
                bnx.c.a(e, "Unable to call %s on %s.", "onConnectionFailed", bqd.class.getSimpleName());
            }
        }

        /* synthetic */ c(bnx bnx, byte b) {
            this();
        }
    }

    /* renamed from: bnx$d */
    class d extends defpackage.bnh.d {
        private d() {
        }

        public final void a(int i) {
            bnx.a(bnx.this, i);
            bnx.this.b(i);
            for (defpackage.bnh.d a2 : new HashSet(bnx.this.e)) {
                a2.a(i);
            }
        }

        public final void a() {
            for (defpackage.bnh.d a2 : new HashSet(bnx.this.e)) {
                a2.a();
            }
        }

        public final void a(bng bng) {
            for (defpackage.bnh.d a2 : new HashSet(bnx.this.e)) {
                a2.a(bng);
            }
        }

        public final void b(int i) {
            for (defpackage.bnh.d b : new HashSet(bnx.this.e)) {
                b.b(i);
            }
        }

        public final void c(int i) {
            for (defpackage.bnh.d c : new HashSet(bnx.this.e)) {
                c.c(i);
            }
        }

        public final void b() {
            for (defpackage.bnh.d b : new HashSet(bnx.this.e)) {
                b.b();
            }
        }

        /* synthetic */ d(bnx bnx, byte b) {
            this();
        }
    }

    public bnx(Context context, String str, String str2, bnw bnw, defpackage.bnh.b bVar, eii eii, egn egn) {
        super(context, str, str2);
        this.d = context.getApplicationContext();
        this.g = bnw;
        this.a = bVar;
        this.h = eii;
        this.i = egn;
        this.f = eif.a(context, bnw, i(), (bqb) new a(this, 0));
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    /* access modifiers changed from: protected */
    public final void b(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    /* access modifiers changed from: protected */
    public final void c(Bundle bundle) {
        e(bundle);
    }

    /* access modifiers changed from: protected */
    public final void d(Bundle bundle) {
        e(bundle);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        try {
            this.f.a(z);
        } catch (RemoteException e2) {
            c.a(e2, "Unable to call %s on %s.", "disconnectFromDevice", bqd.class.getSimpleName());
        }
        b(0);
    }

    public final boo a() {
        bwx.b("Must be called from the main thread.");
        return this.j;
    }

    public final CastDevice b() {
        bwx.b("Must be called from the main thread.");
        return this.k;
    }

    public final void a(double d2) {
        bwx.b("Must be called from the main thread.");
        bsh bsh = this.b;
        if (bsh != null) {
            this.a.a(bsh, d2);
        }
    }

    public final double c() {
        bwx.b("Must be called from the main thread.");
        bsh bsh = this.b;
        if (bsh != null) {
            return this.a.a(bsh);
        }
        return 0.0d;
    }

    public final void a(String str, e eVar) {
        bwx.b("Must be called from the main thread.");
        bsh bsh = this.b;
        if (bsh != null) {
            this.a.a(bsh, str, eVar);
        }
    }

    public final void a(String str) {
        bwx.b("Must be called from the main thread.");
        bsh bsh = this.b;
        if (bsh != null) {
            this.a.b(bsh, str);
        }
    }

    private final void e(Bundle bundle) {
        this.k = CastDevice.a(bundle);
        if (this.k != null) {
            bsh bsh = this.b;
            if (bsh != null) {
                bsh.g();
                this.b = null;
            }
            boolean z = true;
            c.a("Acquiring a connection to Google Play Services for %s", this.k);
            c cVar = new c(this, 0);
            Context context = this.d;
            CastDevice castDevice = this.k;
            bnw bnw = this.g;
            d dVar = new d(this, 0);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (bnw == null || bnw.d == null || bnw.d.c == null) ? false : true);
            if (bnw == null || bnw.d == null || !bnw.d.d) {
                z = false;
            }
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
            defpackage.bsh.a aVar = new defpackage.bsh.a(context);
            bsc<defpackage.bnh.c> bsc = bnh.a;
            defpackage.bnh.c.a aVar2 = new defpackage.bnh.c.a(castDevice, dVar);
            aVar2.c = bundle2;
            this.b = aVar.a(bsc, aVar2.a()).a((defpackage.bsh.b) cVar).a((defpackage.bsh.c) cVar).a();
            this.b.e();
        } else if (h()) {
            c(8);
        } else {
            a(8);
        }
    }

    public final long d() {
        bwx.b("Must be called from the main thread.");
        boo boo = this.j;
        if (boo == null) {
            return 0;
        }
        return boo.e() - this.j.d();
    }

    static /* synthetic */ void a(bnx bnx, int i2) {
        egn egn = bnx.i;
        if (egn.j) {
            egn.j = false;
            if (egn.f != null) {
                boo boo = egn.f;
                bwx.b("Must be called from the main thread.");
                boo.b.remove(egn);
            }
            if (!bzo.g()) {
                ((AudioManager) egn.a.getSystemService("audio")).abandonAudioFocus(null);
            }
            eir eir = egn.c;
            nd.a((MediaSessionCompat) null);
            egn.d.a();
            egn.e.a();
            if (egn.h != null) {
                egn.h.a((PendingIntent) null);
                egn.h.a((android.support.v4.media.session.MediaSessionCompat.a) null, (Handler) null);
                egn.h.a(new android.support.v4.media.MediaMetadataCompat.a().a());
                egn.a(0, (MediaInfo) null);
                egn.h.a(false);
                egn.h.b();
                egn.h = null;
            }
            egn.f = null;
            egn.g = null;
            egn.i = null;
            egn.f();
            if (i2 == 0) {
                egn.g();
            }
        }
        bsh bsh = bnx.b;
        if (bsh != null) {
            bsh.g();
            bnx.b = null;
        }
        bnx.k = null;
        boo boo2 = bnx.j;
        if (boo2 != null) {
            boo2.a((bsh) null);
            bnx.j = null;
        }
        bnx.l = null;
    }
}
