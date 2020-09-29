package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlue2Row implements gul, gzr {
    CALENDAR_ROW("glue2:calendarRow") {
        public final int resolve(gzt gzt) {
            Impl impl;
            fay.a(gzt);
            if ((gzt.text().title() == null || gzt.text().subtitle() == null) ? false : true) {
                impl = Impl.d;
            } else {
                impl = Impl.b;
            }
            return impl.mId;
        }
    },
    IMAGE_ROW("glue2:imageRow") {
        public final int resolve(gzt gzt) {
            Impl impl;
            fay.a(gzt);
            if ((gzt.text().title() == null || gzt.text().subtitle() == null) ? false : true) {
                impl = Impl.e;
            } else {
                impl = Impl.c;
            }
            return impl.mId;
        }
    },
    MULTILINE("glue2:text") {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    VIDEO("glue2:videoRow") {
        public final int resolve(gzt gzt) {
            return Impl.f.mId;
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
        /* access modifiers changed from: private */
        public static final Impl[] g = null;
        private static final /* synthetic */ Impl[] h = null;
        final int mId;

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) h.clone();
        }

        /* synthetic */ Impl(String str, int i, int i2, byte b2) {
            this(str, i, i2);
        }

        static {
            a = new Impl("MULTILINE", 0, R.id.hub_glue2_row_multiline) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxl();
                }
            };
            b = new Impl("SINGLE_LINE_CALENDAR", 1, R.id.hub_glue2_row_single_line_calendar) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a();
                }
            };
            c = new Impl("SINGLE_LINE_IMAGE", 2, R.id.hub_glue2_row_single_line_image) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a(hubsGlueImageDelegate);
                }
            };
            d = new Impl("TWO_LINE_CALENDAR", 3, R.id.hub_glue2_row_two_line_calendar) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b();
                }
            };
            e = new Impl("TWO_LINE_IMAGE", 4, R.id.hub_glue2_row_two_line_image) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            f = new Impl("VIDEO", 5, R.id.hub_glue2_video_row) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxr(hubsGlueImageDelegate);
                }
            };
            h = new Impl[]{a, b, c, d, e, f};
            g = values();
        }

        private Impl(String str, int i, int i2) {
            this.mId = i2;
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2Row(String str) {
        this.mComponentId = (String) fay.a(str);
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String category() {
        return HubsComponentCategory.ROW.mId;
    }

    public final String toString() {
        return id();
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.g);
    }
}
