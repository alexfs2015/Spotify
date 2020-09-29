package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
    static int d;
    public final b a;
    public final MediaControllerCompat b;
    public final ArrayList<h> c;

    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new QueueItem[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };
        final MediaDescriptionCompat a;
        final long b;
        android.media.session.MediaSession.QueueItem c;

        public final int describeContents() {
            return 0;
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        private QueueItem(android.media.session.MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.a = mediaDescriptionCompat;
                this.b = j;
                this.c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeLong(this.b);
        }

        public static List<QueueItem> a(List<?> list) {
            Object obj;
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next == null || VERSION.SDK_INT < 21) {
                    obj = null;
                } else {
                    android.media.session.MediaSession.QueueItem queueItem = (android.media.session.MediaSession.QueueItem) next;
                    obj = new QueueItem(queueItem, MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId());
                }
                arrayList.add(obj);
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.a);
            sb.append(", Id=");
            sb.append(this.b);
            sb.append(" }");
            return sb.toString();
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };
        ResultReceiver a;

        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Token[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }
        };
        public final Object a;
        public defpackage.g b;
        rz c;

        public final int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        private Token(Object obj, defpackage.g gVar) {
            this(obj, gVar, null);
        }

        Token(Object obj, defpackage.g gVar, rz rzVar) {
            this.a = obj;
            this.b = gVar;
            this.c = rzVar;
        }

        public static Token a(Object obj) {
            return a(obj, null);
        }

        public static Token a(Object obj, defpackage.g gVar) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof android.media.session.MediaSession.Token) {
                return new Token(obj, gVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.a);
            }
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                return token.a == null;
            }
            Object obj3 = token.a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }
    }

    public static abstract class a {
        final Callback a;
        WeakReference<b> b;
        private C0002a c = null;
        private boolean d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a reason: collision with other inner class name */
        class C0002a extends Handler {
            C0002a(Looper looper) {
                super(looper);
            }

            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    b bVar = (b) a.this.b.get();
                    if (bVar != null) {
                        bVar.a((defpackage.mg.a) message.obj);
                        a.this.a();
                        bVar.a((defpackage.mg.a) null);
                    }
                }
            }
        }

        class b extends Callback {
            b() {
            }

            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                MediaSessionCompat.b(bundle);
                a();
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        e eVar = (e) a.this.b.get();
                        if (eVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = eVar.b;
                            defpackage.g gVar = token.b;
                            fd.a(bundle2, "android.support.v4.media.session.EXTRA_BINDER", gVar == null ? null : gVar.asBinder());
                            rw.a(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", token.c);
                            resultReceiver.send(0, bundle2);
                        }
                    } else {
                        String str2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            bundle.getParcelable(str2);
                        } else {
                            String str3 = "android.support.v4.media.session.command.ARGUMENT_INDEX";
                            if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                                bundle.getParcelable(str2);
                                bundle.getInt(str3);
                            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                                bundle.getParcelable(str2);
                            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                e eVar2 = (e) a.this.b.get();
                                if (!(eVar2 == null || eVar2.g == null)) {
                                    int i = bundle.getInt(str3, -1);
                                    if (i >= 0 && i < eVar2.g.size()) {
                                        eVar2.g.get(i);
                                    }
                                }
                            }
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                b();
            }

            public final boolean onMediaButtonEvent(Intent intent) {
                a();
                boolean a2 = a.this.a(intent);
                b();
                return a2 || super.onMediaButtonEvent(intent);
            }

            public final void onPlay() {
                a();
                a.this.b();
                b();
            }

            public final void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                a.this.a(str, bundle);
                b();
            }

            public final void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                a.this.b(str, bundle);
                b();
            }

            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                a.this.b(uri, bundle);
                b();
            }

            public final void onSkipToQueueItem(long j) {
                a();
                a.this.a(j);
                b();
            }

            public final void onPause() {
                a();
                a.this.c();
                b();
            }

            public final void onSkipToNext() {
                a();
                a.this.d();
                b();
            }

            public final void onSkipToPrevious() {
                a();
                a.this.e();
                b();
            }

            public final void onFastForward() {
                a();
                b();
            }

            public final void onRewind() {
                a();
                b();
            }

            public final void onStop() {
                a();
                a.this.f();
                b();
            }

            public final void onSeekTo(long j) {
                a();
                a.this.b(j);
                b();
            }

            public final void onSetRating(Rating rating) {
                a();
                a.this.a(RatingCompat.a(rating));
                b();
            }

            public final void onCustomAction(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.b(bundle2);
                String str2 = "android.support.v4.media.session.action.ARGUMENT_URI";
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    a.this.b((Uri) bundle.getParcelable(str2), bundle2);
                } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        a.this.a((Uri) bundle.getParcelable(str2), bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        a.this.a(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        a.this.b(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                    } else {
                        a.this.c(str, bundle);
                    }
                }
                b();
            }

            private void a() {
                if (VERSION.SDK_INT < 28) {
                    b bVar = a.this.b != null ? (b) a.this.b.get() : null;
                    if (bVar != null) {
                        String e = bVar.e();
                        if (TextUtils.isEmpty(e)) {
                            e = "android.media.session.MediaController";
                        }
                        bVar.a(new defpackage.mg.a(e, -1, -1));
                    }
                }
            }

            private void b() {
                b bVar = a.this.b != null ? (b) a.this.b.get() : null;
                if (bVar != null) {
                    bVar.a((defpackage.mg.a) null);
                }
            }

            public final void onPrepare() {
                a();
                b();
            }

            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                b();
            }

            public final void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                b();
            }

            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a();
                a.this.a(uri, bundle);
                b();
            }
        }

        public void a(int i) {
        }

        public void a(long j) {
        }

        public void a(Uri uri, Bundle bundle) {
        }

        public void a(RatingCompat ratingCompat) {
        }

        public void a(String str, Bundle bundle) {
        }

        public void b() {
        }

        public void b(int i) {
        }

        public void b(long j) {
        }

        public void b(Uri uri, Bundle bundle) {
        }

        public void b(String str, Bundle bundle) {
        }

        public void c() {
        }

        public void c(String str, Bundle bundle) {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public a() {
            if (VERSION.SDK_INT >= 21) {
                this.a = new b();
            } else {
                this.a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(b bVar, Handler handler) {
            this.b = new WeakReference<>(bVar);
            C0002a aVar = this.c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.c = new C0002a(handler.getLooper());
        }

        public boolean a(Intent intent) {
            if (VERSION.SDK_INT >= 27) {
                return false;
            }
            b bVar = (b) this.b.get();
            if (!(bVar == null || this.c == null)) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    defpackage.mg.a f = bVar.f();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 79 || keyCode == 85) {
                        if (keyEvent.getRepeatCount() > 0) {
                            a();
                        } else if (this.d) {
                            this.c.removeMessages(1);
                            this.d = false;
                            PlaybackStateCompat d2 = bVar.d();
                            if (((d2 == null ? 0 : d2.e) & 32) != 0) {
                                d();
                            }
                        } else {
                            this.d = true;
                            C0002a aVar = this.c;
                            aVar.sendMessageDelayed(aVar.obtainMessage(1, f), (long) ViewConfiguration.getDoubleTapTimeout());
                        }
                        return true;
                    }
                    a();
                    return false;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.d) {
                boolean z = false;
                this.d = false;
                this.c.removeMessages(1);
                b bVar = (b) this.b.get();
                if (bVar != null) {
                    PlaybackStateCompat d2 = bVar.d();
                    long j = d2 == null ? 0 : d2.e;
                    boolean z2 = d2 != null && d2.a == 3;
                    boolean z3 = (516 & j) != 0;
                    if ((j & 514) != 0) {
                        z = true;
                    }
                    if (!z2 || !z) {
                        if (!z2 && z3) {
                            b();
                        }
                        return;
                    }
                    c();
                }
            }
        }
    }

    public interface b {
        void a(int i);

        void a(PendingIntent pendingIntent);

        void a(Bundle bundle);

        void a(MediaMetadataCompat mediaMetadataCompat);

        void a(a aVar, Handler handler);

        void a(PlaybackStateCompat playbackStateCompat);

        void a(CharSequence charSequence);

        void a(List<QueueItem> list);

        void a(defpackage.mg.a aVar);

        void a(mk mkVar);

        void a(boolean z);

        boolean a();

        void b();

        void b(int i);

        void b(PendingIntent pendingIntent);

        Token c();

        void c(int i);

        PlaybackStateCompat d();

        void d(int i);

        String e();

        void e(int i);

        defpackage.mg.a f();
    }

    static class c extends g {
        private static boolean w = true;

        c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        public void a(a aVar, Handler handler) {
            super.a(aVar, handler);
            if (aVar == null) {
                this.e.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.e.setPlaybackPositionUpdateListener(new OnPlaybackPositionUpdateListener() {
                public final void onPlaybackPositionUpdate(long j) {
                    c.this.a(18, -1, -1, Long.valueOf(j), null);
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public int a(long j) {
            int a = super.a(j);
            return (j & 256) != 0 ? a | 256 : a;
        }

        /* access modifiers changed from: 0000 */
        public final void a(PendingIntent pendingIntent, ComponentName componentName) {
            if (w) {
                try {
                    this.d.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    w = false;
                }
            }
            if (!w) {
                super.a(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(PendingIntent pendingIntent, ComponentName componentName) {
            if (w) {
                this.d.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.b(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(PlaybackStateCompat playbackStateCompat) {
            long j = playbackStateCompat.b;
            float f = playbackStateCompat.d;
            long j2 = playbackStateCompat.h;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.a == 3) {
                long j3 = 0;
                if (j > 0) {
                    if (j2 > 0) {
                        j3 = elapsedRealtime - j2;
                        if (f > 0.0f && f != 1.0f) {
                            j3 = (long) (((float) j3) * f);
                        }
                    }
                    j += j3;
                }
            }
            this.e.setPlaybackState(g(playbackStateCompat.a), j, f);
        }
    }

    static class d extends c {
        d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        public final void a(a aVar, Handler handler) {
            super.a(aVar, handler);
            if (aVar == null) {
                this.e.setMetadataUpdateListener(null);
                return;
            }
            this.e.setMetadataUpdateListener(new OnMetadataUpdateListener() {
                public final void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        d.this.a(19, -1, -1, RatingCompat.a(obj), null);
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final int a(long j) {
            int a = super.a(j);
            return (j & 128) != 0 ? a | 512 : a;
        }

        /* access modifiers changed from: 0000 */
        public final MetadataEditor b(Bundle bundle) {
            MetadataEditor b = super.b(bundle);
            if (((this.l == null ? 0 : this.l.e) & 128) != 0) {
                b.addEditableKey(268435457);
            }
            if (bundle == null) {
                return b;
            }
            String str = "android.media.metadata.YEAR";
            if (bundle.containsKey(str)) {
                b.putLong(8, bundle.getLong(str));
            }
            String str2 = "android.media.metadata.RATING";
            if (bundle.containsKey(str2)) {
                b.putObject(101, bundle.getParcelable(str2));
            }
            String str3 = "android.media.metadata.USER_RATING";
            if (bundle.containsKey(str3)) {
                b.putObject(268435457, bundle.getParcelable(str3));
            }
            return b;
        }
    }

    static class e implements b {
        final MediaSession a;
        final Token b;
        final Bundle c;
        boolean d = false;
        final RemoteCallbackList<defpackage.f> e = new RemoteCallbackList<>();
        PlaybackStateCompat f;
        List<QueueItem> g;
        MediaMetadataCompat h;
        int i;
        int j;
        int k;
        private Object l = new Object();
        private defpackage.mg.a m;

        class a extends defpackage.g.a {
            public final void b(boolean z) {
            }

            public final List<QueueItem> i() {
                return null;
            }

            public final boolean m() {
                return false;
            }

            public final boolean o() {
                return false;
            }

            a() {
            }

            public final void a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public final boolean a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public final void a(defpackage.f fVar) {
                if (!e.this.d) {
                    e.this.e.register(fVar, new defpackage.mg.a("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            public final void b(defpackage.f fVar) {
                e.this.e.unregister(fVar);
            }

            public final String b() {
                throw new AssertionError();
            }

            public final Bundle q() {
                if (e.this.c == null) {
                    return null;
                }
                return new Bundle(e.this.c);
            }

            public final String c() {
                throw new AssertionError();
            }

            public final PendingIntent d() {
                throw new AssertionError();
            }

            public final long e() {
                throw new AssertionError();
            }

            public final ParcelableVolumeInfo f() {
                throw new AssertionError();
            }

            public final void a(int i, int i2, String str) {
                throw new AssertionError();
            }

            public final void b(int i, int i2, String str) {
                throw new AssertionError();
            }

            public final void r() {
                throw new AssertionError();
            }

            public final void a(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public final void b(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public final void a(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public final void s() {
                throw new AssertionError();
            }

            public final void c(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public final void d(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public final void b(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public final void a(long j) {
                throw new AssertionError();
            }

            public final void t() {
                throw new AssertionError();
            }

            public final void u() {
                throw new AssertionError();
            }

            public final void v() {
                throw new AssertionError();
            }

            public final void w() {
                throw new AssertionError();
            }

            public final void x() {
                throw new AssertionError();
            }

            public final void y() {
                throw new AssertionError();
            }

            public final void b(long j) {
                throw new AssertionError();
            }

            public final void a(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            public final void a(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            public final void a(float f) {
                throw new AssertionError();
            }

            public final void a(boolean z) {
                throw new AssertionError();
            }

            public final void b(int i) {
                throw new AssertionError();
            }

            public final void c(int i) {
                throw new AssertionError();
            }

            public final void e(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public final MediaMetadataCompat g() {
                throw new AssertionError();
            }

            public final PlaybackStateCompat h() {
                return MediaSessionCompat.a(e.this.f, e.this.h);
            }

            public final void a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public final void a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public final void a(int i) {
                throw new AssertionError();
            }

            public final CharSequence j() {
                throw new AssertionError();
            }

            public final Bundle k() {
                throw new AssertionError();
            }

            public final int l() {
                return e.this.i;
            }

            public final int n() {
                return e.this.j;
            }

            public final int p() {
                return e.this.k;
            }

            public final boolean a() {
                throw new AssertionError();
            }
        }

        e(Context context, String str, rz rzVar, Bundle bundle) {
            this.a = new MediaSession(context, str);
            this.b = new Token(this.a.getSessionToken(), new a(), rzVar);
            this.c = bundle;
            a(3);
        }

        public final void a(a aVar, Handler handler) {
            this.a.setCallback(aVar == null ? null : aVar.a, handler);
            if (aVar != null) {
                aVar.a((b) this, handler);
            }
        }

        public final void a(int i2) {
            this.a.setFlags(i2 | 1 | 2);
        }

        public final void b(int i2) {
            Builder builder = new Builder();
            builder.setLegacyStreamType(i2);
            this.a.setPlaybackToLocal(builder.build());
        }

        public final void a(mk mkVar) {
            this.a.setPlaybackToRemote((VolumeProvider) mkVar.a());
        }

        public final void a(boolean z) {
            this.a.setActive(z);
        }

        public final boolean a() {
            return this.a.isActive();
        }

        public final void b() {
            this.d = true;
            this.a.release();
        }

        public final Token c() {
            return this.b;
        }

        public final void a(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            CustomAction customAction;
            this.f = playbackStateCompat;
            for (int beginBroadcast = this.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.e.getBroadcastItem(beginBroadcast)).a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.e.finishBroadcast();
            MediaSession mediaSession = this.a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                if (playbackStateCompat.l == null && VERSION.SDK_INT >= 21) {
                    PlaybackState.Builder builder = new PlaybackState.Builder();
                    builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
                    builder.setBufferedPosition(playbackStateCompat.c);
                    builder.setActions(playbackStateCompat.e);
                    builder.setErrorMessage(playbackStateCompat.g);
                    for (PlaybackStateCompat.CustomAction customAction2 : playbackStateCompat.i) {
                        if (customAction2.e != null || VERSION.SDK_INT < 21) {
                            customAction = customAction2.e;
                        } else {
                            CustomAction.Builder builder2 = new CustomAction.Builder(customAction2.a, customAction2.b, customAction2.c);
                            builder2.setExtras(customAction2.d);
                            customAction = builder2.build();
                        }
                        builder.addCustomAction(customAction);
                    }
                    builder.setActiveQueueItemId(playbackStateCompat.j);
                    if (VERSION.SDK_INT >= 22) {
                        builder.setExtras(playbackStateCompat.k);
                    }
                    playbackStateCompat.l = builder.build();
                }
                playbackState = playbackStateCompat.l;
            }
            mediaSession.setPlaybackState(playbackState);
        }

        public final PlaybackStateCompat d() {
            return this.f;
        }

        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.h = mediaMetadataCompat;
            MediaSession mediaSession = this.a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                if (mediaMetadataCompat.c == null && VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    mediaMetadataCompat.writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    mediaMetadataCompat.c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                mediaMetadata = mediaMetadataCompat.c;
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        public final void a(PendingIntent pendingIntent) {
            this.a.setSessionActivity(pendingIntent);
        }

        public final void b(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        public final void a(List<QueueItem> list) {
            android.media.session.MediaSession.QueueItem queueItem;
            this.g = list;
            if (list == null) {
                this.a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (QueueItem queueItem2 : list) {
                if (queueItem2.c != null || VERSION.SDK_INT < 21) {
                    queueItem = queueItem2.c;
                } else {
                    queueItem2.c = new android.media.session.MediaSession.QueueItem((MediaDescription) queueItem2.a.a(), queueItem2.b);
                    queueItem = queueItem2.c;
                }
                arrayList.add(queueItem);
            }
            this.a.setQueue(arrayList);
        }

        public final void a(CharSequence charSequence) {
            this.a.setQueueTitle(charSequence);
        }

        public final void c(int i2) {
            if (VERSION.SDK_INT < 22) {
                this.i = i2;
            } else {
                this.a.setRatingType(i2);
            }
        }

        public final void d(int i2) {
            if (this.j != i2) {
                this.j = i2;
                for (int beginBroadcast = this.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((defpackage.f) this.e.getBroadcastItem(beginBroadcast)).a(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.e.finishBroadcast();
            }
        }

        public final void e(int i2) {
            if (this.k != i2) {
                this.k = i2;
                for (int beginBroadcast = this.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((defpackage.f) this.e.getBroadcastItem(beginBroadcast)).b(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.e.finishBroadcast();
            }
        }

        public final void a(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        public void a(defpackage.mg.a aVar) {
            synchronized (this.l) {
                this.m = aVar;
            }
        }

        public final String e() {
            if (VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
            } catch (Exception e2) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e2);
                return null;
            }
        }

        public defpackage.mg.a f() {
            defpackage.mg.a aVar;
            synchronized (this.l) {
                aVar = this.m;
            }
            return aVar;
        }
    }

    static class f extends e {
        public final void a(defpackage.mg.a aVar) {
        }

        f(Context context, String str, rz rzVar, Bundle bundle) {
            super(context, str, rzVar, bundle);
        }

        public final defpackage.mg.a f() {
            return new defpackage.mg.a(this.a.getCurrentControllerInfo());
        }
    }

    static class g implements b {
        private final Token A;
        private c B;
        private boolean C = false;
        private defpackage.mg.a D;
        private defpackage.mk.a E = new defpackage.mk.a() {
            public final void a(mk mkVar) {
                if (g.this.v == mkVar) {
                    ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(g.this.t, g.this.u, mkVar.a, mkVar.b, mkVar.c);
                    g.this.a(parcelableVolumeInfo);
                }
            }
        };
        final String a;
        final Bundle b;
        final String c;
        final AudioManager d;
        final RemoteControlClient e;
        final Object f = new Object();
        final RemoteCallbackList<defpackage.f> g = new RemoteCallbackList<>();
        boolean h = false;
        volatile a i;
        int j = 3;
        MediaMetadataCompat k;
        PlaybackStateCompat l;
        PendingIntent m;
        List<QueueItem> n;
        CharSequence o;
        int p;
        int q;
        int r;
        Bundle s;
        int t;
        int u;
        mk v;
        private final Context w;
        private final ComponentName x;
        private final PendingIntent y;
        private final b z;

        static final class a {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;

            public a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = str;
                this.b = bundle;
                this.c = resultReceiver;
            }
        }

        class b extends defpackage.g.a {
            public final boolean a() {
                return true;
            }

            public final void b(boolean z) {
            }

            public final boolean m() {
                return false;
            }

            public final boolean o() {
                return false;
            }

            b() {
            }

            public final void a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                a(1, (Object) new a(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.a));
            }

            public final boolean a(KeyEvent keyEvent) {
                a(21, (Object) keyEvent);
                return true;
            }

            public final void a(defpackage.f fVar) {
                if (g.this.h) {
                    try {
                        fVar.a();
                    } catch (Exception unused) {
                    }
                    return;
                }
                g.this.g.register(fVar, new defpackage.mg.a(g.this.f(getCallingUid()), getCallingPid(), getCallingUid()));
            }

            public final void b(defpackage.f fVar) {
                g.this.g.unregister(fVar);
            }

            public final String b() {
                return g.this.a;
            }

            public final Bundle q() {
                if (g.this.b == null) {
                    return null;
                }
                return new Bundle(g.this.b);
            }

            public final String c() {
                return g.this.c;
            }

            public final PendingIntent d() {
                PendingIntent pendingIntent;
                synchronized (g.this.f) {
                    pendingIntent = g.this.m;
                }
                return pendingIntent;
            }

            public final long e() {
                long j;
                synchronized (g.this.f) {
                    j = (long) g.this.j;
                }
                return j;
            }

            public final ParcelableVolumeInfo f() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (g.this.f) {
                    i = g.this.t;
                    i2 = g.this.u;
                    mk mkVar = g.this.v;
                    if (i == 2) {
                        int i6 = mkVar.a;
                        int i7 = mkVar.b;
                        i3 = mkVar.c;
                        i4 = i7;
                        i5 = i6;
                    } else {
                        i4 = g.this.d.getStreamMaxVolume(i2);
                        i3 = g.this.d.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, i5, i4, i3);
                return parcelableVolumeInfo;
            }

            public final void a(int i, int i2, String str) {
                g.this.a(i, i2);
            }

            public final void b(int i, int i2, String str) {
                g.this.b(i, i2);
            }

            public final void r() {
                d(3);
            }

            public final void a(String str, Bundle bundle) {
                a(4, (Object) str, bundle);
            }

            public final void b(String str, Bundle bundle) {
                a(5, (Object) str, bundle);
            }

            public final void a(Uri uri, Bundle bundle) {
                a(6, (Object) uri, bundle);
            }

            public final void s() {
                d(7);
            }

            public final void c(String str, Bundle bundle) {
                a(8, (Object) str, bundle);
            }

            public final void d(String str, Bundle bundle) {
                a(9, (Object) str, bundle);
            }

            public final void b(Uri uri, Bundle bundle) {
                a(10, (Object) uri, bundle);
            }

            public final void a(long j) {
                a(11, (Object) Long.valueOf(j));
            }

            public final void t() {
                d(12);
            }

            public final void u() {
                d(13);
            }

            public final void v() {
                d(14);
            }

            public final void w() {
                d(15);
            }

            public final void x() {
                d(16);
            }

            public final void y() {
                d(17);
            }

            public final void b(long j) {
                a(18, (Object) Long.valueOf(j));
            }

            public final void a(RatingCompat ratingCompat) {
                a(19, (Object) ratingCompat);
            }

            public final void a(RatingCompat ratingCompat, Bundle bundle) {
                a(31, (Object) ratingCompat, bundle);
            }

            public final void a(float f) {
                a(32, (Object) Float.valueOf(f));
            }

            public final void a(boolean z) {
                a(29, (Object) Boolean.valueOf(z));
            }

            public final void b(int i) {
                a(23, i);
            }

            public final void c(int i) {
                a(30, i);
            }

            public final void e(String str, Bundle bundle) {
                a(20, (Object) str, bundle);
            }

            public final MediaMetadataCompat g() {
                return g.this.k;
            }

            public final PlaybackStateCompat h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (g.this.f) {
                    playbackStateCompat = g.this.l;
                    mediaMetadataCompat = g.this.k;
                }
                return MediaSessionCompat.a(playbackStateCompat, mediaMetadataCompat);
            }

            public final List<QueueItem> i() {
                List<QueueItem> list;
                synchronized (g.this.f) {
                    list = g.this.n;
                }
                return list;
            }

            public final void a(MediaDescriptionCompat mediaDescriptionCompat) {
                a(25, (Object) mediaDescriptionCompat);
            }

            public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
                a(27, (Object) mediaDescriptionCompat);
            }

            public final void a(int i) {
                a(28, i);
            }

            public final CharSequence j() {
                return g.this.o;
            }

            public final Bundle k() {
                Bundle bundle;
                synchronized (g.this.f) {
                    bundle = g.this.s;
                }
                return bundle;
            }

            public final int l() {
                return g.this.p;
            }

            public final int n() {
                return g.this.q;
            }

            public final int p() {
                return g.this.r;
            }

            private void d(int i) {
                g.this.a(i, 0, 0, null, null);
            }

            private void a(int i, int i2) {
                g.this.a(i, i2, 0, null, null);
            }

            private void a(int i, Object obj) {
                g.this.a(i, 0, 0, obj, null);
            }

            private void a(int i, Object obj, Bundle bundle) {
                g.this.a(i, 0, 0, obj, bundle);
            }

            public final void a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                g.this.a(26, i, 0, mediaDescriptionCompat, null);
            }
        }

        class c extends Handler {
            public c(Looper looper) {
                super(looper);
            }

            public final void handleMessage(Message message) {
                a aVar = g.this.i;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.b(data);
                    g.this.a(new defpackage.mg.a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.b(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                Object obj = message.obj;
                                break;
                            case 2:
                                g.this.a(message.arg1, 0);
                                break;
                            case 3:
                            case 16:
                            case 17:
                                break;
                            case 4:
                                Object obj2 = message.obj;
                                break;
                            case 5:
                                Object obj3 = message.obj;
                                break;
                            case 6:
                                aVar.a((Uri) message.obj, bundle);
                                break;
                            case 7:
                                aVar.b();
                                break;
                            case 8:
                                aVar.a((String) message.obj, bundle);
                                break;
                            case 9:
                                aVar.b((String) message.obj, bundle);
                                break;
                            case 10:
                                aVar.b((Uri) message.obj, bundle);
                                break;
                            case 11:
                                aVar.a(((Long) message.obj).longValue());
                                break;
                            case 12:
                                aVar.c();
                                break;
                            case 13:
                                aVar.f();
                                break;
                            case 14:
                                aVar.d();
                                break;
                            case 15:
                                aVar.e();
                                break;
                            case 18:
                                aVar.b(((Long) message.obj).longValue());
                                break;
                            case 19:
                                aVar.a((RatingCompat) message.obj);
                                break;
                            case 20:
                                aVar.c((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.a(intent) && keyEvent != null) {
                                    if (keyEvent.getAction() == 0) {
                                        long j = g.this.l == null ? 0 : g.this.l.e;
                                        int keyCode = keyEvent.getKeyCode();
                                        if (keyCode == 126) {
                                            if ((j & 4) != 0) {
                                                aVar.b();
                                                break;
                                            }
                                        } else if (keyCode == 127) {
                                            if ((j & 2) != 0) {
                                                aVar.c();
                                                break;
                                            }
                                        } else {
                                            switch (keyCode) {
                                                case 86:
                                                    if ((j & 1) != 0) {
                                                        aVar.f();
                                                        break;
                                                    }
                                                    break;
                                                case 87:
                                                    if ((j & 32) != 0) {
                                                        aVar.d();
                                                        break;
                                                    }
                                                    break;
                                                case 88:
                                                    if ((j & 16) != 0) {
                                                        aVar.e();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                g.this.b(message.arg1, 0);
                                break;
                            case 23:
                                aVar.a(message.arg1);
                                break;
                            case 25:
                                Object obj4 = message.obj;
                                break;
                            case 26:
                                Object obj5 = message.obj;
                                int i = message.arg1;
                                break;
                            case 27:
                                Object obj6 = message.obj;
                                break;
                            case 28:
                                if (g.this.n != null && message.arg1 >= 0 && message.arg1 < g.this.n.size()) {
                                    g.this.n.get(message.arg1);
                                    break;
                                }
                            case 29:
                                ((Boolean) message.obj).booleanValue();
                                break;
                            case 30:
                                aVar.b(message.arg1);
                                break;
                            case 31:
                                Object obj7 = message.obj;
                                break;
                            case 32:
                                ((Float) message.obj).floatValue();
                                break;
                        }
                    } finally {
                        g.this.a((defpackage.mg.a) null);
                    }
                }
            }
        }

        static int g(int i2) {
            switch (i2) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: 0000 */
        public int a(long j2) {
            int i2 = (1 & j2) != 0 ? 32 : 0;
            if ((2 & j2) != 0) {
                i2 |= 16;
            }
            if ((4 & j2) != 0) {
                i2 |= 4;
            }
            if ((8 & j2) != 0) {
                i2 |= 2;
            }
            if ((16 & j2) != 0) {
                i2 |= 1;
            }
            if ((32 & j2) != 0) {
                i2 |= 128;
            }
            if ((64 & j2) != 0) {
                i2 |= 64;
            }
            return (j2 & 512) != 0 ? i2 | 8 : i2;
        }

        public final void b(PendingIntent pendingIntent) {
        }

        public final String e() {
            return null;
        }

        public g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            if (componentName != null) {
                this.w = context;
                this.a = context.getPackageName();
                this.b = bundle;
                this.d = (AudioManager) context.getSystemService("audio");
                this.c = str;
                this.x = componentName;
                this.y = pendingIntent;
                this.z = new b();
                this.A = new Token(this.z);
                this.p = 0;
                this.t = 1;
                this.u = 3;
                this.e = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        public void a(a aVar, Handler handler) {
            this.i = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f) {
                    if (this.B != null) {
                        this.B.removeCallbacksAndMessages(null);
                    }
                    this.B = new c(handler.getLooper());
                    this.i.a((b) this, handler);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, int i3, int i4, Object obj, Bundle bundle) {
            synchronized (this.f) {
                if (this.B != null) {
                    Message obtainMessage = this.B.obtainMessage(i2, i3, i4, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", f(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final String f(int i2) {
            String nameForUid = this.w.getPackageManager().getNameForUid(i2);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        public final void a(int i2) {
            synchronized (this.f) {
                this.j = i2 | 1 | 2;
            }
        }

        public final void b(int i2) {
            mk mkVar = this.v;
            if (mkVar != null) {
                mkVar.d = null;
            }
            this.u = i2;
            this.t = 1;
            int i3 = this.t;
            int i4 = this.u;
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i3, i4, 2, this.d.getStreamMaxVolume(i4), this.d.getStreamVolume(this.u));
            a(parcelableVolumeInfo);
        }

        public final void a(mk mkVar) {
            if (mkVar != null) {
                mk mkVar2 = this.v;
                if (mkVar2 != null) {
                    mkVar2.d = null;
                }
                this.t = 2;
                this.v = mkVar;
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(this.t, this.u, this.v.a, this.v.b, this.v.c);
                a(parcelableVolumeInfo);
                mkVar.d = this.E;
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        public final void a(boolean z2) {
            if (z2 != this.C) {
                this.C = z2;
                g();
            }
        }

        public final boolean a() {
            return this.C;
        }

        public final void b() {
            this.C = false;
            this.h = true;
            g();
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a();
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
            this.g.kill();
        }

        public final Token c() {
            return this.A;
        }

        public final void a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f) {
                this.l = playbackStateCompat;
            }
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
            if (this.C) {
                if (playbackStateCompat == null) {
                    this.e.setPlaybackState(0);
                    this.e.setTransportControlFlags(0);
                    return;
                }
                b(playbackStateCompat);
                this.e.setTransportControlFlags(a(playbackStateCompat.e));
            }
        }

        public final PlaybackStateCompat d() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f) {
                playbackStateCompat = this.l;
            }
            return playbackStateCompat;
        }

        /* access modifiers changed from: 0000 */
        public void b(PlaybackStateCompat playbackStateCompat) {
            this.e.setPlaybackState(g(playbackStateCompat.a));
        }

        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new android.support.v4.media.MediaMetadataCompat.a(mediaMetadataCompat, MediaSessionCompat.d).a();
            }
            synchronized (this.f) {
                this.k = mediaMetadataCompat;
            }
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
            if (this.C) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = new Bundle(mediaMetadataCompat.b);
                }
                b(bundle).apply();
            }
        }

        /* access modifiers changed from: 0000 */
        public MetadataEditor b(Bundle bundle) {
            MetadataEditor editMetadata = this.e.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            String str = "android.media.metadata.ART";
            if (bundle.containsKey(str)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(str);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else {
                String str2 = "android.media.metadata.ALBUM_ART";
                if (bundle.containsKey(str2)) {
                    Bitmap bitmap2 = (Bitmap) bundle.getParcelable(str2);
                    if (bitmap2 != null) {
                        bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap2);
                }
            }
            String str3 = "android.media.metadata.ALBUM";
            if (bundle.containsKey(str3)) {
                editMetadata.putString(1, bundle.getString(str3));
            }
            String str4 = "android.media.metadata.ALBUM_ARTIST";
            if (bundle.containsKey(str4)) {
                editMetadata.putString(13, bundle.getString(str4));
            }
            String str5 = "android.media.metadata.ARTIST";
            if (bundle.containsKey(str5)) {
                editMetadata.putString(2, bundle.getString(str5));
            }
            String str6 = "android.media.metadata.AUTHOR";
            if (bundle.containsKey(str6)) {
                editMetadata.putString(3, bundle.getString(str6));
            }
            String str7 = "android.media.metadata.COMPILATION";
            if (bundle.containsKey(str7)) {
                editMetadata.putString(15, bundle.getString(str7));
            }
            String str8 = "android.media.metadata.COMPOSER";
            if (bundle.containsKey(str8)) {
                editMetadata.putString(4, bundle.getString(str8));
            }
            String str9 = "android.media.metadata.DATE";
            if (bundle.containsKey(str9)) {
                editMetadata.putString(5, bundle.getString(str9));
            }
            String str10 = "android.media.metadata.DISC_NUMBER";
            if (bundle.containsKey(str10)) {
                editMetadata.putLong(14, bundle.getLong(str10));
            }
            String str11 = "android.media.metadata.DURATION";
            if (bundle.containsKey(str11)) {
                editMetadata.putLong(9, bundle.getLong(str11));
            }
            String str12 = "android.media.metadata.GENRE";
            if (bundle.containsKey(str12)) {
                editMetadata.putString(6, bundle.getString(str12));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        public final void a(PendingIntent pendingIntent) {
            synchronized (this.f) {
                this.m = pendingIntent;
            }
        }

        public final void a(List<QueueItem> list) {
            this.n = list;
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(list);
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
        }

        public final void a(CharSequence charSequence) {
            this.o = charSequence;
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
        }

        public final void c(int i2) {
            this.p = i2;
        }

        public final void d(int i2) {
            if (this.q != i2) {
                this.q = i2;
                for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.g.finishBroadcast();
            }
        }

        public final void e(int i2) {
            if (this.r != i2) {
                this.r = i2;
                for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).b(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.g.finishBroadcast();
            }
        }

        public final void a(Bundle bundle) {
            this.s = bundle;
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
        }

        public final defpackage.mg.a f() {
            defpackage.mg.a aVar;
            synchronized (this.f) {
                aVar = this.D;
            }
            return aVar;
        }

        public final void a(defpackage.mg.a aVar) {
            synchronized (this.f) {
                this.D = aVar;
            }
        }

        private void g() {
            if (this.C) {
                a(this.y, this.x);
                this.d.registerRemoteControlClient(this.e);
                a(this.k);
                a(this.l);
                return;
            }
            b(this.y, this.x);
            this.e.setPlaybackState(0);
            this.d.unregisterRemoteControlClient(this.e);
        }

        /* access modifiers changed from: 0000 */
        public void a(PendingIntent pendingIntent, ComponentName componentName) {
            this.d.registerMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: 0000 */
        public void b(PendingIntent pendingIntent, ComponentName componentName) {
            this.d.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, int i3) {
            if (this.t == 2) {
                mk mkVar = this.v;
                if (mkVar != null) {
                    mkVar.c(i2);
                }
            } else {
                this.d.adjustStreamVolume(this.u, i2, i3);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(int i2, int i3) {
            if (this.t == 2) {
                mk mkVar = this.v;
                if (mkVar != null) {
                    mkVar.b(i2);
                }
            } else {
                this.d.setStreamVolume(this.u, i2, i3);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((defpackage.f) this.g.getBroadcastItem(beginBroadcast)).a(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.g.finishBroadcast();
        }
    }

    public interface h {
        void a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, null, null);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, rz rzVar) {
        this.c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                componentName = mm.a(context);
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            if (VERSION.SDK_INT >= 28) {
                this.a = new f(context, str, null, bundle);
                a((a) new a() {
                }, (Handler) null);
                this.a.b(pendingIntent2);
            } else if (VERSION.SDK_INT >= 21) {
                this.a = new e(context, str, null, bundle);
                a((a) new a() {
                }, (Handler) null);
                this.a.b(pendingIntent2);
            } else if (VERSION.SDK_INT >= 19) {
                d dVar = new d(context, str, componentName2, pendingIntent2, bundle);
                this.a = dVar;
            } else if (VERSION.SDK_INT >= 18) {
                c cVar = new c(context, str, componentName2, pendingIntent2, bundle);
                this.a = cVar;
            } else {
                g gVar = new g(context, str, componentName2, pendingIntent2, bundle);
                this.a = gVar;
            }
            this.b = new MediaControllerCompat(context, this);
            if (d == 0) {
                d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    public final void a(a aVar, Handler handler) {
        if (aVar == null) {
            this.a.a(null, null);
        } else {
            this.a.a(aVar, new Handler());
        }
    }

    public final void a(PendingIntent pendingIntent) {
        this.a.a(pendingIntent);
    }

    public final void a(int i) {
        this.a.b(i);
    }

    public final void a(mk mkVar) {
        if (mkVar != null) {
            this.a.a(mkVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public final void a(boolean z) {
        this.a.a(z);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    public final Token c() {
        return this.a.c();
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
        this.a.a(playbackStateCompat);
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        this.a.a(mediaMetadataCompat);
    }

    public final void a(List<QueueItem> list) {
        this.a.a(list);
    }

    public final void a(Bundle bundle) {
        this.a.a(bundle);
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.b == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.a != 3 && playbackStateCompat.a != 4 && playbackStateCompat.a != 5) {
            return playbackStateCompat;
        }
        long j2 = playbackStateCompat.h;
        if (j2 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = ((long) (playbackStateCompat.d * ((float) (elapsedRealtime - j2)))) + playbackStateCompat.b;
        if (mediaMetadataCompat != null) {
            String str = "android.media.metadata.DURATION";
            if (mediaMetadataCompat.b.containsKey(str)) {
                j = mediaMetadataCompat.b(str);
            }
        }
        long j4 = (j < 0 || j3 <= j) ? j3 < 0 ? 0 : j3 : j;
        return new android.support.v4.media.session.PlaybackStateCompat.a(playbackStateCompat).a(playbackStateCompat.a, j4, playbackStateCompat.d, elapsedRealtime).a();
    }
}
