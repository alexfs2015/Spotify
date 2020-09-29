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

/* renamed from: qbk reason: default package */
public final class qbk extends ArrayAdapter<RadioStationModel> {
    private final Drawable a;
    /* access modifiers changed from: private */
    public final szp b;
    private final OnClickListener c = new OnClickListener() {
        public final void onClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            qbk.this.b.a(szk.a(radioStationModel.uri).b(radioStationModel.title).a());
        }
    };

    public qbk(kf kfVar, szp szp) {
        super(kfVar, R.layout.glue_card, new ArrayList());
        this.b = szp;
        this.a = gaa.a((Context) kfVar, SpotifyIcon.RADIO_16);
    }

    public final long getItemId(int i) {
        return (long) ((RadioStationModel) getItem(i)).hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        fry fry = (fry) fqv.b(view, fry.class);
        if (fry == null) {
            fqv.b();
            fry = fsk.d(getContext(), viewGroup);
            fry.getView().setOnClickListener(this.c);
            fry.c().setImageDrawable(this.a);
        }
        RadioStationModel radioStationModel = (RadioStationModel) getItem(i);
        fry.getView().setTag(radioStationModel);
        fry.b().setText(radioStationModel.title);
        fry.a(false);
        return fry.getView();
    }

    public final boolean hasStableIds() {
        return true;
    }
}
