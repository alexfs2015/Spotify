package com.spotify.mobile.android.spotlets.appprotocol.service;

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

public class AppProtocolRemoteService extends vtp implements defpackage.hhe.a<hne>, defpackage.iih.a {
    private static final String u = AppProtocolRemoteService.class.getName();
    private final List<iia> A = new ArrayList();
    private Handler B;
    public rnf a;
    public hnj b;
    public Flowable<PlayerState> c;
    public jed d;
    public Scheduler e;
    public Scheduler f;
    public Scheduler g;
    public htx h;
    public SpeedControlInteractor i;
    public wlc<iix> j;
    public ver k;
    public ktg l;
    public ksw m;
    public ktp n;
    public kua o;
    public ktn p;
    public jrp q;
    public vjo r;
    public ijq s;
    public ueb t;
    private final Messenger v = new Messenger(new a(this, 0));
    private final Set<Message> w = new HashSet();
    private hne x;
    private Disposable y;
    private ClientIdentity z;

    static class a extends Handler {
        private final WeakReference<AppProtocolRemoteService> a;

        /* synthetic */ a(AppProtocolRemoteService appProtocolRemoteService, byte b) {
            this(appProtocolRemoteService);
        }

        private a(AppProtocolRemoteService appProtocolRemoteService) {
            this.a = new WeakReference<>(appProtocolRemoteService);
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

    public final /* synthetic */ void a(Object obj) {
        this.x = (hne) obj;
        for (Message message : this.w) {
            a(message);
            message.recycle();
        }
        this.w.clear();
    }

    public final void a(iia iia, boolean z2) {
        this.B.post(new Runnable(z2, iia) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ iia f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AppProtocolRemoteService.this.a(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, iia iia) {
        if (z2) {
            ClientIdentity clientIdentity = this.z;
            if (clientIdentity != null) {
                String a2 = a((Context) this, clientIdentity);
                this.h.a(u, getString(R.string.app_remote_notification_is_connected, new Object[]{a2}));
                return;
            }
        }
        this.B.post(new Runnable(iia) {
            private final /* synthetic */ iia f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppProtocolRemoteService.this.f(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(iia iia) {
        this.A.remove(iia);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(iia iia) {
        this.A.remove(iia);
    }

    public final void a(iia iia) {
        this.B.post(new Runnable(iia) {
            private final /* synthetic */ iia f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppProtocolRemoteService.this.e(this.f$1);
            }
        });
    }

    private void a(Message message) {
        Message message2 = message;
        iie iie = new iie(message2.replyTo);
        try {
            this.z = ClientIdentity.a((Context) this, message2.arg1);
            String a2 = a((Context) this, this.z);
            this.h.a(u, getString(R.string.app_remote_notification_is_connecting, new Object[]{a2}));
            iim iim = new iim(new ije(a()), iie, Executors.newSingleThreadExecutor(), this.f);
            iii iii = new iii(this, this.x, iif.a(2, 1, 4, 8), (iix) this.j.get(), this.i, this.e, this.g, this.m, this.t);
            kta kta = new kta((ClientIdentity) fay.a(this.z), getApplication(), this.k, this.l, this.m, this.n, this.p, this.q, this.o);
            iim iim2 = iim;
            iii iii2 = iii;
            iia iia = new iia(iim2, iii2, ImmutableMap.b("appid", kta), true, "app_remote", "inter_app", this.s);
            this.A.add(iia);
            iim.c = new iic(iia);
            iim.b = new iih(iia, iim, this.s, this);
            iie.a = new defpackage.iie.a(iia) {
                private final /* synthetic */ iia f$1;

                {
                    this.f$1 = r2;
                }

                public final void onIoDied() {
                    AppProtocolRemoteService.this.c(this.f$1);
                }
            };
            b();
            iie.a();
            iie.a(true);
        } catch (ValidationException unused) {
            Logger.e("Cannot validate calling identity", new Object[0]);
            stopSelf();
            iie.a(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(iia iia) {
        Logger.c("Remote client died. Stop the session", new Object[0]);
        this.B.post(new Runnable(iia) {
            private final /* synthetic */ iia f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppProtocolRemoteService.this.d(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(iia iia) {
        b(iia);
        this.A.remove(iia);
    }

    private ObjectMapper a() {
        return this.a.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a();
    }

    public void onCreate() {
        super.onCreate();
        this.h.a((Service) this, u);
        this.B = new Handler();
        this.b.a((defpackage.hhe.a<hne>) this);
        this.b.a();
    }

    private void b() {
        Disposable disposable = this.y;
        if (disposable != null) {
            disposable.bf_();
        }
        this.y = this.c.c((Function<? super T, ? extends R>) $$Lambda$AppProtocolRemoteService$o4S_ezq09lqGzbzZpj38mIrpFRA.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(0).a(5, TimeUnit.MINUTES).a(this.e).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                AppProtocolRemoteService.this.a((Boolean) obj);
            }
        }, (Consumer<? super Throwable>) new Consumer() {
            public final void accept(Object obj) {
                AppProtocolRemoteService.this.a((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf(!playerState.isPaused() && playerState.isPlaying());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.h.b(this, u);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.h.b(this, u);
    }

    public IBinder onBind(Intent intent) {
        return this.v.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        stopSelf();
        return super.onUnbind(intent);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        this.h.a((Service) this, u);
        this.r.b(intent);
        return 1;
    }

    public void onDestroy() {
        Disposable disposable = this.y;
        if (disposable != null) {
            disposable.bf_();
        }
        this.h.b(this, u);
        this.b.b();
        this.b.b(this);
        super.onDestroy();
    }

    public final void e() {
        c();
        this.x = null;
    }

    private void c() {
        for (iia b2 : this.A) {
            b(b2);
        }
        this.A.clear();
    }

    public void onTaskRemoved(Intent intent) {
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            c();
        }
    }

    private static String a(Context context, ClientIdentity clientIdentity) {
        ApplicationInfo applicationInfo;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(clientIdentity.a, 0);
        } catch (NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            obj = packageManager.getApplicationLabel(applicationInfo);
        } else {
            obj = context.getString(R.string.app_remote_notification_is_connected_fallback);
        }
        return (String) obj;
    }

    private static void b(iia iia) {
        if (iia.i != 2) {
            iia.a("wamp.error.system_shutdown");
        }
    }

    static /* synthetic */ void a(AppProtocolRemoteService appProtocolRemoteService, Message message) {
        if (message.replyTo == null) {
            appProtocolRemoteService.stopSelf();
            Logger.e("No remote Messenger to reply to", new Object[0]);
        } else if (appProtocolRemoteService.x != null) {
            appProtocolRemoteService.a(message);
        } else {
            if (!appProtocolRemoteService.b.c) {
                appProtocolRemoteService.b.a();
            }
            appProtocolRemoteService.w.add(Message.obtain(message));
        }
    }
}
