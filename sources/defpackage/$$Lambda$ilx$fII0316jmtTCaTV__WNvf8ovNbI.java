package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

/* renamed from: -$$Lambda$ilx$fII0316jmtTCaTV__WNvf8ovNbI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ilx$fII0316jmtTCaTV__WNvf8ovNbI implements Runnable {
    private final /* synthetic */ ilx f$0;
    private final /* synthetic */ InputStream f$1;
    private final /* synthetic */ OutputStream f$2;
    private final /* synthetic */ InetAddress f$3;

    public /* synthetic */ $$Lambda$ilx$fII0316jmtTCaTV__WNvf8ovNbI(ilx ilx, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f$0 = ilx;
        this.f$1 = inputStream;
        this.f$2 = outputStream;
        this.f$3 = inetAddress;
    }

    public final void run() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
