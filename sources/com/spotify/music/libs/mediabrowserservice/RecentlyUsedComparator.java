package com.spotify.music.libs.mediabrowserservice;

import java.io.Serializable;
import java.util.Comparator;

public class RecentlyUsedComparator implements Serializable, Comparator<scw> {
    private static final long serialVersionUID = -3812157713554950887L;

    public static int a(scw scw, scw scw2) {
        fbp.a(scw);
        fbp.a(scw2);
        long j = scw.e().e;
        long j2 = scw2.e().e;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((scw) obj, (scw) obj2);
    }
}
