package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: amv reason: default package */
class amv {
    private static String a = amv.class.getSimpleName();
    private static final String b;
    private static amh c;

    amv() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_Redirect");
        b = sb.toString();
    }

    private static synchronized amh a() {
        amh amh;
        synchronized (amv.class) {
            if (c == null) {
                c = new amh(a, new d());
            }
            amh = c;
        }
        return amh;
    }

    static Uri a(Uri uri) {
        InputStreamReader inputStreamReader;
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            amh a2 = a();
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
                        amw.a((Closeable) inputStreamReader);
                        inputStreamReader2 = inputStreamReader;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        amw.a((Closeable) inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        amw.a((Closeable) inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = inputStreamReader2;
                    amw.a((Closeable) inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    amw.a((Closeable) inputStreamReader);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                amw.a((Closeable) inputStreamReader2);
                return parse;
            }
            amw.a((Closeable) inputStreamReader2);
            return null;
        } catch (IOException unused3) {
            inputStreamReader = null;
            amw.a((Closeable) inputStreamReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            amw.a((Closeable) inputStreamReader);
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
                amw.a((Closeable) outputStream);
            }
        }
    }
}
