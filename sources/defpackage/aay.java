package defpackage;

import android.content.Context;
import com.airbnb.lottie.network.FileExtension;
import com.spotify.cosmos.router.Request;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

/* renamed from: aay reason: default package */
public final class aay {
    final String a;
    final aax b;
    private final Context c;

    public aay(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = new aax(this.c, str);
    }

    /* access modifiers changed from: 0000 */
    public xu<xo> a() {
        FileExtension fileExtension;
        xu<xo> xuVar;
        try {
            StringBuilder sb = new StringBuilder("Fetching ");
            sb.append(this.a);
            xn.a(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a).openConnection();
            httpURLConnection.setRequestMethod(Request.GET);
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    char c2 = 65535;
                    int hashCode = contentType.hashCode();
                    boolean z = false;
                    if (hashCode != -1248325150) {
                        if (hashCode == -43840953) {
                            if (contentType.equals("application/json")) {
                                c2 = 1;
                            }
                        }
                    } else if (contentType.equals("application/zip")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        xn.a("Received json response.");
                        fileExtension = FileExtension.Json;
                        xuVar = xp.a((InputStream) new FileInputStream(new File(this.b.a(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.a);
                    } else {
                        xn.a("Handling zip response.");
                        fileExtension = FileExtension.Zip;
                        xuVar = xp.a(new ZipInputStream(new FileInputStream(this.b.a(httpURLConnection.getInputStream(), fileExtension))), this.a);
                    }
                    if (xuVar.a != null) {
                        aax aax = this.b;
                        File file = new File(aax.a.getCacheDir(), aax.a(aax.b, fileExtension, true));
                        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                        boolean renameTo = file.renameTo(file2);
                        StringBuilder sb2 = new StringBuilder("Copying temp file to real file (");
                        sb2.append(file2);
                        sb2.append(")");
                        xn.a(sb2.toString());
                        if (!renameTo) {
                            StringBuilder sb3 = new StringBuilder("Unable to rename cache file ");
                            sb3.append(file.getAbsolutePath());
                            sb3.append(" to ");
                            sb3.append(file2.getAbsolutePath());
                            sb3.append(".");
                            xn.b(sb3.toString());
                        }
                    }
                    StringBuilder sb4 = new StringBuilder("Completed fetch from network. Success: ");
                    if (xuVar.a != null) {
                        z = true;
                    }
                    sb4.append(z);
                    xn.a(sb4.toString());
                    return xuVar;
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb5 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb5.append(readLine);
                    sb5.append(10);
                } else {
                    StringBuilder sb6 = new StringBuilder("Unable to fetch ");
                    sb6.append(this.a);
                    sb6.append(". Failed with ");
                    sb6.append(httpURLConnection.getResponseCode());
                    sb6.append("\n");
                    sb6.append(sb5);
                    return new xu<>((Throwable) new IllegalArgumentException(sb6.toString()));
                }
            }
        } catch (IOException e) {
            return new xu<>((Throwable) e);
        }
    }
}
