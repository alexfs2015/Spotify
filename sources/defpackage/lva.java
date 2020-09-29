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

/* renamed from: lva reason: default package */
public final class lva {
    final View a;
    final FindCardView b;
    final vsr c = new vsr() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            if (bitmap == null) {
                lva.this.b.a(null, false);
            } else {
                lva.this.b.a(new BitmapDrawable(lva.this.a.getResources(), bitmap), true);
            }
        }

        public final void a(Drawable drawable) {
            lva.this.b.a(null, false);
        }

        public final void b(Drawable drawable) {
            lva.this.b.a(null, false);
        }
    };

    public lva(Context context, ViewGroup viewGroup) {
        this.a = LayoutInflater.from(context).inflate(R.layout.find_category_card_new, viewGroup, false);
        this.b = (FindCardView) this.a.findViewById(R.id.card);
    }

    public final void a(int i, int i2) {
        lvc lvc = this.b.a;
        lvc.a = i;
        lvc.b = i2;
        lvc.a();
        lvc.invalidateSelf();
    }
}
