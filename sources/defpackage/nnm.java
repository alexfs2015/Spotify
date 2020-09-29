package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.homemix.facepile.FaceView;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: nnm reason: default package */
public final class nnm extends u {
    private final CardView a = ((CardView) fay.a(this.o.findViewById(R.id.card)));
    private final TextView b = ((TextView) fay.a(this.o.findViewById(R.id.title)));
    private final LinearLayout c = ((LinearLayout) fay.a(this.o.findViewById(R.id.content_container)));
    private final Picasso d;
    private final Context e;

    public nnm(Picasso picasso, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_mix_affinity_card_view, viewGroup, false));
        this.e = viewGroup.getContext();
        this.d = picasso;
    }

    public final void a(int i, nne nne, List<nlg> list) {
        this.a.a(i);
        this.b.setText(nne.a());
        this.c.removeAllViews();
        for (nlg nlg : (List) fay.a(list)) {
            LinearLayout linearLayout = this.c;
            FaceView faceView = new FaceView(this.e);
            LayoutParams layoutParams = new LayoutParams(-2, -1);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(8);
            }
            faceView.setLayoutParams(layoutParams);
            faceView.setScaleType(ScaleType.FIT_CENTER);
            faceView.setAdjustViewBounds(true);
            faceView.a(this.d, (nlg) fay.a(nlg));
            linearLayout.addView(faceView);
        }
    }
}
