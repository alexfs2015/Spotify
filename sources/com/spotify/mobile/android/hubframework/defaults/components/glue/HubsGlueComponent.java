package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;

public enum HubsGlueComponent implements gwl, hck {
    BACKGROUND("glue:gradient", HubsComponentCategory.ROW) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.f;
        }
    },
    CAROUSEL("glue:carousel", HubsComponentCategory.ROW) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.g;
        }
    },
    EMPTY_VIEW("glue:emptyview", HubsComponentCategory.CARD) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.h;
        }
    },
    HEADER("glue:header", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return hcm.images().main() != null ? HubsGlueComponent.l : HubsGlueComponent.k;
        }
    },
    HEADER_COVER_ART("glue:header:cover", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.i;
        }
    },
    HEADER_LARGE("glue:header:large", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.j;
        }
    },
    HEADER_LEGACY("glue:header:legacy", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.k;
        }
    },
    HEADER_LEGACY_COVER_ART("glue:header:legacy:coverart", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.l;
        }
    },
    HEADER_LEGACY_SCROLLING("glue:header:legacy:scrolling", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.m;
        }
    },
    HEADER_NEW("glue:header:header", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.n;
        }
    },
    SHUFFLE_BUTTON("glue:shuffleButton", HubsComponentCategory.ROW) {
        public final int resolve(hcm hcm) {
            return HubsGlueComponent.o;
        }
    };
    
    /* access modifiers changed from: 0000 */
    public static final int f = 0;
    /* access modifiers changed from: 0000 */
    public static final int g = 0;
    /* access modifiers changed from: 0000 */
    public static final int h = 0;
    /* access modifiers changed from: 0000 */
    public static final int i = 0;
    /* access modifiers changed from: 0000 */
    public static final int j = 0;
    /* access modifiers changed from: 0000 */
    public static final int k = 0;
    /* access modifiers changed from: 0000 */
    public static final int l = 0;
    /* access modifiers changed from: 0000 */
    public static final int m = 0;
    /* access modifiers changed from: 0000 */
    public static final int n = 0;
    /* access modifiers changed from: 0000 */
    public static final int o = 0;
    private final String mCategory;
    private final String mComponentId;

    public static class a implements gwk {
        private SparseArray<gwi<?>> a;

        public a(gzl gzl, gyj gyj, gys gys, defpackage.gyu.a aVar, c cVar, gyz gyz, b bVar, defpackage.gyz.a aVar2, b bVar2, gzi gzi) {
            this.a = new SparseArray<>();
            this.a.append(HubsGlueComponent.f, gzl);
            this.a.append(HubsGlueComponent.g, gyj);
            this.a.append(HubsGlueComponent.h, gys);
            this.a.append(HubsGlueComponent.i, aVar);
            this.a.append(HubsGlueComponent.j, cVar);
            this.a.append(HubsGlueComponent.k, gyz);
            this.a.append(HubsGlueComponent.l, bVar);
            this.a.append(HubsGlueComponent.m, aVar2);
            this.a.append(HubsGlueComponent.n, bVar2);
            this.a.append(HubsGlueComponent.o, gzi);
        }

        public final gwi<?> getBinder(int i) {
            return (gwi) this.a.get(i);
        }
    }

    static {
        f = R.id.hub_glue_background;
        g = R.id.hub_glue_carousel;
        h = R.id.hub_glue_empty_view;
        i = R.id.hub_glue_header_cover_art;
        j = R.id.hub_glue_header_large;
        k = R.id.hub_glue_header_legacy;
        l = R.id.hub_glue_header_legacy_cover_art;
        m = R.id.hub_glue_header_legacy_static;
        n = R.id.hub_glue_header_header;
        o = R.id.hub_glue_shuffle_button;
    }

    private HubsGlueComponent(String str, HubsComponentCategory hubsComponentCategory) {
        this.mComponentId = (String) fbp.a(str);
        this.mCategory = ((HubsComponentCategory) fbp.a(hubsComponentCategory)).mId;
    }

    public static int a() {
        return k;
    }

    public String category() {
        return this.mCategory;
    }

    public String id() {
        return this.mComponentId;
    }
}
