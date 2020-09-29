package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

/* renamed from: ikx reason: default package */
public final class ikx implements ikm, Closeable {
    private final InputStream a;
    private final OutputStream b;
    /* access modifiers changed from: private */
    public final ExecutorService c;
    private a d;
    /* access modifiers changed from: private */
    public volatile boolean e;
    /* access modifiers changed from: private */
    public final Runnable f = new Runnable() {
        public final void run() {
            ikx.a(ikx.this);
            if (!ikx.this.e) {
                ikx.this.c.execute(ikx.this.f);
            }
        }
    };

    public ikx(InputStream inputStream, OutputStream outputStream, ExecutorService executorService) {
        this.a = inputStream;
        this.b = outputStream;
        this.c = executorService;
    }

    static /* synthetic */ void a(ikx ikx) {
        DataInputStream dataInputStream = new DataInputStream(ikx.a);
        try {
            int readInt = dataInputStream.readInt();
            if (readInt < 0 || readInt > 100000) {
                a(dataInputStream);
            }
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            if (ikx.d != null) {
                ikx.d.a(bArr);
            }
        } catch (Exception e2) {
            ikx.e = true;
            a(e2);
        }
    }

    private static void a(DataInputStream dataInputStream) {
        String str;
        byte[] bArr = new byte[Math.min(dataInputStream.available(), 100)];
        dataInputStream.readFully(bArr);
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            if (b3 < 32 || b3 > 126) {
                char[] charArray = "0123456789abcdef".toCharArray();
                StringBuilder sb2 = new StringBuilder(" 0x");
                sb2.append(charArray[b3 >>> 4]);
                sb2.append(charArray[b3 & 15]);
                sb2.append(' ');
                str = sb2.toString();
            } else {
                str = Character.toString((char) b3);
            }
            sb.append(str);
        }
        Assertion.b(String.format("Invalid data on input stream: %s", new Object[]{sb.toString()}));
        throw new IOException("Invalid data on input stream");
    }

    private static void a(Exception exc) {
        Logger.d(exc, exc.getMessage(), new Object[0]);
    }

    public final void a() {
        this.c.execute(this.f);
    }

    public final void a(int i, byte[] bArr) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.b);
        try {
            Logger.a("AppProtocolSessionIo.writeBytes", new Object[0]);
            ByteBuffer allocate = ByteBuffer.allocate(i + 4);
            allocate.putInt(i);
            allocate.put(bArr, 0, i);
            dataOutputStream.write(allocate.array());
        } catch (IOException e2) {
            this.e = true;
            a((Exception) e2);
        }
    }

    public final void a(a aVar) {
        this.d = aVar;
    }

    public final void close() {
        this.e = true;
        try {
            this.a.close();
            this.b.close();
        } catch (IOException e2) {
            Assertion.a("Failed to close session io", (Throwable) e2);
        }
        this.c.shutdown();
    }
}
