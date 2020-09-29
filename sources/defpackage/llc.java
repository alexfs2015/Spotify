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

/* renamed from: llc reason: default package */
public final class llc extends jon implements a, NavigationItem, jol, spl {
    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
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

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new lld(layoutInflater, viewGroup, new llb(layoutInflater.getContext().getPackageManager())).a;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.STATIONSPROMO, null);
    }

    public final udr ag() {
        return udt.aV;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.STATIONS_PROMO;
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }
}
