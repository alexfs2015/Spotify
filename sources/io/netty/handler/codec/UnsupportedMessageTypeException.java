package io.netty.handler.codec;

public class UnsupportedMessageTypeException extends CodecException {
    private static final long serialVersionUID = 2799598826487038726L;

    public UnsupportedMessageTypeException() {
    }

    public UnsupportedMessageTypeException(Object obj, Class<?>... clsArr) {
        super(a(obj == null ? "null" : obj.getClass().getName(), clsArr));
    }

    private static String a(String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder(str);
        if (clsArr != null && clsArr.length > 0) {
            sb.append(" (expected: ");
            sb.append(clsArr[0].getName());
            for (int i = 1; i < clsArr.length; i++) {
                Class<?> cls = clsArr[i];
                if (cls == null) {
                    break;
                }
                sb.append(", ");
                sb.append(cls.getName());
            }
            sb.append(')');
        }
        return sb.toString();
    }
}
