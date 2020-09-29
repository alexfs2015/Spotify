package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bcj reason: default package */
public final class bcj implements bce {
    private final Context a;
    private final List<bcu> b = new ArrayList();
    private final bce c;
    private bce d;
    private bce e;
    private bce f;
    private bce g;
    private bce h;
    private bce i;
    private bce j;

    public bcj(Context context, bce bce) {
        this.a = context.getApplicationContext();
        this.c = (bce) bdl.a(bce);
    }

    private void a(bce bce) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            bce.a((bcu) this.b.get(i2));
        }
    }

    private static void a(bce bce, bcu bcu) {
        if (bce != null) {
            bce.a(bcu);
        }
    }

    private bce d() {
        if (this.e == null) {
            this.e = new AssetDataSource(this.a);
            a(this.e);
        }
        return this.e;
    }

    private bce e() {
        if (this.g == null) {
            try {
                this.g = (bce) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                a(this.g);
            } catch (ClassNotFoundException unused) {
                bdu.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        return ((bce) bdl.a(this.j)).a(bArr, i2, i3);
    }

    public final long a(bcg bcg) {
        bdl.b(this.j == null);
        String scheme = bcg.a.getScheme();
        if (ben.a(bcg.a)) {
            if (bcg.a.getPath().startsWith("/android_asset/")) {
                this.j = d();
            } else {
                if (this.d == null) {
                    this.d = new FileDataSource();
                    a(this.d);
                }
                this.j = this.d;
            }
        } else if ("asset".equals(scheme)) {
            this.j = d();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                this.f = new ContentDataSource(this.a);
                a(this.f);
            }
            this.j = this.f;
        } else if ("rtmp".equals(scheme)) {
            this.j = e();
        } else if ("data".equals(scheme)) {
            if (this.h == null) {
                this.h = new bcc();
                a(this.h);
            }
            this.j = this.h;
        } else if ("rawresource".equals(scheme)) {
            if (this.i == null) {
                this.i = new RawResourceDataSource(this.a);
                a(this.i);
            }
            this.j = this.i;
        } else {
            this.j = this.c;
        }
        return this.j.a(bcg);
    }

    public final Uri a() {
        bce bce = this.j;
        if (bce == null) {
            return null;
        }
        return bce.a();
    }

    public final void a(bcu bcu) {
        this.c.a(bcu);
        this.b.add(bcu);
        a(this.d, bcu);
        a(this.e, bcu);
        a(this.f, bcu);
        a(this.g, bcu);
        a(this.h, bcu);
        a(this.i, bcu);
    }

    public final Map<String, List<String>> b() {
        bce bce = this.j;
        return bce == null ? CC.$default$b(this) : bce.b();
    }

    public final void c() {
        bce bce = this.j;
        if (bce != null) {
            try {
                bce.c();
            } finally {
                this.j = null;
            }
        }
    }
}
