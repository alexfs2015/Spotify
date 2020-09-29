package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: vcb reason: default package */
public final class vcb extends vbz<vbs> {
    public final TextView a;
    public final ImageView b;
    public final ImageView c;
    public final Picasso d;
    public final int e;

    /* renamed from: vcb$a */
    public static class a implements vst {
        private final int a;

        public a(int i) {
            this.a = i / 2;
        }

        public final Bitmap a(Bitmap bitmap) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            int i = this.a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
            paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        public final String a() {
            return a.class.getSimpleName();
        }
    }

    public vcb(View view, Picasso picasso) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.pillow_title);
        this.b = (ImageView) view.findViewById(R.id.pillow_image);
        this.c = (ImageView) view.findViewById(R.id.pillow_checkmark);
        this.d = picasso;
        this.e = (int) view.getContext().getResources().getDimension(R.dimen.pillow_radius);
        uui.a(view).b(this.b).a(this.a).a();
    }
}
