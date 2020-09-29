package com.squareup.wire;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> a = new ProtoAdapter<Boolean>(FieldEncoding.VARINT, Boolean.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 1;
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.c(((Boolean) obj).booleanValue() ? 1 : 0);
        }

        public final /* synthetic */ Object a(vta vta) {
            int c = vta.c();
            if (c == 0) {
                return Boolean.FALSE;
            }
            if (c == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(c)}));
        }
    };
    public static final ProtoAdapter<Integer> b = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public final /* synthetic */ int a(Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                return vtb.a(intValue);
            }
            return 10;
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                vtb.c(intValue);
            } else {
                vtb.c((long) intValue);
            }
        }

        public final /* synthetic */ Object a(vta vta) {
            return Integer.valueOf(vta.c());
        }
    };
    public static final ProtoAdapter<Integer> c = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public final /* synthetic */ int a(Object obj) {
            return vtb.a(((Integer) obj).intValue());
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.c(((Integer) obj).intValue());
        }

        public final /* synthetic */ Object a(vta vta) {
            return Integer.valueOf(vta.c());
        }
    };
    public static final ProtoAdapter<Integer> d = new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Integer.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 4;
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.d(((Integer) obj).intValue());
        }

        public final /* synthetic */ Object a(vta vta) {
            return Integer.valueOf(vta.e());
        }
    };
    public static final ProtoAdapter<Long> e = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public final /* synthetic */ int a(Object obj) {
            return vtb.a(((Long) obj).longValue());
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.c(((Long) obj).longValue());
        }

        public final /* synthetic */ Object a(vta vta) {
            return Long.valueOf(vta.d());
        }
    };
    public static final ProtoAdapter<Long> f = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public final /* synthetic */ int a(Object obj) {
            return vtb.a(((Long) obj).longValue());
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.c(((Long) obj).longValue());
        }

        public final /* synthetic */ Object a(vta vta) {
            return Long.valueOf(vta.d());
        }
    };
    public static final ProtoAdapter<Long> g = new ProtoAdapter<Long>(FieldEncoding.FIXED64, Long.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 8;
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.d(((Long) obj).longValue());
        }

        public final /* synthetic */ Object a(vta vta) {
            return Long.valueOf(vta.f());
        }
    };
    public static final ProtoAdapter<Float> h = new ProtoAdapter<Float>(FieldEncoding.FIXED32, Float.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 4;
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.d(Float.floatToIntBits(((Float) obj).floatValue()));
        }

        public final /* synthetic */ Object a(vta vta) {
            return Float.valueOf(Float.intBitsToFloat(vta.e()));
        }
    };
    public static final ProtoAdapter<String> i = new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, String.class) {
        public final /* synthetic */ int a(Object obj) {
            String str = (String) obj;
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i2 += 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i2 += 3;
                    } else if (charAt <= 56319) {
                        int i3 = i + 1;
                        if (i3 < length && str.charAt(i3) >= 56320 && str.charAt(i3) <= 57343) {
                            i2 += 4;
                            i = i3;
                        }
                    }
                    i++;
                }
                i2++;
                i++;
            }
            return i2;
        }

        public final /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.a.b((String) obj);
        }

        public final /* synthetic */ Object a(vta vta) {
            return vta.a.e(vta.g());
        }
    };
    public static final ProtoAdapter<ByteString> j = new ProtoAdapter<ByteString>(FieldEncoding.LENGTH_DELIMITED, ByteString.class) {
        public final /* synthetic */ int a(Object obj) {
            return ((ByteString) obj).h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            vtb.a((ByteString) obj);
        }

        public final /* synthetic */ Object a(vta vta) {
            return vta.a.d(vta.g());
        }
    };
    private final FieldEncoding k;
    private Class<?> l;
    private ProtoAdapter<List<E>> m;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i, Class<?> cls) {
            StringBuilder sb = new StringBuilder("Unknown enum tag ");
            sb.append(i);
            sb.append(" for ");
            sb.append(cls.getCanonicalName());
            super(sb.toString());
            this.value = i;
        }
    }

    public abstract int a(E e2);

    public abstract E a(vta vta);

    public abstract void a(vtb vtb, E e2);

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.k = fieldEncoding;
        this.l = cls;
    }

    public static <E extends vtd> vtc<E> a(Class<E> cls) {
        return new vtc<>(cls);
    }

    public static <M> ProtoAdapter<M> b(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            StringBuilder sb = new StringBuilder("failed to access ");
            sb.append(cls.getName());
            sb.append("#ADAPTER");
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public int a(int i2, E e2) {
        int a2 = a(e2);
        if (this.k == FieldEncoding.LENGTH_DELIMITED) {
            a2 += vtb.a(a2);
        }
        return a2 + vtb.a(vtb.a(i2, FieldEncoding.VARINT));
    }

    public void a(vtb vtb, int i2, E e2) {
        vtb.c(vtb.a(i2, this.k));
        if (this.k == FieldEncoding.LENGTH_DELIMITED) {
            vtb.c(a(e2));
        }
        a(vtb, e2);
    }

    public final byte[] b(E e2) {
        String str = "value == null";
        vsz.a(e2, str);
        wok wok = new wok();
        try {
            vsz.a(e2, str);
            vsz.a(wok, "sink == null");
            a(new vtb(wok), e2);
            return wok.q();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public static String c(E e2) {
        return e2.toString();
    }

    static {
        new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
            public final /* synthetic */ int a(Object obj) {
                return vtb.a(vtb.b(((Integer) obj).intValue()));
            }

            public final /* synthetic */ void a(vtb vtb, Object obj) {
                vtb.c(vtb.b(((Integer) obj).intValue()));
            }

            public final /* synthetic */ Object a(vta vta) {
                int c = vta.c();
                return Integer.valueOf((-(c & 1)) ^ (c >>> 1));
            }
        };
        new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
            public final /* synthetic */ int a(Object obj) {
                return vtb.a(vtb.b(((Long) obj).longValue()));
            }

            public final /* synthetic */ void a(vtb vtb, Object obj) {
                vtb.c(vtb.b(((Long) obj).longValue()));
            }

            public final /* synthetic */ Object a(vta vta) {
                long d = vta.d();
                return Long.valueOf((-(d & 1)) ^ (d >>> 1));
            }
        };
        new ProtoAdapter<Double>(FieldEncoding.FIXED64, Double.class) {
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return 8;
            }

            public final /* synthetic */ void a(vtb vtb, Object obj) {
                vtb.d(Double.doubleToLongBits(((Double) obj).doubleValue()));
            }

            public final /* synthetic */ Object a(vta vta) {
                return Double.valueOf(Double.longBitsToDouble(vta.f()));
            }
        };
    }

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.m;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> b2 = b();
        this.m = b2;
        return b2;
    }

    private ProtoAdapter<List<E>> b() {
        return new ProtoAdapter<List<E>>(this.k, List.class) {
            public final /* synthetic */ int a(int i, Object obj) {
                List list = (List) obj;
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += ProtoAdapter.this.a(i, list.get(i3));
                }
                return i2;
            }

            public final /* synthetic */ void a(vtb vtb, int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.a(vtb, i, list.get(i2));
                }
            }

            public final /* synthetic */ Object a(vta vta) {
                return Collections.singletonList(ProtoAdapter.this.a(vta));
            }

            public final /* synthetic */ void a(vtb vtb, Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            public final /* synthetic */ int a(Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }
        };
    }
}
