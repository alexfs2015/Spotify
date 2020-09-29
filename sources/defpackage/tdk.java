package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State;
import io.reactivex.Flowable;

/* renamed from: tdk reason: default package */
public final class tdk {
    final tev a;
    wuk b = xaj.b();
    private final Flowable<PlayerState> c;
    private final heg d;
    private tew e;

    /* renamed from: tdk$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState$State[] r0 = com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState$State r1 = com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState$State r1 = com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State.CONNECTED_UNKNOWN_DEVICE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState$State r1 = com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tdk.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: tdk$a */
    static class a {
        final boolean a;
        final BluetoothConnectionState b;

        private a(boolean z, BluetoothConnectionState bluetoothConnectionState) {
            this.a = z;
            this.b = bluetoothConnectionState;
        }

        static a a(boolean z, BluetoothConnectionState bluetoothConnectionState) {
            return new a(z, bluetoothConnectionState);
        }
    }

    public tdk(tev tev, Flowable<PlayerState> flowable, heg heg, com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        this.a = tev;
        this.c = flowable;
        this.d = heg;
        aVar.a(new c() {
            public final void e() {
                tdk.this.a();
            }

            public final void f() {
                tdk tdk = tdk.this;
                tdk.b.unsubscribe();
                tev tev = tdk.a;
                if (tev.b != null) {
                    tev.a.unregisterReceiver(tev.b);
                    tev.b = null;
                }
                tev.c = null;
                tev.d = false;
            }
        });
    }

    public final void a(tew tew) {
        this.e = tew;
        a();
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (this.e != null) {
            BluetoothConnectionState bluetoothConnectionState = aVar.b;
            boolean z = aVar.a;
            int i = AnonymousClass2.a[bluetoothConnectionState.b.ordinal()];
            if (i == 1) {
                fay.a(bluetoothConnectionState.a);
                this.e.a(bluetoothConnectionState.a, z);
            } else if (i != 2) {
                if (i == 3) {
                    this.e.d();
                }
            } else {
                this.e.c();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.b.isUnsubscribed()) {
            this.b = wud.a(vun.a((wrf<T>) this.c).f($$Lambda$tdk$DbJh6y_WoaKrzjUX8J8qD08oXE.INSTANCE), tex.a(this.a), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$TQXNEZXyvaAfQ20mAAOfrkbHVhY.INSTANCE).a(vun.a(this.d.c())).a((wun<? super T>) new $$Lambda$tdk$t20iVzkCvFJYx2gdfQd1JSKqH24<Object>(this), (wun<Throwable>) new $$Lambda$tdk$3lAW8ZvAphBUi9u7l0BjszrtJ4<Throwable>(this));
            this.a.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        tew tew = this.e;
        if (tew != null) {
            tew.d();
        }
    }

    /* access modifiers changed from: private */
    public static boolean a(PlayerState playerState) {
        return ((double) playerState.playbackSpeed()) > 0.1d && !playerState.isPaused();
    }
}
