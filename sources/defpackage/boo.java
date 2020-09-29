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

/* renamed from: boo reason: default package */
public class boo extends bou {
    /* access modifiers changed from: private */
    public static final ein c = new ein("CastSession", 0);
    public final defpackage.bny.b a;
    public bsy b;
    private final Context d;
    /* access modifiers changed from: private */
    public final Set<defpackage.bny.d> e = new HashSet();
    /* access modifiers changed from: private */
    public final bqu f;
    private final bon g;
    private final eiz h;
    /* access modifiers changed from: private */
    public final ehe i;
    /* access modifiers changed from: private */
    public bpf j;
    private CastDevice k;
    /* access modifiers changed from: private */
    public defpackage.bny.a l;

    /* renamed from: boo$a */
    class a extends bqr {
        private a() {
        }

        /* synthetic */ a(boo boo, byte b) {
            this();
        }

        public final void a(int i) {
            boo.a(boo.this, i);
        }

        public final void a(String str) {
            if (boo.this.b != null) {
                boo.this.a.a(boo.this.b, str);
            }
        }

        public final void a(String str, boa boa) {
            if (boo.this.b != null) {
                boo.this.a.a(boo.this.b, str, boa).a((btd<? super R>) new b<Object>("launchApplication"));
            }
        }

        public final void a(String str, String str2) {
            if (boo.this.b != null) {
                boo.this.a.b(boo.this.b, str, str2).a((btd<? super R>) new b<Object>("joinApplication"));
            }
        }
    }

    /* renamed from: boo$b */
    class b implements btd<defpackage.bny.a> {
        private String a;

        b(String str) {
            this.a = str;
        }

        public final /* synthetic */ void onResult(btc btc) {
            defpackage.bny.a aVar = (defpackage.bny.a) btc;
            boo.this.l = aVar;
            try {
                if (aVar.B_().c()) {
                    boo.c.a("%s() -> success result", this.a);
                    boo.this.j = new bpf(new eim(), boo.this.a);
                    try {
                        boo.this.j.a(boo.this.b);
                        boo.this.j.a();
                        boo.this.j.c();
                        ehe f = boo.this.i;
                        bpf a2 = boo.this.j;
                        CastDevice b2 = boo.this.b();
                        if (!(f.j || f.b == null || f.b.d == null || a2 == null)) {
                            if (b2 != null) {
                                f.f = a2;
                                bpf bpf = f.f;
                                bxo.b("Must be called from the main thread.");
                                bpf.b.add(f);
                                f.g = b2;
                                if (!caf.g()) {
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
                                f.i = new ehi(f);
                                f.h.a(f.i, (Handler) null);
                                f.h.a(true);
                                eji eji = f.c;
                                ni.a(f.h);
                                f.j = true;
                                f.a(false);
                            }
                        }
                    } catch (IOException e) {
                        boo.c.b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        boo.this.j = null;
                    }
                    boo.this.f.a(aVar.a(), aVar.b(), aVar.c(), aVar.d());
                    return;
                }
                boo.c.a("%s() -> failure result", this.a);
                boo.this.f.b(aVar.B_().f);
            } catch (RemoteException e2) {
                boo.c.a(e2, "Unable to call %s on %s.", "methods", bqu.class.getSimpleName());
            }
        }
    }

    /* renamed from: boo$c */
    class c implements defpackage.bsy.b, defpackage.bsy.c {
        private c() {
        }

        /* synthetic */ c(boo boo, byte b) {
            this();
        }

        public final void a(int i) {
            try {
                boo.this.f.a(i);
            } catch (RemoteException e) {
                boo.c.a(e, "Unable to call %s on %s.", "onConnectionSuspended", bqu.class.getSimpleName());
            }
        }

        public final void a(Bundle bundle) {
            try {
                if (boo.this.j != null) {
                    try {
                        boo.this.j.a();
                        boo.this.j.c();
                    } catch (IOException e) {
                        boo.c.b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        boo.this.j = null;
                    }
                }
                boo.this.f.a(bundle);
            } catch (RemoteException e2) {
                boo.c.a(e2, "Unable to call %s on %s.", "onConnected", bqu.class.getSimpleName());
            }
        }

        public final void a(ConnectionResult connectionResult) {
            try {
                boo.this.f.a(connectionResult);
            } catch (RemoteException e) {
                boo.c.a(e, "Unable to call %s on %s.", "onConnectionFailed", bqu.class.getSimpleName());
            }
        }
    }

    /* renamed from: boo$d */
    class d extends defpackage.bny.d {
        private d() {
        }

        /* synthetic */ d(boo boo, byte b) {
            this();
        }

        public final void a() {
            for (defpackage.bny.d a2 : new HashSet(boo.this.e)) {
                a2.a();
            }
        }

        public final void a(int i) {
            boo.a(boo.this, i);
            boo.this.b(i);
            for (defpackage.bny.d a2 : new HashSet(boo.this.e)) {
                a2.a(i);
            }
        }

        public final void a(bnx bnx) {
            for (defpackage.bny.d a2 : new HashSet(boo.this.e)) {
                a2.a(bnx);
            }
        }

        public final void b() {
            for (defpackage.bny.d b : new HashSet(boo.this.e)) {
                b.b();
            }
        }

        public final void b(int i) {
            for (defpackage.bny.d b : new HashSet(boo.this.e)) {
                b.b(i);
            }
        }

        public final void c(int i) {
            for (defpackage.bny.d c : new HashSet(boo.this.e)) {
                c.c(i);
            }
        }
    }

    public boo(Context context, String str, String str2, bon bon, defpackage.bny.b bVar, eiz eiz, ehe ehe) {
        super(context, str, str2);
        this.d = context.getApplicationContext();
        this.g = bon;
        this.a = bVar;
        this.h = eiz;
        this.i = ehe;
        this.f = eiw.a(context, bon, i(), (bqs) new a(this, 0));
    }

    static /* synthetic */ void a(boo boo, int i2) {
        ehe ehe = boo.i;
        if (ehe.j) {
            ehe.j = false;
            if (ehe.f != null) {
                bpf bpf = ehe.f;
                bxo.b("Must be called from the main thread.");
                bpf.b.remove(ehe);
            }
            if (!caf.g()) {
                ((AudioManager) ehe.a.getSystemService("audio")).abandonAudioFocus(null);
            }
            eji eji = ehe.c;
            ni.a((MediaSessionCompat) null);
            ehe.d.a();
            ehe.e.a();
            if (ehe.h != null) {
                ehe.h.a((PendingIntent) null);
                ehe.h.a((android.support.v4.media.session.MediaSessionCompat.a) null, (Handler) null);
                ehe.h.a(new android.support.v4.media.MediaMetadataCompat.a().a());
                ehe.a(0, (MediaInfo) null);
                ehe.h.a(false);
                ehe.h.b();
                ehe.h = null;
            }
            ehe.f = null;
            ehe.g = null;
            ehe.i = null;
            ehe.f();
            if (i2 == 0) {
                ehe.g();
            }
        }
        bsy bsy = boo.b;
        if (bsy != null) {
            bsy.g();
            boo.b = null;
        }
        boo.k = null;
        bpf bpf2 = boo.j;
        if (bpf2 != null) {
            bpf2.a((bsy) null);
            boo.j = null;
        }
        boo.l = null;
    }

    private final void e(Bundle bundle) {
        this.k = CastDevice.a(bundle);
        if (this.k != null) {
            bsy bsy = this.b;
            if (bsy != null) {
                bsy.g();
                this.b = null;
            }
            boolean z = true;
            c.a("Acquiring a connection to Google Play Services for %s", this.k);
            c cVar = new c(this, 0);
            Context context = this.d;
            CastDevice castDevice = this.k;
            bon bon = this.g;
            d dVar = new d(this, 0);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (bon == null || bon.d == null || bon.d.c == null) ? false : true);
            if (bon == null || bon.d == null || !bon.d.d) {
                z = false;
            }
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
            defpackage.bsy.a aVar = new defpackage.bsy.a(context);
            bst<defpackage.bny.c> bst = bny.a;
            defpackage.bny.c.a aVar2 = new defpackage.bny.c.a(castDevice, dVar);
            aVar2.c = bundle2;
            this.b = aVar.a(bst, aVar2.a()).a((defpackage.bsy.b) cVar).a((defpackage.bsy.c) cVar).a();
            this.b.e();
        } else if (h()) {
            c(8);
        } else {
            a(8);
        }
    }

    public final bpf a() {
        bxo.b("Must be called from the main thread.");
        return this.j;
    }

    public final void a(double d2) {
        bxo.b("Must be called from the main thread.");
        bsy bsy = this.b;
        if (bsy != null) {
            this.a.a(bsy, d2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    public final void a(String str) {
        bxo.b("Must be called from the main thread.");
        bsy bsy = this.b;
        if (bsy != null) {
            this.a.b(bsy, str);
        }
    }

    public final void a(String str, e eVar) {
        bxo.b("Must be called from the main thread.");
        bsy bsy = this.b;
        if (bsy != null) {
            this.a.a(bsy, str, eVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        try {
            this.f.a(z);
        } catch (RemoteException e2) {
            c.a(e2, "Unable to call %s on %s.", "disconnectFromDevice", bqu.class.getSimpleName());
        }
        b(0);
    }

    public final CastDevice b() {
        bxo.b("Must be called from the main thread.");
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final void b(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    public final double c() {
        bxo.b("Must be called from the main thread.");
        bsy bsy = this.b;
        if (bsy != null) {
            return this.a.a(bsy);
        }
        return 0.0d;
    }

    /* access modifiers changed from: protected */
    public final void c(Bundle bundle) {
        e(bundle);
    }

    public final long d() {
        bxo.b("Must be called from the main thread.");
        bpf bpf = this.j;
        if (bpf == null) {
            return 0;
        }
        return bpf.e() - this.j.d();
    }

    /* access modifiers changed from: protected */
    public final void d(Bundle bundle) {
        e(bundle);
    }
}
