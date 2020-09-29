package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.features.browse.component.findcard.FindCardView;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: lyz reason: default package */
public final class lyz {
    final View a;
    final FindCardView b;
    final wgx c = new wgx() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            if (bitmap == null) {
                lyz.this.b.a(null, false);
            } else {
                lyz.this.b.a(new BitmapDrawable(lyz.this.a.getResources(), bitmap), true);
            }
        }

        public final void a(Drawable drawable) {
            lyz.this.b.a(null, false);
        }

        public final void b(Drawable drawable) {
            lyz.this.b.a(null, false);
        }
    };

    public lyz(Context context, ViewGroup viewGroup) {
        this.a = LayoutInflater.from(context).inflate(R.layout.find_category_card_new, viewGroup, false);
        this.b = (FindCardView) this.a.findViewById(R.id.card);
    }

    public final void a(int i, int i2) {
        lzb lzb = this.b.a;
        lzb.a = i;
        lzb.b = i2;
        lzb.a();
        lzb.invalidateSelf();
    }
}
