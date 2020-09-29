package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: mk reason: default package */
public abstract class mk extends Service {
    static final boolean a = Log.isLoggable("MBServiceCompat", 3);
    final b b;
    final ArrayList<b> c = new ArrayList<>();
    final dp<IBinder, b> d = new dp<>();
    b e;
    final n f = new n();
    protected Token g;
    private c h;

    /* renamed from: mk$a */
    public static final class a {
        final String a;
        final Bundle b;

        public a(String str, Bundle bundle) {
            if (str != null) {
                this.a = str;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
    }

    /* renamed from: mk$b */
    class b implements DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final l d;
        public final HashMap<String, List<ho<IBinder, Bundle>>> e = new HashMap<>();
        public a f;
        private defpackage.ml.a h;
        private Bundle i;

        b(String str, int i2, int i3, Bundle bundle, l lVar) {
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.h = new defpackage.ml.a(str, i2, i3);
            this.i = bundle;
            this.d = lVar;
        }

        public final void binderDied() {
            mk.this.f.post(new Runnable() {
                public final void run() {
                    mk.this.d.remove(b.this.d.a());
                }
            });
        }
    }

    /* renamed from: mk$c */
    interface c {
        IBinder a(Intent intent);

        void a();

        void a(Token token);

        void a(String str, Bundle bundle);
    }

    /* renamed from: mk$d */
    class d implements c {
        final List<Bundle> a = new ArrayList();
        MediaBrowserService b;
        private Messenger d;

        /* renamed from: mk$d$a */
        class a extends MediaBrowserService {
            a(Context context) {
                attachBaseContext(context);
            }

            public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a a2 = d.this.a(str, i, bundle == null ? null : new Bundle(bundle));
                if (a2 == null) {
                    return null;
                }
                return new BrowserRoot(a2.a, a2.b);
            }

            public void onLoadChildren(String str, Result<List<MediaItem>> result) {
                d dVar = d.this;
                AnonymousClass2 r5 = new i<List<MediaBrowserCompat.MediaItem>>(str, new j(result)) {
                    private /* synthetic */ j e;

                    {
                        this.e = r3;
                    }

                    public final void a() {
                        this.e.a.detach();
                    }

                    /* access modifiers changed from: 0000 */
                    public final /* synthetic */ void a(Object obj) {
                        ArrayList arrayList;
                        List<MediaBrowserCompat.MediaItem> list = (List) obj;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (MediaBrowserCompat.MediaItem mediaItem : list) {
                                Parcel obtain = Parcel.obtain();
                                mediaItem.writeToParcel(obtain, 0);
                                arrayList.add(obtain);
                            }
                        } else {
                            arrayList = null;
                        }
                        this.e.a(arrayList);
                    }
                };
                mk.this.e = mk.this.b;
                mk.this.a(str, (i<List<MediaBrowserCompat.MediaItem>>) r5);
                mk.this.e = null;
            }
        }

        d() {
        }

        public final IBinder a(Intent intent) {
            return this.b.onBind(intent);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0077 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final defpackage.mk.a a(java.lang.String r12, int r13, android.os.Bundle r14) {
            /*
                r11 = this;
                r0 = -1
                r1 = 0
                if (r14 == 0) goto L_0x005b
                r2 = 0
                java.lang.String r3 = "extra_client_version"
                int r2 = r14.getInt(r3, r2)
                if (r2 == 0) goto L_0x005b
                r14.remove(r3)
                android.os.Messenger r2 = new android.os.Messenger
                mk r3 = defpackage.mk.this
                mk$n r3 = r3.f
                r2.<init>(r3)
                r11.d = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r3 = 2
                java.lang.String r4 = "extra_service_version"
                r2.putInt(r4, r3)
                android.os.Messenger r3 = r11.d
                android.os.IBinder r3 = r3.getBinder()
                java.lang.String r4 = "extra_messenger"
                defpackage.fd.a(r2, r4, r3)
                mk r3 = defpackage.mk.this
                android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.g
                if (r3 == 0) goto L_0x004b
                mk r3 = defpackage.mk.this
                android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.g
                g r3 = r3.b
                if (r3 != 0) goto L_0x0041
                r3 = r1
                goto L_0x0045
            L_0x0041:
                android.os.IBinder r3 = r3.asBinder()
            L_0x0045:
                java.lang.String r4 = "extra_session_binder"
                defpackage.fd.a(r2, r4, r3)
                goto L_0x0050
            L_0x004b:
                java.util.List<android.os.Bundle> r3 = r11.a
                r3.add(r2)
            L_0x0050:
                java.lang.String r3 = "extra_calling_pid"
                int r0 = r14.getInt(r3, r0)
                r14.remove(r3)
                r7 = r0
                goto L_0x005d
            L_0x005b:
                r2 = r1
                r7 = -1
            L_0x005d:
                mk$b r0 = new mk$b
                mk r5 = defpackage.mk.this
                r10 = 0
                r4 = r0
                r6 = r12
                r8 = r13
                r9 = r14
                r4.<init>(r6, r7, r8, r9, r10)
                mk r3 = defpackage.mk.this
                r3.e = r0
                mk$a r12 = r3.a(r12, r13, r14)
                mk r13 = defpackage.mk.this
                r13.e = r1
                if (r12 != 0) goto L_0x0078
                return r1
            L_0x0078:
                android.os.Messenger r14 = r11.d
                if (r14 == 0) goto L_0x0081
                java.util.ArrayList<mk$b> r13 = r13.c
                r13.add(r0)
            L_0x0081:
                if (r2 != 0) goto L_0x0086
                android.os.Bundle r2 = r12.b
                goto L_0x008f
            L_0x0086:
                android.os.Bundle r13 = r12.b
                if (r13 == 0) goto L_0x008f
                android.os.Bundle r13 = r12.b
                r2.putAll(r13)
            L_0x008f:
                mk$a r13 = new mk$a
                java.lang.String r12 = r12.a
                r13.<init>(r12, r2)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mk.d.a(java.lang.String, int, android.os.Bundle):mk$a");
        }

        public void a() {
            this.b = new a(mk.this);
            this.b.onCreate();
        }

        public final void a(final Token token) {
            mk.this.f.a(new Runnable() {
                public final void run() {
                    if (!d.this.a.isEmpty()) {
                        g gVar = token.b;
                        if (gVar != null) {
                            for (Bundle a2 : d.this.a) {
                                fd.a(a2, "extra_session_binder", gVar.asBinder());
                            }
                        }
                        d.this.a.clear();
                    }
                    d.this.b.setSessionToken((MediaSession.Token) token.a);
                }
            });
        }

        public final void a(final String str, Bundle bundle) {
            b(str, null);
            mk.this.f.post(new Runnable(null) {
                public final void run() {
                    for (IBinder iBinder : mk.this.d.keySet()) {
                        b bVar = (b) mk.this.d.get(iBinder);
                        d dVar = d.this;
                        String str = str;
                        Bundle bundle = null;
                        List<ho> list = (List) bVar.e.get(str);
                        if (list != null) {
                            for (ho hoVar : list) {
                                if (mj.b(bundle, (Bundle) hoVar.b)) {
                                    mk.this.a(str, bVar, (Bundle) hoVar.b, bundle);
                                }
                            }
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public void b(String str, Bundle bundle) {
            this.b.notifyChildrenChanged(str);
        }
    }

    /* renamed from: mk$e */
    class e extends d {

        /* renamed from: mk$e$a */
        class a extends a {
            a(Context context) {
                super(context);
            }

            public void onLoadItem(String str, Result<MediaItem> result) {
                e eVar = e.this;
                AnonymousClass1 r4 = new i<MediaBrowserCompat.MediaItem>(str, new j(result)) {
                    private /* synthetic */ j e;

                    {
                        this.e = r3;
                    }

                    public final void a() {
                        this.e.a.detach();
                    }

                    /* access modifiers changed from: 0000 */
                    public final /* synthetic */ void a(Object obj) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
                        if (mediaItem == null) {
                            this.e.a(null);
                            return;
                        }
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        this.e.a(obtain);
                    }
                };
                mk.this.e = mk.this.b;
                mk.a((i<MediaBrowserCompat.MediaItem>) r4);
                mk.this.e = null;
            }
        }

        e() {
            super();
        }

        public void a() {
            this.b = new a(mk.this);
            this.b.onCreate();
        }
    }

    /* renamed from: mk$f */
    class f extends e {

        /* renamed from: mk$f$a */
        class a extends a {
            a(Context context) {
                super(context);
            }

            public final void onLoadChildren(String str, Result<List<MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                mk.this.e = mk.this.b;
                f fVar = f.this;
                AnonymousClass1 r4 = new i<List<MediaBrowserCompat.MediaItem>>(str, new j(result), bundle) {
                    private /* synthetic */ j e;
                    private /* synthetic */ Bundle f;

                    {
                        this.e = r3;
                        this.f = r4;
                    }

                    public final void a() {
                        this.e.a.detach();
                    }

                    /* access modifiers changed from: 0000 */
                    public final /* synthetic */ void a(Object obj) {
                        List<MediaBrowserCompat.MediaItem> list = (List) obj;
                        if (list == null) {
                            this.e.a(null);
                            return;
                        }
                        if ((this.d & 1) != 0) {
                            list = mk.a(list, this.f);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                        this.e.a(arrayList);
                    }
                };
                mk.this.e = mk.this.b;
                mk.this.b(str, r4);
                mk.this.e = null;
                mk.this.e = null;
            }
        }

        f() {
            super();
        }

        public final void a() {
            this.b = new a(mk.this);
            this.b.onCreate();
        }

        /* access modifiers changed from: 0000 */
        public final void b(String str, Bundle bundle) {
            if (bundle != null) {
                this.b.notifyChildrenChanged(str, bundle);
            } else {
                super.b(str, bundle);
            }
        }
    }

    /* renamed from: mk$g */
    class g extends f {
        g() {
            super();
        }
    }

    /* renamed from: mk$h */
    class h implements c {
        private Messenger b;

        h() {
        }

        public final IBinder a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.b.getBinder();
            }
            return null;
        }

        public final void a() {
            this.b = new Messenger(mk.this.f);
        }

        public final void a(final Token token) {
            mk.this.f.post(new Runnable() {
                public final void run() {
                    Iterator it = mk.this.d.values().iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        try {
                            bVar.d.a(bVar.f.a, token, bVar.f.b);
                        } catch (RemoteException unused) {
                            StringBuilder sb = new StringBuilder("Connection for ");
                            sb.append(bVar.a);
                            sb.append(" is no longer valid.");
                            it.remove();
                        }
                    }
                }
            });
        }

        public final void a(final String str, Bundle bundle) {
            mk.this.f.post(new Runnable(null) {
                public final void run() {
                    for (IBinder iBinder : mk.this.d.keySet()) {
                        b bVar = (b) mk.this.d.get(iBinder);
                        h hVar = h.this;
                        String str = str;
                        Bundle bundle = null;
                        List<ho> list = (List) bVar.e.get(str);
                        if (list != null) {
                            for (ho hoVar : list) {
                                if (mj.b(bundle, (Bundle) hoVar.b)) {
                                    mk.this.a(str, bVar, (Bundle) hoVar.b, bundle);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: mk$i */
    public static class i<T> {
        final Object a;
        boolean b;
        boolean c;
        int d;
        private boolean e;

        i(Object obj) {
            this.a = obj;
        }

        public void a() {
            if (this.e) {
                StringBuilder sb = new StringBuilder("detach() called when detach() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            } else if (this.b) {
                StringBuilder sb2 = new StringBuilder("detach() called when sendResult() had already been called for: ");
                sb2.append(this.a);
                throw new IllegalStateException(sb2.toString());
            } else if (!this.c) {
                this.e = true;
            } else {
                StringBuilder sb3 = new StringBuilder("detach() called when sendError() had already been called for: ");
                sb3.append(this.a);
                throw new IllegalStateException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(Bundle bundle) {
            StringBuilder sb = new StringBuilder("It is not supported to send an error for ");
            sb.append(this.a);
            throw new UnsupportedOperationException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public void a(T t) {
        }

        public void b(T t) {
            if (this.b || this.c) {
                StringBuilder sb = new StringBuilder("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            }
            this.b = true;
            a(t);
        }

        /* access modifiers changed from: 0000 */
        public final boolean b() {
            return this.e || this.b || this.c;
        }
    }

    /* renamed from: mk$j */
    static class j<T> {
        Result a;

        j(Result result) {
            this.a = result;
        }

        private static List<MediaItem> a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        public final void a(T t) {
            if (t instanceof List) {
                this.a.sendResult(a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.a.sendResult(null);
            }
        }
    }

    /* renamed from: mk$k */
    class k {
        k() {
        }
    }

    /* renamed from: mk$l */
    interface l {
        IBinder a();

        void a(String str, Token token, Bundle bundle);

        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);

        void b();
    }

    /* renamed from: mk$m */
    static class m implements l {
        private Messenger a;

        m(Messenger messenger) {
            this.a = messenger;
        }

        private void a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        public final IBinder a() {
            return this.a.getBinder();
        }

        public final void a(String str, Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            a(1, bundle2);
        }

        public final void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            a(3, bundle3);
        }

        public final void b() {
            a(2, null);
        }
    }

    /* renamed from: mk$n */
    final class n extends Handler {
        private final k a = new k();

        n() {
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            Bundle data = message.getData();
            String str = "data_callback_token";
            String str2 = "data_calling_uid";
            String str3 = "data_calling_pid";
            String str4 = "data_package_name";
            String str5 = "data_root_hints";
            String str6 = "data_result_receiver";
            String str7 = "data_media_item_id";
            switch (message2.what) {
                case 1:
                    Bundle bundle = data.getBundle(str5);
                    MediaSessionCompat.b(bundle);
                    k kVar = this.a;
                    String string = data.getString(str4);
                    int i = data.getInt(str3);
                    int i2 = data.getInt(str2);
                    m mVar = new m(message2.replyTo);
                    mk mkVar = mk.this;
                    boolean z = false;
                    if (string != null) {
                        String[] packagesForUid = mkVar.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (packagesForUid[i3].equals(string)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (z) {
                        n nVar = mk.this.f;
                        AnonymousClass1 r5 = new Runnable(mVar, string, i, i2, bundle) {
                            private /* synthetic */ l a;
                            private /* synthetic */ String b;
                            private /* synthetic */ int c;
                            private /* synthetic */ int d;
                            private /* synthetic */ Bundle e;

                            {
                                this.a = r2;
                                this.b = r3;
                                this.c = r4;
                                this.d = r5;
                                this.e = r6;
                            }

                            public final void run() {
                                IBinder a2 = this.a.a();
                                mk.this.d.remove(a2);
                                b bVar = new b(this.b, this.c, this.d, this.e, this.a);
                                mk.this.e = bVar;
                                bVar.f = mk.this.a(this.b, this.d, this.e);
                                mk.this.e = null;
                                if (bVar.f == null) {
                                    StringBuilder sb = new StringBuilder("No root for client ");
                                    sb.append(this.b);
                                    sb.append(" from service ");
                                    sb.append(getClass().getName());
                                    try {
                                        this.a.b();
                                    } catch (RemoteException unused) {
                                        new StringBuilder("Calling onConnectFailed() failed. Ignoring. pkg=").append(this.b);
                                    }
                                } else {
                                    try {
                                        mk.this.d.put(a2, bVar);
                                        a2.linkToDeath(bVar, 0);
                                        if (mk.this.g != null) {
                                            this.a.a(bVar.f.a, mk.this.g, bVar.f.b);
                                        }
                                    } catch (RemoteException unused2) {
                                        new StringBuilder("Calling onConnect() failed. Dropping client. pkg=").append(this.b);
                                        mk.this.d.remove(a2);
                                    }
                                }
                            }
                        };
                        nVar.a(r5);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Package/uid mismatch: uid=");
                    sb.append(i2);
                    sb.append(" package=");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                case 2:
                    k kVar2 = this.a;
                    mk.this.f.a(new Runnable(new m(message2.replyTo)) {
                        private /* synthetic */ l a;

                        {
                            this.a = r2;
                        }

                        public final void run() {
                            b bVar = (b) mk.this.d.remove(this.a.a());
                            if (bVar != null) {
                                bVar.d.a().unlinkToDeath(bVar, 0);
                            }
                        }
                    });
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.b(bundle2);
                    k kVar3 = this.a;
                    String string2 = data.getString(str7);
                    IBinder a2 = fd.a(data, str);
                    m mVar2 = new m(message2.replyTo);
                    n nVar2 = mk.this.f;
                    AnonymousClass3 r11 = new Runnable(mVar2, string2, a2, bundle2) {
                        private /* synthetic */ l a;
                        private /* synthetic */ String b;
                        private /* synthetic */ IBinder c;
                        private /* synthetic */ Bundle d;

                        {
                            this.a = r2;
                            this.b = r3;
                            this.c = r4;
                            this.d = r5;
                        }

                        public final void run() {
                            b bVar = (b) mk.this.d.get(this.a.a());
                            if (bVar == null) {
                                new StringBuilder("addSubscription for callback that isn't registered id=").append(this.b);
                            } else {
                                mk.this.a(this.b, bVar, this.c, this.d);
                            }
                        }
                    };
                    nVar2.a(r11);
                    return;
                case 4:
                    k kVar4 = this.a;
                    String string3 = data.getString(str7);
                    IBinder a3 = fd.a(data, str);
                    mk.this.f.a(new Runnable(new m(message2.replyTo), string3, a3) {
                        private /* synthetic */ l a;
                        private /* synthetic */ String b;
                        private /* synthetic */ IBinder c;

                        {
                            this.a = r2;
                            this.b = r3;
                            this.c = r4;
                        }

                        public final void run() {
                            b bVar = (b) mk.this.d.get(this.a.a());
                            if (bVar == null) {
                                new StringBuilder("removeSubscription for callback that isn't registered id=").append(this.b);
                                return;
                            }
                            if (!mk.this.a(this.b, bVar, this.c)) {
                                StringBuilder sb = new StringBuilder("removeSubscription called for ");
                                sb.append(this.b);
                                sb.append(" which is not subscribed");
                            }
                        }
                    });
                    return;
                case 5:
                    k kVar5 = this.a;
                    String string4 = data.getString(str7);
                    i iVar = (i) data.getParcelable(str6);
                    m mVar3 = new m(message2.replyTo);
                    if (!TextUtils.isEmpty(string4) && iVar != null) {
                        mk.this.f.a(new Runnable(mVar3, string4, iVar) {
                            private /* synthetic */ l a;
                            private /* synthetic */ String b;
                            private /* synthetic */ i c;

                            {
                                this.a = r2;
                                this.b = r3;
                                this.c = r4;
                            }

                            public final void run() {
                                b bVar = (b) mk.this.d.get(this.a.a());
                                if (bVar == null) {
                                    new StringBuilder("getMediaItem for callback that isn't registered id=").append(this.b);
                                    return;
                                }
                                mk mkVar = mk.this;
                                String str = this.b;
                                AnonymousClass2 r4 = new i<MediaBrowserCompat.MediaItem>(str, this.c) {
                                    private /* synthetic */ i e;

                                    {
                                        this.e = r3;
                                    }

                                    /* access modifiers changed from: 0000 */
                                    public final /* synthetic */ void a(Object obj) {
                                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
                                        if ((this.d & 2) != 0) {
                                            this.e.b(-1, null);
                                            return;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelable("media_item", mediaItem);
                                        this.e.b(0, bundle);
                                    }
                                };
                                mkVar.e = bVar;
                                mk.a((i<MediaBrowserCompat.MediaItem>) r4);
                                mkVar.e = null;
                                if (!r4.b()) {
                                    StringBuilder sb = new StringBuilder("onLoadItem must call detach() or sendResult() before returning for id=");
                                    sb.append(str);
                                    throw new IllegalStateException(sb.toString());
                                }
                            }
                        });
                        return;
                    }
                case 6:
                    Bundle bundle3 = data.getBundle(str5);
                    MediaSessionCompat.b(bundle3);
                    k kVar6 = this.a;
                    m mVar4 = new m(message2.replyTo);
                    String string5 = data.getString(str4);
                    int i4 = data.getInt(str3);
                    int i5 = data.getInt(str2);
                    n nVar3 = mk.this.f;
                    AnonymousClass6 r52 = new Runnable(mVar4, i5, string5, i4, bundle3) {
                        private /* synthetic */ l a;
                        private /* synthetic */ int b;
                        private /* synthetic */ String c;
                        private /* synthetic */ int d;
                        private /* synthetic */ Bundle e;

                        {
                            this.a = r2;
                            this.b = r3;
                            this.c = r4;
                            this.d = r5;
                            this.e = r6;
                        }

                        public final void run() {
                            IBinder a2 = this.a.a();
                            mk.this.d.remove(a2);
                            Iterator it = mk.this.c.iterator();
                            b bVar = null;
                            while (it.hasNext()) {
                                b bVar2 = (b) it.next();
                                if (bVar2.c == this.b) {
                                    if (TextUtils.isEmpty(this.c) || this.d <= 0) {
                                        bVar = new b(bVar2.a, bVar2.b, bVar2.c, this.e, this.a);
                                    }
                                    it.remove();
                                }
                            }
                            b bVar3 = bVar == null ? new b(this.c, this.d, this.b, this.e, this.a) : bVar;
                            mk.this.d.put(a2, bVar3);
                            try {
                                a2.linkToDeath(bVar3, 0);
                            } catch (RemoteException unused) {
                            }
                        }
                    };
                    nVar3.a(r52);
                    return;
                case 7:
                    k kVar7 = this.a;
                    mk.this.f.a(new Runnable(new m(message2.replyTo)) {
                        private /* synthetic */ l a;

                        {
                            this.a = r2;
                        }

                        public final void run() {
                            IBinder a2 = this.a.a();
                            b bVar = (b) mk.this.d.remove(a2);
                            if (bVar != null) {
                                a2.unlinkToDeath(bVar, 0);
                            }
                        }
                    });
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.b(bundle4);
                    k kVar8 = this.a;
                    String string6 = data.getString("data_search_query");
                    i iVar2 = (i) data.getParcelable(str6);
                    m mVar5 = new m(message2.replyTo);
                    if (!TextUtils.isEmpty(string6) && iVar2 != null) {
                        n nVar4 = mk.this.f;
                        AnonymousClass8 r10 = new Runnable(mVar5, string6, bundle4, iVar2) {
                            private /* synthetic */ l a;
                            private /* synthetic */ String b;
                            private /* synthetic */ Bundle c;
                            private /* synthetic */ i d;

                            {
                                this.a = r2;
                                this.b = r3;
                                this.c = r4;
                                this.d = r5;
                            }

                            public final void run() {
                                b bVar = (b) mk.this.d.get(this.a.a());
                                if (bVar == null) {
                                    new StringBuilder("search for callback that isn't registered query=").append(this.b);
                                    return;
                                }
                                mk mkVar = mk.this;
                                String str = this.b;
                                Bundle bundle = this.c;
                                AnonymousClass3 r5 = new i<List<MediaBrowserCompat.MediaItem>>(str, this.d) {
                                    private /* synthetic */ i e;

                                    {
                                        this.e = r3;
                                    }

                                    /* access modifiers changed from: 0000 */
                                    public final /* synthetic */ void a(Object obj) {
                                        List list = (List) obj;
                                        if ((this.d & 4) != 0 || list == null) {
                                            this.e.b(-1, null);
                                            return;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                                        this.e.b(0, bundle);
                                    }
                                };
                                mkVar.e = bVar;
                                mkVar.a(str, bundle, (i<List<MediaBrowserCompat.MediaItem>>) r5);
                                mkVar.e = null;
                                if (!r5.b()) {
                                    StringBuilder sb = new StringBuilder("onSearch must call detach() or sendResult() before returning for query=");
                                    sb.append(str);
                                    throw new IllegalStateException(sb.toString());
                                }
                            }
                        };
                        nVar4.a(r10);
                        return;
                    }
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.b(bundle5);
                    k kVar9 = this.a;
                    String string7 = data.getString("data_custom_action");
                    i iVar3 = (i) data.getParcelable(str6);
                    m mVar6 = new m(message2.replyTo);
                    if (!TextUtils.isEmpty(string7) && iVar3 != null) {
                        n nVar5 = mk.this.f;
                        AnonymousClass9 r102 = new Runnable(mVar6, string7, bundle5, iVar3) {
                            private /* synthetic */ l a;
                            private /* synthetic */ String b;
                            private /* synthetic */ Bundle c;
                            private /* synthetic */ i d;

                            {
                                this.a = r2;
                                this.b = r3;
                                this.c = r4;
                                this.d = r5;
                            }

                            public final void run() {
                                b bVar = (b) mk.this.d.get(this.a.a());
                                if (bVar == null) {
                                    StringBuilder sb = new StringBuilder("sendCustomAction for callback that isn't registered action=");
                                    sb.append(this.b);
                                    sb.append(", extras=");
                                    sb.append(this.c);
                                    return;
                                }
                                mk mkVar = mk.this;
                                String str = this.b;
                                Bundle bundle = this.c;
                                AnonymousClass4 r5 = new i<Bundle>(str, this.d) {
                                    private /* synthetic */ i e;

                                    {
                                        this.e = r3;
                                    }

                                    /* access modifiers changed from: 0000 */
                                    public final void a(Bundle bundle) {
                                        this.e.b(-1, bundle);
                                    }

                                    /* access modifiers changed from: 0000 */
                                    public final /* synthetic */ void a(Object obj) {
                                        this.e.b(0, (Bundle) obj);
                                    }
                                };
                                mkVar.e = bVar;
                                if (r5.b || r5.c) {
                                    StringBuilder sb2 = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
                                    sb2.append(r5.a);
                                    throw new IllegalStateException(sb2.toString());
                                }
                                r5.c = true;
                                r5.a((Bundle) null);
                                mkVar.e = null;
                                if (!r5.b()) {
                                    StringBuilder sb3 = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
                                    sb3.append(str);
                                    sb3.append(" extras=");
                                    sb3.append(bundle);
                                    throw new IllegalStateException(sb3.toString());
                                }
                            }
                        };
                        nVar5.a(r102);
                        return;
                    }
                default:
                    StringBuilder sb2 = new StringBuilder("Unhandled message: ");
                    sb2.append(message2);
                    sb2.append("\n  Service version: 2");
                    sb2.append("\n  Client version: ");
                    sb2.append(message2.arg1);
                    break;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            String str = "data_calling_pid";
            if (callingPid > 0) {
                data.putInt(str, callingPid);
            } else if (!data.containsKey(str)) {
                data.putInt(str, -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public mk() {
        b bVar = new b("android.media.session.MediaController", -1, -1, null, null);
        this.b = bVar;
    }

    static List<MediaBrowserCompat.MediaItem> a(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 <= 0 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public static void a(i<MediaBrowserCompat.MediaItem> iVar) {
        iVar.d = 2;
        iVar.b(null);
    }

    public abstract a a(String str, int i2, Bundle bundle);

    public void a(Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.g == null) {
            this.g = token;
            this.h.a(token);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public final void a(String str) {
        if (str != null) {
            this.h.a(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void a(String str, Bundle bundle, i<List<MediaBrowserCompat.MediaItem>> iVar) {
        iVar.d = 4;
        iVar.b(null);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, b bVar, Bundle bundle, Bundle bundle2) {
        final b bVar2 = bVar;
        final String str2 = str;
        final Bundle bundle3 = bundle;
        final Bundle bundle4 = bundle2;
        AnonymousClass1 r0 = new i<List<MediaBrowserCompat.MediaItem>>(str) {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void a(Object obj) {
                List list = (List) obj;
                if (mk.this.d.get(bVar2.d.a()) != bVar2) {
                    if (mk.a) {
                        StringBuilder sb = new StringBuilder("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        sb.append(bVar2.a);
                        sb.append(" id=");
                        sb.append(str2);
                    }
                    return;
                }
                if ((this.d & 1) != 0) {
                    list = mk.a(list, bundle3);
                }
                try {
                    bVar2.d.a(str2, list, bundle3, bundle4);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder("Calling onLoadChildren() failed for id=");
                    sb2.append(str2);
                    sb2.append(" package=");
                    sb2.append(bVar2.a);
                }
            }
        };
        this.e = bVar;
        if (bundle == null) {
            a(str, (i<List<MediaBrowserCompat.MediaItem>>) r0);
        } else {
            b(str, r0);
        }
        this.e = null;
        if (!r0.b()) {
            StringBuilder sb = new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(bVar.a);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, b bVar, IBinder iBinder, Bundle bundle) {
        List<ho> list = (List) bVar.e.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (ho hoVar : list) {
            if (iBinder == hoVar.a && mj.a(bundle, (Bundle) hoVar.b)) {
                return;
            }
        }
        list.add(new ho(iBinder, bundle));
        bVar.e.put(str, list);
        a(str, bVar, bundle, (Bundle) null);
        this.e = bVar;
        this.e = null;
    }

    public abstract void a(String str, i<List<MediaBrowserCompat.MediaItem>> iVar);

    /* access modifiers changed from: 0000 */
    public final boolean a(String str, b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.e.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.e = bVar;
                this.e = null;
            }
        } else {
            List list = (List) bVar.e.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((ho) it.next()).a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.e.remove(str);
                }
            }
            this.e = bVar;
            this.e = null;
            return z2;
        }
    }

    public void b(String str, i<List<MediaBrowserCompat.MediaItem>> iVar) {
        iVar.d = 1;
        a(str, iVar);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.h.a(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 28) {
            this.h = new g();
        } else if (VERSION.SDK_INT >= 26) {
            this.h = new f();
        } else if (VERSION.SDK_INT >= 23) {
            this.h = new e();
        } else if (VERSION.SDK_INT >= 21) {
            this.h = new d();
        } else {
            this.h = new h();
        }
        this.h.a();
    }
}
