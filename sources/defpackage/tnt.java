package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State;
import io.reactivex.Flowable;

/* renamed from: tnt reason: default package */
public final class tnt {
    final tpf a;
    xip b = xon.b();
    private final Flowable<PlayerState> c;
    private final hhc d;
    private tpg e;

    /* renamed from: tnt$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tnt.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: tnt$a */
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

    public tnt(tpf tpf, Flowable<PlayerState> flowable, hhc hhc, com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        this.a = tpf;
        this.c = flowable;
        this.d = hhc;
        aVar.a(new c() {
            public final void e() {
                tnt.this.a();
            }

            public final void f() {
                tnt tnt = tnt.this;
                tnt.b.unsubscribe();
                tpf tpf = tnt.a;
                if (tpf.b != null) {
                    tpf.a.unregisterReceiver(tpf.b);
                    tpf.b = null;
                }
                tpf.c = null;
                tpf.d = false;
            }
        });
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.b.isUnsubscribed()) {
            this.b = xii.a(wit.a((xfk<T>) this.c).e((xiy<? super T, ? extends R>) $$Lambda$tnt$vs0LQveNuzw380774xVogf_KjtA.INSTANCE), tph.a(this.a), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$oAP4wHXLiuSmpHhZfIbhvVzLAlo.INSTANCE).a(wit.a(this.d.c())).a((xis<? super T>) new $$Lambda$tnt$oOpz7DHzey4YLPmY5tt1DkUlhs<Object>(this), (xis<Throwable>) new $$Lambda$tnt$JSRrRTU4L_x_G8K0bdLB8BI0NU<Throwable>(this));
            this.a.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        tpg tpg = this.e;
        if (tpg != null) {
            tpg.d();
        }
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (this.e != null) {
            BluetoothConnectionState bluetoothConnectionState = aVar.b;
            boolean z = aVar.a;
            int i = AnonymousClass2.a[bluetoothConnectionState.b.ordinal()];
            if (i == 1) {
                fbp.a(bluetoothConnectionState.a);
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
    public static boolean a(PlayerState playerState) {
        return ((double) playerState.playbackSpeed()) > 0.1d && !playerState.isPaused();
    }

    public final void a(tpg tpg) {
        this.e = tpg;
        a();
    }
}
