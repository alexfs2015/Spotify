package defpackage;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ff reason: default package */
public abstract class ff extends Service {
    private static Object h = new Object();
    private static HashMap<ComponentName, h> i = new HashMap<>();
    b a;
    private h b;
    private a c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d> g;

    /* renamed from: ff$a */
    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            while (true) {
                e c = ff.this.c();
                if (c == null) {
                    return null;
                }
                ff.this.a(c.a());
                c.b();
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            ff.this.b();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            ff.this.b();
        }
    }

    /* renamed from: ff$b */
    interface b {
        IBinder a();

        e b();
    }

    /* renamed from: ff$c */
    static final class c extends h {
        private final Context b;
        private final WakeLock c;
        private final WakeLock d;
        private boolean e;
        private boolean f;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.b = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.c = powerManager.newWakeLock(1, sb.toString());
            this.c.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.d = powerManager.newWakeLock(1, sb2.toString());
            this.d.setReferenceCounted(false);
        }

        public final void a() {
            synchronized (this) {
                this.e = false;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.b.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.e) {
                        this.e = true;
                        if (!this.f) {
                            this.c.acquire(60000);
                        }
                    }
                }
            }
        }

        public final void b() {
            synchronized (this) {
                if (!this.f) {
                    this.f = true;
                    this.d.acquire(600000);
                    this.c.release();
                }
            }
        }

        public final void c() {
            synchronized (this) {
                if (this.f) {
                    if (this.e) {
                        this.c.acquire(60000);
                    }
                    this.f = false;
                    this.d.release();
                }
            }
        }
    }

    /* renamed from: ff$d */
    final class d implements e {
        private Intent a;
        private int b;

        d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public final Intent a() {
            return this.a;
        }

        public final void b() {
            ff.this.stopSelf(this.b);
        }
    }

    /* renamed from: ff$e */
    interface e {
        Intent a();

        void b();
    }

    /* renamed from: ff$f */
    static final class f extends JobServiceEngine implements b {
        final Object a = new Object();
        JobParameters b;
        private ff c;

        /* renamed from: ff$f$a */
        final class a implements e {
            private JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            public final Intent a() {
                return this.a.getIntent();
            }

            public final void b() {
                synchronized (f.this.a) {
                    if (f.this.b != null) {
                        f.this.b.completeWork(this.a);
                    }
                }
            }
        }

        f(ff ffVar) {
            super(ffVar);
            this.c = ffVar;
        }

        public final IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.c.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new defpackage.ff.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final defpackage.ff.e b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.a
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.b     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.b     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                ff r2 = r3.c
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                ff$f$a r0 = new ff$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.f.b():ff$e");
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.b = jobParameters;
            this.c.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean a2 = this.c.a();
            synchronized (this.a) {
                this.b = null;
            }
            return a2;
        }
    }

    /* renamed from: ff$g */
    static final class g extends h {
        private final JobInfo b;
        private final JobScheduler c;

        g(Context context, ComponentName componentName, int i) {
            super(componentName);
            a(i);
            this.b = new Builder(i, this.a).setOverrideDeadline(0).build();
            this.c = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: 0000 */
        public final void a(Intent intent) {
            this.c.enqueue(this.b, new JobWorkItem(intent));
        }
    }

    /* renamed from: ff$h */
    static abstract class h {
        final ComponentName a;
        private boolean b;
        private int c;

        h(ComponentName componentName) {
            this.a = componentName;
        }

        public void a() {
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                StringBuilder sb = new StringBuilder("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.c);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }
    }

    public ff() {
        if (VERSION.SDK_INT >= 26) {
            this.g = null;
        } else {
            this.g = new ArrayList<>();
        }
    }

    private static h a(Context context, ComponentName componentName, boolean z, int i2) {
        h hVar;
        h hVar2 = (h) i.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z) {
            hVar = new g(context, componentName, i2);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar3 = hVar;
        i.put(componentName, hVar3);
        return hVar3;
    }

    public static void a(Context context, Class cls, int i2, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (h) {
                h a2 = a(context, componentName, true, i2);
                a2.a(i2);
                a2.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (this.c == null) {
            this.c = new a();
            h hVar = this.b;
            if (hVar != null && z) {
                hVar.b();
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel(false);
        }
        this.e = true;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        ArrayList<d> arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.c = null;
                if (this.g != null && this.g.size() > 0) {
                    a(false);
                } else if (!this.f) {
                    this.b.c();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final e c() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.g) {
            if (this.g.size() <= 0) {
                return null;
            }
            e eVar = (e) this.g.remove(0);
            return eVar;
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.a = new f(this);
            this.b = null;
            return;
        }
        this.a = null;
        this.b = a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.b.c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.g == null) {
            return 2;
        }
        this.b.a();
        synchronized (this.g) {
            ArrayList<d> arrayList = this.g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            a(true);
        }
        return 3;
    }
}
