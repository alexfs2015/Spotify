package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: pwn reason: default package */
public final class pwn extends c<a> {

    /* renamed from: pwn$a */
    static class a extends defpackage.gui.c.a<View> {
        private TextView b = this.c.b();
        private fre c;
        private final SpotifyIconView d;
        private final Matrix e;

        a(View view) {
            super(view);
            this.c = (fre) fqb.a(view, fre.class);
            int b2 = uts.b(16.0f, view.getResources());
            int b3 = uts.b(10.0f, view.getResources());
            this.e = new Matrix();
            float f = (float) b2;
            float f2 = f / 2.0f;
            this.e.postRotate(-45.0f, f2, f2);
            this.e.postTranslate((float) (-uts.b(3.0f, view.getResources())), 0.0f);
            uuu.b(this.b.getContext(), this.b, R.attr.pasteTextAppearance);
            this.b.setMaxLines(2);
            TextView textView = this.b;
            textView.setPadding(textView.getPaddingLeft(), b3, this.b.getPaddingRight(), b3);
            ia.b((MarginLayoutParams) this.b.getLayoutParams(), uts.b(8.0f, view.getResources()));
            Context context = view.getContext();
            int b4 = uts.b(16.0f, context.getResources());
            SpotifyIconView spotifyIconView = new SpotifyIconView(context);
            spotifyIconView.a(SpotifyIconV2.ARROW_UP);
            spotifyIconView.c(uuu.d(context, R.attr.pasteColorAccessory));
            spotifyIconView.a.a((float) b4);
            spotifyIconView.setImageMatrix(this.e);
            spotifyIconView.setScaleType(ScaleType.MATRIX);
            this.d = spotifyIconView;
            this.c.a(this.d);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(view.getContext(), SpotifyIconV2.SEARCH, (float) uts.b(16.0f, view.getResources()));
            spotifyIconDrawable.a(uuu.d(view.getContext(), R.attr.pasteColorAccessory));
            spotifyIconDrawable.a(f);
            ImageView c2 = this.c.c();
            c2.setImageDrawable(spotifyIconDrawable);
            LayoutParams layoutParams = new LayoutParams(b2, b2);
            ia.b(layoutParams, b2);
            c2.setLayoutParams(layoutParams);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            guj.a(gum, this.a, gzt);
            String str = (String) fay.a(gzt.custom().string("query"));
            String str2 = (String) fay.a(gzt.text().title());
            if (str2.startsWith(str)) {
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new StyleSpan(1), str.length(), str2.length(), 17);
                this.b.setText(spannableString);
            } else {
                this.b.setText(str2);
            }
            has.a(gum.c).a("rightAccessoryClick").a(gzt).a(this.d).a();
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        fqb.b();
        return new a(frq.d(viewGroup.getContext(), viewGroup).getView());
    }
}
