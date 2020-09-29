package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import java.io.IOException;
import java.util.Map.Entry;

/* renamed from: rlx reason: default package */
public final class rlx implements rll {
    Runnable a;
    private final wmb b;
    private final String c;

    public rlx(wmb wmb) {
        this(wmb, "https://crashdump.spotify.com:443");
    }

    private rlx(wmb wmb, String str) {
        this.b = wmb;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/v2/android");
        this.c = sb.toString();
    }

    public final void a(rlf rlf) {
        a a2 = new a().a(wma.b);
        fdh R_ = rlf.c.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                a2.a(b.a((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        wmc.a(this.b, new a().a(this.c).a(Request.POST, (wme) a2.a()).a(), false).a(new wlk() {
            public final void onFailure(wlj wlj, IOException iOException) {
                Logger.d("Couldn't send parameters to crashdump.", new Object[0]);
                if (rlx.this.a != null) {
                    rlx.this.a.run();
                }
            }

            public final void onResponse(wlj wlj, wmf wmf) {
                Logger.b("Sent parameters to crashdump.", new Object[0]);
                if (rlx.this.a != null) {
                    rlx.this.a.run();
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.a = runnable;
    }
}
