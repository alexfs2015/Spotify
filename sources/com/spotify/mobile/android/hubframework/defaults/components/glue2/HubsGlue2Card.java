package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlue2Card implements gwl, hck {
    CATEGORY("glue2:categoryCard") {
        public final int resolve(hcm hcm) {
            return Impl.a.mId;
        }
    },
    LARGE("glue2:cardLarge") {
        public final int resolve(hcm hcm) {
            fbp.a(hcm);
            return TextUtils.isEmpty(hcm.text().title()) && TextUtils.isEmpty(hcm.text().subtitle()) ? Impl.d.mId : Impl.c.mId;
        }
    },
    REGULAR("glue2:card") {
        public final int resolve(hcm hcm) {
            Impl impl;
            fbp.a(hcm);
            if ((hcm.text().title() == null || hcm.text().subtitle() == null) ? false : true) {
                String str = "eysuSsttitlel";
                String str2 = "";
                String str3 = "atmmdaea";
                impl = fbn.a(hcm.custom().string("subtitleStyle", ""), "metadata") ? Impl.f : Impl.g;
            } else {
                String str4 = "elelotyitS";
                impl = fbn.a("description", hcm.custom().string("titleStyle")) ? Impl.b : Impl.e;
            }
            return impl.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gxo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        public static final Impl e = null;
        public static final Impl f = null;
        public static final Impl g = null;
        /* access modifiers changed from: private */
        public static final Impl[] h = null;
        private static final /* synthetic */ Impl[] i = null;
        final int mId;

        static {
            a = new Impl("CATEGORY", 0, R.id.hub_glue2_card_category) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gzt(hubsGlueImageDelegate);
                }
            };
            b = new Impl("DESCRIPTION_ONLY", 1, R.id.hub_glue2_regular_card_description_only) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            c = new Impl("LARGE_DESCRIPTION_ONLY", 2, R.id.hub_glue2_regular_card_large_description_only) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate);
                }
            };
            d = new Impl("LARGE_NO_TEXT", 3, R.id.hub_glue2_regular_card_large_no_text) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d(hubsGlueImageDelegate);
                }
            };
            e = new Impl("TITLE", 4, R.id.hub_glue2_regular_card_title) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new e(hubsGlueImageDelegate);
                }
            };
            f = new Impl("TITLE_METADATA", 5, R.id.hub_glue2_regular_card_title_metadata) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new f(hubsGlueImageDelegate);
                }
            };
            g = new Impl("TITLE_SUBTITLE", 6, R.id.hub_glue2_regular_card_title_subtitle) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new g(hubsGlueImageDelegate);
                }
            };
            i = new Impl[]{a, b, c, d, e, f, g};
            h = values();
        }

        private Impl(String str, int i2, int i3) {
            this.mId = i3;
        }

        /* synthetic */ Impl(String str, int i2, int i3, byte b2) {
            this(str, i2, i3);
        }

        public static Impl valueOf(String str) {
            Class<Impl> cls = Impl.class;
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) i.clone();
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2Card(String str) {
        this.mComponentId = (String) fbp.a(str);
    }

    public static gwk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.h);
    }

    public final String category() {
        return HubsComponentCategory.CARD.mId;
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String toString() {
        return id();
    }
}
