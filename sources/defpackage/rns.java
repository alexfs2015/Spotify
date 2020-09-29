package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: rns reason: default package */
public final class rns implements tyk {
    private final rnt a;
    private final Picasso b;

    public rns(rnt rnt, Picasso picasso) {
        this.a = rnt;
        this.b = picasso;
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.age_verification_dialog, viewGroup, false);
        TextView textView = (TextView) fay.a(inflate.findViewById(R.id.sub_title));
        ImageView imageView = (ImageView) fay.a(inflate.findViewById(R.id.image_view));
        Button button = (Button) fay.a(inflate.findViewById(R.id.action_button));
        a(this.a.a(), (TextView) fay.a(inflate.findViewById(R.id.title)));
        a(this.a.b(), textView);
        tzb d = this.a.d();
        if (d != null) {
            d.a(imageView, this.b);
        }
        a(this.a.c(), button);
        return inflate;
    }

    private static void a(tze tze, TextView textView) {
        if (tze != null) {
            tze.a(textView);
        } else {
            textView.setVisibility(8);
        }
    }
}
