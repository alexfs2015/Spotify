package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import java.io.IOException;
import java.util.Map.Entry;

/* renamed from: rvd reason: default package */
public final class rvd implements rur {
    Runnable a;
    private final xah b;
    private final String c;

    public rvd(xah xah) {
        this(xah, "https://crashdump.spotify.com:443");
    }

    private rvd(xah xah, String str) {
        this.b = xah;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/v2/android");
        this.c = sb.toString();
    }

    public final void a(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(rul rul) {
        a a2 = new a().a(xag.b);
        fdz R_ = rul.c.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                a2.a(b.a((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        xai.a(this.b, new a().a(this.c).a(Request.POST, (xak) a2.a()).a(), false).a(new wzq() {
            public final void onFailure(wzp wzp, IOException iOException) {
                Logger.d("Couldn't send parameters to crashdump.", new Object[0]);
                if (rvd.this.a != null) {
                    rvd.this.a.run();
                }
            }

            public final void onResponse(wzp wzp, xal xal) {
                Logger.b("Sent parameters to crashdump.", new Object[0]);
                if (rvd.this.a != null) {
                    rvd.this.a.run();
                }
            }
        });
    }
}
