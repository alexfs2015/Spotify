package defpackage;

import android.net.Uri;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.NetworkPolicy;

/* renamed from: foi reason: default package */
public final class foi implements Downloader {
    private final a a;
    private final wzn b;

    public foi(xah xah) {
        this.a = xah;
        this.b = xah.l;
    }

    public final a a(Uri uri, int i) {
        wzo wzo;
        boolean z = true;
        if (i == 0) {
            wzo = null;
        } else if (NetworkPolicy.c(i)) {
            wzo = wzo.a;
        } else {
            a aVar = new a();
            if (!NetworkPolicy.a(i)) {
                aVar.a = true;
            }
            if (!NetworkPolicy.b(i)) {
                aVar.b = true;
            }
            wzo = aVar.a();
        }
        a a2 = new a().a(uri.toString());
        if (wzo != null) {
            a2.a(wzo);
        }
        xal b2 = this.a.a(a2.a()).b();
        int i2 = b2.c;
        if (i2 < 300) {
            if (b2.i == null) {
                z = false;
            }
            xam xam = b2.g;
            return new a(xam.d(), z, xam.b());
        }
        b2.g.close();
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" ");
        sb.append(b2.d);
        throw new ResponseException(sb.toString(), i, i2);
    }
}
