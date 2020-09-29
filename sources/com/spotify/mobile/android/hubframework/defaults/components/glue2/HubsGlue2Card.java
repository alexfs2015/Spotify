package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlue2Card implements gul, gzr {
    CATEGORY("glue2:categoryCard") {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    LARGE("glue2:cardLarge") {
        public final int resolve(gzt gzt) {
            fay.a(gzt);
            if (TextUtils.isEmpty(gzt.text().title()) && TextUtils.isEmpty(gzt.text().subtitle())) {
                return Impl.d.mId;
            }
            return Impl.c.mId;
        }
    },
    REGULAR("glue2:card") {
        public final int resolve(gzt gzt) {
            Impl impl;
            fay.a(gzt);
            if (!((gzt.text().title() == null || gzt.text().subtitle() == null) ? false : true)) {
                if (faw.a("description", gzt.custom().string("titleStyle"))) {
                    impl = Impl.b;
                } else {
                    impl = Impl.e;
                }
            } else if (faw.a(gzt.custom().string("subtitleStyle", ""), "metadata")) {
                impl = Impl.f;
            } else {
                impl = Impl.g;
            }
            return impl.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gvo {
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

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) i.clone();
        }

        /* synthetic */ Impl(String str, int i2, int i3, byte b2) {
            this(str, i2, i3);
        }

        static {
            a = new Impl("CATEGORY", 0, R.id.hub_glue2_card_category) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxf(hubsGlueImageDelegate);
                }
            };
            b = new Impl("DESCRIPTION_ONLY", 1, R.id.hub_glue2_regular_card_description_only) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            c = new Impl("LARGE_DESCRIPTION_ONLY", 2, R.id.hub_glue2_regular_card_large_description_only) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate);
                }
            };
            d = new Impl("LARGE_NO_TEXT", 3, R.id.hub_glue2_regular_card_large_no_text) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d(hubsGlueImageDelegate);
                }
            };
            e = new Impl("TITLE", 4, R.id.hub_glue2_regular_card_title) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new e(hubsGlueImageDelegate);
                }
            };
            f = new Impl("TITLE_METADATA", 5, R.id.hub_glue2_regular_card_title_metadata) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new f(hubsGlueImageDelegate);
                }
            };
            g = new Impl("TITLE_SUBTITLE", 6, R.id.hub_glue2_regular_card_title_subtitle) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new g(hubsGlueImageDelegate);
                }
            };
            i = new Impl[]{a, b, c, d, e, f, g};
            h = values();
        }

        private Impl(String str, int i2, int i3) {
            this.mId = i3;
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2Card(String str) {
        this.mComponentId = (String) fay.a(str);
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String category() {
        return HubsComponentCategory.CARD.mId;
    }

    public final String toString() {
        return id();
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.h);
    }
}
