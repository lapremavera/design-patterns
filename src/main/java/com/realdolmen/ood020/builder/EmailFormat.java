package com.realdolmen.ood020.builder;

//this is the Abstract Builder
public abstract class EmailFormat {

    public abstract void createHeader();
    public abstract void createMessage();
    public abstract void createFrom(String From);
    public abstract void createTo(String To);
    public abstract void createSubject(String Subject);
    public abstract void createBody(String Body);
}
