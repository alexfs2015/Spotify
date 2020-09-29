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

/* renamed from: qfj reason: default package */
public final class qfj extends c<a> {

    /* renamed from: qfj$a */
    static class a extends defpackage.gwi.c.a<View> {
        private TextView b = this.c.b();
        private fry c;
        private final SpotifyIconView d;
        private final Matrix e;

        a(View view) {
            super(view);
            this.c = (fry) fqv.a(view, fry.class);
            int b2 = vfj.b(16.0f, view.getResources());
            int b3 = vfj.b(10.0f, view.getResources());
            this.e = new Matrix();
            float f = (float) b2;
            float f2 = f / 2.0f;
            this.e.postRotate(-45.0f, f2, f2);
            this.e.postTranslate((float) (-vfj.b(3.0f, view.getResources())), 0.0f);
            vgl.b(this.b.getContext(), this.b, R.attr.pasteTextAppearance);
            this.b.setMaxLines(2);
            TextView textView = this.b;
            textView.setPadding(textView.getPaddingLeft(), b3, this.b.getPaddingRight(), b3);
            ia.b((MarginLayoutParams) this.b.getLayoutParams(), vfj.b(8.0f, view.getResources()));
            Context context = view.getContext();
            int b4 = vfj.b(16.0f, context.getResources());
            SpotifyIconView spotifyIconView = new SpotifyIconView(context);
            spotifyIconView.a(SpotifyIconV2.ARROW_UP);
            spotifyIconView.c(vgl.d(context, R.attr.pasteColorAccessory));
            spotifyIconView.a.a((float) b4);
            spotifyIconView.setImageMatrix(this.e);
            spotifyIconView.setScaleType(ScaleType.MATRIX);
            this.d = spotifyIconView;
            this.c.a(this.d);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(view.getContext(), SpotifyIconV2.SEARCH, (float) vfj.b(16.0f, view.getResources()));
            spotifyIconDrawable.a(vgl.d(view.getContext(), R.attr.pasteColorAccessory));
            spotifyIconDrawable.a(f);
            ImageView c2 = this.c.c();
            c2.setImageDrawable(spotifyIconDrawable);
            LayoutParams layoutParams = new LayoutParams(b2, b2);
            ia.b(layoutParams, b2);
            c2.setLayoutParams(layoutParams);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            gwj.a(gwm, this.a, hcm);
            String str = (String) fbp.a(hcm.custom().string("query"));
            String str2 = (String) fbp.a(hcm.text().title());
            if (str2.startsWith(str)) {
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new StyleSpan(1), str.length(), str2.length(), 17);
                this.b.setText(spannableString);
            } else {
                this.b.setText(str2);
            }
            hdl.a(gwm.c).a("rightAccessoryClick").a(hcm).a(this.d).a();
        }
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        fqv.b();
        return new a(fsk.d(viewGroup.getContext(), viewGroup).getView());
    }
}
