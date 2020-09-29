package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlueSectionHeader implements gwl, hck {
    SECTION_HEADER("glue:sectionHeader") {
        public final int resolve(hcm hcm) {
            return !fbo.a(hcm.text().description()) ? Impl.b.mId : Impl.a.mId;
        }
    },
    SECTION_HEADER_LARGE("glue:row:sectionHeaderLarge") {
        public final int resolve(hcm hcm) {
            return Impl.a.mId;
        }
    },
    SECTION_HEADER_LARGE_WITH_DESCRIPTION("glue:row:sectionHeaderLargeWithDescription") {
        public final int resolve(hcm hcm) {
            return Impl.b.mId;
        }
    },
    SECTION_HEADER_SMALL("glue:sectionHeaderSmall") {
        public final int resolve(hcm hcm) {
            return !fbo.a(hcm.text().description()) ? Impl.d.mId : Impl.c.mId;
        }
    },
    SECTION_HEADER_SMALL_NO_DESCRIPTION("glue:row:sectionHeaderSmall") {
        public final int resolve(hcm hcm) {
            return Impl.d.mId;
        }
    },
    SECTION_HEADER_SMALL_WITH_DESCRIPTION("glue:row:sectionHeaderSmallWithDescription") {
        public final int resolve(hcm hcm) {
            return Impl.d.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gxo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        /* access modifiers changed from: private */
        public static final Impl[] e = null;
        private static final /* synthetic */ Impl[] f = null;
        final int mId;

        static {
            a = new Impl("SECTION_HEADER_LARGE", 0, R.id.hub_glue_section_header_large) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            b = new Impl("SECTION_HEADER_LARGE_WITH_DESCRIPTION", 1, R.id.hub_glue_section_header_large_with_description) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            c = new Impl("SECTION_HEADER_SMALL", 2, R.id.hub_glue_section_header_small) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c();
                }
            };
            d = new Impl("SECTION_HEADER_SMALL_WITH_DESCRIPTION", 3, R.id.hub_glue_section_header_small_with_description) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d();
                }
            };
            f = new Impl[]{a, b, c, d};
            e = values();
        }

        private Impl(String str, int i, int i2) {
            this.mId = i2;
        }

        /* synthetic */ Impl(String str, int i, int i2, byte b2) {
            this(str, i, i2);
        }

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) f.clone();
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlueSectionHeader(String str) {
        this.mComponentId = (String) fbp.a(str);
    }

    public static int a() {
        return Impl.a.mId;
    }

    public static gwk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.e);
    }

    public String category() {
        return HubsComponentCategory.SECTION_HEADER.mId;
    }

    public String id() {
        return this.mComponentId;
    }
}
