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

/* renamed from: bbs reason: default package */
public final class bbs implements bbn {
    private final Context a;
    private final List<bcd> b = new ArrayList();
    private final bbn c;
    private bbn d;
    private bbn e;
    private bbn f;
    private bbn g;
    private bbn h;
    private bbn i;
    private bbn j;

    public bbs(Context context, bbn bbn) {
        this.a = context.getApplicationContext();
        this.c = (bbn) bcu.a(bbn);
    }

    public final void a(bcd bcd) {
        this.c.a(bcd);
        this.b.add(bcd);
        a(this.d, bcd);
        a(this.e, bcd);
        a(this.f, bcd);
        a(this.g, bcd);
        a(this.h, bcd);
        a(this.i, bcd);
    }

    public final long a(bbp bbp) {
        bcu.b(this.j == null);
        String scheme = bbp.a.getScheme();
        if (bdw.a(bbp.a)) {
            if (bbp.a.getPath().startsWith("/android_asset/")) {
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
                this.h = new bbl();
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
        return this.j.a(bbp);
    }

    public final int a(byte[] bArr, int i2, int i3) {
        return ((bbn) bcu.a(this.j)).a(bArr, i2, i3);
    }

    public final Uri a() {
        bbn bbn = this.j;
        if (bbn == null) {
            return null;
        }
        return bbn.a();
    }

    public final Map<String, List<String>> b() {
        bbn bbn = this.j;
        if (bbn == null) {
            return CC.$default$b(this);
        }
        return bbn.b();
    }

    public final void c() {
        bbn bbn = this.j;
        if (bbn != null) {
            try {
                bbn.c();
            } finally {
                this.j = null;
            }
        }
    }

    private bbn d() {
        if (this.e == null) {
            this.e = new AssetDataSource(this.a);
            a(this.e);
        }
        return this.e;
    }

    private bbn e() {
        if (this.g == null) {
            try {
                this.g = (bbn) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                a(this.g);
            } catch (ClassNotFoundException unused) {
                bdd.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private void a(bbn bbn) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            bbn.a((bcd) this.b.get(i2));
        }
    }

    private static void a(bbn bbn, bcd bcd) {
        if (bbn != null) {
            bbn.a(bcd);
        }
    }
}
