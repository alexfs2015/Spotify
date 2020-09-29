package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: rwy reason: default package */
public final class rwy implements ulf {
    private final rwz a;
    private final Picasso b;

    public rwy(rwz rwz, Picasso picasso) {
        this.a = rwz;
        this.b = picasso;
    }

    private static void a(ulz ulz, TextView textView) {
        if (ulz != null) {
            ulz.a(textView);
        } else {
            textView.setVisibility(8);
        }
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.age_verification_dialog, viewGroup, false);
        TextView textView = (TextView) fbp.a(inflate.findViewById(R.id.sub_title));
        ImageView imageView = (ImageView) fbp.a(inflate.findViewById(R.id.image_view));
        Button button = (Button) fbp.a(inflate.findViewById(R.id.action_button));
        a(this.a.a(), (TextView) fbp.a(inflate.findViewById(R.id.title)));
        a(this.a.b(), textView);
        ulw d = this.a.d();
        if (d != null) {
            d.a(imageView, this.b);
        }
        a(this.a.c(), button);
        return inflate;
    }
}
