package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: uvq reason: default package */
public final class uvq<T extends View> implements vsr {
    public static final c<View> a = new c<View>() {
        public final void b(View view, Drawable drawable) {
        }

        public final void a(View view, int i) {
            ip.a(view, uvp.a(view.getContext(), i));
        }

        public final void a(View view, Drawable drawable) {
            ip.a(view, (Drawable) null);
        }
    };
    private final T b;
    private final c<T> c;
    private final b d;
    private a e;

    /* renamed from: uvq$a */
    interface a {
        void a(Bitmap bitmap);
    }

    /* renamed from: uvq$b */
    public interface b {
        void a();

        void a(int i);
    }

    /* renamed from: uvq$c */
    public interface c<T extends View> {
        void a(T t, int i);

        void a(T t, Drawable drawable);

        void b(T t, Drawable drawable);
    }

    public uvq(T t, c<T> cVar) {
        this.e = new a() {
            public final void a(Bitmap bitmap) {
                uus.a(bitmap).a(new defpackage.uus.c() {
                    public final void onGenerated(uus uus) {
                        uvq.this.a(uvj.b(uus));
                    }
                });
            }
        };
        this.c = (c) fay.a(cVar);
        this.b = (View) fay.a(t);
        this.d = null;
        t.setTag(R.id.glue_color_target_tag, this);
    }

    public uvq(b bVar) {
        this.e = new a() {
            public final void a(Bitmap bitmap) {
                uus.a(bitmap).a(new defpackage.uus.c() {
                    public final void onGenerated(uus uus) {
                        uvq.this.a(uvj.b(uus));
                    }
                });
            }
        };
        this.c = null;
        this.b = null;
        this.d = bVar;
    }

    public final void b(Drawable drawable) {
        c<T> cVar = this.c;
        if (cVar != null) {
            cVar.b(this.b, drawable);
        }
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fay.a(!bitmap.isRecycled());
        if (bitmap.getHeight() == 1 && bitmap.getWidth() == 1 && bitmap.getConfig() == Config.ARGB_8888) {
            a(bitmap.getPixel(0, 0));
        } else {
            this.e.a(bitmap);
        }
        fay.a(!bitmap.isRecycled());
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

    static {
        new c<ImageView>() {
            public final /* synthetic */ void a(View view, int i) {
                ((ImageView) view).setImageDrawable(new ColorDrawable(uuy.a(i, 0.4f)));
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
                imageView.setImageDrawable(uvp.a(imageView.getContext(), i));
            }

            public final /* synthetic */ void a(View view, Drawable drawable) {
                ((ImageView) view).setImageDrawable(drawable);
            }

            public final /* synthetic */ void b(View view, Drawable drawable) {
                ((ImageView) view).setImageDrawable(drawable);
            }
        };
    }
}
