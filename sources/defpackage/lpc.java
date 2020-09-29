package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: lpc reason: default package */
public final class lpc extends jqz implements a, NavigationItem, jqx, szs {
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new lpd(layoutInflater, viewGroup, new lpb(layoutInflater.getContext().getPackageManager())).a;
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.STATIONSPROMO, null);
    }

    public final uqm ag() {
        return uqo.aV;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.STATIONS_PROMO;
    }

    public final boolean ai() {
        return true;
    }

    public final boolean ak() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "stations-promo";
    }
}
