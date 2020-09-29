package defpackage;

/* renamed from: wba reason: default package */
public final class wba<T> extends wgu<wba<T>> {
    public static final wba<vyw> a = a("ALLOCATOR");
    public static final wba<wcb> b = a("RCVBUF_ALLOCATOR");
    public static final wba<wby> c = a("MESSAGE_SIZE_ESTIMATOR");
    public static final wba<Integer> d = a("CONNECT_TIMEOUT_MILLIS");
    @Deprecated
    public static final wba<Integer> e = a("MAX_MESSAGES_PER_READ");
    public static final wba<Integer> f = a("WRITE_SPIN_COUNT");
    @Deprecated
    public static final wba<Integer> g = a("WRITE_BUFFER_HIGH_WATER_MARK");
    @Deprecated
    public static final wba<Integer> h = a("WRITE_BUFFER_LOW_WATER_MARK");
    public static final wba<wcj> i = a("WRITE_BUFFER_WATER_MARK");
    public static final wba<Boolean> j = a("ALLOW_HALF_CLOSURE");
    public static final wba<Boolean> k = a("AUTO_READ");
    @Deprecated
    public static final wba<Boolean> l = a("AUTO_CLOSE");
    public static final wba<Boolean> m = a("SO_KEEPALIVE");
    public static final wba<Integer> n = a("SO_SNDBUF");
    public static final wba<Integer> o = a("SO_RCVBUF");
    public static final wba<Boolean> p = a("SO_REUSEADDR");
    public static final wba<Integer> q = a("SO_LINGER");
    public static final wba<Integer> r = a("IP_TOS");
    public static final wba<Boolean> s = a("TCP_NODELAY");
    public static final wba<Boolean> t = a("SINGLE_EVENTEXECUTOR_PER_GROUP");
    private static final whd<wba<Object>> w = new whd<wba<Object>>() {
        public final /* synthetic */ whc a(int i, String str) {
            return new wba(i, str, 0);
        }
    };

    /* synthetic */ wba(int i2, String str, byte b2) {
        this(i2, str);
    }

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

    private static <T> wba<T> a(String str) {
        return (wba) w.a(str);
    }

    private wba(int i2, String str) {
        super(i2, str);
    }

    public static void a(T t2) {
        if (t2 == null) {
            throw new NullPointerException("value");
        }
    }
}
