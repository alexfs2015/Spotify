package defpackage;

/* renamed from: wpg reason: default package */
public final class wpg<T> extends wva<wpg<T>> {
    public static final wpg<wnc> a = a("ALLOCATOR");
    public static final wpg<wqh> b = a("RCVBUF_ALLOCATOR");
    public static final wpg<wqe> c = a("MESSAGE_SIZE_ESTIMATOR");
    public static final wpg<Integer> d = a("CONNECT_TIMEOUT_MILLIS");
    @Deprecated
    public static final wpg<Integer> e = a("MAX_MESSAGES_PER_READ");
    public static final wpg<Integer> f = a("WRITE_SPIN_COUNT");
    @Deprecated
    public static final wpg<Integer> g = a("WRITE_BUFFER_HIGH_WATER_MARK");
    @Deprecated
    public static final wpg<Integer> h = a("WRITE_BUFFER_LOW_WATER_MARK");
    public static final wpg<wqp> i = a("WRITE_BUFFER_WATER_MARK");
    public static final wpg<Boolean> j = a("ALLOW_HALF_CLOSURE");
    public static final wpg<Boolean> k = a("AUTO_READ");
    @Deprecated
    public static final wpg<Boolean> l = a("AUTO_CLOSE");
    public static final wpg<Boolean> m = a("SO_KEEPALIVE");
    public static final wpg<Integer> n = a("SO_SNDBUF");
    public static final wpg<Integer> o = a("SO_RCVBUF");
    public static final wpg<Boolean> p = a("SO_REUSEADDR");
    public static final wpg<Integer> q = a("SO_LINGER");
    public static final wpg<Integer> r = a("IP_TOS");
    public static final wpg<Boolean> s = a("TCP_NODELAY");
    public static final wpg<Boolean> t = a("SINGLE_EVENTEXECUTOR_PER_GROUP");
    private static final wvj<wpg<Object>> w = new wvj<wpg<Object>>() {
        public final /* synthetic */ wvi a(int i, String str) {
            return new wpg(i, str, 0);
        }
    };

    static {
        a("SO_BROADCAST");
        a("SO_BACKLOG");
        a("SO_TIMEOUT");
        a("IP_MULTICAST_ADDR");
        a("IP_MULTICAST_IF");
        a("IP_MULTICAST_TTL");
        a("IP_MULTICAST_LOOP_DISABLED");
        a("DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION");
    }

    private wpg(int i2, String str) {
        super(i2, str);
    }

    /* synthetic */ wpg(int i2, String str, byte b2) {
        this(i2, str);
    }

    private static <T> wpg<T> a(String str) {
        return (wpg) w.a(str);
    }

    public static void a(T t2) {
        if (t2 == null) {
            throw new NullPointerException("value");
        }
    }
}
