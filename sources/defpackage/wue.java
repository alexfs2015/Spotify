package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wue reason: default package */
final class wue {
    private static final wyc a = wyd.a(wue.class);
    private static final Pattern b = Pattern.compile("-+BEGIN\\s+.*CERTIFICATE[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*CERTIFICATE[^-]*-+", 2);
    private static final Pattern c = Pattern.compile("-+BEGIN\\s+.*PRIVATE\\s+KEY[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*PRIVATE\\s+KEY[^-]*-+", 2);

    private wue() {
    }

    private static void a(OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e) {
            a.d("Failed to close a stream.", (Throwable) e);
        }
    }

    static wnb[] a(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            wnb[] a2 = a((InputStream) fileInputStream);
            d(fileInputStream);
            return a2;
        } catch (FileNotFoundException unused) {
            StringBuilder sb = new StringBuilder("could not find certificate file: ");
            sb.append(file);
            throw new CertificateException(sb.toString());
        } catch (Throwable th) {
            d(fileInputStream);
            throw th;
        }
    }

    private static wnb[] a(InputStream inputStream) {
        try {
            String c2 = c(inputStream);
            ArrayList arrayList = new ArrayList();
            Matcher matcher = b.matcher(c2);
            for (int i = 0; matcher.find(i); i = matcher.end()) {
                wnb a2 = woc.a(matcher.group(1), wvh.b);
                wnb a3 = wrn.a(a2);
                a2.B();
                arrayList.add(a3);
            }
            if (!arrayList.isEmpty()) {
                return (wnb[]) arrayList.toArray(new wnb[arrayList.size()]);
            }
            throw new CertificateException("found no certificates in input stream");
        } catch (IOException e) {
            throw new CertificateException("failed to read certificate input stream", e);
        }
    }

    static wnb b(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            wnb b2 = b((InputStream) fileInputStream);
            d(fileInputStream);
            return b2;
        } catch (FileNotFoundException unused) {
            StringBuilder sb = new StringBuilder("could not fine key file: ");
            sb.append(file);
            throw new KeyException(sb.toString());
        } catch (Throwable th) {
            d(fileInputStream);
            throw th;
        }
    }

    private static wnb b(InputStream inputStream) {
        try {
            Matcher matcher = c.matcher(c(inputStream));
            if (matcher.find()) {
                wnb a2 = woc.a(matcher.group(1), wvh.b);
                wnb a3 = wrn.a(a2);
                a2.B();
                return a3;
            }
            throw new KeyException("could not find a PKCS #8 private key in input stream (see http://netty.io/wiki/sslcontextbuilder-and-private-key.html for more information)");
        } catch (IOException e) {
            throw new KeyException("failed to read key input stream", e);
        }
    }

    private static String c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    return byteArrayOutputStream.toString(wvh.b.name());
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            a((OutputStream) byteArrayOutputStream);
        }
    }

    private static void d(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            a.d("Failed to close a stream.", (Throwable) e);
        }
    }
}
