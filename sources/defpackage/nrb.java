package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.homemix.facepile.FaceView;
import com.squareup.picasso.Picasso;

/* renamed from: nrb reason: default package */
public final class nrb extends u {
    final FaceView a = ((FaceView) fbp.a(this.o.findViewById(R.id.face)));
    final TextView b = ((TextView) fbp.a(this.o.findViewById(R.id.name)));
    final TextView c = ((TextView) fbp.a(this.o.findViewById(R.id.affinityType)));
    final Picasso d;
    final Context e;

    public nrb(Picasso picasso, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_mix_face_pile_detail_row, viewGroup, false));
        this.d = picasso;
        this.e = viewGroup.getContext();
    }
}
