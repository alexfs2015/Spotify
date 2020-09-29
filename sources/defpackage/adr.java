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

/* renamed from: adr reason: default package */
public class adr implements act {
    public static final agd a = agd.a("connected.car.sdk");
    protected String b;
    protected final String c;
    public final Map<String, List<Object>> d = new HashMap();
    public HashMap<String, Boolean> e;
    public aev f;
    private final aet g = new aeu();
    private aew h;
    /* access modifiers changed from: private */
    public final Context i;
    /* access modifiers changed from: private */
    public String j;
    private final acu k;

    /* renamed from: adr$a */
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
                adr.a.b("register mSyncReceiver", new Object[0]);
                StringBuilder sb = new StringBuilder("ACTION_SYNC_BROADCASTER_RESPONSE");
                sb.append(adr.this.c);
                this.a = new Intent(sb.toString());
                this.c = Boolean.TRUE;
                adr.this.i.registerReceiver(this.d, new IntentFilter("ACTION_SYNC_BROADCASTER_REQUEST"));
            }
            this.b.postDelayed(new Runnable(adr.this) {
                public final void run() {
                    a.a(a.this);
                }
            }, 1000);
        }

        static /* synthetic */ void a(a aVar) {
            Boolean bool;
            synchronized (aVar.c) {
                if (aVar.c.booleanValue()) {
                    adr.a.b("unregister mSyncReceiver", new Object[0]);
                    try {
                        adr.this.i.unregisterReceiver(aVar.d);
                        bool = Boolean.FALSE;
                    } catch (IllegalArgumentException e2) {
                        try {
                            adr.a.c("Error unregistering mSyncReceiver %s", e2.getMessage());
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

        public final void a() {
            String str = "init";
            adr.a.b("sendNotification(%s, %s)", "ACTION_SYNC_BROADCASTER_REQUEST", str);
            this.a.putExtra("EXTRA_SYNC_BROADCASTER_RESPONSE_STRING", "success");
            this.a.putExtra("EXTRA_SYNC_BROADCASTER_IDENT", str);
            this.a.putExtra("EXTRA_SYNC_BROADCASTER_SESSION_ID", adr.this.j);
            adr.this.i.sendBroadcast(this.a);
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

    public adr(Context context, acu acu) {
        this.i = context;
        this.k = acu;
        this.c = context.getPackageName();
    }

    public final acr a() {
        return (acr) SdkManager.INSTANCE.b(this.b);
    }

    public void a(acr acr) {
        if (acr != null) {
            this.b = SdkManager.INSTANCE.a(acr);
            SdkManager.INSTANCE.a(this.b, acr, true);
            ((aew) agu.a(this.c).a((Type) aes.class)).a(SdkManager.INSTANCE.mApplicationName, this.b);
            return;
        }
        a.b("called setListener(NULL)", new Object[0]);
    }

    public final void a(String str) {
        c().a(str);
    }

    public final void b() {
        SdkManager.INSTANCE.b();
        SdkManager.INSTANCE.mApplicationName = this.c;
        SdkManager sdkManager = SdkManager.INSTANCE;
        sdkManager.a(sdkManager.mApplicationName, this.k, true);
        agu.a(this.i, SdkManager.INSTANCE.mApplicationName, null);
        agu a2 = agu.a(this.c);
        Class<aet> cls = aet.class;
        Class<aex> cls2 = aex.class;
        Class<aet> cls3 = aet.class;
        aet aet = this.g;
        try {
            agt agt = (agt) cls2.newInstance();
            agt.j(this.c);
            a2.d.put(cls, agt);
            a2.f.put(cls3, aet);
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        agu a3 = agu.a(this.c);
        Class<aes> cls4 = aes.class;
        Class<aew> cls5 = aew.class;
        try {
            agv agv = (agv) cls5.newInstance();
            agv.b(this.c);
            a3.e.put(cls4, agv);
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        }
        agu a4 = agu.a(this.c);
        if (!a4.c) {
            for (agt m : a4.d.values()) {
                m.m();
            }
            a4.c = true;
        }
        this.h = (aew) agu.a(this.c).a((Type) aes.class);
        this.j = UUID.randomUUID().toString();
        new a().a();
        this.f = new aev(this.c, this.i, this.j);
        aev aev = this.f;
        StringBuilder sb = new StringBuilder("ACTION_SYNC_BROADCASTER_REQUEST");
        sb.append(aev.b);
        String sb2 = sb.toString();
        aev.a.b("activate(%s)", sb2);
        aev.c.registerReceiver(aev.e, new IntentFilter(sb2));
    }

    /* access modifiers changed from: protected */
    public final aew c() {
        if (this.h == null) {
            this.h = (aew) agu.a(this.c).a((Type) aes.class);
        }
        return this.h;
    }
}
