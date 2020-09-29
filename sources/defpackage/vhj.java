package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: vhj reason: default package */
public class vhj {
    private Picasso a;
    private final Context b;
    private final Downloader c;
    private final List<wgs> d;
    private final Optional<ExecutorService> e;

    /* renamed from: vhj$a */
    public static final class a implements wgx {
        vfk a;
        wfz b;
        private final ImageView c;
        private final boolean d = false;

        a(ImageView imageView, vfk vfk, boolean z) {
            this.c = imageView;
            this.a = vfk;
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            wfz wfz = this.b;
            if (wfz != null) {
                wfz.a();
            }
            if (this.b instanceof vha) {
                vgj.a(bitmap).a(new c() {
                    public final void onGenerated(vgj vgj) {
                        if (a.this.b instanceof vha) {
                            ((vha) a.this.b).a(vgj);
                        }
                    }
                });
            }
            vhd.a(this.c, this.a.createDrawable(bitmap), loadedFrom, this.d);
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            wfz wfz = this.b;
            if (wfz != null) {
                wfz.b();
            }
            this.c.setImageDrawable(drawable);
        }

        public final void b(Drawable drawable) {
            vhd.a(this.c, 0, drawable);
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.c == this.c && aVar.a == this.a;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }
    }

    vhj(Context context, Downloader downloader, List<wgs> list, Optional<ExecutorService> optional) {
        jtr.b("Not called on main looper");
        this.b = context;
        this.c = downloader;
        this.d = list;
        this.e = optional;
    }

    private static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return Math.max(memoryClass, 16) * 149796;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Drawable a(ImageView imageView, Bitmap bitmap) {
        return new BitmapDrawable(imageView.getResources(), bitmap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Drawable a(gcr gcr, vfk vfk, Context context, Bitmap bitmap) {
        return (Drawable) gcr.apply(vfk != null ? vfk.createDrawable(bitmap) : new BitmapDrawable(context.getResources(), bitmap));
    }

    public static vfk a(Context context, vfk vfk, gcr<Drawable, Drawable> gcr) {
        return new $$Lambda$vhj$WZBAmhxHngNwmZJku7boALkD4U(gcr, vfk, context);
    }

    public static wgx a(ImageView imageView) {
        return a(imageView, vgq.a(), (wfz) null);
    }

    public static wgx a(ImageView imageView, vfk vfk) {
        return a(imageView, vfk, (wfz) null);
    }

    public static wgx a(ImageView imageView, vfk vfk, wfz wfz) {
        fbp.a(imageView);
        fbp.a(vfk);
        a aVar = (a) imageView.getTag(R.id.picasso_target);
        if (aVar == null) {
            aVar = new a(imageView, vfk, false);
            imageView.setTag(R.id.picasso_target, aVar);
        }
        aVar.b = wfz;
        aVar.a = vfk;
        return aVar;
    }

    public static wgx a(ImageView imageView, vha vha) {
        fbp.a(imageView);
        a aVar = (a) imageView.getTag(R.id.picasso_target);
        if (aVar == null) {
            aVar = new a(imageView, new $$Lambda$vhj$sQpPkceOduk06DezQBnaZcZKXDU(imageView), false);
            imageView.setTag(R.id.picasso_target, aVar);
        }
        aVar.b = vha;
        return aVar;
    }

    @Deprecated
    public final synchronized Picasso a() {
        if (this.a == null) {
            com.squareup.picasso.Picasso.a aVar = new com.squareup.picasso.Picasso.a(this.b);
            if (this.e.b()) {
                ExecutorService executorService = (ExecutorService) this.e.c();
                if (executorService == null) {
                    throw new IllegalArgumentException("Executor service must not be null.");
                } else if (aVar.b == null) {
                    aVar.b = executorService;
                } else {
                    throw new IllegalStateException("Executor service already set.");
                }
            }
            for (wgs wgs : this.d) {
                if (wgs != null) {
                    if (aVar.d == null) {
                        aVar.d = new ArrayList();
                    }
                    if (!aVar.d.contains(wgs)) {
                        aVar.d.add(wgs);
                    } else {
                        throw new IllegalStateException("RequestHandler already registered.");
                    }
                } else {
                    throw new IllegalArgumentException("RequestHandler must not be null.");
                }
            }
            Downloader downloader = this.c;
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (aVar.a == null) {
                aVar.a = downloader;
                if (VERSION.SDK_INT <= 18) {
                    Config config = Config.RGB_565;
                    if (config != null) {
                        aVar.e = config;
                        aVar.a(new vhi(new wgl(a(this.b) / 2)));
                    } else {
                        throw new IllegalArgumentException("Bitmap config must not be null.");
                    }
                } else {
                    aVar.a(new vhi(new wgl(a(this.b))));
                }
                $$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow r1 = $$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow.INSTANCE;
                if (r1 == null) {
                    throw new IllegalArgumentException("Listener must not be null.");
                } else if (aVar.c == null) {
                    aVar.c = r1;
                    this.a = aVar.a();
                } else {
                    throw new IllegalStateException("Listener already set.");
                }
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }
        return this.a;
    }

    @Deprecated
    public final synchronized vgw b() {
        return new vgw(a());
    }
}
