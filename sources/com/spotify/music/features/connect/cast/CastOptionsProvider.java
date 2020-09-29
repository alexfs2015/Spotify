package com.spotify.music.features.connect.cast;

import android.content.Context;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.DiscoveryTechnology;
import java.util.List;

public class CastOptionsProvider implements bor {
    public List<box> getAdditionalSessionProviders(Context context) {
        return null;
    }

    public bon getCastOptions(Context context) {
        a aVar = new a();
        aVar.f = null;
        aVar.e = true;
        aVar.g = true;
        aVar.c = false;
        aVar.a = DiscoveryConfiguration.a(DiscoveryTechnology.a).a;
        a aVar2 = new a();
        aVar2.a.a = false;
        aVar.d = aVar2.a;
        bon bon = new bon(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, false);
        return bon;
    }
}
