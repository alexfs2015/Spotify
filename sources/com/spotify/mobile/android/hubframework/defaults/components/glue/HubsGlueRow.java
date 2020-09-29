package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlueRow implements gul, gzr {
    ENTITY("glue:entityRow") {
        public final int resolve(gzt gzt) {
            return NORMAL.resolve(gzt);
        }
    },
    MULTILINE("glue:text") {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    MULTILINE_CAPPED("glue:textRow") {
        public final int resolve(gzt gzt) {
            return Impl.b.mId;
        }
    },
    NAVIGATION("glue:navigationRow") {
        public final int resolve(gzt gzt) {
            return SMALL.resolve(gzt);
        }
    },
    NORMAL("glue:row") {
        public final int resolve(gzt gzt) {
            Impl impl;
            fay.a(gzt);
            if (!gwz.e(gzt)) {
                impl = gzt.text().description() != null ? Impl.a : gwt.b(gzt) ? Impl.d : Impl.c;
            } else if (gwt.b(gzt)) {
                impl = gwu.a(gzt) ? Impl.i : Impl.h;
            } else {
                impl = gzt.custom().intValue("row_number") != null ? gwu.a(gzt) ? Impl.m : Impl.l : gwu.a(gzt) ? Impl.k : Impl.g;
            }
            return impl.mId;
        }
    },
    SMALL("glue:smallRow") {
        public final int resolve(gzt gzt) {
            return (gwt.b(gzt) ? Impl.e : Impl.f).mId;
        }
    },
    VIDEO("glue:videoRow") {
        public final int resolve(gzt gzt) {
            return Impl.j.mId;
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
        public static final Impl h = null;
        public static final Impl i = null;
        public static final Impl j = null;
        public static final Impl k = null;
        public static final Impl l = null;
        public static final Impl m = null;
        /* access modifiers changed from: private */
        public static final Impl[] n = null;
        private static final /* synthetic */ Impl[] o = null;
        final int mId;

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) o.clone();
        }

        /* synthetic */ Impl(String str, int i2, int i3, byte b2) {
            this(str, i2, i3);
        }

        static {
            a = new Impl("MULTILINE", 0, R.id.hub_glue_row_multiline) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gwv.a(hubsGlueImageDelegate);
                }
            };
            b = new Impl("MULTILINE_CAPPED", 1, R.id.hub_glue_row_multiline_capped) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0038a(hubsGlueImageDelegate);
                }
            };
            c = new Impl("SINGLE_LINE", 2, R.id.hub_glue_row_single_line) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            d = new Impl("SINGLE_LINE_IMAGE", 3, R.id.hub_glue_row_single_line_image) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0040b(hubsGlueImageDelegate);
                }
            };
            e = new Impl("SINGLE_LINE_IMAGE_SMALL", 4, R.id.hub_glue_row_single_line_image_small) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0039a(hubsGlueImageDelegate);
                }
            };
            f = new Impl("SINGLE_LINE_SMALL", 5, R.id.hub_glue_row_single_line_small) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gwv.b.a(hubsGlueImageDelegate);
                }
            };
            g = new Impl("TWO_LINE", 6, R.id.hub_glue_row_two_line) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate, false);
                }
            };
            h = new Impl("TWO_LINE_IMAGE", 7, R.id.hub_glue_row_two_line_image) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gwv.c.a(hubsGlueImageDelegate, false);
                }
            };
            i = new Impl("TWO_LINE_IMAGE_MUTED", 8, R.id.hub_glue_row_two_line_image_muted) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gwv.c.a(hubsGlueImageDelegate, true);
                }
            };
            j = new Impl("TWO_LINE_LANDSCAPE_IMAGE", 9, R.id.hub_glue_row_two_line_landscape_image) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0041a(hubsGlueImageDelegate, false);
                }
            };
            k = new Impl("TWO_LINE_MUTED", 10, R.id.hub_glue_row_two_line_muted) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate, true);
                }
            };
            l = new Impl("TWO_LINE_NUMBER", 11, R.id.hub_glue_row_two_line_number) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate, false);
                }
            };
            m = new Impl("TWO_LINE_NUMBER_MUTED", 12, R.id.hub_glue_row_two_line_number_muted) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate, true);
                }
            };
            o = new Impl[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
            n = values();
        }

        private Impl(String str, int i2, int i3) {
            this.mId = i3;
        }

        public final int a() {
            return this.mId;
        }
    }

    public static final class a {

        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow$a$a reason: collision with other inner class name */
        public static class C0012a {
            /* access modifiers changed from: private */
            public static final gbg<SpotifyIconV2> a = null;

            static {
                a = gbg.a(SpotifyIconV2.class);
            }
        }
    }

    private HubsGlueRow(String str) {
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

    public static int a() {
        return Impl.g.mId;
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return defpackage.gvo.a.a(hubsGlueImageDelegate, Impl.n);
    }
}
