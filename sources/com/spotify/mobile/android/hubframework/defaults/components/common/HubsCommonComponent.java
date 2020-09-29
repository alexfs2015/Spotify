package com.spotify.mobile.android.hubframework.defaults.components.common;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;

public enum HubsCommonComponent implements gyw, gzr {
    LOADING_SPINNER(R.id.hub_common_loading_view, "app:loading_spinner", HubsComponentCategory.SPINNER, new gwe());
    
    private static final gbj<SparseArray<gui<?>>> b = null;
    private static final gul c = null;
    private final gvl<?> mBinder;
    public final int mBinderId;
    private final String mCategory;
    private final String mComponentId;

    static {
        Class<HubsCommonComponent> cls;
        b = gyx.a(cls);
        c = gyx.b(cls);
    }

    private HubsCommonComponent(int i, String str, HubsComponentCategory hubsComponentCategory, gvl<?> gvl) {
        this.mBinderId = i;
        this.mComponentId = (String) fay.a(str);
        this.mCategory = ((HubsComponentCategory) fay.a(hubsComponentCategory)).mId;
        this.mBinder = (gvl) fay.a(gvl);
    }

    public final int a() {
        return this.mBinderId;
    }

    public final gvl<?> b() {
        return this.mBinder;
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String category() {
        return this.mCategory;
    }

    public static SparseArray<gui<?>> c() {
        return (SparseArray) b.a();
    }

    public static gul d() {
        return c;
    }
}
