package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.ArrayList;

/* renamed from: pso reason: default package */
public final class pso extends ArrayAdapter<RadioStationModel> {
    private final Drawable a;
    /* access modifiers changed from: private */
    public final spi b;
    private final OnClickListener c = new OnClickListener() {
        public final void onClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            pso.this.b.a(spd.a(radioStationModel.uri).b(radioStationModel.title).a());
        }
    };

    public final boolean hasStableIds() {
        return true;
    }

    public pso(ka kaVar, spi spi) {
        super(kaVar, R.layout.glue_card, new ArrayList());
        this.b = spi;
        this.a = fzg.a((Context) kaVar, SpotifyIcon.RADIO_16);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        fre fre = (fre) fqb.b(view, fre.class);
        if (fre == null) {
            fqb.b();
            fre = frq.d(getContext(), viewGroup);
            fre.getView().setOnClickListener(this.c);
            fre.c().setImageDrawable(this.a);
        }
        RadioStationModel radioStationModel = (RadioStationModel) getItem(i);
        fre.getView().setTag(radioStationModel);
        fre.b().setText(radioStationModel.title);
        fre.a(false);
        return fre.getView();
    }

    public final long getItemId(int i) {
        return (long) ((RadioStationModel) getItem(i)).hashCode();
    }
}
