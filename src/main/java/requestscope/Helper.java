package requestscope;


import io.micronaut.runtime.http.scope.RequestScope;

@RequestScope
public class Helper {
    public int getTheAnswer() { return 42; }
}
