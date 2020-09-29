package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: msf reason: default package */
public final class msf {
    private final Context a;

    public msf(Context context) {
        this.a = context;
    }

    public final String a() {
        try {
            InputStream open = this.a.getAssets().open("follow_feed_response.json");
            byte[] bArr = new byte[open.available()];
            StringBuilder sb = new StringBuilder(1);
            while (open.read(bArr) != -1) {
                sb.append(new String(bArr, Charset.forName("UTF-8")));
            }
            open.close();
            return sb.toString();
        } catch (IOException e) {
            Logger.e(e, e.getMessage(), new Object[0]);
            return "";
        }
    }
}
