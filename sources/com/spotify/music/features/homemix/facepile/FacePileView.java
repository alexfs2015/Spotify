package com.spotify.music.features.homemix.facepile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

public class FacePileView extends LinearLayout {
    private final FaceView a;
    private final FaceView b;
    private final vfu c;

    public FacePileView(Context context) {
        this(context, null);
    }

    public FacePileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FacePileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new vfu(this);
        LayoutInflater.from(getContext()).inflate(R.layout.home_mix_face_pile_view, this);
        this.a = (FaceView) fbp.a(findViewById(R.id.face_pile_first));
        this.b = (FaceView) fbp.a(findViewById(R.id.face_pile_second));
    }

    public final void a(Picasso picasso, nqx nqx) {
        fbp.a(nqx);
        List list = null;
        this.a.a(picasso, nqx.a().isEmpty() ? null : (nqw) nqx.a().get(0));
        FaceView faceView = this.b;
        if (nqx.a().size() > 0) {
            list = nqx.a().subList(1, nqx.a().size());
        }
        if (list == null || list.isEmpty()) {
            faceView.setVisibility(8);
        } else if (list.size() == 1) {
            faceView.b((Picasso) fbp.a(picasso), (nqw) list.get(0));
        } else {
            faceView.setImageDrawable(new nqy(faceView.getContext(), faceView.getContext().getString(R.string.home_mix_face_overflow_template, new Object[]{Integer.valueOf(list.size())}), fr.c(faceView.getContext(), R.color.face_pile_counter_bg)));
            vhj.a((ImageView) faceView);
            faceView.setScaleType(ScaleType.CENTER_CROP);
            faceView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.c.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.b();
    }
}
