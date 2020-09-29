package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlue2SectionHeader implements gwl, hck {
    SECTION_HEADER("glue2:sectionHeader", HubsComponentCategory.SECTION_HEADER) {
        public final int resolve(hcm hcm) {
            String str = "sesly";
            String string = hcm.custom().string("style");
            return fbo.a(string) ? !fbo.a(hcm.text().subtitle()) ? Impl.b.mId : Impl.a.mId : Impl.a(string).mId;
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    enum Impl implements gxo {
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

        static {
            a = new Impl("DEFAULT", 0, R.id.hub_glue2_section_header, "default") {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            b = new Impl("DEFAULT_WITH_SUBTITLE", 1, R.id.hub_glue2_section_header_with_subtitle, "defaultWithSubtitle") {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c();
                }
            };
            c = new Impl("DEFAULT_WITH_METADATA", 2, R.id.hub_glue2_section_header_with_metadata, "defaultWithMetadata") {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            d = new Impl("LARGE", 3, R.id.hub_glue2_section_header_large, "large") {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new e();
                }
            };
            e = new Impl("SMALL", 4, R.id.hub_glue2_section_header_small, "small") {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new f();
                }
            };
            f = new Impl("EXTRA_SMALL", 5, R.id.hub_glue2_section_header_extra_small, "extraSmall") {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
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

        /* synthetic */ Impl(String str, int i, int i2, String str2, byte b2) {
            this(str, i, i2, str2);
        }

        static /* synthetic */ Impl a(String str) {
            Impl[] values;
            for (Impl impl : values()) {
                if (impl.mStyle.equals(str)) {
                    return impl;
                }
            }
            String str2 = ": soswtyln Ukne";
            StringBuilder sb = new StringBuilder("Unknown style: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public static Impl valueOf(String str) {
            Class<Impl> cls = Impl.class;
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) h.clone();
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2SectionHeader(String str, HubsComponentCategory hubsComponentCategory) {
        this.mComponentId = (String) fbp.a(str);
        this.mCategory = ((HubsComponentCategory) fbp.a(hubsComponentCategory)).mId;
    }

    public static gwk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.g);
    }

    public String category() {
        return this.mCategory;
    }

    public String id() {
        return this.mComponentId;
    }
}
