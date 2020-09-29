package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.ClientIdentity.ValidationException;
import com.spotify.music.R;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AppProtocolRemoteService extends whv implements defpackage.hjy.a<hpt>, defpackage.iku.a {
    private static final String v = AppProtocolRemoteService.class.getName();
    private ClientIdentity A;
    private final List<ikn> B = new ArrayList();
    private Handler C;
    public rwl a;
    public hpy b;
    public Flowable<PlayerState> c;
    public jgs d;
    public Scheduler e;
    public Scheduler f;
    public Scheduler g;
    public hwj h;
    public SpeedControlInteractor i;
    public wzi<ilk> j;
    public vro k;
    public kwp l;
    public kwf m;
    public kwy n;
    public kxj o;
    public kww p;
    public jtz q;
    public vwu r;
    public imd s;
    public mip t;
    public jty u;
    private final Messenger w = new Messenger(new a(this, 0));
    private final Set<Message> x = new HashSet();
    private hpt y;
    private Disposable z;

    static class a extends Handler {
        private final WeakReference<AppProtocolRemoteService> a;

        private a(AppProtocolRemoteService appProtocolRemoteService) {
            this.a = new WeakReference<>(appProtocolRemoteService);
        }

        /* synthetic */ a(AppProtocolRemoteService appProtocolRemoteService, byte b) {
            this(appProtocolRemoteService);
        }

        public final void handleMessage(Message message) {
            AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) this.a.get();
            if (appProtocolRemoteService != null) {
                AppProtocolRemoteService.a(appProtocolRemoteService, message);
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            if (VERSION.SDK_INT >= 21) {
                message.arg1 = message.sendingUid;
            } else {
                message.arg1 = Binder.getCallingUid();
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    private ObjectMapper a() {
        return this.a.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf(!playerState.isPaused() && playerState.isPlaying());
    }

    private static String a(Context context, ClientIdentity clientIdentity) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(clientIdentity.a, 0);
        } catch (NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : context.getString(R.string.app_remote_notification_is_connected_fallback));
    }

    private void a(Message message) {
        Message message2 = message;
        Message message3 = message;
        ikr ikr = new ikr(message3.replyTo);
        try {
            this.A = ClientIdentity.a((Context) this, message3.arg1);
            String a2 = a((Context) this, this.A);
            this.h.a(v, getString(R.string.app_remote_notification_is_connecting, new Object[]{a2}));
            ikz ikz = new ikz(new ilr(a()), ikr, Executors.newSingleThreadExecutor(), this.f);
            ikv ikv = new ikv(this, this.y, iks.a(2, 1, 4, 8), (ilk) this.j.get(), this.i, this.e, this.g, this.m, this.t, this.u);
            ClientIdentity clientIdentity = (ClientIdentity) fbp.a(this.A);
            Application application = getApplication();
            vro vro = this.k;
            kwp kwp = this.l;
            kwf kwf = this.m;
            kwy kwy = this.n;
            kww kww = this.p;
            jtz jtz = this.q;
            kwj kwj = r16;
            kwp kwp2 = kwp;
            kwf kwf2 = kwf;
            kwy kwy2 = kwy;
            kww kww2 = kww;
            jtz jtz2 = jtz;
            kwj kwj2 = new kwj(clientIdentity, application, vro, kwp, kwf, kwy, kww, jtz, this.o);
            String str = "ppsre_tna";
            ikz ikz2 = ikz;
            ikz ikz3 = ikz;
            ikv ikv2 = ikv;
            ikv ikv3 = ikv;
            ikn ikn = new ikn(ikz3, ikv3, ImmutableMap.b("appid", kwj2), true, "app_remote", "inter_app", this.s);
            this.B.add(ikn);
            ikz.c = new ikp(ikn);
            ikz.b = new iku(ikn, ikz, this.s, this);
            ikr.a = new defpackage.ikr.a(ikn) {
                private final /* synthetic */ ikn f$1;

                {
                    this.f$1 = r2;
                }

                public final void onIoDied() {
                    AppProtocolRemoteService.this.c(this.f$1);
                }
            };
            b();
            ikr.a();
            ikr.a(true);
        } catch (ValidationException unused) {
            Logger.e("Cannot validate calling identity", new Object[0]);
            stopSelf();
            ikr.a(false);
        }
    }

    static /* synthetic */ void a(AppProtocolRemoteService appProtocolRemoteService, Message message) {
        if (message.replyTo == null) {
            appProtocolRemoteService.stopSelf();
            String str = "lotmrsogr tMeersoeem p tey noe ";
            Logger.e("No remote Messenger to reply to", new Object[0]);
        } else if (appProtocolRemoteService.y != null) {
            appProtocolRemoteService.a(message);
        } else {
            if (!appProtocolRemoteService.b.c) {
                appProtocolRemoteService.b.a();
            }
            appProtocolRemoteService.x.add(Message.obtain(message));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.h.b(this, v);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.h.b(this, v);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, ikn ikn) {
        if (z2) {
            ClientIdentity clientIdentity = this.A;
            if (clientIdentity != null) {
                String a2 = a((Context) this, clientIdentity);
                this.h.a(v, getString(R.string.app_remote_notification_is_connected, new Object[]{a2}));
                return;
            }
        }
        this.C.post(new Runnable(ikn) {
            private final /* synthetic */ ikn f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppProtocolRemoteService.this.f(this.f$1);
            }
        });
    }

    private void b() {
        Disposable disposable = this.z;
        if (disposable != null) {
            disposable.bd_();
        }
        this.z = this.c.c((Function<? super T, ? extends R>) $$Lambda$AppProtocolRemoteService$o4S_ezq09lqGzbzZpj38mIrpFRA.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(0).a(5, TimeUnit.MINUTES).a(this.e).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                AppProtocolRemoteService.this.a((Boolean) obj);
            }
        }, (Consumer<? super Throwable>) new Consumer() {
            public final void accept(Object obj) {
                AppProtocolRemoteService.this.a((Throwable) obj);
            }
        });
    }

    private static void b(ikn ikn) {
        if (ikn.i != 2) {
            String str = "mshdonp..uesrroyaetostwrmw";
            ikn.a("wamp.error.system_shutdown");
        }
    }

    private void c() {
        for (ikn b2 : this.B) {
            b(b2);
        }
        this.B.clear();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(ikn ikn) {
        String str = " eodebt sdne tisocnept tSRlems.hiie ";
        Logger.c("Remote client died. Stop the session", new Object[0]);
        this.C.post(new Runnable(ikn) {
            private final /* synthetic */ ikn f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppProtocolRemoteService.this.d(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(ikn ikn) {
        b(ikn);
        this.B.remove(ikn);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(ikn ikn) {
        this.B.remove(ikn);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(ikn ikn) {
        this.B.remove(ikn);
    }

    public final void a(ikn ikn) {
        this.C.post(new Runnable(ikn) {
            private final /* synthetic */ ikn f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppProtocolRemoteService.this.e(this.f$1);
            }
        });
    }

    public final void a(ikn ikn, boolean z2) {
        this.C.post(new Runnable(z2, ikn) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ ikn f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AppProtocolRemoteService.this.a(this.f$1, this.f$2);
            }
        });
    }

    public final /* synthetic */ void a(Object obj) {
        this.y = (hpt) obj;
        for (Message message : this.x) {
            a(message);
            message.recycle();
        }
        this.x.clear();
    }

    public final void e() {
        c();
        this.y = null;
    }

    public IBinder onBind(Intent intent) {
        return this.w.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.h.a((Service) this, v);
        this.C = new Handler();
        this.b.a((defpackage.hjy.a<hpt>) this);
        this.b.a();
    }

    public void onDestroy() {
        Disposable disposable = this.z;
        if (disposable != null) {
            disposable.bd_();
        }
        this.h.b(this, v);
        this.b.b();
        this.b.b(this);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        this.h.a((Service) this, v);
        this.r.b(intent);
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        String str = "NMtncibAeindoIo.tatnrad.i.";
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            c();
        }
    }

    public boolean onUnbind(Intent intent) {
        stopSelf();
        return super.onUnbind(intent);
    }
}
