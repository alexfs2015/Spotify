package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: era reason: default package */
public final class era extends evb {
    final SSLSocketFactory a;

    public era(evc evc) {
        super(evc);
        this.a = VERSION.SDK_INT < 19 ? new evn() : null;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    public final boolean e() {
        NetworkInfo networkInfo;
        j();
        try {
            networkInfo = ((ConnectivityManager) m().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    static byte[] a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public final /* bridge */ /* synthetic */ evi f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ evs g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ evz h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
