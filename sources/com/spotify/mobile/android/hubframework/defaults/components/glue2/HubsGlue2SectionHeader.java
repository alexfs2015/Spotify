package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlue2SectionHeader implements gul, gzr {
    SECTION_HEADER("glue2:sectionHeader", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(gzt gzt) {
            String string = gzt.custom().string("style");
            if (!fax.a(string)) {
                return Impl.a(string).mId;
            }
            if (!fax.a(gzt.text().subtitle())) {
                return Impl.b.mId;
            }
            return Impl.a.mId;
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    enum Impl implements gvo {
        public static final Impl a = null;
        public static final Impl b = null;
        private static Impl c;
        private static Impl d;
        private static Impl e;
        private static Impl f;
        /* access modifiers changed from: private */
        public static final Impl[] g = null;
        private static final /* synthetic */ Impl[] h = null;
        final int mId;
        private final String mStyle;

        /* synthetic */ Impl(String str, int i, int i2, String str2, byte b2) {
            this(str, i, i2, str2);
        }

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) h.clone();
        }

        static {
            a = new Impl("DEFAULT", 0, R.id.hub_glue2_section_header, "default") {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            b = new Impl("DEFAULT_WITH_SUBTITLE", 1, R.id.hub_glue2_section_header_with_subtitle, "defaultWithSubtitle") {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c();
                }
            };
            c = new Impl("DEFAULT_WITH_METADATA", 2, R.id.hub_glue2_section_header_with_metadata, "defaultWithMetadata") {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            d = new Impl("LARGE", 3, R.id.hub_glue2_section_header_large, "large") {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new e();
                }
            };
            e = new Impl("SMALL", 4, R.id.hub_glue2_section_header_small, "small") {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new f();
                }
            };
            f = new Impl("EXTRA_SMALL", 5, R.id.hub_glue2_section_header_extra_small, "extraSmall") {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d();
                }
            };
            h = new Impl[]{a, b, c, d, e, f};
            g = values();
        }

        private Impl(String str, int i, int i2, String str2) {
            this.mId = i2;
            this.mStyle = str2;
        }

        public final int a() {
            return this.mId;
        }

        static /* synthetic */ Impl a(String str) {
            Impl[] values;
            for (Impl impl : values()) {
                if (impl.mStyle.equals(str)) {
                    return impl;
                }
            }
            StringBuilder sb = new StringBuilder("Unknown style: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private HubsGlue2SectionHeader(String str, HubsComponentCategory hubsComponentCategory) {
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
        return a.a(hubsGlueImageDelegate, Impl.g);
    }
}
