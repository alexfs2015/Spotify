package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: fl reason: default package */
public final class fl {
    private static final Object c = new Object();
    private static String d;
    private static Set<String> e = new HashSet();
    private static final Object f = new Object();
    private static d g;
    public final Context a;
    public final NotificationManager b = ((NotificationManager) this.a.getSystemService("notification"));

    /* renamed from: fl$a */
    public static class a implements e {
        private String a;
        private int b;
        private String c;
        private boolean d = false;

        public a(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public final void a(e eVar) {
            eVar.a(this.a, this.b, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            sb.append(this.c);
            sb.append(", all:false");
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: fl$b */
    static class b implements e {
        private String a;
        private int b;
        private String c;
        private Notification d;

        b(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        public final void a(e eVar) {
            eVar.a(this.a, this.b, this.c, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: fl$c */
    static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* renamed from: fl$d */
    static class d implements ServiceConnection, Callback {
        private final Context a;
        private final HandlerThread b;
        private final Handler c;
        private final Map<ComponentName, a> d = new HashMap();
        private Set<String> e = new HashSet();

        /* renamed from: fl$d$a */
        static class a {
            final ComponentName a;
            boolean b = false;
            e c;
            ArrayDeque<e> d = new ArrayDeque<>();
            int e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        d(Context context) {
            this.a = context;
            this.b = new HandlerThread("NotificationManagerCompat");
            this.b.start();
            this.c = new Handler(this.b.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            aVar.b = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
            if (aVar.b) {
                aVar.e = 0;
            } else {
                new StringBuilder("Unable to bind to listener ").append(aVar.a);
                this.a.unbindService(this);
            }
            return aVar.b;
        }

        private void b(a aVar) {
            if (aVar.b) {
                this.a.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        private void c(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                aVar.e++;
                if (aVar.e > 6) {
                    StringBuilder sb = new StringBuilder("Giving up on delivering ");
                    sb.append(aVar.d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.a);
                    sb.append(" after ");
                    sb.append(aVar.e);
                    sb.append(" retries");
                    aVar.d.clear();
                    return;
                }
                int i = (1 << (aVar.e - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb2 = new StringBuilder("Scheduling retry for ");
                    sb2.append(i);
                    sb2.append(" ms");
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i);
            }
        }

        private void d(a aVar) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder("Processing component ");
                sb.append(aVar.a);
                sb.append(", ");
                sb.append(aVar.d.size());
                sb.append(" queued tasks");
            }
            if (!aVar.d.isEmpty()) {
                if (!a(aVar) || aVar.c == null) {
                    c(aVar);
                    return;
                }
                while (true) {
                    e eVar = (e) aVar.d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(str, 3)) {
                            new StringBuilder("Sending task ").append(eVar);
                        }
                        eVar.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(str, 3)) {
                            new StringBuilder("Remote service has died: ").append(aVar.a);
                        }
                    } catch (RemoteException unused2) {
                        new StringBuilder("RemoteException communicating with ").append(aVar.a);
                    }
                }
                if (!aVar.d.isEmpty()) {
                    c(aVar);
                }
            }
        }

        public final void a(e eVar) {
            this.c.obtainMessage(0, eVar).sendToTarget();
        }

        public final boolean handleMessage(Message message) {
            String str;
            int i = message.what;
            if (i == 0) {
                e eVar = (e) message.obj;
                Set<String> b2 = fl.b(this.a);
                if (!b2.equals(this.e)) {
                    this.e = b2;
                    List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (b2.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                StringBuilder sb = new StringBuilder("Permission present on component ");
                                sb.append(componentName);
                                sb.append(", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (true) {
                        str = "NotifManCompat";
                        if (!it.hasNext()) {
                            break;
                        }
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.d.containsKey(componentName2)) {
                            if (Log.isLoggable(str, 3)) {
                                new StringBuilder("Adding listener record for ").append(componentName2);
                            }
                            this.d.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator it2 = this.d.entrySet().iterator();
                    while (it2.hasNext()) {
                        Entry entry = (Entry) it2.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable(str, 3)) {
                                new StringBuilder("Removing listener record for ").append(entry.getKey());
                            }
                            b((a) entry.getValue());
                            it2.remove();
                        }
                    }
                }
                for (a aVar : this.d.values()) {
                    aVar.d.add(eVar);
                    d(aVar);
                }
                return true;
            } else if (i == 1) {
                c cVar = (c) message.obj;
                ComponentName componentName3 = cVar.a;
                IBinder iBinder = cVar.b;
                a aVar2 = (a) this.d.get(componentName3);
                if (aVar2 != null) {
                    aVar2.c = defpackage.e.a.a(iBinder);
                    aVar2.e = 0;
                    d(aVar2);
                }
                return true;
            } else if (i == 2) {
                a aVar3 = (a) this.d.get((ComponentName) message.obj);
                if (aVar3 != null) {
                    b(aVar3);
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                a aVar4 = (a) this.d.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    d(aVar4);
                }
                return true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                new StringBuilder("Connected to service ").append(componentName);
            }
            this.c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                new StringBuilder("Disconnected from service ").append(componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: fl$e */
    interface e {
        void a(e eVar);
    }

    private fl(Context context) {
        this.a = context;
    }

    public static fl a(Context context) {
        return new fl(context);
    }

    public static Set<String> b(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (c) {
            if (string != null) {
                if (!string.equals(d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    e = hashSet;
                    d = string;
                }
            }
            set = e;
        }
        return set;
    }

    public final void a(int i, Notification notification) {
        Bundle a2 = fi.a(notification);
        if (a2 != null && a2.getBoolean("android.support.useSideChannel")) {
            a((e) new b(this.a.getPackageName(), i, null, notification));
            this.b.cancel(null, i);
            return;
        }
        this.b.notify(null, i, notification);
    }

    public void a(e eVar) {
        synchronized (f) {
            if (g == null) {
                g = new d(this.a.getApplicationContext());
            }
            g.a(eVar);
        }
    }

    public final boolean a() {
        if (VERSION.SDK_INT >= 24) {
            return this.b.areNotificationsEnabled();
        }
        if (VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            String packageName = this.a.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            try {
                Class cls = Class.forName(AppOpsManager.class.getName());
                return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return true;
    }
}
