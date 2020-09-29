package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: add reason: default package */
public class add implements acf {
    public static final afp a = afp.a("connected.car.sdk");
    protected String b;
    protected final String c;
    public final Map<String, List<Object>> d = new HashMap();
    public HashMap<String, Boolean> e;
    public aeh f;
    private final aef g = new aeg();
    private aei h;
    /* access modifiers changed from: private */
    public final Context i;
    /* access modifiers changed from: private */
    public String j;
    private final acg k;

    /* renamed from: add$a */
    class a {
        private final Intent a;
        private final Handler b = new Handler();
        private Boolean c = Boolean.FALSE;
        private final BroadcastReceiver d = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                a.this.a();
                a.a(a.this);
            }
        };

        public a() {
            synchronized (this.c) {
                add.a.b("register mSyncReceiver", new Object[0]);
                StringBuilder sb = new StringBuilder("ACTION_SYNC_BROADCASTER_RESPONSE");
                sb.append(add.this.c);
                this.a = new Intent(sb.toString());
                this.c = Boolean.TRUE;
                add.this.i.registerReceiver(this.d, new IntentFilter("ACTION_SYNC_BROADCASTER_REQUEST"));
            }
            this.b.postDelayed(new Runnable(add.this) {
                public final void run() {
                    a.a(a.this);
                }
            }, 1000);
        }

        public final void a() {
            String str = "init";
            add.a.b("sendNotification(%s, %s)", "ACTION_SYNC_BROADCASTER_REQUEST", str);
            this.a.putExtra("EXTRA_SYNC_BROADCASTER_RESPONSE_STRING", "success");
            this.a.putExtra("EXTRA_SYNC_BROADCASTER_IDENT", str);
            this.a.putExtra("EXTRA_SYNC_BROADCASTER_SESSION_ID", add.this.j);
            add.this.i.sendBroadcast(this.a);
        }

        static /* synthetic */ void a(a aVar) {
            Boolean bool;
            synchronized (aVar.c) {
                if (aVar.c.booleanValue()) {
                    add.a.b("unregister mSyncReceiver", new Object[0]);
                    try {
                        add.this.i.unregisterReceiver(aVar.d);
                        bool = Boolean.FALSE;
                    } catch (IllegalArgumentException e2) {
                        try {
                            add.a.c("Error unregistering mSyncReceiver %s", e2.getMessage());
                            bool = Boolean.FALSE;
                        } catch (Throwable th) {
                            aVar.c = Boolean.FALSE;
                            throw th;
                        }
                    }
                    aVar.c = bool;
                }
            }
        }
    }

    static {
        String[] strArr = {"geo.currentPosition", "geo.bearing", "geo.finalDestination"};
        new String[1][0] = "telephony";
        new String[1][0] = "consumption";
        new String[1][0] = "rawcds";
        new String[1][0] = "instrumentcluster";
        new String[1][0] = "voicerecorder";
    }

    public add(Context context, acg acg) {
        this.i = context;
        this.k = acg;
        this.c = context.getPackageName();
    }

    public final void b() {
        SdkManager.INSTANCE.b();
        SdkManager.INSTANCE.mApplicationName = this.c;
        SdkManager sdkManager = SdkManager.INSTANCE;
        sdkManager.a(sdkManager.mApplicationName, this.k, true);
        agg.a(this.i, SdkManager.INSTANCE.mApplicationName, null);
        agg a2 = agg.a(this.c);
        Class<aef> cls = aef.class;
        Class<aej> cls2 = aej.class;
        Class<aef> cls3 = aef.class;
        aef aef = this.g;
        try {
            agf agf = (agf) cls2.newInstance();
            agf.j(this.c);
            a2.d.put(cls, agf);
            a2.f.put(cls3, aef);
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        agg a3 = agg.a(this.c);
        Class<aee> cls4 = aee.class;
        Class<aei> cls5 = aei.class;
        try {
            agh agh = (agh) cls5.newInstance();
            agh.c(this.c);
            a3.e.put(cls4, agh);
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        }
        agg a4 = agg.a(this.c);
        if (!a4.c) {
            for (agf m : a4.d.values()) {
                m.m();
            }
            a4.c = true;
        }
        this.h = (aei) agg.a(this.c).a((Type) aee.class);
        this.j = UUID.randomUUID().toString();
        new a().a();
        this.f = new aeh(this.c, this.i, this.j);
        aeh aeh = this.f;
        StringBuilder sb = new StringBuilder("ACTION_SYNC_BROADCASTER_REQUEST");
        sb.append(aeh.b);
        String sb2 = sb.toString();
        aeh.a.b("activate(%s)", sb2);
        aeh.c.registerReceiver(aeh.e, new IntentFilter(sb2));
    }

    public final void a(String str) {
        c().a(str);
    }

    public void a(acd acd) {
        if (acd != null) {
            this.b = SdkManager.INSTANCE.a(acd);
            SdkManager.INSTANCE.a(this.b, acd, true);
            ((aei) agg.a(this.c).a((Type) aee.class)).a(SdkManager.INSTANCE.mApplicationName, this.b);
            return;
        }
        a.b("called setListener(NULL)", new Object[0]);
    }

    public final acd a() {
        return (acd) SdkManager.INSTANCE.b(this.b);
    }

    /* access modifiers changed from: protected */
    public final aei c() {
        if (this.h == null) {
            this.h = (aei) agg.a(this.c).a((Type) aee.class);
        }
        return this.h;
    }
}
