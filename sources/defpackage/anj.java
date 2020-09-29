package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: anj reason: default package */
class anj {
    private static String a = anj.class.getSimpleName();
    private static final String b;
    private static amv c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_Redirect");
        b = sb.toString();
    }

    anj() {
    }

    private static synchronized amv a() {
        amv amv;
        synchronized (anj.class) {
            if (c == null) {
                c = new amv(a, new d());
            }
            amv = c;
        }
        return amv;
    }

    static Uri a(Uri uri) {
        InputStreamReader inputStreamReader;
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            amv a2 = a();
            InputStreamReader inputStreamReader2 = null;
            boolean z = false;
            while (true) {
                try {
                    InputStream a3 = a2.a(uri2, b);
                    if (a3 == null) {
                        break;
                    }
                    z = true;
                    inputStreamReader = new InputStreamReader(a3);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, 128);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        ank.a((Closeable) inputStreamReader);
                        inputStreamReader2 = inputStreamReader;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        ank.a((Closeable) inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ank.a((Closeable) inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = inputStreamReader2;
                    ank.a((Closeable) inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    ank.a((Closeable) inputStreamReader);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                ank.a((Closeable) inputStreamReader2);
                return parse;
            }
            ank.a((Closeable) inputStreamReader2);
            return null;
        } catch (IOException unused3) {
            inputStreamReader = null;
            ank.a((Closeable) inputStreamReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            ank.a((Closeable) inputStreamReader);
            throw th;
        }
    }

    static void a(Uri uri, Uri uri2) {
        if (!(uri == null || uri2 == null)) {
            OutputStream outputStream = null;
            try {
                outputStream = a().b(uri.toString(), b);
                outputStream.write(uri2.toString().getBytes());
            } catch (IOException unused) {
            } finally {
                ank.a((Closeable) outputStream);
            }
        }
    }
}
