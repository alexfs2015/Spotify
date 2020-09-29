package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;

/* renamed from: uva reason: default package */
public final class uva implements uuf {
    private final uuf a;
    private final uuy b;
    private final uvb c;
    private final uup d;
    private final Context e;

    public uva(Context context, uuf uuf, uuy uuy, uvb uvb, uup uup) {
        this.e = context;
        this.a = uuf;
        this.b = uuy;
        this.c = uvb;
        this.d = uup;
    }

    public final String a() {
        return this.a.a();
    }

    public final void a(Intent intent) {
        this.a.a(intent);
    }

    public final void a(Uri uri, Uri uri2) {
        if (this.b.b.a(uuy.a, true)) {
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
                vs.a(uup.a(uri, uri2));
            }
        }
    }
}
