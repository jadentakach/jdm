package jt.jdm;

import java.util.List;

interface JDMCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
