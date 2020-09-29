package org.slf4j.helpers;

public abstract class MarkerIgnoringBase extends NamedLoggerBase implements xfo {
    private static final long serialVersionUID = 9044267456635152283L;

    public /* bridge */ /* synthetic */ String f() {
        return super.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("(");
        sb.append(f());
        sb.append(")");
        return sb.toString();
    }
}
