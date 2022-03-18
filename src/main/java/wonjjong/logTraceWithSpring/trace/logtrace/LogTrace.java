package wonjjong.logTraceWithSpring.trace.logtrace;

import wonjjong.logTraceWithSpring.trace.TraceStatus;

public interface LogTrace {
    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);

}
