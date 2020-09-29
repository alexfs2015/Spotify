package com.spotify.mobile.android.hubframework.defaults.components.common;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;

public enum HubsCommonComponent implements hbp, hck {
    LOADING_SPINNER(R.id.hub_common_loading_view, "app:loading_spinner", HubsComponentCategory.SPINNER, new gyf());
    
    private static final gch<SparseArray<gwi<?>>> b = null;
    private static final gwl c = null;
    private final gxl<?> mBinder;
    public final int mBinderId;
    private final String mCategory;
    private final String mComponentId;

    static {
        Class<HubsCommonComponent> cls;
        b = hbq.a(cls);
        c = hbq.b(cls);
    }

    private HubsCommonComponent(int i, String str, HubsComponentCategory hubsComponentCategory, gxl<?> gxl) {
        this.mBinderId = i;
        this.mComponentId = (String) fbp.a(str);
        this.mCategory = ((HubsComponentCategory) fbp.a(hubsComponentCategory)).mId;
        this.mBinder = (gxl) fbp.a(gxl);
    }

    public static SparseArray<gwi<?>> c() {
        return (SparseArray) b.a();
    }

    public static gwl d() {
        return c;
    }

    public final int a() {
        return this.mBinderId;
    }

    public final gxl<?> b() {
        return this.mBinder;
    }

    public final String category() {
        return this.mCategory;
    }

    public final String id() {
        return this.mComponentId;
    }
}
