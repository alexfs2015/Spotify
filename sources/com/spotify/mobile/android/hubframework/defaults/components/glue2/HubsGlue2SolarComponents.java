package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

@Deprecated
public enum HubsGlue2SolarComponents implements gul, gzr {
    SECTION_HEADER("glue2:solarSectionHeader", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    SECTION_HEADER_LARGE("glue2:solarSectionHeaderLarge", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.b.mId;
        }
    },
    SECTION_HEADER_SMALL("glue2:solarSectionHeaderSmall", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.c.mId;
        }
    },
    SECTION_HEADER_WITH_DESCRIPTION("glue2:solarSectionHeaderWithDescription", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.d.mId;
        }
    },
    SECTION_HEADER_WITH_RECOMMENDATION("glue2:solarSectionHeaderWithRecommendation", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.e.mId;
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    enum Impl implements gvo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        public static final Impl e = null;
        /* access modifiers changed from: private */
        public static final Impl[] f = null;
        private static final /* synthetic */ Impl[] g = null;
        final int mId;

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) g.clone();
        }

        /* synthetic */ Impl(String str, int i, int i2, byte b2) {
            this(str, i, i2);
        }

        static {
            a = new Impl("SECTION_HEADER", 0, R.id.hub_glue2_solar_section_header) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c();
                }
            };
            b = new Impl("SECTION_HEADER_LARGE", 1, R.id.hub_glue2_solar_section_header_large) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            c = new Impl("SECTION_HEADER_SMALL", 2, R.id.hub_glue2_solar_section_header_small) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            d = new Impl("SECTION_HEADER_WITH_DESCRIPTION", 3, R.id.hub_glue2_solar_section_header_with_subtitle) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d();
                }
            };
            e = new Impl("SECTION_HEADER_WITH_RECOMMENDATION", 4, R.id.hub_glue2_solar_section_header_with_metadata) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new e();
                }
            };
            g = new Impl[]{a, b, c, d, e};
            f = values();
        }

        private Impl(String str, int i, int i2) {
            this.mId = i2;
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2SolarComponents(String str, HubsComponentCategory hubsComponentCategory) {
        this.mComponentId = (String) fay.a(str);
        this.mCategory = ((HubsComponentCategory) fay.a(hubsComponentCategory)).mId;
    }

    public String id() {
        return this.mComponentId;
    }

    public String category() {
        return this.mCategory;
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.f);
    }
}
