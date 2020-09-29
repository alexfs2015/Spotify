package defpackage;

import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.Executors;

/* renamed from: ijk reason: default package */
public final class ijk {
    private static final UUID e = UUID.fromString("E3CCCCCD-33B7-457D-A03C-AA1C54BF617F");
    private static final UUID f = UUID.fromString("7FBE865E-518B-462A-B31B-90ACF6A472FC");
    public iji a;
    public iji b;
    public iji c;
    public iji d;
    private final ijj g;
    private final boolean h = false;
    private final a i;
    private final Handler j = new Handler(Looper.getMainLooper());

    /* renamed from: ijk$a */
    public interface a {
        void a(ihz ihz, String str);
    }

    public ijk(ijj ijj, a aVar, boolean z) {
        this.g = ijj;
        this.i = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(BluetoothSocket bluetoothSocket) {
        try {
            this.j.post(new $$Lambda$ijk$wWRgH0LMCLVuvcVrfbNAQ02nS2g(this, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream(), bluetoothSocket));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.i.a(a(inputStream, outputStream), bluetoothSocket.getRemoteDevice().getAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(BluetoothSocket bluetoothSocket) {
        try {
            this.j.post(new $$Lambda$ijk$nuH7f5Ubi8MxTy_8SbUWfeCkSRg(this, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream(), bluetoothSocket));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.i.a(b(inputStream, outputStream), bluetoothSocket.getRemoteDevice().getAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Socket socket) {
        try {
            this.j.post(new $$Lambda$ijk$RODkjj0fVnVhXSBvTEESSudqr0(this, socket.getInputStream(), socket.getOutputStream(), socket.getInetAddress()));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.i.a(a(inputStream, outputStream), inetAddress.getHostAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Socket socket) {
        try {
            this.j.post(new $$Lambda$ijk$od2ZnGoSIOVLycdPXqvupxaXuU0(this, socket.getInputStream(), socket.getOutputStream(), socket.getInetAddress()));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.i.a(b(inputStream, outputStream), inetAddress.getHostAddress());
    }

    private static ihz a(InputStream inputStream, OutputStream outputStream) {
        return new iik(inputStream, outputStream, Executors.newSingleThreadExecutor());
    }

    private static ihz b(InputStream inputStream, OutputStream outputStream) {
        return new iiw(new iit(inputStream, Executors.newSingleThreadExecutor(), new iis()), new iiv(outputStream, Executors.newSingleThreadScheduledExecutor(), new iis()));
    }

    public final void a() {
        if (!((this.a == null && this.b == null && this.c == null && this.d == null) ? false : true)) {
            this.a = this.g.a(e, (a) new $$Lambda$ijk$srue_tR9DyDDlRZ3mGxEQghU(this));
            this.a.start();
            this.b = this.g.a(f, (a) new $$Lambda$ijk$UgzFs7GEEsiG5dNESZJ9rjXSCVs(this));
            this.b.start();
            if (this.h) {
                this.c = this.g.a(9095, (a) new $$Lambda$ijk$RU0jsFWqbkxWXMIdudAjeRTpX8I(this));
                this.c.start();
                this.d = this.g.a(9096, (a) new $$Lambda$ijk$qkVRivNQgprTQiEncPwmmoHrFQ(this));
                this.d.start();
            }
        }
    }
}
