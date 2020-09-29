package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.homemix.facepile.FaceView;
import com.squareup.picasso.Picasso;

/* renamed from: nlm reason: default package */
public final class nlm extends u {
    final FaceView a = ((FaceView) fay.a(this.o.findViewById(R.id.face)));
    final TextView b = ((TextView) fay.a(this.o.findViewById(R.id.name)));
    final TextView c = ((TextView) fay.a(this.o.findViewById(R.id.affinityType)));
    final Picasso d;
    final Context e;

    public nlm(Picasso picasso, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_mix_face_pile_detail_row, viewGroup, false));
        this.d = picasso;
        this.e = viewGroup.getContext();
    }
}
