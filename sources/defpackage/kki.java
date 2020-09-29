package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: kki reason: default package */
public class kki extends kif {
    public Picasso U;

    public static kki a(g gVar) {
        kki kki = new kki();
        Bundle a = a((kfp) gVar);
        a.putInt("color", gVar.e);
        a.putString("preview", gVar.a);
        a.putString("image", gVar.b);
        a.putString(TrackData.TYPE_TRACK, gVar.c);
        a.putString("artist", gVar.d);
        kki.g(a);
        return kki;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_placeholder_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            CardView cardView = (CardView) ip.d(view, (int) R.id.card);
            ImageView imageView = (ImageView) ip.d(view, (int) R.id.image);
            TextView textView = (TextView) ip.d(view, (int) R.id.track);
            TextView textView2 = (TextView) ip.d(view, (int) R.id.artist);
            cardView.a(bundle2.getInt("color", -16777216));
            textView.setText(bundle2.getString(TrackData.TYPE_TRACK));
            textView2.setText(bundle2.getString("artist"));
            this.U.a(bundle2.getString("image")).a(imageView);
        }
    }

    public final void aP_() {
        super.aP_();
        b((String) fbp.a(l().getString("preview")));
    }
}
