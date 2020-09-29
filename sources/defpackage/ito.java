package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Location;

/* renamed from: ito reason: default package */
public final class ito extends ArrayAdapter<Location> {
    public ito(Context context) {
        super(context, 0);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Location location = (Location) getItem(i);
        frd frd = (frd) fqb.b(view, frd.class);
        if (frd == null) {
            fqb.b();
            frd = frq.a(getContext(), viewGroup);
        }
        frd.a(location.mLocationName);
        frd.getView().setTag(location);
        return frd.getView();
    }
}
