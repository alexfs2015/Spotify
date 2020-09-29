package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlueSectionHeader implements gul, gzr {
    SECTION_HEADER("glue:sectionHeader") {
        public final int resolve(gzt gzt) {
            if (!fax.a(gzt.text().description())) {
                return Impl.b.mId;
            }
            return Impl.a.mId;
        }
    },
    SECTION_HEADER_LARGE("glue:row:sectionHeaderLarge") {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    SECTION_HEADER_LARGE_WITH_DESCRIPTION("glue:row:sectionHeaderLargeWithDescription") {
        public final int resolve(gzt gzt) {
            return Impl.b.mId;
        }
    },
    SECTION_HEADER_SMALL("glue:sectionHeaderSmall") {
        public final int resolve(gzt gzt) {
            if (!fax.a(gzt.text().description())) {
                return Impl.d.mId;
            }
            return Impl.c.mId;
        }
    },
    SECTION_HEADER_SMALL_NO_DESCRIPTION("glue:row:sectionHeaderSmall") {
        public final int resolve(gzt gzt) {
            return Impl.d.mId;
        }
    },
    SECTION_HEADER_SMALL_WITH_DESCRIPTION("glue:row:sectionHeaderSmallWithDescription") {
        public final int resolve(gzt gzt) {
            return Impl.d.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gvo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        /* access modifiers changed from: private */
        public static final Impl[] e = null;
        private static final /* synthetic */ Impl[] f = null;
        final int mId;

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) f.clone();
        }

        /* synthetic */ Impl(String str, int i, int i2, byte b2) {
            this(str, i, i2);
        }

        static {
            a = new Impl("SECTION_HEADER_LARGE", 0, R.id.hub_glue_section_header_large) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            b = new Impl("SECTION_HEADER_LARGE_WITH_DESCRIPTION", 1, R.id.hub_glue_section_header_large_with_description) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            c = new Impl("SECTION_HEADER_SMALL", 2, R.id.hub_glue_section_header_small) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c();
                }
            };
            d = new Impl("SECTION_HEADER_SMALL_WITH_DESCRIPTION", 3, R.id.hub_glue_section_header_small_with_description) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d();
                }
            };
            f = new Impl[]{a, b, c, d};
            e = values();
        }

        private Impl(String str, int i, int i2) {
            this.mId = i2;
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlueSectionHeader(String str) {
        this.mComponentId = (String) fay.a(str);
    }

    public String id() {
        return this.mComponentId;
    }

    public String category() {
        return HubsComponentCategory.SECTION_HEADER.mId;
    }

    public static int a() {
        return Impl.a.mId;
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.e);
    }
}
