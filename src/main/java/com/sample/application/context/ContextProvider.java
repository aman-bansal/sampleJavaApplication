package com.sample.application.context;

public class ContextProvider {
    private final static ThreadLocal<Context> localThread = new ThreadLocal<>();

    public static Context getContext() {
        Context c = localThread.get();
        if(c == null) {
            localThread.set(new Context());
            c = localThread.get();
        }
        return c;
    }

    public static void setPath(String path) {
        getContext().setRequestMethod(path);
    }
}
