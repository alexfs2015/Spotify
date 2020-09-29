package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vsl reason: default package */
public class vsl {
    private static final AtomicInteger a = new AtomicInteger();
    private final Picasso b;
    private final a c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private Drawable i;
    private Drawable j;
    private Object k;

    public vsl(Picasso picasso, Uri uri, int i2) {
        this.f = true;
        this.b = picasso;
        this.c = new a(uri, i2, picasso.j);
    }

    vsl() {
        this.f = true;
        this.b = null;
        this.c = new a(null, 0, null);
    }

    public vsl a() {
        if (this.g != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.i == null) {
            this.f = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public vsl a(int i2) {
        if (!this.f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i2 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.i == null) {
            this.g = i2;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public vsl a(Drawable drawable) {
        if (!this.f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.g == 0) {
            this.i = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public vsl b(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.j == null) {
            this.h = i2;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public vsl b(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.h == 0) {
            this.j = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public vsl a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        } else if (this.k == null) {
            this.k = obj;
            return this;
        } else {
            throw new IllegalStateException("Tag already set.");
        }
    }

    public vsl b() {
        this.e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public vsl c() {
        this.e = false;
        return this;
    }

    public vsl a(int i2, int i3) {
        Resources resources = this.b.d.getResources();
        return b(resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i3));
    }

    public vsl b(int i2, int i3) {
        this.c.a(i2, i3);
        return this;
    }

    public vsl d() {
        a aVar = this.c;
        if (!aVar.d) {
            aVar.c = true;
            return this;
        }
        throw new IllegalStateException("Center crop can not be used after calling centerInside");
    }

    public vsl e() {
        a aVar = this.c;
        if (!aVar.c) {
            aVar.d = true;
            return this;
        }
        throw new IllegalStateException("Center inside can not be used after calling centerCrop");
    }

    public vsl f() {
        a aVar = this.c;
        if (aVar.b == 0 && aVar.a == 0) {
            throw new IllegalStateException("onlyScaleDown can not be applied without resize");
        }
        aVar.e = true;
        return this;
    }

    public vsl a(Config config) {
        this.c.g = config;
        return this;
    }

    public vsl a(vst vst) {
        a aVar = this.c;
        if (vst == null) {
            throw new IllegalArgumentException("Transformation must not be null.");
        } else if (vst.a() != null) {
            if (aVar.f == null) {
                aVar.f = new ArrayList(2);
            }
            aVar.f.add(vst);
            return this;
        } else {
            throw new IllegalArgumentException("Transformation key must not be null.");
        }
    }

    public vsl g() {
        this.d = true;
        return this;
    }

    public Bitmap h() {
        long nanoTime = System.nanoTime();
        vsv.a();
        if (this.e) {
            throw new IllegalStateException("Fit cannot be used with get.");
        } else if (!this.c.a()) {
            return null;
        } else {
            vsk a2 = a(nanoTime);
            vsa vsa = new vsa(this.b, a2, 0, 0, this.k, vsv.a(a2, new StringBuilder()));
            Picasso picasso = this.b;
            return vrr.a(picasso, picasso.e, this.b.f, this.b.g, (vrp) vsa).a();
        }
    }

    public void i() {
        a((vrt) null);
    }

    public void a(vrt vrt) {
        long nanoTime = System.nanoTime();
        if (!this.e) {
            if (this.c.a()) {
                if (!(this.c.h != null)) {
                    a aVar = this.c;
                    Priority priority = Priority.LOW;
                    if (priority == null) {
                        throw new IllegalArgumentException("Priority invalid.");
                    } else if (aVar.h == null) {
                        aVar.h = priority;
                    } else {
                        throw new IllegalStateException("Priority already set.");
                    }
                }
                vsk a2 = a(nanoTime);
                String a3 = vsv.a(a2, new StringBuilder());
                if (this.b.b(a3) != null) {
                    if (this.b.l) {
                        String b2 = a2.b();
                        StringBuilder sb = new StringBuilder("from ");
                        sb.append(LoadedFrom.MEMORY);
                        vsv.a("Main", "completed", b2, sb.toString());
                    }
                    if (vrt != null) {
                        vrt.a();
                        return;
                    }
                } else {
                    vry vry = new vry(this.b, a2, 0, 0, this.k, a3, vrt);
                    this.b.b((vrp) vry);
                }
            }
            return;
        }
        throw new IllegalStateException("Fit cannot be used with fetch.");
    }

    public void a(vsr vsr) {
        long nanoTime = System.nanoTime();
        vsv.b();
        if (vsr == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.e) {
            Drawable drawable = null;
            if (!this.c.a()) {
                this.b.d(vsr);
                if (this.f) {
                    drawable = j();
                }
                vsr.b(drawable);
                return;
            }
            vsk a2 = a(nanoTime);
            String a3 = vsv.a(a2);
            if (MemoryPolicy.a(0)) {
                Bitmap b2 = this.b.b(a3);
                if (b2 != null) {
                    this.b.d(vsr);
                    vsr.a(b2, LoadedFrom.MEMORY);
                    return;
                }
            }
            if (this.f) {
                drawable = j();
            }
            vsr.b(drawable);
            vss vss = new vss(this.b, vsr, a2, 0, 0, this.j, a3, this.k, this.h);
            this.b.a((vrp) vss);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public void a(ImageView imageView) {
        a(imageView, (vrt) null);
    }

    public void a(ImageView imageView, vrt vrt) {
        ImageView imageView2 = imageView;
        vrt vrt2 = vrt;
        long nanoTime = System.nanoTime();
        vsv.b();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.c.a()) {
            this.b.d(imageView2);
            if (this.f) {
                vsi.a(imageView2, j());
            }
        } else {
            if (this.e) {
                a aVar = this.c;
                if (!((aVar.a == 0 && aVar.b == 0) ? false : true)) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f) {
                            vsi.a(imageView2, j());
                        }
                        this.b.h.put(imageView2, new vrw(this, imageView2, vrt2));
                        return;
                    }
                    this.c.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            vsk a2 = a(nanoTime);
            String a3 = vsv.a(a2);
            if (MemoryPolicy.a(0)) {
                Bitmap b2 = this.b.b(a3);
                if (b2 != null) {
                    this.b.d(imageView2);
                    vsi.a(imageView, this.b.d, b2, LoadedFrom.MEMORY, this.d, this.b.k);
                    if (this.b.l) {
                        String b3 = a2.b();
                        StringBuilder sb = new StringBuilder("from ");
                        sb.append(LoadedFrom.MEMORY);
                        vsv.a("Main", "completed", b3, sb.toString());
                    }
                    if (vrt2 != null) {
                        vrt.a();
                    }
                    return;
                }
            }
            if (this.f) {
                vsi.a(imageView2, j());
            }
            vsb vsb = new vsb(this.b, imageView, a2, 0, 0, this.h, this.j, a3, this.k, vrt, this.d);
            this.b.a((vrp) vsb);
        }
    }

    private Drawable j() {
        if (this.g != 0) {
            return this.b.d.getResources().getDrawable(this.g);
        }
        return this.i;
    }

    private vsk a(long j2) {
        int andIncrement = a.getAndIncrement();
        vsk b2 = this.c.b();
        b2.a = andIncrement;
        b2.b = j2;
        boolean z = this.b.l;
        String str = "Main";
        if (z) {
            vsv.a(str, "created", b2.b(), b2.toString());
        }
        vsk a2 = this.b.a(b2);
        if (a2 != b2) {
            a2.a = andIncrement;
            a2.b = j2;
            if (z) {
                String a3 = a2.a();
                StringBuilder sb = new StringBuilder("into ");
                sb.append(a2);
                vsv.a(str, "changed", a3, sb.toString());
            }
        }
        return a2;
    }
}
