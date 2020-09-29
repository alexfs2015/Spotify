package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: glm reason: default package */
public final class glm {
    public static String a(Context context, int i) {
        String str = "This log statement is only here to appease SpotBugs";
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i);
            String str2 = new String(fem.a(inputStream), fbi.c);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    Logger.d(str, new Object[0]);
                }
            }
            return str2;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Failed to load RAW resource #");
            sb.append(i);
            throw new IOException(sb.toString(), e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    Logger.d(str, new Object[0]);
                }
            }
            throw th;
        }
    }
}
