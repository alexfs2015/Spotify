package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

public enum HubsGlue2MiscComponents implements gwl, hck {
    CAROUSEL("glue2:carousel", HubsComponentCategory.ROW) {
        public final int resolve(hcm hcm) {
            return Impl.a.mId;
        }
    },
    EMPTY_STATE("glue2:emptyState", HubsComponentCategory.CARD) {
        public final int resolve(hcm hcm) {
            String str = "sesyt";
            String string = hcm.custom().string("style");
            String str2 = "rremr";
            if (LogMessage.SEVERITY_ERROR.equals(string)) {
                return Impl.b.mId;
            }
            if ("noResults".equals(string)) {
                return Impl.c.mId;
            }
            String str3 = "yUppo tty:ustepalssettmeo  edn ";
            StringBuilder sb = new StringBuilder("Unsupported empty state style: ");
            sb.append(string);
            Assertion.b(sb.toString());
            return Impl.c.mId;
        }
    },
    GRADIENT("glue2:gradient", HubsComponentCategory.ROW) {
        public final int resolve(hcm hcm) {
            return Impl.d.mId;
        }
    },
    SIMPLE_HEADER("glue2:simpleHeader", HubsComponentCategory.HEADER) {
        public final int resolve(hcm hcm) {
            return Impl.e.mId;
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    enum Impl implements gxo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        public static final Impl e = null;
        /* access modifiers changed from: private */
        public static final Impl[] f = null;
        private static final /* synthetic */ Impl[] g = null;
        final int mId;

        static {
            a = new Impl("CAROUSEL", 0, R.id.hub_glue2_carousel) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gzs();
                }
            };
            b = new Impl("EMPTY_STATE_ERROR", 1, R.id.hub_glue2_empty_state_error) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            c = new Impl("EMPTY_STATE_NO_RESULT", 2, R.id.hub_glue2_empty_state_no_result) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            d = new Impl("GRADIENT", 3, R.id.hub_glue2_gradient) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gzx();
                }
            };
            e = new Impl("SIMPLE_HEADER", 4, R.id.hub_glue2_simple_header) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new hag(hubsGlueImageDelegate);
                }
            };
            g = new Impl[]{a, b, c, d, e};
            f = values();
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
            return (Impl[]) g.clone();
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2MiscComponents(String str, HubsComponentCategory hubsComponentCategory) {
        this.mComponentId = (String) fbp.a(str);
        this.mCategory = ((HubsComponentCategory) fbp.a(hubsComponentCategory)).mId;
    }

    public static gwk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.f);
    }

    public String category() {
        return this.mCategory;
    }

    public String id() {
        return this.mComponentId;
    }
}
