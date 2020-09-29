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

        public final /* synthetic */ Object a(whg whg) {
            int c = whg.c();
            if (c == 0) {
                return Boolean.FALSE;
            }
            if (c == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(c)}));
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.c(((Boolean) obj).booleanValue() ? 1 : 0);
        }
    };
    public static final ProtoAdapter<Integer> b = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public final /* synthetic */ int a(Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                return whh.a(intValue);
            }
            return 10;
        }

        public final /* synthetic */ Object a(whg whg) {
            return Integer.valueOf(whg.c());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                whh.c(intValue);
            } else {
                whh.c((long) intValue);
            }
        }
    };
    public static final ProtoAdapter<Integer> c = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public final /* synthetic */ int a(Object obj) {
            return whh.a(((Integer) obj).intValue());
        }

        public final /* synthetic */ Object a(whg whg) {
            return Integer.valueOf(whg.c());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.c(((Integer) obj).intValue());
        }
    };
    public static final ProtoAdapter<Integer> d = new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Integer.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 4;
        }

        public final /* synthetic */ Object a(whg whg) {
            return Integer.valueOf(whg.e());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.d(((Integer) obj).intValue());
        }
    };
    public static final ProtoAdapter<Long> e = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public final /* synthetic */ int a(Object obj) {
            return whh.a(((Long) obj).longValue());
        }

        public final /* synthetic */ Object a(whg whg) {
            return Long.valueOf(whg.d());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.c(((Long) obj).longValue());
        }
    };
    public static final ProtoAdapter<Long> f = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public final /* synthetic */ int a(Object obj) {
            return whh.a(((Long) obj).longValue());
        }

        public final /* synthetic */ Object a(whg whg) {
            return Long.valueOf(whg.d());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.c(((Long) obj).longValue());
        }
    };
    public static final ProtoAdapter<Long> g = new ProtoAdapter<Long>(FieldEncoding.FIXED64, Long.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 8;
        }

        public final /* synthetic */ Object a(whg whg) {
            return Long.valueOf(whg.f());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.d(((Long) obj).longValue());
        }
    };
    public static final ProtoAdapter<Float> h = new ProtoAdapter<Float>(FieldEncoding.FIXED32, Float.class) {
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 4;
        }

        public final /* synthetic */ Object a(whg whg) {
            return Float.valueOf(Float.intBitsToFloat(whg.e()));
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.d(Float.floatToIntBits(((Float) obj).floatValue()));
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

        public final /* synthetic */ Object a(whg whg) {
            return whg.a.e(whg.g());
        }

        public final /* synthetic */ void a(whh whh, Object obj) {
            whh.a.b((String) obj);
        }
    };
    public static final ProtoAdapter<ByteString> j = new ProtoAdapter<ByteString>(FieldEncoding.LENGTH_DELIMITED, ByteString.class) {
        public final /* synthetic */ int a(Object obj) {
            return ((ByteString) obj).h();
        }

        public final /* synthetic */ Object a(whg whg) {
            return whg.a.d(whg.g());
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            whh.a((ByteString) obj);
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

    static {
        new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
            public final /* synthetic */ int a(Object obj) {
                return whh.a(whh.b(((Integer) obj).intValue()));
            }

            public final /* synthetic */ Object a(whg whg) {
                int c = whg.c();
                return Integer.valueOf((-(c & 1)) ^ (c >>> 1));
            }

            public final /* synthetic */ void a(whh whh, Object obj) {
                whh.c(whh.b(((Integer) obj).intValue()));
            }
        };
        new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
            public final /* synthetic */ int a(Object obj) {
                return whh.a(whh.b(((Long) obj).longValue()));
            }

            public final /* synthetic */ Object a(whg whg) {
                long d = whg.d();
                return Long.valueOf((-(d & 1)) ^ (d >>> 1));
            }

            public final /* synthetic */ void a(whh whh, Object obj) {
                whh.c(whh.b(((Long) obj).longValue()));
            }
        };
        new ProtoAdapter<Double>(FieldEncoding.FIXED64, Double.class) {
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return 8;
            }

            public final /* synthetic */ Object a(whg whg) {
                return Double.valueOf(Double.longBitsToDouble(whg.f()));
            }

            public final /* synthetic */ void a(whh whh, Object obj) {
                whh.d(Double.doubleToLongBits(((Double) obj).doubleValue()));
            }
        };
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.k = fieldEncoding;
        this.l = cls;
    }

    public static <E extends whj> whi<E> a(Class<E> cls) {
        return new whi<>(cls);
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

            public final /* synthetic */ int a(Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            public final /* synthetic */ Object a(whg whg) {
                return Collections.singletonList(ProtoAdapter.this.a(whg));
            }

            public final /* synthetic */ void a(whh whh, int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.a(whh, i, list.get(i2));
                }
            }

            public final /* synthetic */ void a(whh whh, Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }
        };
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

    public static String c(E e2) {
        return e2.toString();
    }

    public int a(int i2, E e2) {
        int a2 = a(e2);
        if (this.k == FieldEncoding.LENGTH_DELIMITED) {
            a2 += whh.a(a2);
        }
        return a2 + whh.a(whh.a(i2, FieldEncoding.VARINT));
    }

    public abstract int a(E e2);

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.m;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> b2 = b();
        this.m = b2;
        return b2;
    }

    public abstract E a(whg whg);

    public void a(whh whh, int i2, E e2) {
        whh.c(whh.a(i2, this.k));
        if (this.k == FieldEncoding.LENGTH_DELIMITED) {
            whh.c(a(e2));
        }
        a(whh, e2);
    }

    public abstract void a(whh whh, E e2);

    public final byte[] b(E e2) {
        String str = "value == null";
        whf.a(e2, str);
        xcq xcq = new xcq();
        try {
            whf.a(e2, str);
            whf.a(xcq, "sink == null");
            a(new whh(xcq), e2);
            return xcq.q();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
