package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vhh reason: default package */
public final class vhh<T extends View> implements wgx {
    public static final c<View> a = new c<View>() {
        public final void a(View view, int i) {
            ip.a(view, vhg.a(view.getContext(), i));
        }

        public final void a(View view, Drawable drawable) {
            ip.a(view, (Drawable) null);
        }

        public final void b(View view, Drawable drawable) {
        }
    };
    private final T b;
    private final c<T> c;
    private final b d;
    private a e;

    /* renamed from: vhh$a */
    interface a {
        void a(Bitmap bitmap);
    }

    /* renamed from: vhh$b */
    public interface b {
        void a();

        void a(int i);
    }

    /* renamed from: vhh$c */
    public interface c<T extends View> {
        void a(T t, int i);

        void a(T t, Drawable drawable);

        void b(T t, Drawable drawable);
    }

    static {
        new c<ImageView>() {
            public final /* synthetic */ void a(View view, int i) {
                ((ImageView) view).setImageDrawable(new ColorDrawable(vgp.a(i, 0.4f)));
            }

            public final /* synthetic */ void a(View view, Drawable drawable) {
                ((ImageView) view).setImageDrawable(drawable);
            }

            public final /* synthetic */ void b(View view, Drawable drawable) {
                ((ImageView) view).setImageDrawable(drawable);
            }
        };
        new c<ImageView>() {
            public final /* synthetic */ void a(View view, int i) {
                ImageView imageView = (ImageView) view;
                imageView.setImageDrawable(vhg.a(imageView.getContext(), i));
            }

            public final /* synthetic */ void a(View view, Drawable drawable) {
                ((ImageView) view).setImageDrawable(drawable);
            }

            public final /* synthetic */ void b(View view, Drawable drawable) {
                ((ImageView) view).setImageDrawable(drawable);
            }
        };
    }

    public vhh(T t, c<T> cVar) {
        this.e = new a() {
            public final void a(Bitmap bitmap) {
                vgj.a(bitmap).a(new defpackage.vgj.c() {
                    public final void onGenerated(vgj vgj) {
                        vhh.this.a(vha.b(vgj));
                    }
                });
            }
        };
        this.c = (c) fbp.a(cVar);
        this.b = (View) fbp.a(t);
        this.d = null;
        t.setTag(R.id.glue_color_target_tag, this);
    }

    public vhh(b bVar) {
        this.e = new a() {
            public final void a(Bitmap bitmap) {
                vgj.a(bitmap).a(new defpackage.vgj.c() {
                    public final void onGenerated(vgj vgj) {
                        vhh.this.a(vha.b(vgj));
                    }
                });
            }
        };
        this.c = null;
        this.b = null;
        this.d = bVar;
    }

    /* access modifiers changed from: private */
    public void a(int i) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(i);
        }
        c<T> cVar = this.c;
        if (cVar != null) {
            cVar.a(this.b, i);
        }
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        if (bitmap.getHeight() == 1 && bitmap.getWidth() == 1 && bitmap.getConfig() == Config.ARGB_8888) {
            a(bitmap.getPixel(0, 0));
        } else {
            this.e.a(bitmap);
        }
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
        c<T> cVar = this.c;
        if (cVar != null) {
            cVar.a(this.b, drawable);
        }
    }

    public final void b(Drawable drawable) {
        c<T> cVar = this.c;
        if (cVar != null) {
            cVar.b(this.b, drawable);
        }
    }
}
