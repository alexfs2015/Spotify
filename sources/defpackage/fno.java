package defpackage;

import android.net.Uri;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.NetworkPolicy;

/* renamed from: fno reason: default package */
public final class fno implements Downloader {
    private final a a;
    private final wlh b;

    public fno(wmb wmb) {
        this.a = wmb;
        this.b = wmb.l;
    }

    public final a a(Uri uri, int i) {
        wli wli;
        boolean z = true;
        if (i == 0) {
            wli = null;
        } else if (NetworkPolicy.c(i)) {
            wli = wli.a;
        } else {
            a aVar = new a();
            if (!NetworkPolicy.a(i)) {
                aVar.a = true;
            }
            if (!NetworkPolicy.b(i)) {
                aVar.b = true;
            }
            wli = aVar.a();
        }
        a a2 = new a().a(uri.toString());
        if (wli != null) {
            a2.a(wli);
        }
        wmf b2 = this.a.a(a2.a()).b();
        int i2 = b2.c;
        if (i2 < 300) {
            if (b2.i == null) {
                z = false;
            }
            wmg wmg = b2.g;
            return new a(wmg.d(), z, wmg.b());
        }
        b2.g.close();
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" ");
        sb.append(b2.d);
        throw new ResponseException(sb.toString(), i, i2);
    }
}
