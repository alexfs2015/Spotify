package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;

/* renamed from: ujp reason: default package */
public final class ujp implements uiu {
    private final uiu a;
    private final ujn b;
    private final ujq c;
    private final uje d;
    private final Context e;

    public ujp(Context context, uiu uiu, ujn ujn, ujq ujq, uje uje) {
        this.e = context;
        this.a = uiu;
        this.b = ujn;
        this.c = ujq;
        this.d = uje;
    }

    public final void a(Uri uri, Uri uri2) {
        if (this.b.b.a(ujn.a, true)) {
            boolean z = false;
            if (uri2 != null) {
                String uri3 = uri2.toString();
                String[] stringArray = this.e.getResources().getStringArray(R.array.attribution_blacklist);
                int length = stringArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (uri3.contains(stringArray[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z) {
                ve.a(uje.a(uri, uri2));
            }
        }
    }

    public final void a(Intent intent) {
        this.a.a(intent);
    }

    public final String a() {
        return this.a.a();
    }
}
