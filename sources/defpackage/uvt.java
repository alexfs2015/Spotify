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
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: uvt reason: default package */
public class uvt {
    private Picasso a;
    private boolean b;
    private final Context c;
    private final Downloader d;
    private final Callable<Boolean> e;
    private final List<vsm> f;
    private final Optional<ExecutorService> g;

    /* renamed from: uvt$a */
    public static final class a implements vsr {
        utt a;
        vrt b;
        private final ImageView c;
        private final boolean d;

        a(ImageView imageView, utt utt, boolean z) {
            this.c = imageView;
            this.a = utt;
            this.d = z;
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            vrt vrt = this.b;
            if (vrt != null) {
                vrt.a();
            }
            if (this.b instanceof uvj) {
                uus.a(bitmap).a(new c() {
                    public final void onGenerated(uus uus) {
                        if (a.this.b instanceof uvj) {
                            ((uvj) a.this.b).a(uus);
                        }
                    }
                });
            }
            uvm.a(this.c, this.a.createDrawable(bitmap), loadedFrom, this.d);
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            vrt vrt = this.b;
            if (vrt != null) {
                vrt.b();
            }
            this.c.setImageDrawable(drawable);
        }

        public final void b(Drawable drawable) {
            uvm.a(this.c, 0, drawable);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.c == this.c && aVar.a == this.a) {
                return true;
            }
            return false;
        }
    }

    uvt(Context context, Downloader downloader, List<vsm> list, Callable<Boolean> callable, Optional<ExecutorService> optional) {
        jrh.b("Not called on main looper");
        this.c = context;
        this.d = downloader;
        this.f = list;
        this.e = callable;
        this.g = optional;
    }

    private static <T> T a(Callable<T> callable, T t) {
        try {
            return callable.call();
        } catch (Exception unused) {
            return t;
        }
    }

    @Deprecated
    public final synchronized uvf b() {
        return new uvf(a());
    }

    private static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return Math.max(memoryClass, 16) * 149796;
    }

    public static vsr a(ImageView imageView) {
        return a(imageView, uuz.a(), (vrt) null);
    }

    public static vsr a(ImageView imageView, utt utt) {
        return a(imageView, utt, (vrt) null);
    }

    public static vsr a(ImageView imageView, utt utt, vrt vrt) {
        fay.a(imageView);
        fay.a(utt);
        boolean z = false;
        try {
            uvt uvt = (uvt) ggw.a(uvt.class);
            if (uvt != null && uvt.b) {
                z = true;
            }
        } catch (IllegalStateException unused) {
        }
        a aVar = (a) imageView.getTag(R.id.picasso_target);
        if (aVar == null) {
            aVar = new a(imageView, utt, z);
            imageView.setTag(R.id.picasso_target, aVar);
        }
        aVar.b = vrt;
        aVar.a = utt;
        return aVar;
    }

    public static vsr a(final ImageView imageView, uvj uvj) {
        fay.a(imageView);
        boolean z = false;
        try {
            uvt uvt = (uvt) ggw.a(uvt.class);
            if (uvt != null && uvt.b) {
                z = true;
            }
        } catch (IllegalStateException unused) {
        }
        a aVar = (a) imageView.getTag(R.id.picasso_target);
        if (aVar == null) {
            aVar = new a(imageView, new utt() {
                public final Drawable createDrawable(Bitmap bitmap) {
                    return new BitmapDrawable(imageView.getResources(), bitmap);
                }
            }, z);
            imageView.setTag(R.id.picasso_target, aVar);
        }
        aVar.b = uvj;
        return aVar;
    }

    public static utt a(final Context context, final utt utt, final gbt<Drawable, Drawable> gbt) {
        return new utt() {
            public final Drawable createDrawable(Bitmap bitmap) {
                Object obj;
                gbt gbt = gbt;
                utt utt = utt;
                if (utt != null) {
                    obj = utt.createDrawable(bitmap);
                } else {
                    obj = new BitmapDrawable(context.getResources(), bitmap);
                }
                return (Drawable) gbt.apply(obj);
            }
        };
    }

    @Deprecated
    public final synchronized Picasso a() {
        if (this.a == null) {
            com.squareup.picasso.Picasso.a aVar = new com.squareup.picasso.Picasso.a(this.c);
            if (this.g.b()) {
                ExecutorService executorService = (ExecutorService) this.g.c();
                if (executorService == null) {
                    throw new IllegalArgumentException("Executor service must not be null.");
                } else if (aVar.b == null) {
                    aVar.b = executorService;
                } else {
                    throw new IllegalStateException("Executor service already set.");
                }
            }
            for (vsm vsm : this.f) {
                if (vsm != null) {
                    if (aVar.d == null) {
                        aVar.d = new ArrayList();
                    }
                    if (!aVar.d.contains(vsm)) {
                        aVar.d.add(vsm);
                    } else {
                        throw new IllegalStateException("RequestHandler already registered.");
                    }
                } else {
                    throw new IllegalArgumentException("RequestHandler must not be null.");
                }
            }
            Downloader downloader = this.d;
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (aVar.a == null) {
                aVar.a = downloader;
                if (VERSION.SDK_INT <= 18) {
                    Config config = Config.RGB_565;
                    if (config != null) {
                        aVar.e = config;
                        aVar.a(new uvs(new vsf(a(this.c) / 2)));
                    } else {
                        throw new IllegalArgumentException("Bitmap config must not be null.");
                    }
                } else {
                    aVar.a(new uvs(new vsf(a(this.c))));
                }
                $$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY r1 = $$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY.INSTANCE;
                if (r1 == null) {
                    throw new IllegalArgumentException("Listener must not be null.");
                } else if (aVar.c == null) {
                    aVar.c = r1;
                    this.a = aVar.a();
                    this.b = ((Boolean) a(this.e, (T) Boolean.FALSE)).booleanValue();
                    if (this.b) {
                        this.a.k = true;
                        this.a.l = true;
                    }
                } else {
                    throw new IllegalStateException("Listener already set.");
                }
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }
        return this.a;
    }
}
