package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlueRow implements gwl, hck {
    ENTITY("glue:entityRow") {
        public final int resolve(hcm hcm) {
            return NORMAL.resolve(hcm);
        }
    },
    MULTILINE("glue:text") {
        public final int resolve(hcm hcm) {
            return Impl.a.mId;
        }
    },
    MULTILINE_CAPPED("glue:textRow") {
        public final int resolve(hcm hcm) {
            return Impl.b.mId;
        }
    },
    NAVIGATION("glue:navigationRow") {
        public final int resolve(hcm hcm) {
            return SMALL.resolve(hcm);
        }
    },
    NORMAL("glue:row") {
        public final int resolve(hcm hcm) {
            Impl impl;
            fbp.a(hcm);
            if (!gzk.e(hcm)) {
                impl = hcm.text().description() != null ? Impl.a : gzd.b(hcm) ? Impl.d : Impl.c;
            } else if (gzd.b(hcm)) {
                impl = gze.a(hcm) ? Impl.i : Impl.h;
            } else {
                String str = "mosuwr_bne";
                impl = hcm.custom().intValue("row_number") != null ? gze.a(hcm) ? Impl.m : Impl.l : gze.a(hcm) ? Impl.k : Impl.g;
            }
            return impl.mId;
        }
    },
    SMALL("glue:smallRow") {
        public final int resolve(hcm hcm) {
            return (gzd.b(hcm) ? Impl.e : Impl.f).mId;
        }
    },
    VIDEO("glue:videoRow") {
        public final int resolve(hcm hcm) {
            return Impl.j.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gxo {
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

        static {
            a = new Impl("MULTILINE", 0, R.id.hub_glue_row_multiline) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gzf.a(hubsGlueImageDelegate);
                }
            };
            b = new Impl("MULTILINE_CAPPED", 1, R.id.hub_glue_row_multiline_capped) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0039a(hubsGlueImageDelegate);
                }
            };
            c = new Impl("SINGLE_LINE", 2, R.id.hub_glue_row_single_line) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            d = new Impl("SINGLE_LINE_IMAGE", 3, R.id.hub_glue_row_single_line_image) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0041b(hubsGlueImageDelegate);
                }
            };
            e = new Impl("SINGLE_LINE_IMAGE_SMALL", 4, R.id.hub_glue_row_single_line_image_small) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0040a(hubsGlueImageDelegate);
                }
            };
            f = new Impl("SINGLE_LINE_SMALL", 5, R.id.hub_glue_row_single_line_small) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gzf.b.a(hubsGlueImageDelegate);
                }
            };
            g = new Impl("TWO_LINE", 6, R.id.hub_glue_row_two_line) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate, false);
                }
            };
            h = new Impl("TWO_LINE_IMAGE", 7, R.id.hub_glue_row_two_line_image) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gzf.c.a(hubsGlueImageDelegate, false);
                }
            };
            i = new Impl("TWO_LINE_IMAGE_MUTED", 8, R.id.hub_glue_row_two_line_image_muted) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new defpackage.gzf.c.a(hubsGlueImageDelegate, true);
                }
            };
            j = new Impl("TWO_LINE_LANDSCAPE_IMAGE", 9, R.id.hub_glue_row_two_line_landscape_image) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new C0042a(hubsGlueImageDelegate, false);
                }
            };
            k = new Impl("TWO_LINE_MUTED", 10, R.id.hub_glue_row_two_line_muted) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate, true);
                }
            };
            l = new Impl("TWO_LINE_NUMBER", 11, R.id.hub_glue_row_two_line_number) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate, false);
                }
            };
            m = new Impl("TWO_LINE_NUMBER_MUTED", 12, R.id.hub_glue_row_two_line_number_muted) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate, true);
                }
            };
            o = new Impl[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
            n = values();
        }

        private Impl(String str, int i2, int i3) {
            this.mId = i3;
        }

        /* synthetic */ Impl(String str, int i2, int i3, byte b2) {
            this(str, i2, i3);
        }

        public static Impl valueOf(String str) {
            Class<Impl> cls = Impl.class;
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) o.clone();
        }

        public final int a() {
            return this.mId;
        }
    }

    public static final class a {

        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow$a$a reason: collision with other inner class name */
        public static class C0012a {
            /* access modifiers changed from: private */
            public static final gce<SpotifyIconV2> a = null;

            static {
                a = gce.a(SpotifyIconV2.class);
            }
        }
    }

    private HubsGlueRow(String str) {
        this.mComponentId = (String) fbp.a(str);
    }

    public static int a() {
        return Impl.g.mId;
    }

    public static gwk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return defpackage.gxo.a.a(hubsGlueImageDelegate, Impl.n);
    }

    public final String category() {
        return HubsComponentCategory.ROW.mId;
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String toString() {
        return id();
    }
}
