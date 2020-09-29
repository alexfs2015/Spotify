package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Location;

/* renamed from: ivy reason: default package */
public final class ivy extends ArrayAdapter<Location> {
    public ivy(Context context) {
        super(context, 0);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Location location = (Location) getItem(i);
        frx frx = (frx) fqv.b(view, frx.class);
        if (frx == null) {
            fqv.b();
            frx = fsk.a(getContext(), viewGroup);
        }
        frx.a(location.mLocationName);
        frx.getView().setTag(location);
        return frx.getView();
    }
}
