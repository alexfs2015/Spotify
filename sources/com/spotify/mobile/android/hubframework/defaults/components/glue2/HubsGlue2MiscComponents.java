package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

public enum HubsGlue2MiscComponents implements gul, gzr {
    CAROUSEL("glue2:carousel", HubsComponentCategory.ROW) {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    EMPTY_STATE("glue2:emptyState", HubsComponentCategory.CARD) {
        public final int resolve(gzt gzt) {
            String string = gzt.custom().string("style");
            if (LogMessage.SEVERITY_ERROR.equals(string)) {
                return Impl.b.mId;
            }
            if ("noResults".equals(string)) {
                return Impl.c.mId;
            }
            StringBuilder sb = new StringBuilder("Unsupported empty state style: ");
            sb.append(string);
            Assertion.b(sb.toString());
            return Impl.c.mId;
        }
    },
    GRADIENT("glue2:gradient", HubsComponentCategory.ROW) {
        public final int resolve(gzt gzt) {
            return Impl.d.mId;
        }
    },
    SIMPLE_HEADER("glue2:simpleHeader", HubsComponentCategory.HEADER) {
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
            a = new Impl("CAROUSEL", 0, R.id.hub_glue2_carousel) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxe();
                }
            };
            b = new Impl("EMPTY_STATE_ERROR", 1, R.id.hub_glue2_empty_state_error) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            c = new Impl("EMPTY_STATE_NO_RESULT", 2, R.id.hub_glue2_empty_state_no_result) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            d = new Impl("GRADIENT", 3, R.id.hub_glue2_gradient) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxj();
                }
            };
            e = new Impl("SIMPLE_HEADER", 4, R.id.hub_glue2_simple_header) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxo(hubsGlueImageDelegate);
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

    private HubsGlue2MiscComponents(String str, HubsComponentCategory hubsComponentCategory) {
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
