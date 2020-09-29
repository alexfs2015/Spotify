package com.spotify.music.features.playlistentity.trackcloud;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class TrackCloudShuffling {

    enum TrackType {
        IN_PLAYLIST,
        RECOMMENDATION
    }

    private static float a(ho<vle, TrackType> hoVar, boolean z) {
        float f = 0.0f;
        if (hoVar == null || hoVar.a == null) {
            return 0.0f;
        }
        vlf b = ((vle) hoVar.a).b();
        if (b != null && b.inCollection()) {
            f = 3.0f;
        }
        float f2 = 1.0f;
        if (hoVar.b == TrackType.IN_PLAYLIST) {
            if (z) {
                f2 = 5.0f;
            }
        } else if (hoVar.b != TrackType.RECOMMENDATION) {
            return f;
        }
        return f + f2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(vle vle) {
        return new ho(vle, TrackType.RECOMMENDATION);
    }

    public static List<vle> a(List<vle> list, List<vle> list2, Random random) {
        boolean z = false;
        fbp.a((list == null && list2 == null) ? false : true, (Object) "At least one list should be not null");
        if (!(list == null || list2 == null)) {
            z = true;
        }
        ArrayList<ho> a = Lists.a();
        if (list != null) {
            a.addAll(Lists.a(list, $$Lambda$TrackCloudShuffling$3vUWCVR_QHQiFZu8G5zmeWjHoHo.INSTANCE));
        }
        if (list2 != null) {
            a.addAll(Lists.a(list2, $$Lambda$TrackCloudShuffling$cnE_HCSVITyvJMSdbWhvc9fSKTU.INSTANCE));
        }
        float f = 0.0f;
        for (ho a2 : a) {
            f += a(a2, z);
        }
        ArrayList arrayList = new ArrayList(a.size());
        while (!a.isEmpty()) {
            float nextFloat = random.nextFloat() * f;
            ho hoVar = null;
            Iterator it = a.iterator();
            float f2 = 0.0f;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ho hoVar2 = (ho) it.next();
                if (a(hoVar2, z) + f2 >= nextFloat) {
                    hoVar = hoVar2;
                    break;
                }
                f2 += a(hoVar2, z);
            }
            a.remove(hoVar);
            f -= a(hoVar, z);
            arrayList.add(((ho) fbp.a(hoVar)).a);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho b(vle vle) {
        return new ho(vle, TrackType.IN_PLAYLIST);
    }
}
