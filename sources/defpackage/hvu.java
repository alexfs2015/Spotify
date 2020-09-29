package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: hvu reason: default package */
public final class hvu {
    public static ParcelFileDescriptor a(final InputStream inputStream) {
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            new Thread(new Runnable() {
                public final void run() {
                    AutoCloseOutputStream autoCloseOutputStream = new AutoCloseOutputStream(parcelFileDescriptor2);
                    try {
                        fem.a(inputStream, (OutputStream) autoCloseOutputStream);
                        autoCloseOutputStream.flush();
                        try {
                        } catch (IOException e) {
                            Logger.d(e, e.getMessage(), new Object[0]);
                        }
                        try {
                            autoCloseOutputStream.close();
                        } catch (IOException e2) {
                            Logger.d(e2, e2.getMessage(), new Object[0]);
                        }
                    } catch (IOException e3) {
                        Logger.d(e3, e3.getMessage(), new Object[0]);
                        try {
                        } catch (IOException e4) {
                            Logger.d(e4, e4.getMessage(), new Object[0]);
                        }
                        try {
                            autoCloseOutputStream.close();
                        } catch (IOException e5) {
                            Logger.d(e5, e5.getMessage(), new Object[0]);
                        }
                    } finally {
                        try {
                            inputStream.close();
                        } catch (IOException e6) {
                            Logger.d(e6, e6.getMessage(), new Object[0]);
                        }
                        try {
                            autoCloseOutputStream.close();
                        } catch (IOException e7) {
                            Logger.d(e7, e7.getMessage(), new Object[0]);
                        }
                    }
                }
            }, "AsyncPipeWriter").start();
            return parcelFileDescriptor;
        } catch (IOException e) {
            Logger.d(e, e.getMessage(), new Object[0]);
            return null;
        }
    }
}
