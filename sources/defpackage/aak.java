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

/* renamed from: aak reason: default package */
public final class aak {
    final String a;
    final aaj b;
    private final Context c;

    public aak(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = new aaj(this.c, str);
    }

    /* access modifiers changed from: 0000 */
    public xg<xa> a() {
        FileExtension fileExtension;
        xg<xa> xgVar;
        try {
            StringBuilder sb = new StringBuilder("Fetching ");
            sb.append(this.a);
            wz.a(sb.toString());
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
                        wz.a("Received json response.");
                        fileExtension = FileExtension.Json;
                        xgVar = xb.a((InputStream) new FileInputStream(new File(this.b.a(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.a);
                    } else {
                        wz.a("Handling zip response.");
                        fileExtension = FileExtension.Zip;
                        xgVar = xb.a(new ZipInputStream(new FileInputStream(this.b.a(httpURLConnection.getInputStream(), fileExtension))), this.a);
                    }
                    if (xgVar.a != null) {
                        aaj aaj = this.b;
                        File file = new File(aaj.a.getCacheDir(), aaj.a(aaj.b, fileExtension, true));
                        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                        boolean renameTo = file.renameTo(file2);
                        StringBuilder sb2 = new StringBuilder("Copying temp file to real file (");
                        sb2.append(file2);
                        sb2.append(")");
                        wz.a(sb2.toString());
                        if (!renameTo) {
                            StringBuilder sb3 = new StringBuilder("Unable to rename cache file ");
                            sb3.append(file.getAbsolutePath());
                            sb3.append(" to ");
                            sb3.append(file2.getAbsolutePath());
                            sb3.append(".");
                            wz.b(sb3.toString());
                        }
                    }
                    StringBuilder sb4 = new StringBuilder("Completed fetch from network. Success: ");
                    if (xgVar.a != null) {
                        z = true;
                    }
                    sb4.append(z);
                    wz.a(sb4.toString());
                    return xgVar;
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
                    return new xg<>((Throwable) new IllegalArgumentException(sb6.toString()));
                }
            }
        } catch (IOException e) {
            return new xg<>((Throwable) e);
        }
    }
}
