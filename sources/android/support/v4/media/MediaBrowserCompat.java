package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class MediaBrowserCompat {
    static final boolean a = Log.isLoggable("MediaBrowserCompat", 3);
    public final d b;

    static class CustomActionResultReceiver extends defpackage.i {
        private final Bundle b;
        private final c c;

        public final void a(int i, Bundle bundle) {
            if (this.c != null) {
                MediaSessionCompat.b(bundle);
                if (!(i == -1 || i == 0 || i == 1)) {
                    StringBuilder sb = new StringBuilder("Unknown result code: ");
                    sb.append(i);
                    sb.append(" (extras=");
                    sb.append(this.b);
                    sb.append(", resultData=");
                    sb.append(bundle);
                    sb.append(")");
                }
            }
        }
    }

    static class ItemReceiver extends defpackage.i {
        public final void a(int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i == 0 && bundle != null) {
                String str = "media_item";
                if (bundle.containsKey(str)) {
                    bundle.getParcelable(str);
                }
            }
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final int a;
        private final MediaDescriptionCompat b;

        MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.a)) {
                this.a = i;
                this.b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static List<MediaItem> a(List<?> list) {
            Object obj;
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next == null || VERSION.SDK_INT < 21) {
                    obj = null;
                } else {
                    android.media.browse.MediaBrowser.MediaItem mediaItem = (android.media.browse.MediaBrowser.MediaItem) next;
                    obj = new MediaItem(MediaDescriptionCompat.a(mediaItem.getDescription()), mediaItem.getFlags());
                }
                arrayList.add(obj);
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.a);
            sb.append(", mDescription=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }
    }

    static class SearchResultReceiver extends defpackage.i {
        public final void a(int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i == 0 && bundle != null) {
                String str = "search_results";
                if (bundle.containsKey(str)) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                    if (parcelableArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add((MediaItem) parcelable);
                        }
                    }
                }
            }
        }
    }

    static class a extends Handler {
        private final WeakReference<i> a;
        private WeakReference<Messenger> b;

        a(i iVar) {
            this.a = new WeakReference<>(iVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (!(weakReference == null || weakReference.get() == null || this.a.get() == null)) {
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                i iVar = (i) this.a.get();
                Messenger messenger = (Messenger) this.b.get();
                try {
                    int i = message.what;
                    String str = "data_media_item_id";
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.b(bundle);
                        iVar.a(messenger, data.getString(str), (Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        iVar.a(messenger);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder("Unhandled message: ");
                        sb.append(message);
                        sb.append("\n  Client version: 1");
                        sb.append("\n  Service version: ");
                        sb.append(message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.b(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.b(bundle3);
                        iVar.a(messenger, data.getString(str), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        iVar.a(messenger);
                    }
                }
            }
        }
    }

    public static class b {
        final ConnectionCallback a;
        C0000b b;

        class a extends ConnectionCallback {
            a() {
            }

            public final void onConnected() {
                if (b.this.b != null) {
                    b.this.b.a();
                }
                b.this.a();
            }

            public final void onConnectionFailed() {
                b.this.c();
            }

            public final void onConnectionSuspended() {
                if (b.this.b != null) {
                    b.this.b.b();
                }
                b.this.b();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b reason: collision with other inner class name */
        interface C0000b {
            void a();

            void b();
        }

        public b() {
            if (VERSION.SDK_INT >= 21) {
                this.a = new a();
            } else {
                this.a = null;
            }
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public static abstract class c {
    }

    public interface d {
        void c();

        void d();

        Token e();
    }

    static class e implements C0000b, d, i {
        private Context a;
        private MediaBrowser b;
        private Bundle c;
        private a d = new a(this);
        private final dp<String, k> e = new dp<>();
        private int f;
        private j g;
        private Messenger h;
        private Token i;
        private Bundle j;

        e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.c = bundle2;
            this.c.putInt("extra_client_version", 1);
            this.c.putInt("extra_calling_pid", Process.myPid());
            bVar.b = this;
            this.b = new MediaBrowser(context, componentName, bVar.a, this.c);
        }

        public final void a() {
            try {
                Bundle extras = this.b.getExtras();
                if (extras != null) {
                    this.f = extras.getInt("extra_service_version", 0);
                    IBinder a2 = fd.a(extras, "extra_messenger");
                    if (a2 != null) {
                        this.g = new j(a2, this.c);
                        this.h = new Messenger(this.d);
                        this.d.a(this.h);
                        try {
                            j jVar = this.g;
                            Context context = this.a;
                            Messenger messenger = this.h;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", jVar.a);
                            jVar.a(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    defpackage.g a3 = defpackage.g.a.a(fd.a(extras, "extra_session_binder"));
                    if (a3 != null) {
                        this.i = Token.a(this.b.getSessionToken(), a3);
                    }
                }
            } catch (IllegalStateException e2) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
            }
        }

        public final void a(Messenger messenger) {
        }

        public final void a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        public final void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.h == messenger) {
                k kVar = (k) this.e.get(str);
                if (kVar == null) {
                    if (MediaBrowserCompat.a) {
                        new StringBuilder("onLoadChildren for id that isn't subscribed id=").append(str);
                    }
                    return;
                }
                if (kVar.a(bundle) != null) {
                    if (bundle == null) {
                        if (list != null) {
                            this.j = bundle2;
                            this.j = null;
                        }
                    } else if (list != null) {
                        this.j = bundle2;
                        this.j = null;
                    }
                }
            }
        }

        public final void b() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        public final void c() {
            this.b.connect();
        }

        public final void d() {
            j jVar = this.g;
            if (jVar != null) {
                Messenger messenger = this.h;
                if (messenger != null) {
                    try {
                        jVar.a(7, null, messenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
            this.b.disconnect();
        }

        public final Token e() {
            if (this.i == null) {
                this.i = Token.a(this.b.getSessionToken());
            }
            return this.i;
        }
    }

    static class f extends e {
        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class h implements d, i {
        final Context a;
        final ComponentName b;
        final b c;
        final Bundle d;
        final a e = new a(this);
        int f = 1;
        a g;
        j h;
        Messenger i;
        private final dp<String, k> j = new dp<>();
        private String k;
        private Token l;
        private Bundle m;
        private Bundle n;

        class a implements ServiceConnection {
            a() {
            }

            private void a(Runnable runnable) {
                if (Thread.currentThread() == h.this.e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    h.this.e.post(runnable);
                }
            }

            /* access modifiers changed from: 0000 */
            public final boolean a(String str) {
                if (h.this.g == this && h.this.f != 0 && h.this.f != 1) {
                    return true;
                }
                if (!(h.this.f == 0 || h.this.f == 1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" for ");
                    sb.append(h.this.b);
                    sb.append(" with mServiceConnection=");
                    sb.append(h.this.g);
                    sb.append(" this=");
                    sb.append(this);
                }
                return false;
            }

            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                a((Runnable) new Runnable() {
                    public final void run() {
                        if (MediaBrowserCompat.a) {
                            StringBuilder sb = new StringBuilder("MediaServiceConnection.onServiceConnected name=");
                            sb.append(componentName);
                            sb.append(" binder=");
                            sb.append(iBinder);
                            h.this.b();
                        }
                        if (a.this.a("onServiceConnected")) {
                            h.this.h = new j(iBinder, h.this.d);
                            h.this.i = new Messenger(h.this.e);
                            h.this.e.a(h.this.i);
                            h.this.f = 2;
                            try {
                                if (MediaBrowserCompat.a) {
                                    h.this.b();
                                }
                                j jVar = h.this.h;
                                Context context = h.this.a;
                                Messenger messenger = h.this.i;
                                Bundle bundle = new Bundle();
                                bundle.putString("data_package_name", context.getPackageName());
                                bundle.putInt("data_calling_pid", Process.myPid());
                                bundle.putBundle("data_root_hints", jVar.a);
                                jVar.a(1, bundle, messenger);
                            } catch (RemoteException unused) {
                                new StringBuilder("RemoteException during connect for ").append(h.this.b);
                                if (MediaBrowserCompat.a) {
                                    h.this.b();
                                }
                            }
                        }
                    }
                });
            }

            public final void onServiceDisconnected(final ComponentName componentName) {
                a((Runnable) new Runnable() {
                    public final void run() {
                        if (MediaBrowserCompat.a) {
                            StringBuilder sb = new StringBuilder("MediaServiceConnection.onServiceDisconnected name=");
                            sb.append(componentName);
                            sb.append(" this=");
                            sb.append(this);
                            sb.append(" mServiceConnection=");
                            sb.append(h.this.g);
                            h.this.b();
                        }
                        if (a.this.a("onServiceDisconnected")) {
                            h.this.h = null;
                            h.this.i = null;
                            h.this.e.a(null);
                            h.this.f = 4;
                            h.this.c.b();
                        }
                    }
                });
            }
        }

        public h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.a = context;
                this.b = componentName;
                this.c = bVar;
                this.d = bundle == null ? null : new Bundle(bundle);
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        private static String a(int i2) {
            if (i2 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i2 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i2 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i2 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i2 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            StringBuilder sb = new StringBuilder("UNKNOWN/");
            sb.append(i2);
            return sb.toString();
        }

        private boolean a(Messenger messenger, String str) {
            if (this.i == messenger) {
                int i2 = this.f;
                if (!(i2 == 0 || i2 == 1)) {
                    return true;
                }
            }
            int i3 = this.f;
            if (!(i3 == 0 || i3 == 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(this.b);
                sb.append(" with mCallbacksMessenger=");
                sb.append(this.i);
                sb.append(" this=");
                sb.append(this);
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            a aVar = this.g;
            if (aVar != null) {
                this.a.unbindService(aVar);
            }
            this.f = 1;
            this.g = null;
            this.h = null;
            this.i = null;
            this.e.a(null);
            this.k = null;
            this.l = null;
        }

        public final void a(Messenger messenger) {
            StringBuilder sb = new StringBuilder("onConnectFailed for ");
            sb.append(this.b);
            Log.e("MediaBrowserCompat", sb.toString());
            if (a(messenger, "onConnectFailed")) {
                if (this.f != 2) {
                    StringBuilder sb2 = new StringBuilder("onConnect from service while mState=");
                    sb2.append(a(this.f));
                    sb2.append("... ignoring");
                    return;
                }
                a();
                this.c.c();
            }
        }

        public final void a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (a(messenger, "onConnect")) {
                if (this.f != 2) {
                    StringBuilder sb = new StringBuilder("onConnect from service while mState=");
                    sb.append(a(this.f));
                    sb.append("... ignoring");
                    return;
                }
                this.k = str;
                this.l = token;
                this.m = bundle;
                this.f = 3;
                if (MediaBrowserCompat.a) {
                    b();
                }
                this.c.a();
                try {
                    for (Entry entry : this.j.entrySet()) {
                        String str2 = (String) entry.getKey();
                        k kVar = (k) entry.getValue();
                        List<l> list = kVar.a;
                        List<Bundle> list2 = kVar.b;
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            j jVar = this.h;
                            IBinder iBinder = ((l) list.get(i2)).a;
                            Bundle bundle2 = (Bundle) list2.get(i2);
                            Messenger messenger2 = this.i;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("data_media_item_id", str2);
                            fd.a(bundle3, "data_callback_token", iBinder);
                            bundle3.putBundle("data_options", bundle2);
                            jVar.a(3, bundle3, messenger2);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (a(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.a) {
                    StringBuilder sb = new StringBuilder("onLoadChildren for ");
                    sb.append(this.b);
                    sb.append(" id=");
                    sb.append(str);
                }
                k kVar = (k) this.j.get(str);
                if (kVar == null) {
                    if (MediaBrowserCompat.a) {
                        new StringBuilder("onLoadChildren for id that isn't subscribed id=").append(str);
                    }
                    return;
                }
                if (kVar.a(bundle) != null) {
                    if (bundle == null) {
                        if (list != null) {
                            this.n = bundle2;
                            this.n = null;
                        }
                    } else if (list != null) {
                        this.n = bundle2;
                        this.n = null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            new StringBuilder("  mServiceComponent=").append(this.b);
            new StringBuilder("  mCallback=").append(this.c);
            new StringBuilder("  mRootHints=").append(this.d);
            new StringBuilder("  mState=").append(a(this.f));
            new StringBuilder("  mServiceConnection=").append(this.g);
            new StringBuilder("  mServiceBinderWrapper=").append(this.h);
            new StringBuilder("  mCallbacksMessenger=").append(this.i);
            new StringBuilder("  mRootId=").append(this.k);
            new StringBuilder("  mMediaSessionToken=").append(this.l);
        }

        public final void c() {
            int i2 = this.f;
            if (i2 == 0 || i2 == 1) {
                this.f = 2;
                this.e.post(new Runnable() {
                    public final void run() {
                        if (h.this.f != 0) {
                            h.this.f = 2;
                            if (MediaBrowserCompat.a && h.this.g != null) {
                                StringBuilder sb = new StringBuilder("mServiceConnection should be null. Instead it is ");
                                sb.append(h.this.g);
                                throw new RuntimeException(sb.toString());
                            } else if (h.this.h != null) {
                                StringBuilder sb2 = new StringBuilder("mServiceBinderWrapper should be null. Instead it is ");
                                sb2.append(h.this.h);
                                throw new RuntimeException(sb2.toString());
                            } else if (h.this.i == null) {
                                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                                intent.setComponent(h.this.b);
                                h hVar = h.this;
                                hVar.g = new a();
                                boolean z = false;
                                try {
                                    z = h.this.a.bindService(intent, h.this.g, 1);
                                } catch (Exception unused) {
                                    StringBuilder sb3 = new StringBuilder("Failed binding to service ");
                                    sb3.append(h.this.b);
                                    Log.e("MediaBrowserCompat", sb3.toString());
                                }
                                if (!z) {
                                    h.this.a();
                                    h.this.c.c();
                                }
                                if (MediaBrowserCompat.a) {
                                    h.this.b();
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder("mCallbacksMessenger should be null. Instead it is ");
                                sb4.append(h.this.i);
                                throw new RuntimeException(sb4.toString());
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("connect() called while neigther disconnecting nor disconnected (state=");
            sb.append(a(this.f));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        public final void d() {
            this.f = 0;
            this.e.post(new Runnable() {
                public final void run() {
                    if (h.this.i != null) {
                        try {
                            h.this.h.a(2, null, h.this.i);
                        } catch (RemoteException unused) {
                            new StringBuilder("RemoteException during connect for ").append(h.this.b);
                        }
                    }
                    int i = h.this.f;
                    h.this.a();
                    if (i != 0) {
                        h.this.f = i;
                    }
                    if (MediaBrowserCompat.a) {
                        h.this.b();
                    }
                }
            });
        }

        public final Token e() {
            if (this.f == 3) {
                return this.l;
            }
            StringBuilder sb = new StringBuilder("getSessionToken() called while not connected(state=");
            sb.append(this.f);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }

    interface i {
        void a(Messenger messenger);

        void a(Messenger messenger, String str, Token token, Bundle bundle);

        void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    static class j {
        Bundle a;
        private Messenger b;

        public j(IBinder iBinder, Bundle bundle) {
            this.b = new Messenger(iBinder);
            this.a = bundle;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.b.send(obtain);
        }
    }

    static class k {
        final List<l> a = new ArrayList();
        final List<Bundle> b = new ArrayList();

        public final l a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (mj.a((Bundle) this.b.get(i), bundle)) {
                    return (l) this.a.get(i);
                }
            }
            return null;
        }
    }

    public static abstract class l {
        final IBinder a = new Binder();
        private SubscriptionCallback b;

        class a extends SubscriptionCallback {
            a() {
            }

            public void onChildrenLoaded(String str, List<android.media.browse.MediaBrowser.MediaItem> list) {
                MediaItem.a(list);
            }

            public void onError(String str) {
            }
        }

        class b extends a {
            b() {
                super();
            }

            public final void onChildrenLoaded(String str, List<android.media.browse.MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                MediaItem.a(list);
            }

            public final void onError(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
            }
        }

        public l() {
            if (VERSION.SDK_INT >= 26) {
                this.b = new b();
            } else if (VERSION.SDK_INT >= 21) {
                this.b = new a();
            } else {
                this.b = null;
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.b = new g(context, componentName, bVar, null);
        } else if (VERSION.SDK_INT >= 23) {
            this.b = new f(context, componentName, bVar, null);
        } else if (VERSION.SDK_INT >= 21) {
            this.b = new e(context, componentName, bVar, null);
        } else {
            this.b = new h(context, componentName, bVar, null);
        }
    }

    public final void a() {
        this.b.d();
    }
}
